<%@ page language="java" contentType="text/html"%>
<%@ page import="java.text.*,java.util.*" %>
<%@ page import = "pkg.SongDriver"%>
<%@ page import = "pkg.Artist"%>
<!DOCTYPE html>
<head>
  <link rel="stylesheet" type="text/css" href="theme.css">
</head>
	  <div class="container">
		    <label for="uname"><b>Username</b></label>
		    <input type="text" placeholder="Enter Username" name="uname" required>

		    <label for="psw"><b>Password</b></label>
		    <input type="password" placeholder="Enter Password" name="psw" required>

    	<button type="submit">Login</button>
		    <label>
		      <input type="checkbox" checked="checked" name="remember"> Remember me
		    </label>
		    <h1>
		    <%
		    	/*SongDriver bod = (SongDriver)session.getAttribute("load");
		    	String username = request.getParameter("uname");
		    	String pass = request.getParameter("psw");
		    	bod.addListener(username,pass);
		    	*/
		    	Artist artist1 = new Artist("Drake");
		    	out.println(artist1.getArtistName());
		    %>
		</h1>
  	</div>
<html>
<body>

</body>
</html>
