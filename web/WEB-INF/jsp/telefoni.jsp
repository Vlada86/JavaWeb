<%-- 
    Document   : telefoni
    Created on : Sep 5, 2017, 11:41:41 AM
    Author     : Kameni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--taglib regularan i taglib za vreme--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<head>
    <title>Telefoni</title>
    <meta charset="UTF-8">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,400italic,700,700italic&subset=latin,latin-ext' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">


    <link href="../css/style.css" type="text/css" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="//cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>

    <script>
        $(document).ready(function () {
            $('#tabela').DataTable();
        });
    </script>    


    <!-- <script>
         $(document).ready(function () {
             $("#ok").click(function () {
 
                 $.post("servletok",
                         {
                             pera: document.getElementById("x").value,
 
                             mika: document.getElementById("y").value
                         },
                         function (data, status) {
 
                             // document.getElementById("res").innerHTML = data;
                             alert("Data: " + data + "\nStatus: " + status);
                             // document.getElementById("myForm").submit(); 
                         });
             });
         });
     </script>-->
</head>

<body>

    <div id="wrapper">


        <div id="header">

            <div id="logo">
                <a href="index.html">
                    <img src="../images/logo.jpg" alt="PRODAJA I SERVIS TELEFONA">
                </a>
            </div>

            <div id="slogan">
                <p>SERVIS I PRODAJA TELEFONA</p>
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




   

        <h1>Prikaz svih telefona</h1>
        <table id="tabela">
            <thead>
            <th>Model</th>
             <th>Cena</th>
              <th></th>
               <c:if test = "${ulogovan}">
          <th></th>
      </c:if>
             
            
               
                
            </thead>
            <c:forEach items="${telefoni}" var="t">
                <tr>    
                    <td>${t.telNaziv}</td>
                    <td>${t.telCena}</td>
                            <td>
                                <form action="prikaz">
                                    <input type="hidden" name="id" value="${t.telId}">
                                    <input type="submit" name="submit" id="submit" value="Vidi specifikaciju">
                                           
                        </form>
                            </td>
                                    <c:if test = "${ulogovan}">
                                        <td>
                                         <form action="korpa">
                                    <input type="hidden" name="id" value="${t.telId}">
                                    <input type="submit" name="submit" id="submit" value="Dodaj u korpu">
                                           
                        </form>
                                    </td>

      </c:if>
                    
                    
                    
                   
                  
                </tr>
            </c:forEach>

        </table>

        
        <div id="footer">
            <p>ALFA MOBIL &copy;</p>
        </div><!-- end #footer -->
<tr>
                    <td colspan="2" style="width:980px;">
                        <table cellpadding="0" cellspacing="2" border="0" width=840><tr>
                                <td style="width:350; text-align:left; font-size:12px; color:red;">
                                     &nbsp;&nbsp;* maloprodajna cena sa uključenim PDV-om. Cena je izražena u evrima radi &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;lakšeg snalaženja,plaćanje ISKLJUČIVO u dinarskoj protivvrednosti
    </div><!-- end #wrapper -->

</body>

</html>