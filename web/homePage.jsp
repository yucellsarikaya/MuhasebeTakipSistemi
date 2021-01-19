<%-- 
    Document   : homePage
    Created on : 12.Ara.2020, 21:56:11
    Author     : sarik
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Anasayfa</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script defer src="https://use.fontawesome.com/releases/v5.8.2/js/all.js" integrity="sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH" crossorigin="anonymous"></script>

        <style>   
         body {
            background-image: url("image/arkaFon.jpg");
        }    
            
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
                alert("Giriş Başarılı....")
            </script> 
    <%
    }
    %>
    
        <%
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/donemodevi";
            String user = "root";
            String pass = "1234";
            Connection con = null;
            try {
                Class.forName(driver);
            } catch (Exception e) {
                System.exit(0);
            }
            try {
                con = DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                System.exit(0);
            }
%>
<%
            int id = (int) session.getAttribute("id");
            String[] dizi= new String[6];
                try {
                    String query = "select * from users where id_user=?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setInt(1, id);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        dizi[0] = String.valueOf(rs.getInt("id_user"));
                        dizi[1] = rs.getString("name_user");
                        dizi[2] = rs.getString("surname_user");
                        dizi[3] = rs.getString("username_user");
                        dizi[4] = rs.getString("email_user");
                        dizi[5] = String.valueOf(rs.getDouble("bakiye"));
                    }
                } catch (Exception e) {
                }
 %>
    <div id="YanMenu" class="sidenav">
        <center><strong><a href="javascript:void(0)" class="btn btn-dark" onclick="closeNav()"  ><i class="fas fa-times"></i></a></strong></center> <!--Yan menuyu kapar-->
                        <strong><a href="homePage.jsp" class="smooth-scroll" style="font-size:20px; padding-top:18px;"><i class="fas fa-home"></i>&nbsp;&nbsp;Anasayfa</i></a></strong>
                        <strong><a href="buying.jsp" class="smooth-scroll" style="font-size:20px;padding-top:18px;"><i class="fas fa-hand-holding-usd"></i>&nbsp;&nbsp;Alış İşlemleri</a></strong>
                        <strong><a href="sales.jsp" class="smooth-scroll" style="font-size:20px;padding-top:18px;"><i class="far fa-handshake"></i>&nbsp;&nbsp;Satış İşlemleri</a></strong>
                        <strong><a href="stokList.jsp" class="smooth-scroll" style="font-size:20px;padding-top:18px;"><i class="fas fa-store-alt"></i>&nbsp;&nbsp;Stok Durumu</a></strong>
                        <strong><a href="customerForm.jsp" class="smooth-scroll" style="font-size:20px;padding-top:18px;"><i class="fas fa-users"></i>&nbsp;&nbsp;Müşteri Formu</a></strong>
                        <strong><a href="cari.jsp" class="smooth-scroll" style="font-size:20px;padding-top:18px;"><i class="fas fa-wallet"></i>&nbsp;&nbsp;Cari</a></strong>
                        <strong><a href="iletisim.jsp" class="smooth-scroll" style="font-size:20px;padding-top:18px;"><i class="fas fa-address-card"></i>&nbsp;&nbsp;İletişim</a></strong>
                        <strong><a href="firstScreen.jsp" class="smooth-scroll" style="font-size:20px;padding-top:15px;"><i class="fas fa-sign-out-alt"></i>&nbsp;&nbsp;Çıkış</a></strong>
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
        
        <div class="container emp-profile card text-center" style="background-color:#E6F2F8; opacity:0.9; filter:alpha(opacity=50)">
            <form method="post">
                <div class="row">
                    <div class="col-md-6">
                        <div class="profile-head ">
                                    <h5>
                                        <%out.println(dizi[1] + " " + dizi[2]);%>
                                    </h5>
                                    <h6>
                                        Muhasebe Takip Kullanıcsı
                                    </h6>
                            <ul class="nav nav-tabs" id="myTab" role="tablist">
                                <li class="nav-item">
                                    <p class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Kişi Bilgileri</p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-8">
                        <div class="tab-content profile-tab" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Kullanıcı Adı</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%out.println(dizi[3]);%></p>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Email</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%out.println(dizi[4]);%></p>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Bakiye</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%out.println(dizi[5]);%></p>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Meslek</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p>Muhasebe</p>
                                            </div>
                                        </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>           
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
          document.getElementById("main").style.marginLeft= "0";
          document.body.style.backgroundColor = "white";
        }
    </script> 
</body>
</html>
