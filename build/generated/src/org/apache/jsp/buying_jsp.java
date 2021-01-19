package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buying_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Alış İşlemleri</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("                <script defer src=\"https://use.fontawesome.com/releases/v5.8.2/js/all.js\" integrity=\"sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Css/style.css\">\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"Css/custom-responsive-style.css\"> \n");
      out.write("                <script type=\"text/javascript\" src=\"Kutuphaneler/jquery-3.2.1.min.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"Kutuphaneler/all-plugins.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"Kutuphaneler/plugin-active.js\"></script>\n");
      out.write("                <style>   \n");
      out.write("                    .sidenav {\n");
      out.write("                        height: 100%;\n");
      out.write("                        width: 0;\n");
      out.write("                        position: fixed;\n");
      out.write("                        z-index: 1;\n");
      out.write("                        top: 0;\n");
      out.write("                        left: 0;\n");
      out.write("                        background-color: #8DB4C7;\n");
      out.write("                        overflow-x: hidden;\n");
      out.write("                        transition: 0.5s;\n");
      out.write("                        padding-top: 60px;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .sidenav a {\n");
      out.write("                        padding: 8px 8px 8px 32px;\n");
      out.write("                        color: white;\n");
      out.write("                        display: block;\n");
      out.write("                        transition: 0s;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .sidenav a:hover {\n");
      out.write("                        color: black; \n");
      out.write("                        background: #f1f1f1;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    .sidenav .closebtn {\n");
      out.write("                        position: absolute;\n");
      out.write("                        top: 0;\n");
      out.write("                        right: 25px;\n");
      out.write("                        margin-left: 100px;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    #main {\n");
      out.write("                        transition: margin-left .5s;\n");
      out.write("                        padding: 16px;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    @media screen and (max-height: 450px) {\n");
      out.write("                        .sidenav {padding-top: 15px;}\n");
      out.write("                        .sidenav a {font-size: 18px;}\n");
      out.write("                    }\n");
      out.write("                </style>  \n");
      out.write("                </head>\n");
      out.write("                <body>\n");
      out.write("                    ");

        String mesaj = (String) session.getAttribute("mesaj");
        if(mesaj != null){
            session.removeAttribute("mesaj");
    
      out.write("\n");
      out.write("            <script language=\"javascript\">\n");
      out.write("                alert(\"Alım Başarılı....\")\n");
      out.write("            </script> \n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("                <div id=\"YanMenu\" class=\"sidenav\">\n");
      out.write("        <center><strong><a href=\"javascript:void(0)\" class=\"btn btn-dark\" onclick=\"closeNav()\" ><i class=\"fas fa-times\"></i></a></strong></center> <!--Yan menuyu kapar-->\n");
      out.write("                        <strong><a href=\"homePage.jsp\" class=\"smooth-scroll\"><i class=\"fas fa-home\"></i>&nbsp;&nbsp;Anasayfa</i></a></strong>\n");
      out.write("                        <strong><a href=\"buying.jsp\" class=\"smooth-scroll\"><i class=\"fas fa-hand-holding-usd\"></i>&nbsp;&nbsp;Alış İşlemleri</a></strong>\n");
      out.write("                        <strong><a href=\"sales.jsp\" class=\"smooth-scroll\"><i class=\"far fa-handshake\"></i>&nbsp;&nbsp;Satış İşlemleri</a></strong>\n");
      out.write("                        <strong><a href=\"stokList.jsp\" class=\"smooth-scroll\"><i class=\"fas fa-store-alt\"></i>&nbsp;&nbsp;Stok Durumu</a></strong>\n");
      out.write("                        <strong><a href=\"customerForm.jsp\" class=\"smooth-scroll\"><i class=\"fas fa-users\"></i>&nbsp;&nbsp;Müşteri Formu</a></strong>\n");
      out.write("                        <strong><a href=\"cari.jsp\" class=\"smooth-scroll\"><i class=\"fas fa-wallet\"></i>&nbsp;&nbsp;Cari</a></strong>\n");
      out.write("                        <strong><a href=\"iletisim.jsp\" class=\"smooth-scroll\"><i class=\"fas fa-address-card\"></i>&nbsp;&nbsp;İletişim</a></strong>\n");
      out.write("                        <strong><a href=\"firstScreen.jsp\" class=\"smooth-scroll\"><i class=\"fas fa-sign-out-alt\"></i>&nbsp;&nbsp;Çıkış</a></strong>\n");
      out.write("    </div>\n");
      out.write("                    <div id=\"main\">\n");
      out.write("                        <header>\n");
      out.write("                            <nav class=\"navbar navbar-expand-md navbar-dark\" style=\"background-color: #8DB4C7\">\n");
      out.write("                                <div>\n");
      out.write("                                    <img src=\"image/logo.png\" border=0 width=50 height=50>\n");
      out.write("                                    <a class=\"navbar-brand\"> Sarıkaya Muhasebe Takip Sistemi</a>\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\n");
      out.write("                        </header>\n");
      out.write("\n");
      out.write("                        <span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776;</span> <!--Yan menuyu acar-->\n");
      out.write("                        <br>\n");
      out.write("                        <section id=\"ContactUs\">\n");
      out.write("                            <div class=\"container contact-container\">\n");
      out.write("                                <h3 class=\"contact-title\">Alış İşlemleri</h3>\n");
      out.write("                                <div class=\"contact-outer-wrapper\">\n");
      out.write("                                    <div class=\"form-wrap\">\n");
      out.write("                                        <form action=\"ServletBuying\" method=\"POST\">\n");
      out.write("                                            <div class=\"fname floating-label\">\n");
      out.write("                                                <input type=\"text\" required class=\"floating-input\" name=\"urunAdi\" />\n");
      out.write("                                                <label for=\"title\">Ürün İsmi</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"floating-label\">\n");
      out.write("                                                <input type=\"number\" step=\"any\" required class=\"floating-input\" name=\"ucret\" />\n");
      out.write("                                                <label for=\"number\">Ürün Ücreti</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"floating-label\">\n");
      out.write("                                                <input type=\"number\" step=\"any\" class=\"floating-input\" name=\"kdv\" />\n");
      out.write("                                                <label for=\"number\" required>KDV tutarı</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"floating-label\">\n");
      out.write("                                                <input type=\"number\" class=\"floating-input\" name=\"adet\" />\n");
      out.write("                                                <label for=\"number\">Ürün Adeti</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"fname floating-label\">\n");
      out.write("                                                <input type=\"text\" required class=\"floating-input\" name=\"musteriAdi\" />\n");
      out.write("                                                <label for=\"title\">Müşteri İsmi</label>\n");
      out.write("                                            </div> \n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"fname floating-label\">\n");
      out.write("                                                <input type=\"text\" required class=\"floating-input\" name=\"sirketAdi\" />\n");
      out.write("                                                <label for=\"title\">Şirketin İsmi</label>\n");
      out.write("                                            </div> \n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"fname floating-label\">\n");
      out.write("                                                <input type=\"number\" step=\"any\" required class=\"floating-input\" name=\"tel\" />\n");
      out.write("                                                <label for=\"title\">Telefon</label>\n");
      out.write("                                            </div> \n");
      out.write("                                            <br>\n");
      out.write("                                            <div class=\"submit-btn\">\n");
      out.write("                                                <button type=\"submit\">Alımı Başlat</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    <script>\n");
      out.write("                        function openNav() {\n");
      out.write("                            document.getElementById(\"YanMenu\").style.width = \"250px\";\n");
      out.write("                            document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("                            document.body.style.backgroundColor = \"gray\";\n");
      out.write("                        }\n");
      out.write("                        function closeNav() {\n");
      out.write("                            document.getElementById(\"YanMenu\").style.width = \"0\";\n");
      out.write("                            document.getElementById(\"main\").style.marginLeft = \"0\";\n");
      out.write("                            document.body.style.backgroundColor = \"white\";\n");
      out.write("                        }\n");
      out.write("                    </script> \n");
      out.write("                    </body>\n");
      out.write("                    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
