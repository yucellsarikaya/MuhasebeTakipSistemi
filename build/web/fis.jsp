<%-- 
    Document   : fis
    Created on : 06.Oca.2021, 19:30:41
    Author     : sarik
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="Class.Sales"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script defer src="https://use.fontawesome.com/releases/v5.8.2/js/all.js" integrity="sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH" crossorigin="anonymous"></script>

        <title>JSP Page</title>
    </head>
    <style>
        .genel {
            font-family: 'Source Sans Pro', sans-serif;
            text-align: center;
        }
        
        #container{
            width: 500px;
            height: 555px;
            background-color: #f2f2f2;
            position: absolute;
            left: 40%;
            top: 20%;
            margin-left: -100px;
            margin-top: -100px;
            border-style: groove;
            border: 2px solid black;
            border-radius: 5px;
            font-size: 24px;           
        }
    </style>
    <body>
        <%
            String[] dizi= new String[15];
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
            int id = Integer.parseInt(request.getParameter("urunId"));
            if (id < 0) {
                id = id * (-1);
                try {
                    String query = "select * from urunsatisi where id=?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setInt(1, id);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        dizi[0] = String.valueOf(rs.getInt("id"));
                        dizi[1] = rs.getString("urunAdiSatis");
                        dizi[2] = String.valueOf(rs.getInt("urunAdetSatis"));
                        dizi[3] = String.valueOf(rs.getInt("urunUcretSatis"));
                        dizi[4] = String.valueOf(rs.getInt("urunUcretSatis")*rs.getInt("urunAdetSatis"));
                        dizi[5] = String.valueOf(rs.getFloat("urunKDVSatis"));
                        dizi[6] = String.valueOf(((rs.getInt("urunUcretSatis")*rs.getFloat("urunKDVSatis"))*rs.getInt("urunAdetSatis"))+(rs.getFloat("urunUcretSatis")*rs.getInt("urunAdetSatis")));
                        dizi[7] = "Alıcı";
                        dizi[8] = rs.getString("urunSirketSatis");
                        dizi[9] = rs.getString("urunMusteriSatis");
                        dizi[10] = "Satış";
                        dizi[11] =  String.valueOf(rs.getDate("tarihSatis"));
                        dizi[12] = rs.getString("urunTelefonSatis");
                    }
                } catch (Exception e) {
                }
            } else {
                try {
                    String query = "select * from urunalimi where id=?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setInt(1, id);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        dizi[0] = String.valueOf(rs.getInt("id"));
                        dizi[1] = rs.getString("urunAdiAlim");
                        dizi[2] = String.valueOf(rs.getInt("urunAdetAlim"));
                        dizi[3] = String.valueOf(rs.getInt("urunUcretAlim"));
                        dizi[4] = String.valueOf(rs.getInt("urunUcretAlim")*rs.getInt("urunAdetAlim"));
                        dizi[5] = String.valueOf(rs.getFloat("urunKDVAlim"));
                        dizi[6] = String.valueOf(((rs.getInt("urunUcretAlim")*rs.getFloat("urunKDVAlim"))*rs.getInt("urunAdetAlim"))+(rs.getFloat("urunUcretAlim")*rs.getInt("urunAdetAlim")));
                        dizi[7] = "Satıcı";
                        dizi[8] = rs.getString("urunSirketAlim");
                        dizi[9] = rs.getString("urunMusteriAlim");
                        dizi[10] = "Alış";
                        dizi[11] =  String.valueOf(rs.getDate("tarihAlim"));
                        dizi[12] = rs.getString("urunTelefonAlim");
                    }
                } catch (Exception e) {
                }
            }
        %>
            


    <div id="container" class="container-fluid">
        <div class="row">
            <div class="col-md-9"><img src="image/logo.png" border=0 width=32 height=32>Sarıkaya Muhasebe Bilgi Fişi</div>
            <div class="col-md-3"style="font-size: 14px;"><%= (new java.util.Date()).toLocaleString()%></div>
        </div><hr width="100%" color="black" size="2">
        <div style="font-size:16px; padding:5px 10px 10px 10px;" class="genel">
            <div class="row">
                <div class="col-md-3">Sipariş No</div>
                <div class="col-md-3">Ürün Adı</div>
                <div class="col-md-3">Ürün Adeti</div>
                <div class="col-md-3">Ürün Fiyatı</div> 
            </div><hr>
            <div class="row" style="font-size: 12px;">
                <div class="col-md-3"><%out.println(dizi[0]);%></div>
                <div class="col-md-3"><%out.println(dizi[1]);%></div>
                <div class="col-md-3"><%out.println(dizi[2]);%></div>
                <div class="col-md-3"><%out.println(dizi[3]);%></div>
            </div>
        </div>
        <div style="font-size:12px; padding:5px 10px 10px 10px;" class="genel">
            <div class="row">
                <div class="col-md-6"></div>
                <div class="col-md-3">Toplam: </div>
                <div class="col-md-3"><%out.println(dizi[4]);%></div>
            </div>
        </div>
        <div style="font-size:12px; padding:5px 10px 10px 10px;" class="genel">
            <div class="row">
                <div class="col-md-6"></div>
                <div class="col-md-3">KDV:</div>
                <div class="col-md-3"><%out.println(dizi[5]);%></div>
            </div>
        </div>
        <div style="font-size: 12px; padding:5px 10px 10px 10px;" class="genel">
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-5">&nbsp;&nbsp;&nbsp;&nbsp;Genel Toplam:</div>
                <div class="col-md-2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%out.println(dizi[6]);%></div>
            </div><hr>
        </div>
        <div style="text-align:left; font-size:10px;" class="genel">
            <div><strong><%out.println(dizi[7]);%>Bilgileri:</strong></div><br>
            <div>Şirketin Adı:<%out.println(dizi[8]);%></div><br>
            <div>Müşteri Adı: <%out.println(dizi[9]);%></div><br>
            <div><%out.println(dizi[10]);%> Tarihi: <%out.println(dizi[11]);%></div><br>
            <div>Telefon: <%out.println(dizi[12]);%> </div><br>
        </div>
        <div  style="padding-top:50px; font-size:13px;" class="genel">
            <div><i class="fas fa-map-marker-alt"></i>&nbsp;Kızılay, Selanik Cd 49-9, 06420 Çankaya/Ankara&nbsp;&nbsp;&nbsp;<i class="fas fa-phone-volume"></i>&nbsp;0312 123 45 67</div>
        </div>
    </div>
</body>
</html>
