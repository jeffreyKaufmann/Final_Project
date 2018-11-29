package pkg;
import java.util.Scanner;
import java.util.*;
public class SongDriver {
      Scanner scanner = new Scanner(System.in);
      ArrayList<Listener> users = new ArrayList<Listener>();
      int idNum;
      public SongDriver()
      {

      }
      public void controlCreateListener()
      {
            System.out.println("Enter Username:");
            String username = scanner.next();
            System.out.println("Enter Password:");
            String pass = scanner.next();
            Listener list = new Listener(username,pass);

            users.add(list);
            idNum=users.size()-1;
      }
      public void becomeArtist()
      {
            System.out.println("Enter Artist Name:");
            Artist list = new Artist(scanner.next());
      }
      public void controlCreatePlaylist()
      {
            System.out.println("\nCreating a Playlist");
            System.out.println("Enter playlist name:");
            String playlistName = scanner.next();
            Playlist playlist1 = new Playlist(0, playlistName);
            Listener base = users.get(idNum);
            base.addNewPlaylist(playlist1);

      }
      public Listener getListener(int i)
      {
            return users.get(i);
      }
   public static void main(String[] args) {



      Listener list1 = new Listener("Atriole", "12345678");
      Artist artist1 = new Artist("Drake");
      Playlist play1 = new Playlist(20, "Jams");

      Album album1 = new Album(artist1.getArtistName(), "Hotline Bling");
      artist1.addAlbum(album1);
      Song song1 = new Song("Hotling Bling", artist1.getArtistName(), album1.getAlbumName());
      Song song2 = new Song("9", artist1.getArtistName(), album1.getAlbumName());
      Song song3 = new Song("U with Me?", artist1.getArtistName(), album1.getAlbumName());
      Song song4 = new Song("Feel No Ways", artist1.getArtistName(), album1.getAlbumName());
      Song song5 = new Song("Hype", artist1.getArtistName(), album1.getAlbumName());
      Album album2 = new Album(artist1.getArtistName(), "If you're reading this it's too late"); 
      
      artist1.addAlbum(album2);
      Song song7 = new Song("Star 67", artist1.getArtistName(), album2.getAlbumName());
      Song song8 = new Song("6 God", artist1.getArtistName(), album2.getAlbumName());
      Song song9 = new Song("Jungle", artist1.getArtistName(), album2.getAlbumName());
      
      Artist artist2 = new Artist("Kanye");
      
      Album album3 = new Album(artist2.getArtistName(), "Yeezus");
      Song song10 = new Song("Black SkinHead", artist2.getArtistName(), album3.getAlbumName());
      Song song11 = new Song("I'm in it", artist2.getArtistName(), album3.getAlbumName());
      artist2.addAlbum(album3);

      album1.addSong(song1);
      album1.addSong(song2);
      album1.addSong(song3);
      album1.addSong(song4);
      album1.addSong(song5);

      album2.addSong(song7);
      album2.addSong(song8);
      album2.addSong(song9);
      album3.addSong(song10);
      album3.addSong(song11);

      play1.addSong(song1);
      play1.addSong(song3);
      play1.addSong(song4);
      play1.addSong(song5);
      play1.addSong(song9);
      play1.addSong(song7);
      play1.addSong(song8);

      list1.addToFaves(song7);
      list1.addToFaves(song8);





      SongDriver abc = new SongDriver();
      abc.controlCreateListener();

      System.out.println("Displaying Top Artists: ");
      artist1.printArtist();
      artist2.printArtist();
      System.out.println("Displaying Favorites:");
      list1.printFaves();

      (abc.getListener(0)).addNewPlaylist(play1);

      //Button press to create playlist Theoretical
      abc.controlCreatePlaylist();
      //Button press to enter selected playlist
      Playlist selected = abc.getListener(0).selectPlaylist();
      //Adding a random song to playlist would be a button but Search functionallity isn't finished
      selected.addSong(song3);
      selected.displayPlaylist();



   }
}   