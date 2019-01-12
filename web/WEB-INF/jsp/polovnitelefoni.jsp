<%-- 
    Document   : polovnitelefoni
    Created on : Sep 9, 2017, 11:38:16 PM
    Author     : Kameni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Polovni Telefoni</title>
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
                <li><a href="home">Početna strana</a></li>
                <li><a href="telefoni">Telefoni</a></li>
                <li><a href="oprema">Dodatna oprema</a></li>
                <li><a href="servis">Tehnička podrška &amp Servis</a></li>
                <li><a href="kontakt">Kontakt</a></li>

            </ul>



        </div><!-- end #nav -->




        

        <h1>Prikaz polovnih telefona</h1>
        <table id="tabela">
            <thead>
            <th>Model</th>
            <th>Dispej</th>
            <th>Procesor</th>
            <th>Ram memorija</th>
            <th>Kraci opis</th>
             <th>Cena</th>
              <th></th>
               <c:if test = "${ulogovan}">
          <th></th>
      </c:if>
             
            
               
                
            </thead>
            <c:forEach items="${polovnitelefoni}" var="p">
                <tr>    
                    <td>${p.ptModel}</td>
                    <td>${p.ptDisplej}</td>
                    <td>${p.ptProcesor}</td>
                    <td>${p.ptRammemorija}</td>
                    <td>${p.ptKraciopis}</td>
                    <td>${p.ptCena}</td>
                            <td>
                             
                       
                                    </td>

                    
                    
                    
                   
                  
                </tr>
            </c:forEach>

        </table>

        
        <div id="footer">
            <p>ALFA MOBIL &copy;</p>
        </div><!-- end #footer -->

    </div><!-- end #wrapper -->

</body>

</html>
    </body>
</html>
