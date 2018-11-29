<%@ page language="java" contentType="text/html"%>
<%@ page import="java.text.*,java.util.*" %>
<%@ page import="pkg.SongDriver"%>
<%@ page import="pkg.Artist"%>
<%@ page import="pkg.Playlist"%>
<%@ page import="pkg.Listener"%>
<%@ page import="pkg.Song"%>
<%@ page import="pkg.Album"%>


<!DOCTYPE html>
<head>
  <link rel="stylesheet" type="text/css" href="theme.css">
</head>
<html>
<body>

	<%
	  SongDriver load = new SongDriver();
	  session.setAttribute("load",load);
	  /*
	  	Basically doing filler albums and songs so the website isn't blank just as a test
	  */
	  Listener list1 = new Listener("Atriole", "12345678");
      Artist artist1 = new Artist("Drake");
      Playlist play1 = new Playlist(20, "Jams");

      Album album1 = new Album(artist1.getArtistName(), "Hotline Bling");
      artist1.addAlbum(album1);
      Song song1 = new Song("Hotling Bling", artist1.getArtistName(), album1.getAlbumName());
      Song song2 = new Song("9", artist1.getArtistName(), album1.getAlbumName());
      Song song3 = new Song("U with Me?", artist1.getArtistName(), album1.getAlbumName());
      Song song4 = new Song("Feel No Ways", artist1.getArtistName(), album1.getAlbumName());
      Song song5 = new Song("Hype", artist1.getArtistName(), album1.getAlbumName());
      Album album2 = new Album(artist1.getArtistName(), "If you're reading this it's too late"); 
      
      artist1.addAlbum(album2);
      Song song7 = new Song("Star 67", artist1.getArtistName(), album2.getAlbumName());
      Song song8 = new Song("6 God", artist1.getArtistName(), album2.getAlbumName());
      Song song9 = new Song("Jungle", artist1.getArtistName(), album2.getAlbumName());
      
      Artist artist2 = new Artist("Kanye");
      
      Album album3 = new Album(artist2.getArtistName(), "Yeezus");
      Song song10 = new Song("Black SkinHead", artist2.getArtistName(), album3.getAlbumName());
      Song song11 = new Song("I'm in it", artist2.getArtistName(), album3.getAlbumName());
      artist2.addAlbum(album3);

      album1.addSong(song1);
      album1.addSong(song2);
      album1.addSong(song3);
      album1.addSong(song4);
      album1.addSong(song5);

      album2.addSong(song7);
      album2.addSong(song8);
      album2.addSong(song9);
      album3.addSong(song10);
      album3.addSong(song11);

      play1.addSong(song1);
      play1.addSong(song3);
      play1.addSong(song4);
      play1.addSong(song5);
      play1.addSong(song9);
      play1.addSong(song7);
      play1.addSong(song8);

      list1.addToFaves(song7);
      list1.addToFaves(song8);

	%>

	<script language="javascript" type="text/javascript"> 
	function doSubmit() 
	{ 
	window.open("login.jsp","_self"); 
	} 
</script>
	
	<html:button property="button" onclick="doSubmit();"/> 
		Create Account
	</html:button>
<p>
	OBJECT ORIENTED PLAYLISTS
</p>
	<div class="topnav">
		<script type="text/javascript" src= "SongDriver.java">

		</script>
	  <a class="active" href="#Home">Home</a>
	  <a href="#Playlists">Playlists</a>
	  <a href="#Favorites">Favorites</a>
	  <input type="text" placeholder="Search..">
	</div>
<p>
	<%!
		public void outputFave(Listener list, JspWriter out) throws IOException
		{
			ArrayList<String> favorites = list.returnFaves();
			out.println("Favorites:");
		    for(int i=0; i<favorites.size(); i++)
			{
				out.println(favorites.get(i));
		 	}
		}
	%>
	<%
		outputFave(list1);
		list1.printFaves();
	%>
</p>
</body>
</html>
