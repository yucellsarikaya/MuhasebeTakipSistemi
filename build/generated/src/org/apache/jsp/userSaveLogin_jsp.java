package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userSaveLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Kullanıcı Kayıt</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">   \n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("\tbackground-image: url(\"image/arkaFon3.jpg\");\n");
      out.write("            } \n");
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
      out.write("        <div class=\"container\" id=\"form\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-offset-4\">\n");
      out.write("                <label class><h3>Kullanıcı Kayıt</h3></label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <form class=\"form-horizontal\" action=\"ServletUser\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                      <label class=\"control-label col-sm-4\" >Ad:</label>\n");
      out.write("                  <div class=\"col-sm-8\">\n");
      out.write("                    <input class=\"form-control\" placeholder=\"Adınızı Giriniz\" name=\"name\" required>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                      <label class=\"control-label col-sm-4\" >Soyad:</label>\n");
      out.write("                  <div class=\"col-sm-8\">\n");
      out.write("                    <input class=\"form-control\" placeholder=\"Soyadınızı Giriniz\" name=\"surname\" required>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                      <label class=\"control-label col-sm-4\" >Kullanıcı Adı:</label>\n");
      out.write("                  <div class=\"col-sm-8\">\n");
      out.write("                    <input class=\"form-control\" placeholder=\"Kullanıcı Adınızı Giriniz\" name=\"username\" required>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label class=\"control-label col-sm-4\" for=\"pwd\">Şifre:</label>\n");
      out.write("                  <div class=\"col-sm-8\">          \n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"Şifrenizi Giriniz\" name=\"pwd\" required>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label class=\"control-label col-sm-4\" for=\"pwd\">Bakiye:</label>\n");
      out.write("                  <div class=\"col-sm-8\">          \n");
      out.write("                    <input type=\"number\" step=\"any\" class=\"form-control\" placeholder=\"Bekiye Giriniz\" name=\"bakiye\" required>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label class=\"control-label col-sm-4\" for=\"pwd\">E posta:</label>\n");
      out.write("                  <div class=\"col-sm-8\">          \n");
      out.write("                    <input type=\"email\" class=\"form-control\" placeholder=\"E-postanızı Giriniz\" name=\"mail\" required>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">        \n");
      out.write("                  <div class=\"col-sm-offset-4 col-sm-10\">\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-primary\">Hesap Oluştur</button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
