/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.services.webservices;

import co.model.dao.NoticiaDao;
import co.model.pojos.TblNoticia;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author johniersanchez
 */
@WebService(serviceName = "NoticiaWS")
public class NoticiaWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarNoticia")
    public String IngresarNoticia(@WebParam(name = "codigo") int codigo, @WebParam(name = "titulo") String titulo, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "url") String url) {
        TblNoticia t = new TblNoticia(codigo, titulo, descripcion, url);
        NoticiaDao noticiaDAO = new NoticiaDao();
        noticiaDAO.ingresarNoticia(t);
        return "Usuario Ingresado";

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarNoticia")
    public String BuscarNoticia(@WebParam(name = "codigo") int codigo) {
        NoticiaDao noticiaDAO = new NoticiaDao();
        return noticiaDAO.consultarNoticia(codigo);

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConsultarNoticia")
    public List ConsultarNoticia() {

        NoticiaDao noticaDAO = new NoticiaDao();
        List<TblNoticia> listaNoticia = noticaDAO.verNoticia();
        return listaNoticia;

    }

}
