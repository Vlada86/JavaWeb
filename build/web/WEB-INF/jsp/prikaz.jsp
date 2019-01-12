
<%--taglib regularan i taglib za vreme--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prikaz</title>
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
                            <li>${email}</li>
                        </form>
                    </ul>
                </li> 
                <li><a href="vidikorpu">Vidi Korpu</a></li>
            </ul>



        </div><!-- end #nav -->
        <div class="container">

            <div id="main">

                <body>
                    <h1>Prikaz specifikacia za izabrani model</h1>
                    <table border="1">
                        <thead>
                        <th>Specifikacije</th>
                        </thead>

                        <c:forEach items="${specifikacije}" var="s">
                            <tr>

                                <td>${s.smVrednost}</td>
                            </tr>







                        </c:forEach>

                    </table>
            </div><!-- end #main -->



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
