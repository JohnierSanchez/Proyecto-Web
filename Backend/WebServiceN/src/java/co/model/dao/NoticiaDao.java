/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.model.dao;

import co.model.pojos.TblNoticia;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;

/**
 *
 * @author johniersanchez
 */
public class NoticiaDao {

    public void ingresarNoticia(TblNoticia n) {
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;

        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.save(n);
            tx.commit();
            sesion.close();

        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo guardar correctamente");
        }
    }

    public String consultarNoticia(int idn) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        TblNoticia t = (TblNoticia) sesion.get(TblNoticia.class, idn);
        sesion.close();
        if (t != null) {
            return "El codigo de la noticia es " + t.getIdnoticia() + " cuyo titulo es " + t.getTitulo();
        } else {
            return "La noticia con el codigo " + idn + " no existe";
        }
    }

    public List<TblNoticia> verNoticia() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createQuery("from TblNoticia");
        List<TblNoticia> lista = query.list();
        sesion.close();
        return lista;
    }
        public void eliminarNoticia(int n){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;

        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.delete(n);
            tx.commit();
            sesion.close();

        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo eliminar correctamente");
        }
    }
}

            
        

    

