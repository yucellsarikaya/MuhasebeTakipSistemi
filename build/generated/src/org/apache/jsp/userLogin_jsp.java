package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<head>\n");
      out.write("  <title>Kullanıcı Giriş</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">   \n");
      out.write("    <style>\n");
      out.write("\tbody {\n");
      out.write("            background-image: url(\"image/arkaFon.jpg\");\n");
      out.write("        } \n");
      out.write("        #fon{ \n");
      out.write("           \n");
      out.write("          top: -50%; \n");
      out.write("          left: -50%; \n");
      out.write("          width: 200%; \n");
      out.write("          height: 200%;\n");
      out.write("        }\n");
      out.write("        #fon img{\n");
      out.write("          position: absolute; \n");
      out.write("          top: 0; \n");
      out.write("          left: 0; \n");
      out.write("          right: 0; \n");
      out.write("          bottom: 0; \n");
      out.write("          margin: auto; \n");
      out.write("          min-width: 50%;\n");
      out.write("          min-height: 50%;\n");
      out.write("        }\n");
      out.write("        #form{\n");
      out.write("             width:450px;\n");
      out.write("             border-radius:25px;\n");
      out.write("             margin-top:150px;\n");
      out.write("             font-weight:90;\n");
      out.write("             margin-left:150px;\n");
      out.write("             background-color:#E6F2F8;\n");
      out.write("             opacity:0.9;\n");
      out.write("             filter:alpha(opacity=50)  \n");
      out.write("             \n");
      out.write("                 \n");
      out.write("        }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

        String mesaj = (String) session.getAttribute("mesaj");
        if(mesaj != null){
            session.removeAttribute("mesaj");
    
      out.write("\n");
      out.write("            <script language=\"javascript\">\n");
      out.write("                alert(\"Yanlış şifre ve kullanıcı adı....\")\n");
      out.write("            </script> \n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    \n");
      out.write("        <div class=\"container\" id=\"form\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-offset-4\">\n");
      out.write("                <label class><h3>Kullanıcı Girişi</h3></label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <form class=\"form-horizontal\" action=\"ServletLogin\" method=\"POST\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label class=\"control-label col-sm-4\" >Kullanıcı Adı</label>\n");
      out.write("              <div class=\"col-sm-8\">\n");
      out.write("                <input class=\"form-control\" required placeholder=\"Kullanıcı Adı\" name=\"userName\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"control-label col-sm-4\" for=\"pwd\">Şifre:</label>\n");
      out.write("              <div class=\"col-sm-8\">          \n");
      out.write("                <input type=\"password\" class=\"form-control\" required placeholder=\"Şifre Giriniz\" name=\"pwd\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">        \n");
      out.write("              <div class=\"col-sm-offset-4 col-sm-10\">\n");
      out.write("                <div class=\"checkbox\">\n");
      out.write("                  <button type=\"submit\"><a href=\"userSaveLogin.jsp\">Hesap Oluştur</a></button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"form-group\">        \n");
      out.write("              <div class=\"col-sm-offset-4 col-sm-10\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Giriş</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
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
