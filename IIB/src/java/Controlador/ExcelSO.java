
import Conexion.ConexionBD;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.swing.UIManager.getString;

/**
 *
 * @author joe
 */
@WebServlet(urlPatterns = {"/SO"})
public class ExcelSO extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Excel</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Excel at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
        try {
            ConexionBD bd = new ConexionBD();
            ConexionBD con = new ConexionBD();
            bd.conectarBD();
            ResultSet resul = null;
            String consulta ="SELECT familia FROM Equipo WHERE tipo=1 OR tipo=2 OR tipo=6 OR tipo=13;";
            resul = bd.consultarBD(consulta);
                                ResultSet r = con.consultarBD(consulta);
                                ResultSet r1;
                                int numero = 0;
                                int num = 0;
                                String texto = "";
                                int num1 = 0;
                                int num2=0;
            ResultSetMetaData rsmd = resul.getMetaData();

            //excel file
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setHeader("Content-Disposition", "attachment; filename=reporte.xls");
            

            response.getWriter().write("Tipo de equipo");
            response.getWriter().write(",");
            response.getWriter().write("Windows XP y anteriores");
            response.getWriter().write(",");
            response.getWriter().write("Windows VISTA/7/8");
            response.getWriter().write(",");
            response.getWriter().write("Windows Server, MAC y Linux");
            response.getWriter().write("\n");
            while (resul.next()) {
                                            numero = r.getInt(1);
                                            ConexionBD con1 = new ConexionBD();
                                            con1.conectarBD();
                                            ConexionBD con2 = new ConexionBD();
                                            con2.conectarBD();
                                            ResultSet r2 = con2.consultarBD("select count(*) from Equipo where NivelObsolescencia =2 and familia=" + numero + ";");
                                            r1 = con1.consultarBD("select Descripcion from Familia where IdFamilia=" + numero + ";");
                                            while (r1.next()) {
                                                response.getWriter().write(getString(1));
                                                response.getWriter().write(",");
                                            }

                                            while (r2.next()) {                                                
                                                num = r2.getInt(1);
                                                response.getWriter().write( Integer.toString(num));
                                                response.getWriter().write(",");
                                            }
                                            r1 = con1.consultarBD("select count(*) from Equipo where NivelObsolescencia=4 and familia=" + numero + ";");
                                            while (r1.next()) {
                                                num1 = r1.getInt(1);
                                                response.getWriter().write( Integer.toString(num1));
                                                response.getWriter().write(",");
                                            }
                                            r2 = con2.consultarBD("select count(*) from Equipo where NivelObsolescencia=6 and familia=" + numero + ";");
                                            while (r1.next()) {
                                                num2 = r1.getInt(1);
                                                response.getWriter().write( Integer.toString(num2));                                                
                                            }                            
                                            response.getWriter().write("\n");
            }

            bd.desconectarBD();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExcelSO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}