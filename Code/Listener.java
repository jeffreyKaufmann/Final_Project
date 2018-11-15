import java.util.*;
public class Listener 
{
	private String userName;
	private String passWord;
	public Song[] playlist;
	ArrayList<Song> faves = new ArrayList<Song>(1);

	public Listener(String name, String pass)
	{
		this.userName = name;
		this.passWord = pass;
	}
	public void addToFaves(Song song)
	{
		faves.add(song);
	}
	public void removeFromFaves(Song song)
	{
		faves.remove(song);
	}
	public void printFaves()
	{
		System.out.println("Favorites:");
		for(int i=0; i<faves.size(); i++)
		{
			System.out.println(faves.get(i).toString());
		}
	}
}