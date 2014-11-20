package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InicioSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sistema de Inventario</title>\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" css/bootstrap.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" css/bootstrap-theme.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" css/lightbox.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" css/main.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" css/media.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" css/result-consulta.css\" >\n");
      out.write("        <link rel=\"shortcut icon\" href=\" images/favicon_64.gif\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\" images/favicon_64.gif\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\" class=\"jumbotron\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a href=\"http://www.unam.mx/\" id=\"escudoUNAM\">\n");
      out.write("                    <img alt=\"Universidad Nacional Autónoma de México, UNAM\" src=\"images/unam-logo.png\"/>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"#\" id=\"header-title\">\n");
      out.write("                    Sistema de Inventario <br>Bibliotecario\n");
      out.write("                </a>\n");
      out.write("                <img id=\"banner_iib\" src=\"images/banner_iib.jpg\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"menu\" class=\"navbar\">\n");
      out.write("            <div class=\"container-fluid\" role=\"navigation\">\n");
      out.write("                <ul class=\"nav navbar-nav nav-pills\">\n");
      out.write("                    <!-- <li><a >Acceso</a></li> -->\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"main\">\n");
      out.write("\n");
      out.write("            <div id=\"main-container\" class=\"container-fluid\" role=\"main\">\n");
      out.write("\n");
      out.write("                <div id=\"main-title\" class=\"page-header\">\n");
      out.write("                    <h1><small>Inicio de Sesi&oacute;n</small> </h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"content\"> \n");
      out.write("\n");
      out.write("                    <div id=\"main-content\">\t\n");
      out.write("                        ");

                            if (request.getParameter("error") != null) { 
                                String error = request.getParameter("error");
                                 if(error.equals("NA")){
                                     
      out.write("\n");
      out.write("                                             <div class=\"alert alert-danger\" role=\"alert\"><p>Usuario no activo. Pasar con administrador para activar cuenta.</p></div>                                             \n");
      out.write("                        ");

                                 } else{
                           
      out.write("\n");
      out.write("                           <div class=\"alert alert-danger\" role=\"alert\"><p>Usuario no existente. Rectificar datos. </p></div>\n");
      out.write("                           ");

                                 }                    
                        
                            }
                        
      out.write("\n");
      out.write("                        <form class=\"form-horizontal\" role=\"form\" action=\"validadorSesion.jsp\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Correo</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input pattern=\"[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}\" type=\"email\" name=\"correo\" class=\"form-control\" id=\"inputEmail3\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Contraseña</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"password\" name=\"contrasenia\" class=\"form-control\" id=\"inputPassword3\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-10\">                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">Entrar</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"footer\" >\n");
      out.write("            <div class=\"container-fluid\" role=\"footer\">\n");
      out.write("                <p>2014 &copy; Biblioteca Nacional.<br>\n");
      out.write("                    Hemeroteca Nacional, Ciudad Universitaria. Universidad Nacional Autónoma de México.<br>\n");
      out.write("                    <a href=\"http://www.iib.unam.mx/\">IIB</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\" js/jquery.js\"></script>\n");
      out.write("        <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("        <script src=\" js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\" js/lightbox.js\"></script>\n");
      out.write("        <script src=\" js/async_content.js\"></script>\n");
      out.write("        <script src=\" js/async-consulta.js\"></script>\n");
      out.write("        <script src=\" js/async_contact.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
