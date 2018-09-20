/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.services.webservices;

import co.model.pojos.TblUsuario;
import co.model.dao.UsuarioDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author johniersanchez
 */
@WebService(serviceName = "WS")
public class WS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarUsuario")
    public String IngresarUsuario(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre) {
        TblUsuario t = new TblUsuario(id, nombre);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.ingresarProducto(t);
        return "Usuario Ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarUsuario")
    public String BuscarUsuario(@WebParam(name = "id") int id) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.consultarUsuario(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultarUsuario")
    public List<TblUsuario> ConsultarUsuario() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<TblUsuario> listaUsuarios = usuarioDAO.verUsuario();
        return listaUsuarios;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarUsuario")
    public String EliminarUsuario(@WebParam(name = "id") int id) {
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      usuarioDAO.eliminarUsuario(id);
      return "Usuario EliminadoCorrectamente";
    }


}
