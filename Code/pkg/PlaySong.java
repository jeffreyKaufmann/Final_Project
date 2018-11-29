package pkg;
public class PlaySong implements Playing
{
	public void pausePlay(Context context, Song song)
	{
		System.out.println( song.toString() +" is Playing");
		context.setState(new StoppedSong());
	}

}