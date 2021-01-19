<%-- 
    Document   : customerForm
    Created on : 09.Oca.2021, 21:05:01
    Author     : sarik
--%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Class.Sales"%>
<%@page import="Class.Buying"%>
<%@page import="Class.ListGetir"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    int x = (int) session.getAttribute("id");
    List<Buying> alisMus = new ListGetir().getirAlisMüsteriListe(x);
    request.setAttribute("alisMus", alisMus);

    List<Sales> satisMus = new ListGetir().getirSatisMüsteriListe(x);
    request.setAttribute("satisMus", satisMus);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Anasayfa</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script defer src="https://use.fontawesome.com/releases/v5.8.2/js/all.js" integrity="sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH" crossorigin="anonymous"></script>
        <style>   
        .sidenav {
          height: 100%;
          width: 0;
          position: fixed;
          z-index: 1;
          top: 0;
          left: 0;
          background-color: #8DB4C7;
          overflow-x: hidden;
          transition: 0.5s;
          padding-top: 60px;
        }

        .sidenav a {
          padding: 8px 8px 8px 32px;
          color: white;
          display: block;
          transition: 0s;
        }

        .sidenav a:hover {
             color: black; 
             background: #f1f1f1;
        }

        .sidenav .closebtn {
          position: absolute;
          top: 0;
          right: 25px;
          margin-left: 100px;
        }

        #main {
          transition: margin-left .5s;
          padding: 16px;
        }

        @media screen and (max-height: 450px) {
          .sidenav {padding-top: 15px;}
          .sidenav a {font-size: 18px;}
        }
    </style>  
</head>
<body>
    <div id="YanMenu" class="sidenav">
        <center><strong><a href="javascript:void(0)" class="btn btn-dark" onclick="closeNav()" ><i class="fas fa-times"></i></a></strong></center> <!--Yan menuyu kapar-->
                        <strong><a href="homePage.jsp" class="smooth-scroll"><i class="fas fa-home"></i>&nbsp;&nbsp;Anasayfa</i></a></strong>
                        <strong><a href="buying.jsp" class="smooth-scroll"><i class="fas fa-hand-holding-usd"></i>&nbsp;&nbsp;Alış İşlemleri</a></strong>
                        <strong><a href="sales.jsp" class="smooth-scroll"><i class="far fa-handshake"></i>&nbsp;&nbsp;Satış İşlemleri</a></strong>
                        <strong><a href="stokList.jsp" class="smooth-scroll"><i class="fas fa-store-alt"></i>&nbsp;&nbsp;Stok Durumu</a></strong>
                        <strong><a href="customerForm.jsp" class="smooth-scroll"><i class="fas fa-users"></i>&nbsp;&nbsp;Müşteri Formu</a></strong>
                        <strong><a href="cari.jsp" class="smooth-scroll"><i class="fas fa-wallet"></i>&nbsp;&nbsp;Cari</a></strong>
                        <strong><a href="iletisim.jsp" class="smooth-scroll"><i class="fas fa-address-card"></i>&nbsp;&nbsp;İletişim</a></strong>
                        <strong><a href="firstScreen.jsp" class="smooth-scroll"><i class="fas fa-sign-out-alt"></i>&nbsp;&nbsp;Çıkış</a></strong>
    </div>

    <div id="main">
        <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: #8DB4C7">
                        <div>
                            <img src="image/logo.png" border=0 width=50 height=50>
                            <a class="navbar-brand"> Sarıkaya Muhasebe Takip Sistemi</a>
                        </div>
                </nav>
        </header>
        
        <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;</span> <!--Yan menuyu acar-->
        <br>
        
        <div class="row">
                <div class="container">
                    <h3 class="text-center">Müşteri Listesi</h3>
                    <hr>
                    <br>
                    <table class="table table-sm table-hover table-bordered table-striped"style="text-align:center">
                        <thead class="thead-light">
                            <tr>
                                <th colspan="5">Alım Yapılan Müşteriler</th>
                            </tr>
                         </thead>
                         <tr>
                            <th scope="col">Müşteri Adı</th>
                            <th scope="col">Şirketin İsmi</th>
                            <th scope="col">Telefon</th>
                            <th scope="col">İşlem Tarihi</th>
                        </tr>
                        <tbody>
                        <c:forEach items="${alisMus}" var="alisMus">
                            <tr>
                                <td class="align-middle">${alisMus.musteriAdi}</td>
                                <td class="align-middle">${alisMus.sirketAdi}</td>
                                <td class="align-middle">${alisMus.telefon}</td>
                                <td class="align-middle">${alisMus.tarih}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    </table>
                    
                    <br>
                    <table class="table table-sm table-hover table-bordered table-striped"style="text-align:center">
                        <thead class="thead-light">
                            <tr>
                                <th colspan="5">Satış Yapılan Müşteriler</th>
                            </tr>
                         </thead>
                         <tr>
                            <th scope="col">Müşteri Adı</th>
                            <th scope="col">Şirketin İsmi</th>
                            <th scope="col">Telefon</th>
                            <th scope="col">İşlem Tarihi</th>
                        </tr>
                    <tbody>
                        <c:forEach items="${satisMus}" var="satisMus">
                            <tr>
                                <td class="align-middle">${satisMus.musteriAdi}</td>
                                <td class="align-middle">${satisMus.sirketAdi}</td>
                                <td class="align-middle">${satisMus.telefon}</td>
                                <td class="align-middle">${satisMus.tarih}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    </table>
                </div>
                
        </div>
        
    </div>
    <script>
        function openNav() {
          document.getElementById("YanMenu").style.width = "250px";
          document.getElementById("main").style.marginLeft = "250px";
          document.body.style.backgroundColor = "gray";
        }
        function closeNav() {
          document.getElementById("YanMenu").style.width = "0";
          document.getElementById("main").style.marginLeft= "0";
          document.body.style.backgroundColor = "white";
        }
    </script> 
</body>
</html>
