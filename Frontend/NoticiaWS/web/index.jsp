<%-- 
    Document   : index
    Created on : 17/09/2018, 11:08:23 PM
    Author     : johniersanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ParcialD</title>
    </head>
    <body>
        <h1>Noticia</h1>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                co.services.webservices.NoticiaWS_Service service = new co.services.webservices.NoticiaWS_Service();
                co.services.webservices.NoticiaWS port = service.getNoticiaWSPort();
                // TODO initialize WS operation arguments here
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                java.lang.String titulo = request.getParameter("titulo");
                java.lang.String descripcion = request.getParameter("descripcion");
                java.lang.String url = request.getParameter("url");
                // TODO process result here
                java.lang.String result = port.ingresarNoticia(codigo, titulo, descripcion, url);
                out.println("<font color='blue'>" + result + "</font>");
            } catch (Exception ex) {
                out.print("<font color='red'>" + "No se guardo correctamente" + "</font>");

            }
        %>
        <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
        <%
            try {
                co.services.webservices.NoticiaWS_Service service = new co.services.webservices.NoticiaWS_Service();
                co.services.webservices.NoticiaWS port = service.getNoticiaWSPort();
                // TODO initialize WS operation arguments here
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                // TODO process result here
                java.lang.String result = port.buscarNoticia(codigo);
                out.println("<font color='blue'>" + result + "</font>");
            } catch (Exception ex) {
                out.print("<font color='red'>"+"Noticia no encontrado"+"</font>");

            }
        %>
        <%-- end web service invocation --%><hr/>
        <form action="index.jsp" method="post">
            <table>
                <tr>
                    <th>Id Noticia:</th>
                    <td><input type="text" name="codigo" size="10" required/></td>
                </tr>
                <tr>
                    <th>Titulo:</th>
                    <td><input type="text" name="titulo" size="20" required/></td>
                </tr>
                <tr>
                    <th>Descripcion:</th>
                    <td><input type="textarea" name="descripcion" size="20" required/></td>
                </tr>
                <tr>
                    <th>url:</th>
                    <td><input type="text" name="url" size="20" required/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Guardar" /></td>
                </tr>
            </table>
        </form>

        <form action="index.jsp" method="post">
            <table>
                <tr>
                    <th>Id Noticia:</th>
                    <td><input type="text" name="codigo" size="10" required/></td>
                </tr>

                <tr>

                    <td colspan><input type="submit" value="Buscar" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
