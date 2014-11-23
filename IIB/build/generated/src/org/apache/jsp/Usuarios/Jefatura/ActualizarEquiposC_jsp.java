package org.apache.jsp.Usuarios.Jefatura;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Controlador.Equipo;
import Conexion.ConexionBD;

public final class ActualizarEquiposC_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sistema de Inventario</title>\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" ../../css/bootstrap.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" ../../css/bootstrap-theme.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" ../../css/lightbox.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" ../../css/main.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" ../../css/style3.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" ../../css/media.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" ../../css/result-consulta.css\" >\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\" ../../css/datepicker.css\" >\n");
      out.write("        <link rel=\"shortcut icon\" href=\" ../../images/favicon_64.gif\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\" ../../images/favicon_64.gif\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\" class=\"jumbotron\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a href=\"http://www.unam.mx/\" id=\"escudoUNAM\">\n");
      out.write("                    <img alt=\"Universidad Nacional Autónoma de México, UNAM\" src=\"../../images/unam-logo.png\"/>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"#\" id=\"header-title\">\n");
      out.write("                    Sistema de Inventario <br>Bibliotecario\n");
      out.write("                </a>\n");
      out.write("                <img id=\"banner_iib\" src=\"../../images/banner_iib.jpg\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"menu\" class=\"navbar\">\n");
      out.write("            <div class=\"container-fluid\" role=\"navigation\">\n");
      out.write("                <form method=\"post\" action=\"../../cerrarSesion.jsp\">               \n");
      out.write("                    <button type=\"submit\" id=\"cerrarS\">Salir</button>                                 \n");
      out.write("                </form>                    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"main\">\n");
      out.write("\n");
      out.write("            <div id=\"main-container\" class=\"container-fluid\" role=\"main\">\n");
      out.write("\n");
      out.write("                <div id=\"main-title\" class=\"page-header\">\n");
      out.write("                    <h1><small>Jefatura de departamento.</small> </h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"content\" > \n");
      out.write("                    <div id=\"vertical-menu\">\n");
      out.write("\n");
      out.write("                        <div id=\"menu1\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"nivel1 primera\">\n");
      out.write("                                    <a class=\"nivel1\">Equipos</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"RegistrarEquipos.jsp\">Registrar </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"ActualizarEquipos.jsp\">Actualizar</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nivel1 primera\">\n");
      out.write("                                    <a class=\"nivel1\">Movimientos</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nivel1 primera\">\n");
      out.write("                                    <a class=\"nivel1\">Usuarios</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"RegistrarUsuarios.jsp\">Registrar</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"BajaUsuarios.jsp\">Dar de Baja</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"CambioContraseniaUsuario.jsp\">Nueva Contraseña</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nivel1 primera\">\n");
      out.write("                                    <a class=\"nivel1\">Catálogos</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"AgregarCatalogo.jsp\">Crear</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"consultarCatalogos.jsp\">Consultar</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nivel1 primera\">\n");
      out.write("                                    <a class=\"nivel1\">Consultas</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nivel1 primera\">\n");
      out.write("                                    <a href=\"CambioContrasenia.jsp\">Cambiar Contraseña</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"main-content\">\t\n");
      out.write("\n");
      out.write("                        <h2>Actualizar equipo.</h2>\n");
      out.write("                        ");

                            int nI = Integer.parseInt(request.getParameter("numI"));
                            Equipo e = new Equipo(nI);
                            if (e.getCount() == 0) {//si es distinto a 0 entonces al menos existe 1
                                response.sendRedirect("ActualizarEquipos.jsp?error=NE");
                            } else {//existe un equipo con ese número.
      out.write("\n");
      out.write("                        <!--apartado para mostrar las características del equipo-->  \n");
      out.write("                        <form class=\"form-horizontal\" role=\"form\" action=\"GuardarEquipo.jsp\" method=\"post\">\n");
      out.write("                            <div id=\"equipo\">\n");
      out.write("                                <section id =\"izquierda\">\n");
      out.write("                                    <p>Número de inventario informática:<span><input type=\"text\" class=\"input-group input-group-sm\" name=\"invInf\" style=\"width : 200px\" value=\"");
      out.print( e.getNumInformatica());
      out.write("\"></span></p>\n");
      out.write("                                    <p>Número de inventario UNAM <span><input type=\"text\" class=\"input-group input-group-sm\" name=\"invUNAM\" style=\"width : 200px\" value=\"");
      out.print( e.getNumUNAM());
      out.write("\"></span></p>\n");
      out.write("                                    <p>Número de inventario departamento<span><input type=\"text\" class=\"input-group input-group-sm\" name=\"numInvD\" style=\"width : 200px\"value=\"");
      out.print( e.getNumDepto());
      out.write("\"></span></p>   \n");
      out.write("                                    <p>Descripción<span><input type=\"text\" class=\"input-group input-group-sm\" name=\"descripcion\" style=\"width : 200px\"value=\"");
      out.print( e.getDescripcion());
      out.write("\"></span></p>\n");
      out.write("                                    <p>Serie<span><input type=\"text\" class=\"input-group input-group-sm\" name=\"serie\" style=\"width : 200px\"value=\"");
      out.print( e.getSerie());
      out.write("\"></span></p>\n");
      out.write("                                    <p>Fecha de registro<span><input type=\"text\" class=\"input-group input-group-sm\" name=\"fechaReg\" style=\"width : 200px\"value=\"\"></span></p>\n");
      out.write("                                    <p>Fecha de resguardo <span><input type=\"text\" class=\"input-group input-group-sm\" name=\"fechaRes\" style=\"width : 200px\"value=\"\"></span></p>                                    \n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"submit\">Guardar</button>          \n");
      out.write("\n");
      out.write("                                </section>\n");
      out.write("\n");
      out.write("                                <section id=\"derecha\">\n");
      out.write("                                    ");

                                        ConexionBD c = new ConexionBD();
                                        c.conectarBD();
                                        ResultSet r;
                                        String descripcion;
                                        int id;
                                    
      out.write("          \n");
      out.write("\n");
      out.write("                                    <label>Clase:</label>\n");
      out.write("                                    <select name=\"clase\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Clase;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getClase()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
                                            if (id == 0) {
      out.write("\n");
      out.write("                                        <option value=\"0\"></option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                    }
                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br> \n");
      out.write("\n");
      out.write("                                    <label>Estado:</label>\n");
      out.write("                                    <select name=\"estado\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Estado;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getEstado()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
                                            if (id == 0) {
      out.write("\n");
      out.write("                                        <option value=\"0\"></option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                    }
                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br>\n");
      out.write("\n");
      out.write("                                    <label>Estado Físico:</label>\n");
      out.write("                                    <select name=\"estadoF\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM EstadoFisico;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getEstadoFisico()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
                                            if (id == 0) {
      out.write("\n");
      out.write("                                        <option value =\"0\"></option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                    }
                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br> \n");
      out.write("\n");
      out.write("                                    <label>Familia:</label>\n");
      out.write("                                    <select name=\"familia\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Familia;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getFamilia()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
                                            if (id == 0) {
      out.write("\n");
      out.write("                                        <option value=\"0\"></option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                    }
                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br>\n");
      out.write("                                    <label>Marca:</label>\n");
      out.write("                                    <select name=\"marca\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Marca;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getMarca()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
                                                    
                                                if (id == 0){
      out.write("\n");
      out.write("                                                <option value=\"0\"></option>\n");
      out.write("                                                ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br> \n");
      out.write("\n");
      out.write("                                    <label>Modelo:</label>\n");
      out.write("                                    <select name=\"modelo\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Modelo;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getModelo()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else { 
                                                    if (id == 0){
      out.write("\n");
      out.write("                                                    <option value=\"0\"></option>\n");
      out.write("                                                    ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                            }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br>    \n");
      out.write("\n");
      out.write("                                    <label>Proveedor:</label>\n");
      out.write("                                    <select name=\"prov\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Proveedor;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getProveedor()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else { 
                                                    if (id == 0){
      out.write("\n");
      out.write("                                        <option value=\"0\"></option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                            }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br> \n");
      out.write("\n");
      out.write("                                    <label>Responsable:</label>\n");
      out.write("                                    <select name=\"responsable\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Responsable;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getMarca()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br>   \n");
      out.write("\n");
      out.write("                                    <label>Tipo:</label>\n");
      out.write("                                    <select name=\"tipo\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Tipo;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getTipo()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <label>Ubicación:</label>\n");
      out.write("                                    <select name=\"ubicacion\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Ubicacion;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getMarca()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br>\n");
      out.write("\n");
      out.write("                                    <label>Uso:</label>\n");
      out.write("                                    <select name=\"uso\"><br>                                  \n");
      out.write("                                        ");

                                            r = c.consultarBD("SELECT * FROM Uso;");
                                            while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);
                                                if (id == e.getMarca()) {
      out.write("\n");
      out.write("                                        <option selected value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write('"');
      out.write('>');
      out.print(descripcion);
      out.write("</option>\n");
      out.write("                                        ");

                                                }
                                            }
                                        
      out.write("\n");
      out.write("                                    </select><br>                                     \n");
      out.write("                                    ");
c.desconectarBD(); 
      out.write("                                                                                                                                           \n");
      out.write("\n");
      out.write("\n");
      out.write("                                </section>                                  \n");
      out.write("                            </div>\n");
      out.write("                        </form> \n");
      out.write("                        ");
}
      out.write("                        \n");
      out.write("                    </div>                                                                                 \n");
      out.write("                </div>\n");
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
      out.write("        <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('#example1').datepicker('show');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.9.0.js\"></script>\n");
      out.write("        <script src=\" ../../js/jquery.js\"></script>\n");
      out.write("        <script src=\" ../../js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\" ../../js/lightbox.js\"></script>\n");
      out.write("        <script src=\" ../../js/async_content.js\"></script>\n");
      out.write("        <script src=\" ../../js/async-consulta.js\"></script>\n");
      out.write("        <script src=\" ../../js/async_contact.js\"></script>\n");
      out.write("        <script src=\"../../js/bootstrap-datepicker.js\"></script>\n");
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
