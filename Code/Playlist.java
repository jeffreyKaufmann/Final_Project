public class Playlist extends Listener 
{
	private String playlistName;
	private Song[] songs;
	int num;
	public Playlist(int playlistLength, String playlist)
	{
		super("Username","pass");
		playlistName = playlist;
		songs = new Song[playlistLength];
		num = 0;
	}
	public void displayPlaylist()
	{
		System.out.println("Playlist:");
		for(int i=0; i<num; i++)
		{

			System.out.println(songs[i].toString()+ " Album Name: " + songs[i].getAlbumName() + " Artist Name: " + songs[i].getArtistName());
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
	public void addSong(Song songName)
	{
		if(num<songs.length)
		{
			songs[num]= songName;
			num++;
		}
		else
		{
			System.out.println("Error: Playlist is Full");
		}
	}
	public void removeSong (String name)
	{
		boolean found = false;
		int id = 0;
		while(id< num)
			if(found == true)
			{

			}
			else
			{

			}

	}
	



}