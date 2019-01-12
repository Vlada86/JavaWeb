<%-- 
    Document   : home
    Created on : Sep 5, 2017, 6:02:35 PM
    Author     : Kameni
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <script src="//cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>

        <script>
            $(document).ready(function () {
                $('#tabela').DataTable();
            });
        </script>    
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

                <h1>AKCIJSKA PONUDA</h1>
                <table id="tabela">
                     <thead>
            <th>Model</th>
             <th>Cena</th>
              <th></th>
      
            
               
                
            </thead>
            <c:forEach items="${akcijska_ponuda}" var="a">
                <tr>    
                    <td>${a.akcNaziv}</td>
                    <td>${a.akcCena}</td>
                    
                            <td>
                                
                            </td>
     
                    
                   
                  
                </tr>
            </c:forEach>

        </table>

            </div><!-- end #main -->

            <div id="sidebar">
                <div class="block">
                    <h2><a href="akcijska_ponuda">Akcijska ponuda</a></h2>
                    <p>Curabitur pulvinar venenatis dolor eget euismod. Curabitur tincidunt nisi in neque semper, vel malesuada risus elementum. Nullam elit nulla, ullamcorper vel ultrices sit amet, fringilla sollicitudin tortor. Proin ullamcorper, nibh nec gravida ornare, odio leo mattis enim, id maximus libero metus vel tellus.</p>
                </div>
                <div class="block">
                    <h2><a href="polovnitelefoni">Polovni telefoni</a></h2>
                    <p>Curabitur pulvinar venenatis dolor eget euismod. Curabitur tincidunt nisi in neque semper, vel malesuada risus elementum. Nullam elit nulla, ullamcorper vel ultrices sit amet, fringilla sollicitudin tortor. Proin ullamcorper, nibh nec gravida ornare, odio leo mattis enim, id maximus libero metus vel tellus.</p>
                </div>
               
            </div><!-- end #sidebar -->

            <div id="footer">

                <p><strong>ALFA MOBIL&copy;</strong></p>
            </div><!-- end #footer -->
            <tr>
                <td colspan="2" style="width:980px;">
                    <table cellpadding="0" cellspacing="2" border="0" width=840><tr>
                            <td style="width:350; text-align:left; font-size:12px; color:red;">


                                </div><!-- end #wrapper -->




                                </body>
                                </html>

