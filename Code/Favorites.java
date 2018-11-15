import java.util.*;
public class Favorites extends Listener
{
	ArrayList<Song> faves = new ArrayList<Song>(1);
	public Favorites()
	{
		super("Username","pass");
	}
	private void createFaves()
	{

	}
	public void addToFaves(Song song)
	{
		System.out.println(faves.size());
		faves.add(song);
	}
	public void removeFromFaves(Song song)
	{
		faves.remove(song);
	}
	public void printFaves()
	{
		for(int i=0; i<faves.size(); i++)
		{
			System.out.println(faves.get(i));
		}
	}
}