<%-- 
    Document   : userSave
    Created on : 17.Ara.2020, 19:06:21
    Author     : sarik
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<head>
  <title>Kullanıcı Kayıt</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">   
    <style>
        body {
	background-image: url("image/arkaFon3.jpg");
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
        <div class="container" id="form">
            
            <div class="col-sm-offset-4">
                <label class><h3>Kullanıcı Kayıt</h3></label>
            </div>
            
            <form class="form-horizontal" action="ServletUser" method="post">
                <div class="form-group">
                      <label class="control-label col-sm-4" >Ad:</label>
                  <div class="col-sm-8">
                    <input class="form-control" placeholder="Adınızı Giriniz" name="name" required>
                  </div>
                </div>
                
                <div class="form-group">
                      <label class="control-label col-sm-4" >Soyad:</label>
                  <div class="col-sm-8">
                    <input class="form-control" placeholder="Soyadınızı Giriniz" name="surname" required>
                  </div>
                </div>
                
                <div class="form-group">
                      <label class="control-label col-sm-4" >Kullanıcı Adı:</label>
                  <div class="col-sm-8">
                    <input class="form-control" placeholder="Kullanıcı Adınızı Giriniz" name="username" required>
                  </div>
                </div>

                <div class="form-group">
                  <label class="control-label col-sm-4" for="pwd">Şifre:</label>
                  <div class="col-sm-8">          
                    <input type="password" class="form-control" placeholder="Şifrenizi Giriniz" name="pwd" required>
                  </div>
                </div>
                
                <div class="form-group">
                  <label class="control-label col-sm-4" for="pwd">Bakiye:</label>
                  <div class="col-sm-8">          
                    <input type="number" step="any" class="form-control" placeholder="Bakiye Giriniz" name="bakiye" required>
                  </div>
                </div>
                
                <div class="form-group">
                  <label class="control-label col-sm-4" for="pwd">E posta:</label>
                  <div class="col-sm-8">          
                    <input type="email" class="form-control" placeholder="E-postanızı Giriniz" name="mail" required>
                  </div>
                </div>

                <div class="form-group">        
                  <div class="col-sm-offset-4 col-sm-10">
                      <button type="submit" class="btn btn-primary">Hesap Oluştur</button>
                  </div>
                </div>
          </form>
        </div>
</body>
</html>