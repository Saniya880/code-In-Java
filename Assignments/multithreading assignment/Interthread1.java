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

        notify(); // Notify client that dish is ready
    }

    // Consumer: Client eats the dish
    public synchronized String takeDish() throws InterruptedException {
        while (!isDishAvailable) {
            wait(); // Wait if no dish is on the table
        }

        String servedDish = this.dish;
        isDishAvailable = false;
        System.out.println("Client ate: " + servedDish);

        notify(); // Notify chef that table is now free
        return servedDish;
    }
}

// Chef (Producer)
class Chef extends Thread {
    private final Table table;
    private final int dishLimit;

    public Chef(Table table, int dishLimit) {
        this.table = table;
        this.dishLimit = dishLimit;
    }

    public void run() {
        try {
            for (int i = 1; i <= dishLimit; i++) {
                String dish = "Dish " + i;
                table.putDish(dish);
                Thread.sleep(500); // Simulate cooking time
            }
        } catch (InterruptedException e) {
            System.out.println("Chef was interrupted.");
        }
        System.out.println("Chef is done cooking.");
    }
}

// Client (Consumer)
class Client extends Thread {
    private final Table table;
    private final int dishLimit;

    public Client(Table table, int dishLimit) {
        this.table = table;
        this.dishLimit = dishLimit;
    }

    public void run() {
        try {
            for (int i = 1; i <= dishLimit; i++) {
                table.takeDish();
                Thread.sleep(800); // Simulate eating time
            }
        } catch (InterruptedException e) {
            System.out.println("Client was interrupted.");
        }
        System.out.println("Client is done eating.");
    }
}

 class TestMain {
    public static void main(String[] args) {
        Table table = new Table();
        int dishLimit = 10;

        Chef chef = new Chef(table, dishLimit);
        Client client = new Client(table, dishLimit);

        chef.start();
        client.start();

        // No join() used here — main() ends immediately,
        // but the program keeps running until both threads finish.
        System.out.println("Restaurant is open. Chef and Client started.");
    }
}
