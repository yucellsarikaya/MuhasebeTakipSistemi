<%-- 
    Document   : adminPaneli
    Created on : 09.Oca.2021, 23:28:12
    Author     : sarik
--%>

<%@page import="Class.ListGetir"%>
<%@page import="Class.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
 List<User> user = new ListGetir().usersGetir();
 request.setAttribute("user", user);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Yönetici Paneli</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
<body>
    <header>
            <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                <div>
                    <a>Muhasebe Takip Sistemi </a>
                </div>

                <ul class="navbar-nav">
                    <li><a href="firstScreen.jsp" class="nav-link">Çıkış</a></li>
                </ul>
            </nav>
    </header>
    <br/>
    <div class="container">
        <h3 class="text-center">Kullanıcılar</h3>
        <table class="table table-bordered">
        <thead class="thead-dark">
          <tr>
            <th scope="col">id</th>
            <th scope="col">İsim</th>
            <th scope="col">Soyisim</th>
            <th scope="col">Kullanıcı Adı</th>
            <th scope="col">Şifre</th>
            <th scope="col">E-Posta</th>
            <th scope="col">Bakiye</th>
            <th scope="col"></th>
          </tr>
        </thead>
        <tbody>
            <c:forEach items="${user}" var="user">
                <tr>
                    <td class="align-middle">${user.id}</td>
                    <td class="align-middle">${user.name}</td>
                    <td class="align-middle">${user.surname}</td>
                    <td class="align-middle">${user.username}</td>
                    <td class="align-middle">${user.pasw}</td>
                    <td class="align-middle">${user.mail}</td>
                    <td class="align-middle">${user.bakiye}</td>
                    <td class="align-middle"><a href="ServletUserDelete?id=${user.id}">Sil</a></td>
                </tr>
            </c:forEach>
        </tbody>
        </table>
    </div>
<hr><hr><hr>
</body>
</html>
