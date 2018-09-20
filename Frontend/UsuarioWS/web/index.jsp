<%-- 
    Document   : index
    Created on : 9/09/2018, 09:14:43 PM
    Author     : johniersanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Parcial</title>
    </head>
    <body>
        <h1>Furmulario Usuario</h1>    
        <%-- start web service invocation --%><hr/>
        <%
            try {
                co.services.webservices.WS_Service service = new co.services.webservices.WS_Service();
                co.services.webservices.WS port = service.getWSPort();
                // TODO initialize WS operation arguments here
                int id = Integer.parseInt(request.getParameter("id"));
                java.lang.String nombre = request.getParameter("nombre");
                // TODO process result here
                java.lang.String result = port.ingresarUsuario(id, nombre);
                out.println("<font color='blue'>" + result + "</font>");
            } catch (Exception ex) {
                out.print("<font color='red'>" + "No se guardo correctamente" + "</font>");
            }
        %>
        <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
        <%
            try {
                co.services.webservices.WS_Service service = new co.services.webservices.WS_Service();
                co.services.webservices.WS port = service.getWSPort();
                // TODO initialize WS operation arguments here
                int id = Integer.parseInt(request.getParameter("id"));
                // TODO process result here
                java.lang.String result = port.buscarUsuario(id);
                out.println("<font color='blue'>" + result + "</font>");
            } catch (Exception ex) {
                out.print("<font color='red'>" + "Usuario no encontrado" + "</font>");

            }
        %>
        <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                co.services.webservices.WS_Service service = new co.services.webservices.WS_Service();
                co.services.webservices.WS port = service.getWSPort();
                // TODO initialize WS operation arguments here
                int id = Integer.parseInt(request.getParameter("id"));
    // TODO process result here
                java.lang.String result = port.eliminarUsuario(id);
                out.println("<font color='blue'>" + result + "</font>");
            } catch (Exception ex) {
                out.print("<font color='red'>" + "Usuario no eliminado" + "</font>");
            }
        %>
        <%-- end web service invocation --%><hr/>




        <form action="index.jsp" method="post">
            <table>
                <tr>
                    <th>Id:</th>
                    <td><input type="text" name="id" size="10" required/></td>
                </tr>
                <tr>
                    <th>Nombre:</th>
                    <td><input type="text" name="nombre" size="20" required/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Guardar" /></td>
                </tr>
            </table>
        </form>
        <h1>Buscar Usuario</h1>
        <form action="index.jsp" method="post">
            <table>
                <tr>
                    <th>Id:</th>
                    <td><input type="text" name="id" size="10" required/></td>
                </tr>

                <tr>
                    <td colspan><input type="submit" value="Buscar" /></td>
                    
                </tr>
            </table>
        </form>
                <h1>Eliminar Usuario</h1>
        <form action="index.jsp" method="post">
            <table>
                <tr>
                    <th>Id:</th>
                    <td><input type="text" name="id" size="10" required/></td>
                </tr>

                <tr>
                    <td colspan><input type="submit" value="Eliminar" /></td>
                    
                </tr>
            </table>
        </form>

    </body>
</html>
