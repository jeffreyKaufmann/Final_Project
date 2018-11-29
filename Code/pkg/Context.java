package pkg;
public class Context {
   private Playing state = new StoppedSong();
   public Song use;
   public Context(Song song){
      use = song;
      state = null;
   }

   public void setState(Playing state){
      this.state = state;		
   }
   public void nextState()
   {
      state.pausePlay(this, use);
   }
}