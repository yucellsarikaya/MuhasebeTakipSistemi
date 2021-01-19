<%@ page contentType="text/html; charset=UTF-8" %>
<head>
  <title>Kullanıcı Giriş</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">   
    <style>
	body {
            background-image: url("image/arkaFon.jpg");
        } 
        #fon{ 
           
          top: -50%; 
          left: -50%; 
          width: 200%; 
          height: 200%;
        }
        #fon img{
          position: absolute; 
          top: 0; 
          left: 0; 
          right: 0; 
          bottom: 0; 
          margin: auto; 
          min-width: 50%;
          min-height: 50%;
        }
        #form{
             width:450px;
             border-radius:25px;
             margin-top:150px;
             font-weight:90;
             margin-left:150px;
             background-color:#E6F2F8;
             opacity:0.9;
             filter:alpha(opacity=50)  
             
                 
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
                alert("Yanlış şifre ve kullanıcı adı....")
            </script> 
    <%
    }
    %>
    
        <div class="container" id="form">
            
            <div class="col-sm-offset-4">
                <label class><h3>Kullanıcı Girişi</h3></label>
            </div>
            
            <form class="form-horizontal" action="ServletLogin" method="POST">
              <div class="form-group">
                  <label class="control-label col-sm-4" >Kullanıcı Adı</label>
              <div class="col-sm-8">
                <input class="form-control" required placeholder="Kullanıcı Adı" name="userName">
              </div>
            </div>

            <div class="form-group">
              <label class="control-label col-sm-4" for="pwd">Şifre:</label>
              <div class="col-sm-8">          
                <input type="password" class="form-control" required placeholder="Şifre Giriniz" name="pwd">
              </div>
            </div>

            <div class="form-group">        
              <div class="col-sm-offset-4 col-sm-10">
                <div class="checkbox">
                  <button type="submit"><a href="userSaveLogin.jsp">Hesap Oluştur</a></button>
                </div>
              </div>
            </div>
                
            <div class="form-group">        
              <div class="col-sm-offset-4 col-sm-10">
                <button type="submit" class="btn btn-primary">Giriş</button>
              </div>
            </div>
          </form>
        </div>
</body>
</html>
