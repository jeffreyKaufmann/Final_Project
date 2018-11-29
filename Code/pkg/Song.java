package pkg;
import java.util.*;
public class Song extends Album
{
	private String songName;
	private String artistName;
	private String albumName;
	//public static byte[] Image;
	public Song(String name, String artist, String album)
	{
		super(artist, album);
		this.songName = name;
		this.artistName = artist;
		this.albumName = album;
	}
	public void addSong(String name, String artist, String album)
	{
		Song song = new Song(name, artist, album);
	}
	public String getName()
	{
		return songName;
	}
	public String toString() {
      return "Song: " + getName();
   }

}