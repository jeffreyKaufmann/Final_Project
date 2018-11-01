public class Playlist 
{
	private String playlistName;
	private Song[] songs;
	int num;
	public Playlist()
	{
		songs = new Song[30];
		num = 0;
	}
	public void displayPlaylist()
	{

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
	/*
	public void addSong(Song songName)
	{
		if(num<songs.length)
		{
			song[num]= songName;
			num++;
		}
		else
		{
			System.out.println("Playlist is Full");
		}
	}
	public removeSong (string Name)
	{
		boolean found = false;
		int id = 0;
		while(id< num)
			if(found == true)
			{

			}
			else
			{
				song[id].getN
			}

	}
	*/



}