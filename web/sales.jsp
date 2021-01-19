<%-- 
    Document   : sales
    Created on : 02.Oca.2021, 20:18:51
    Author     : sarik
--%>
<%@page import="Class.ListGetir"%>
<%@page import="Class.StokList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    int x = (int) session.getAttribute("id");
    List<StokList> urunler = new ListGetir().urunGetir(x);
    request.setAttribute("urunler", urunler);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Satış İşlemleri</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
                <script defer src="https://use.fontawesome.com/releases/v5.8.2/js/all.js" integrity="sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH" crossorigin="anonymous"></script>

        <link rel="stylesheet" type="text/css" href="Css/style.css">
            <link rel="stylesheet" type="text/css" href="Css/custom-responsive-style.css"> 
                <script type="text/javascript" src="Kutuphaneler/jquery-3.2.1.min.js"></script>
                <script type="text/javascript" src="Kutuphaneler/all-plugins.js"></script>
                <script type="text/javascript" src="Kutuphaneler/plugin-active.js"></script>    
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
    <%
        String mesaj = (String) session.getAttribute("mesaj");
        if(mesaj != null){
            session.removeAttribute("mesaj");
    %>
            <script language="javascript">
                alert("Satış Başarılı....")
            </script> 
    <%
    }
    %>
    
    <%
    String mesaj1 = (String) session.getAttribute("mesaj1");
        if(mesaj1 != null){
            session.removeAttribute("mesaj1");
    %>
            <script language="javascript">
                alert("Seçilen ürünün adedi stokta yoktur!")
            </script> 
    <%
    }
    %>
    
                    
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
                            <h3 class="contact-title">Satış İşlemleri</h3>
                            <div class="contact-outer-wrapper">
                                <div class="form-wrap">
                                    <form action="ServletSales" method="POST">
                                        <div class="fname floating-label">
                                            <fieldset class="form-group">
                                                <div class="col-md-1 mb-1">
                                                    <select class="mdb-select md-form" name="item">
                                                        <option value="" disabled selected class="smooth-scroll">Ürünler</option>
                                                        <c:forEach items="${urunler}" var="urunler">
                                                            <option>${urunler.urunAdi}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </fieldset>
                                        </div>
                                        <br>
                                            <div class="floating-label">
                                                <input type="number" required class="floating-input" name="ucret" />
                                                <label for="number">Ürün Ücreti</label>
                                        </div>
                                            <br>
                                        <div class="floating-label">
                                                <input type="number" step="any" class="floating-input" name="kdv" />
                                                <label for="number" required>KDV tutarı</label>
                                        </div>
                                        <br>
                                        <div class="floating-label">
                                                <input type="number" class="floating-input" name="adet" />
                                                <label for="number">Ürün Adeti</label>
                                        </div>
                                        <br>
                                        <div class="fname floating-label">
                                                <input type="text" required class="floating-input" name="musteriAdi" />
                                                <label for="title">Müşteri İsmi</label>
                                            </div> 
                                        <br>
                                        <div class="fname floating-label">
                                                <input type="text" required class="floating-input" name="sirketAdi" />
                                                <label for="title">Şirketin İsmi</label>
                                        </div> 
                                        <br>
                                        <div class="fname floating-label">
                                                <input type="number" step="any" required class="floating-input" name="tel" />
                                                <label for="title">Telefon</label>
                                        </div> 
                                        <div class="submit-btn">
                                            <button type="submit">Satımı Başlat</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
                <script>
                    $(document).ready(function () {
                        $('.mdb-select').materialSelect();
                    });

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