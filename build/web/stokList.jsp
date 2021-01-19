<%-- 
    Document   : stokList
    Created on : 03.Oca.2021, 20:34:10
    Author     : sarik
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Class.ListGetir"%>
<%@page import="Class.StokList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    int x = (int) session.getAttribute("id");
    List<StokList> stoks = new ListGetir().getirTumListe(x);
    request.setAttribute("stoks", stoks);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Stok Listesi</title>
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
                <h3 class="text-center">Stok Listesi</h3>
                <hr>
                <br>
                <table class="table table-sm table-hover table-bordered table-striped">
                    <thead class="thead-light">
                        <tr>
                            <th scope="col">Ürün adı</th>
                            <th scope="col">Ürün Fiyat</th>
                            <th scope="col">Ürün KDV</th>
                            <th scope="col">Toplam Adet</th>
                            <th scope="col">Toplam Fiyat</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${stoks}" var="stoks">
                            <tr>
                                <td class="align-middle">${stoks.urunAdi}</td>
                                <td class="align-middle">${stoks.ucret}</td>
                                <td class="align-middle">${stoks.kdv}</td>
                                <td class="align-middle">${stoks.adet}</td>
                                <td class="align-middle">${((stoks.ucret * stoks.kdv) * stoks.adet) + (stoks.ucret * stoks.adet)}</td>
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
            document.body.style.backgroundColor = "white";
        }
        function closeNav() {
            document.getElementById("YanMenu").style.width = "0";
            document.getElementById("main").style.marginLeft = "0";
            document.body.style.backgroundColor = "white";
        }
    </script> 
</body>
</html>
