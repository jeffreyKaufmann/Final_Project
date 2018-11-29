package pkg;
public class StoppedSong implements Playing
{
	public void pausePlay(Context context,Song song)
	{
		System.out.println(song.toString()+" is Paused");
		context.setState(new PlaySong());
	}
}