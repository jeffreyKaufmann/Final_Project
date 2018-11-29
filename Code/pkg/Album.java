package pkg;
public class Album extends Artist
{
	public String albumName;
	public String artistName;
	public static int date;
	public Song[] songs;
	public int num;
	//public static byte[] Image;
	public Album(String artist, String album)
	{
		super(artist);
		num =0;
		//int exactDate = (int) (new Date().getTime()/1000);
		this.artistName = getArtistName();
		this.albumName = album;
		songs = new Song[15];
		//this.date = new Date(((long)exactDate)*1000L);
	}
	/*public void getDate()
	{
		return(date);
	}
	*/
	public void addAlbum(String artist, String album)
	{
		Album album1 = new Album(artist, album);
	}
	public void deleteAlbum(Album name)
	{

	}
	public void addSong(Song song)
	{
		if(num<songs.length)
		{
			songs[num]= song;
			num++;
		}
		else
		{
			System.out.println("Album is Full");
		}
	}
	public String getAlbumName()
	{
		return albumName;
	}
	public void printAlbum()
	{
		int i =0;
		System.out.println("\nAlbum Name:" + albumName);
		while(i<num)
		{
			System.out.println(songs[i].toString());
			i++;
		}
	}
}