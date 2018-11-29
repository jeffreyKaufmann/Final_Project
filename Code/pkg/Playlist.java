package pkg;
import java.util.*;
public class Playlist extends Listener 
{
	private String playlistName;
	private ArrayList<Song> songs = new ArrayList<Song>();
	public Playlist(int playlistLength, String playlist)
	{
		super("Username","pass");
		playlistName = playlist;
	}
	public void displayPlaylist()
	{
		System.out.println("Playlist: " + this.getPlaylistName());
		for(int i=0; i<songs.size(); i++)
		{

			System.out.println(songs.get(i).toString()+ "| Album Name: " + songs.get(i).getAlbumName() + "| Artist Name: " + songs.get(i).getArtistName());
		}
	}
	public String getPlaylistName() 
	{
      return playlistName;
    }
    public void setPlaylistName()
    {
    	this.playlistName = playlistName;
    }
	public void removePlaylist(Playlist playName)
	{
		playName = null;
	}
	public void addSong(Song song)
	{
		songs.add(song);
	}
	public void removeSong (Song song)
	{
		songs.remove(song);

	}
	



}