package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import Class.Sales;

public final class fis_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.8.2/js/all.js\" integrity=\"sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        #container{\n");
      out.write("            width: 500px;\n");
      out.write("            height: 555px;\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 40%;\n");
      out.write("            top: 20%;\n");
      out.write("            margin-left: -100px;\n");
      out.write("            margin-top: -100px;\n");
      out.write("            border-style: groove;\n");
      out.write("            border: 2px solid black;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 24px; \n");
      out.write("            font-family: 'Source Sans Pro', sans-serif;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        #container1{\n");
      out.write("            font-size: 14px;\n");
      out.write("            padding: 10px 10px 10px 10px;\n");
      out.write("            font-family: 'Source Sans Pro', sans-serif;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        #container2{\n");
      out.write("            text-align: left;\n");
      out.write("            font-size: 10px;\n");
      out.write("            font-family: 'Source Sans Pro', sans-serif;\n");
      out.write("        }\n");
      out.write("        #container3{\n");
      out.write("            padding-top: 50px; \n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 14px;\n");
      out.write("            font-family: 'Source Sans Pro', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");

            String[] dizi= new String[10];
        
      out.write("\n");
      out.write("        ");

            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/proje";
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
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            int id = Integer.parseInt(request.getParameter("id"));
            if (id < 0) {
                id *= -1;
                try {
                    String query = "select * from urunsatis where id=?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setInt(1, id);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        dizi[0] = String.valueOf(rs.getInt("id"));
                        dizi[1] = rs.getString("urunAdi");
                        dizi[2] = rs.getString("sirketAdi");
                        dizi[3] = String.valueOf(rs.getInt("ucret"));
                        dizi[4] = String.valueOf(rs.getInt("adet"));
                        dizi[5] = String.valueOf(rs.getDate("tarih"));
                        dizi[6] = "Satıcı";
                        dizi[7] = String.valueOf(rs.getInt("ucret") * rs.getInt("adet"));
                        dizi[9] = "Satış";
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
                        dizi[1] = rs.getString("urunAdi");
                        dizi[2] = rs.getString("sirketAdi");
                        dizi[3] = String.valueOf(rs.getInt("ucret"));
                        dizi[4] = String.valueOf(rs.getInt("adet"));
                        dizi[5] = String.valueOf(rs.getDate("tarih"));
                        dizi[6] = "Alıcı";
                        dizi[7] = String.valueOf(rs.getInt("ucret") * rs.getInt("adet"));
                        dizi[9] = "Alış";
                    }
                } catch (Exception e) {
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"container\" class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-9\"><img src=\"image/logo.png\" border=0 width=32 height=32>Sarıkaya Muhasebe Bilgi Fişi</div>\n");
      out.write("            <div class=\"col-md-3\"style=\"font-size: 14px;\">");
      out.print( (new java.util.Date()).toLocaleString());
      out.write("</div>\n");
      out.write("        </div><hr width=\"100%\" color=\"black\" size=\"2\">\n");
      out.write("        <div id=\"container3\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">Sipariş No</div>\n");
      out.write("                <div class=\"col-md-3\">Ürün Adı</div>\n");
      out.write("                <div class=\"col-md-3\">Ürün Adeti</div>\n");
      out.write("                <div class=\"col-md-3\">Ürün Fiyatı</div> \n");
      out.write("            </div><hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">");
out.println(dizi[0]);
      out.write("</div>\n");
      out.write("                <div class=\"col-md-3\">");
out.println(dizi[1]);
      out.write("</div>\n");
      out.write("                <div class=\"col-md-3\">");
out.println(dizi[4]);
      out.write("</div>\n");
      out.write("                <div class=\"col-md-3\">");
out.println(dizi[3]);
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"container1\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\"></div>\n");
      out.write("                <div class=\"col-md-3\">Toplam: </div>\n");
      out.write("                <div class=\"col-md-3\">");
out.println(dizi[7]);
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"container1\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\"></div>\n");
      out.write("                <div class=\"col-md-3\">KDV:</div>\n");
      out.write("                <div class=\"col-md-3\">0.5</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"container1\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\"></div>\n");
      out.write("                <div class=\"col-md-5\">&nbsp;&nbsp;&nbsp;&nbsp;Genel Toplam:</div>\n");
      out.write("                <div class=\"col-md-2\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;180</div>\n");
      out.write("            </div><hr>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"container2\">\n");
      out.write("            <div><strong>");
out.println(dizi[6]);
      out.write("Bilgileri:</strong></div><br>\n");
      out.write("            <div>Şirketin Adı:");
out.println(dizi[2]);
      out.write("</div><br>\n");
      out.write("            <div>Müşterin Adı: Cebrail Söyletmez</div><br>\n");
      out.write("            <div>");
out.println(dizi[9]);
      out.write(" Tarihi: ");
out.println(dizi[5]);
      out.write("</div><br>\n");
      out.write("            <div>Telefon: 0555 555 55 55</div><br>\n");
      out.write("            <div>Adres:Demirlibahçe Mah Talatpaşa Bulv, Uzgörenler Sk. No: 4 D: A, 06340 Mamak/Ankara</div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"container3\">\n");
      out.write("            <div><i class=\"fas fa-map-marker-alt\"></i>&nbsp;Kızılay, Selanik Cd 49-9, 06420 Çankaya/Ankara&nbsp;&nbsp;&nbsp;<i class=\"fas fa-phone-volume\"></i>&nbsp;0312 123 45 67</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
