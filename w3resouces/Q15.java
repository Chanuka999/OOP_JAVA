import java.util.ArrayList;

class Song{
    private String title;
    private String artist;

    Song(String title,String artist){
        this.title=title;
        this.artist=artist;
    }

    String getTitle(){
        return title;
    }

    void setTitle(String title){
        this.title=title;
    }

    String getArtist(){
        return artist;
    }

    String setArtist(String artist){
        this.artist=artist;
    }

}

class MusicLaboratary{
   private ArrayList<Song> songs;

   MusicLaboratary(){
    songs = new ArrayList<Song>(); 
   }

   ArrayList<Song> getSongs(){
    return songs;
   }

   void addSongs(Song song){
      songs.add(song);
   }

   void removeSongs(Song song){
     songs.remove(song);
   }

   void playSongs(){
    int size = songs.size();

    if(size == 0){
        System.out.println("No songs in the library");
        return;
    }

    Random rand = new Random();

    int index = rand.nextInt(size);
    System.out.println("Now playing" + songs.getIndex(index).getTitle()  + "by" + songs.get(index).getArtist());
   }
}

public class Q15{
    public static void main(String[] args){

        MusicLaboratary library = new MusicLaboratary();

        Song  song1 = new Song("pem sihine", "chanuka");
          Song  song1 = new Song("nadhen", "randitha");
            Song  song1 = new Song("piyamennee", "kamal");

            library.addSongs(song1);
             library.addSongs(song2);
              library.addSongs(song3);

              System.out.println("All songs:");

              for(Song song :library.getSongs()){
                System.out.println(song.getTitle() + "by" + song.getArtist());
              }

              System.out.println("\n Playing Ramdom songs:");

              library.playSongs();
              System.out.println();
               library.playSongs();
              System.out.println();
              library.playSongs();

    }
}