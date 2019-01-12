<%-- 
    Document   : home
    Created on : Sep 5, 2017, 6:02:35 PM
    Author     : Kameni
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <c:if test = "${ulogovan}">
                        <li></li>
                        </c:if>

                    <li><a href="home">Početna strana</a></li>
                    <li><a href="telefoni">Telefoni</a></li>
                    <li><a href="oprema">Dodatna oprema</a></li>
                    <li><a href="servis">Tehnička podrška &amp Servis</a></li>
                    <li><a href="kontakt">Kontakt</a></li>

                    <c:if test = "${ulogovan}">
                        <li><li><a href="vidikorpu">Vidi Korpu</a></li>
                        </c:if>   
                    </li> 
                    <li>
                        <ul class="lgn">
                            <form action="login" method="post">
                                <li>
                                    <input  type="text" name="email" class="forma"  placeholder="email">
                                </li><li>
                                    <input type="password" name="password" class="formel_1" placeholder="password">
                                </li><li>
                                    <input type ="submit" class="formel_1" value="LogIn">
                                </li>

                            </form>




                            <c:if test="${ulogovan}">

                            <h1>Dobrodosli!</h1>


                            <c:choose>
                                <c:when test="${ulogovan==true}">
                                    <p>Ulogovani ste kao : ${korisnik.korIme} ${korisnik.korPrezime} </p>
                                    <p><strong><a href="logout">Izlogujte se!</a></strong></p>

                                </c:when>
                            </c:choose>

                            </c:if>






                        </ul>

                </ul>


            </div><!-- end #nav -->
            <div class="container">

                <div id="main">

                    <div id ="Oprema">

                <form action="oprema">


                    <select id="Oprema" name="Oprema">
                        <option disabled selected value> -- Dodatna Oprema -- </option>
                        <c:forEach items="${dodatna_oprema_grupe}" var="d">
                            <option value="${d.dogId}">${d.dogNaziv}</option>
                        </c:forEach>

                    </select>
                    <input type="submit" value="Pogledaj opremu">

                </form>
                <ol>
                    <c:forEach items="${dodatna_oprema}" var="d">
                       
                        <li>${d.doVrednost}
                            <ul>${d.doCena}</ul>
                            </li>
                        </c:forEach>

                </ol>
            </div>


                </div><!-- end #main -->

                <div id="sidebar">
                    <div class="block">
                        <h2><a href="akcijska_ponuda">Akcijska ponuda</a></h2>
                        <p>Curabitur pulvinar venenatis dolor eget euismod. Curabitur tincidunt nisi in neque semper, vel malesuada risus elementum. Nullam elit nulla, ullamcorper vel ultrices sit amet, fringilla sollicitudin tortor. Proin ullamcorper, nibh nec gravida ornare, odio leo mattis enim, id maximus libero metus vel tellus.</p>
                    </div>
                    <div class="block">
                        <h2><a href="polovnitelefoni" >Polovni telefoni</a></h2>
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
