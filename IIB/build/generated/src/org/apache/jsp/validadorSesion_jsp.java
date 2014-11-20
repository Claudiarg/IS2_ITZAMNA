package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.Usuario;

public final class validadorSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
    
        String email = request.getParameter("correo").trim();
	String contrasenia = request.getParameter("contrasenia").trim();           
        Usuario usuario = new Usuario(email, contrasenia);        

        if(usuario.getCount()== 1){//existe el usuario.
            //System.out.println("Si existe el usuario");
            if(usuario.getActivo() == 1){// si esta el usuario activo en el sistema                 
                //System.out.println("Usuario activo");
                 session = request.getSession();
    		 session.setAttribute("idUs", usuario.getIdUsuario());
                 session.setAttribute("Nombre", usuario.getNombre());
                 session.setAttribute("Apellido", usuario.getApellido());
		 session.setAttribute("tipoU",usuario.getTipoUsuario());
                 session.setAttribute("contrasenia", usuario.getContrasenia());
                 session.setAttribute("isLogin","true");
                    /*1 | Jefatura de departamento    |
                      2 | Secretaria                  |
                      3 | Tecnico Académico           |
                      4 | Personal inventario HN y BN |*/

                 switch (usuario.getTipoUsuario()){
                     case 1:
                         response.sendRedirect("./Usuarios/Jefatura/InicioJefatura.jsp");
                         break;                         
                     case 2:
                         response.sendRedirect("./Usuarios/Secretaria/InicioSecretaria.jsp");
                         break;
                     case 3: 
                         response.sendRedirect("./Usuarios/Tecnico/InicioTecnico.jsp");
                         break;
                     case 4:
                         response.sendRedirect("./Usuarios/Personal/InicioPersonal.jsp");
                         break;
                     default:
                         response.sendRedirect("InicioSesion.jsp");
                         break;
                 }                                     
            }else{              
              response.sendRedirect("InicioSesion.jsp?error=NA");
            }                                                   
        }else{            
            response.sendRedirect("InicioSesion.jsp?error=NE");            
        }
        
      out.write("      \n");
      out.write("                \n");
      out.write("     </body>\n");
      out.write("    </html>");
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
