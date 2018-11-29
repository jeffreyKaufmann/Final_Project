import java.util.*;
import java.util.Iterator;
public class AlbumIterator implements Iterator<Song>
{
	private ArrayList<Song> song;
	private int index=0; 
	public AlbumIterator(ArrayList<Song> song)
	{
		this.song = song;
	}
	public boolean hasNext()
	{
		if(song.get(index+1)==null)
		{
			return false;
		}
		return true;

	}
	public Song next()
	{
		return song.get(index ++);
	}
	public void remove()
	{
		for(int i=index-1; i<song.size()-1;i++)
		{
			song.remove(i);
		}
	}
}