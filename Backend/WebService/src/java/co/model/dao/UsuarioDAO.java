/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.model.dao;
import co.model.pojos.TblUsuario;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;

/**
 *
 * @author johniersanchez
 */
public class UsuarioDAO {
    public void ingresarProducto(TblUsuario t){
        SessionFactory sf=null;
        Session sesion =null;
        Transaction tx=null;
        
        try{
            sf=HibernateUtil.getSessionFactory();
            sesion=sf.openSession();
            tx=sesion.beginTransaction();
            sesion.save(t);
            tx.commit();
            sesion.close();
            
        }
        catch(Exception ex){
            tx.rollback();
            throw new RuntimeException("No se pudo guardar correctamente");
        }
    }
    
    public String consultarUsuario(int id){
     SessionFactory sf= HibernateUtil.getSessionFactory();
     Session sesion= sf.openSession();
     TblUsuario t = (TblUsuario)sesion.get(TblUsuario.class, id);
     sesion.close();
    if(t!=null){
        return "El codigo del usuario es "+t.getId()+" cuyo nombre es "+t.getNombre();
    }else{
        return "El usuario con el codigo "+id+" no existe";
    }
    }
    
    public List<TblUsuario> verUsuario(){
     SessionFactory sf= HibernateUtil.getSessionFactory();
     Session sesion= sf.openSession();
     Query query=sesion.createQuery("from TblUsuario");
     List<TblUsuario> lista=query.list();
     sesion.close();
     return lista;
    }
    public void eliminarUsuario(int id){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;

        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.delete(id);
            tx.commit();
            sesion.close();

        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se pudo eliminar correctamente");
        }
    }
    
}
