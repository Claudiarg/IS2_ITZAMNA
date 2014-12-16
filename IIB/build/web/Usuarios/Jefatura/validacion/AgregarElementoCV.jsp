                           <%@page import="Conexion.ConexionBD"%>
<%
                                ConexionBD con = new ConexionBD();
                                con.conectarBD();
                                String tabla = request.getParameter("tabla");
                                String nuevo = request.getParameter("nuevo");
                                String p = "INSERT INTO " + tabla + " (id" + tabla + ", Descripcion) VALUES (0,'" + nuevo + "');";
                                con.insertarBD(p);
                                con.desconectarBD();
                                response.sendRedirect("../AgregarCatalogo.jsp?v=exito");
                            %>
