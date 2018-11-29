package pkg;
import java.util.*;
public class Listener extends SongDriver
{
	private String userName;
	private String passWord;
	public Song[] playlist;
	ArrayList<Song> faves = new ArrayList<Song>(1);
	ArrayList<Playlist> players = new ArrayList<Playlist>();

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
	public void addNewPlaylist(Playlist playName)
	{
		players.add(playName);
	}
	public void printFaves()
	{
		System.out.println("Favorites:");
		for(int i=0; i<faves.size(); i++)
		{
			System.out.println(faves.get(i).toString());
		}
	}
	public ArrayList<String> returnFaves()
	{
		ArrayList<String> output = new ArrayList<String>();
		for(int i=0; i<faves.size(); i++)
		{
			output.add((faves.get(i)).toString());
		}
		return output;
	}
	public Playlist selectPlaylist()
    {
        int playlistValue = 0;
        for(int i=0;i<players.size();i++)
        {
            System.out.println( i+1 + ")");
            players.get(i).displayPlaylist();
        }
        System.out.println("Select Playlist:");
        playlistValue = scanner.nextInt();
        playlistValue--;
        while(playlistValue>=players.size())
        {
        	System.out.println("Reselect Playlist:");
        	playlistValue = scanner.nextInt();
        }
        return players.get(playlistValue);

    }
	/*
	public ArrayList<Song> searchSong(String search)
	{

	}
	*/
}