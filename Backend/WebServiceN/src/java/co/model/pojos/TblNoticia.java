package co.model.pojos;
// Generated 17/09/2018 09:02:39 PM by Hibernate Tools 4.3.1



/**
 * TblNoticia generated by hbm2java
 */
public class TblNoticia  implements java.io.Serializable {


     private int idnoticia;
     private String titulo;
     private String descripcion;
     private String url;

    public TblNoticia() {
    }

    public TblNoticia(int idnoticia, String titulo, String descripcion, String url) {
       this.idnoticia = idnoticia;
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.url = url;
    }
   
    public int getIdnoticia() {
        return this.idnoticia;
    }
    
    public void setIdnoticia(int idnoticia) {
        this.idnoticia = idnoticia;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


