package pkg;
import java.util.*;
public class Album extends Artist
{

	public String albumName;
	public String artistName;
	public static int date;
	public ArrayList<Song> songs = new ArrayList<Song>();
	//public static byte[] Image;
	public Album(String artist, String album)
	{
		super(artist);
		//int exactDate = (int) (new Date().getTime()/1000);
		this.artistName = getArtistName();
		this.albumName = album;
		
	}
	public void addAlbum(String artist, String album)
	{
		Album album1 = new Album(artist, album);
	}
	public void deleteAlbum(Album name)
	{
	}
	public void addSong(Song song)
	{
		songs.add(song);
	}
	public String getAlbumName()
	{
		return albumName;
	}
	public void printAlbum()
	{
		int i =0;
		System.out.println("\nAlbum Name:" + albumName);
		while(i<songs.size())
		{
			System.out.println(songs.get(i).toString());
			i++;
		}
	}
	public void printAlbumIt()
	{
		AlbumIterator music = new AlbumIterator(songs);
		System.out.println("\nAlbum Name:" + albumName);
		while(music.hasNext())
		{
			System.out.println(songs.next().toString());
		}
	}
}