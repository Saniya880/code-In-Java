//Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
// class MusicLibrary{
//     ArrayList<Song>arr=new ArrayList<>();
//     public void addsong(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the songname:");
//         String songname=sc.nextLine();
//         // System.out.println("enter the ramdon song to play=");
//         // String randomsong=sc.nextLine();
//         arr.add(new Song(songname));
//         System.out.println("songs added:"+songname);

//     }

//     public void display(){
//         for(Song song:arr){
//             System.out.println("--"+song.getTitle());
//         }
//     }
//     // void removeSong(String name){
//     //     if(songs.remove(name)){
//     //         System.out.println("song remove"+name);
//     //     }else{
//     //         System.out.println("not found");
//     //     }
//     // }
// }

class MusicLibrary{
    ArrayList<Song> playlist = new ArrayList<Song>();
    public void addsong(Song s){
        playlist.add(s);
        System.out.println("Song added succesfully");
    }
    public void removeSong(Song s){
        playlist.remove(s);
        System.out.println("song removed successfully");
    }
    public void playRandomSong(){
        Random r = new Random();
        int randomIndex = r.nextInt(playlist.size());
        if(randomIndex < playlist.size())  System.out.println("Random Song played.... "+ playlist.get(randomIndex).getSongName());
        else System.out.print("Error..");
    }
 }
class Song{
   private String name;
   private String singer;
   private double duration;

   public Song(String name, String singer, double duration){
    this.name = name; 
    this.singer = singer;
    this.duration = duration;
   }

   public void displaySong(){
    System.out.println("Name : "+ this.name+" Singer : "+ this.singer+" Duration : "+ this.duration);
   }
   public String getSongName(){
    return this.name;
   }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // MusicLibrary m=new MusicLibrary();
        // m.addsong();
        // m.addsong();
        // // m.song();
        // m.display();
        // System.out.println("enter thte soong you want to remove ");
        // String name=sc.nextLine();
        // m.removeSong(name);
        // m.display();
        Song s1 = new Song("jeene laga hu", "prerna jaiswal", 3.45);
        Song s2 = new Song("jeene laga hu2", "prerna jaiswal1", 3.55);
        Song s3 = new Song("jeene laga hu3", "prerna jaiswal2", 3.35);
        Song s4 = new Song("jeene laga hu4", "prerna jaiswal3", 2.45);

        MusicLibrary m = new MusicLibrary();
        m.addsong(s1);
        m.addsong(s2);
        m.addsong(s3);
        m.addsong(s4);

        m.playRandomSong();

    }
}
