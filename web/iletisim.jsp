<%-- 
    Document   : iletisim
    Created on : 07.Oca.2021, 15:52:20
    Author     : sarik
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>İletişim Bilgileri</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
                <script defer src="https://use.fontawesome.com/releases/v5.8.2/js/all.js" integrity="sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH" crossorigin="anonymous"></script>

        <link href="https://use.fontawesome.com/releases/v5.0.7/css/all.css" rel="stylesheet">
            <link rel="stylesheet" type="text/css" href="Css/style.css">
                <link rel="stylesheet" type="text/css" href="Css/custom-responsive-style.css">
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
                        <section id="ContactUs">
                            <div class="container contact-container">
                                <div class="contact-outer-wrapper">
                                    <div class="address-block">
                                        <p class="add-title">İletişim Bilgileri</p>
                                        <div class="c-detail">
                                            <div class="c-icon"><i class="fas fa-address-book" aria-hidden="true"></i></div>
                                            <div class="c-info">
                                                <h4>Adres</h4>
                                                <p><a>Kızılay, Selanik Cd 49-9, 06420 Çankaya/Ankara</a></p>
                                            </div>
                                        </div>
                                        <div class="c-detail">
                                            <div class="c-icon"><i class="fas fa-phone-square" aria-hidden="true"></i></div>
                                            <div class="c-info">
                                                <h4>Telefon</h4>
                                                <p><a>0312 123 45 67</a></p>
                                            </div>
                                        </div>
                                        <div class="c-detail">
                                            <div class="c-icon"><i class="fas fa-envelope" aria-hidden="true"></i></div>
                                            <div class="c-info">
                                                <h4>Email</h4>
                                                <p><a>sarikayaMuhasebe@gmail.com</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
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