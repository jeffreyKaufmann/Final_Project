package pkg;
import java.util.Scanner;
import java.util.*;
public class Artist extends Listener
{
	public String name;
	public ArrayList<Album> albums = new ArrayList<Album>();
	public Artist(String artistName)
	{
		super("x","x");
		this.name = artistName;
	}
	public void setArtistName(String artistName)
	{
		name = artistName;
	}
	public String getArtistName()
	{
		return name;
	}
	public void addAlbum(Album album)
	{
		albums.add(album);
	}
	public void printArtist()
	{
		int i =0;
		System.out.print("\nArtist Name:" + name);
		while(i<albums.size())
		{
			albums.get(i).printAlbum();
			i++;
		}
	}

}
