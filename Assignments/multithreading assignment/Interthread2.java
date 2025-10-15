class Table {
    private String dish;
    private boolean isDishAvailable = false;

    // Producer: Chef puts a dish on the table
    public synchronized void putDish(String dish) throws InterruptedException {
        while (isDishAvailable) {
            wait(); // Wait if table already has a dish
        }

        this.dish = dish;
        isDishAvailable = true;
        System.out.println("Chef prepared: " + dish);

        notifyAll(); // Notify all waiting clients
    }

    // Consumer: Client eats the dish
    public synchronized String takeDish(String clientName) throws InterruptedException {
        while (!isDishAvailable) {
            wait(); // Wait if table is empty
        }

        String servedDish = this.dish;
        isDishAvailable = false;
        System.out.println(clientName + " ate: " + servedDish);

        notifyAll(); // Notify the chef to produce the next dish
        return servedDish;
    }
}

// Producer: Chef
class Chef extends Thread {
    private final Table table;
    private final int totalDishes;

    public Chef(Table table, int totalDishes) {
        this.table = table;
        this.totalDishes = totalDishes;
    }

    public void run() {
        try {
            for (int i = 1; i <= totalDishes; i++) {
                String dish = "Dish " + i;
                table.putDish(dish);
                Thread.sleep(500); // Simulate cooking
            }
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted.");
        }
        System.out.println("Chef is done cooking.");
    }
}

// Consumer: Client
class Client extends Thread {
    private final Table table;
    private final int dishesToEat;
    private final String clientName;

    public Client(Table table, int dishesToEat, String clientName) {
        this.table = table;
        this.dishesToEat = dishesToEat;
        this.clientName = clientName;
    }

    public void run() {
        try {
            for (int i = 0; i < dishesToEat; i++) {
                table.takeDish(clientName);
                Thread.sleep(800); // Simulate eating
            }
        } catch (InterruptedException e) {
            System.out.println(clientName + " interrupted.");
        }
        System.out.println(clientName + " is done eating.");
    }
}

   class TestMain {
    public static void main(String[] args) {
        Table table = new Table();
        int totalDishes = 10;      // Total dishes prepared
        int numClients = 2;        // Total clients

        // One chef
        Chef chef = new Chef(table, totalDishes);
        chef.start();

        // Divide dishes among clients
        int dishesPerClient = totalDishes / numClients;

        // Start multiple clients
        for (int i = 1; i <= numClients; i++) {
            Client client = new Client(table, dishesPerClient, "Client-" + i);
            client.start();
        }

        System.out.println("Restaurant is open. Chef and Clients started.");
    }
}
