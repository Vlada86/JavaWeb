<%-- 
    Document   : home
    Created on : Sep 5, 2017, 6:02:35 PM
    Author     : Kameni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ALFA MOBIL</title>
        <meta charset="UTF-8">

        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,400italic,700,700italic&subset=latin,latin-ext' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        
        <%--link za eksterni css--%>
        <link href="../css/style.css" type="text/css" rel="stylesheet">


    </head>
    <body>
    </div>

    <div id="wrapper">


        <div id="header">

            <div id="logo">
                <a href="home">
                    <img src="../images/logo.jpg" alt="Logo ALFA-MOBIL">
                </a>

            </div>

            <div id="slogan">
                <p>Prodaja i servis mobilnih telefona</p>

            </div>

        </div><!-- end #header -->


        <div id="nav">

            <ul>
                <li><a href="home">Početna strana</a></li>
                <li><a href="telefoni">Telefoni</a></li>
                <li><a href="oprema">Dodatna oprema</a></li>
                <li><a href="servis">Tehnička podrška &amp Servis</a></li>
                <li><a href="kontakt">Kontakt</a></li>
                
            </ul>
          



        </div><!-- end #nav -->
        <div class="container">

            <div id="main">

                <h1><strong>Zakažite servis</strong></h1>
                <form id="kontakt" method="POST" action="zakazivanje">
				
				<table id="kontakt-tabela">
				<tr>
				<td>
					<label for="ime">Ime:</label><br>
					<input type="text" id="ime" name="ime">
					<br><br>
					
					<label for="prezime">Prezime:</label><br>
					<input type="text" id="prezime" name="prezime">
                                        <br><br>
                                        
                                        <label for="telefon">Telefon:</label><br>
                                        <input type ="text" id="telefon" name="telefon">
                                        <br><br>
		
				</td>
				<td><br>
				
					
					
					
				</td>
				<td>
                	<label for="poruka">Poruka</label>
					<br>
                	<textarea cols="33" rows="10" name="poruka" id="poruka"></textarea>
				</td>
				</tr>
				<tr>
				<td colspan="3">
					
					<input type="submit" name="submit" id="submit" value="Posalji">
					
				</td>
				</tr>
				</table>
				</form>
				
				

            </div><!-- end #main -->

             

            <div id="footer">

                <p><strong>ALFA MOBIL&copy;</strong></p>
            </div><!-- end #footer -->
            <tr>
                <td colspan="2" style="width:980px;">
                    <table cellpadding="0" cellspacing="2" border="0" width=840><tr>
                            <td style="width:350; text-align:left; font-size:12px; color:black;">
                               

                                </div><!-- end #wrapper -->


                                </body>
</html>
