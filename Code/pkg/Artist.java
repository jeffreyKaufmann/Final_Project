package pkg;
import java.util.Scanner;
public class Artist extends Listener
{
	public String name;
	public Album[] albums;
	public int num;
	public Artist(String artistName)
	{
		super("x","x");
		num = 0;
		albums = new Album[30];
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
		if(num<albums.length)
		{
			albums[num]= album;
			num++;
		}
		else
		{
			System.out.println("Artist albums are Full");
		}
	}
	public void printArtist()
	{
		int i =0;
		System.out.print("\nArtist Name:" + name);
		while(i<num)
		{
			albums[i].printAlbum();
			i++;
		}
	}

}
