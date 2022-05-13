package modelo;
public class Existencia {
    public int folio = 0;
    public String materia = "";
    public String fecha="";
    public int metros=0;
    public int codigo=0;
    public String rutProveedor="";
    public String ubicacion="";

    public Existencia() {

    }

    public Existencia(int folio, String materia, String fecha, int metros, int codigo, String rutProveedor,
            String ubicacion) {
        this.folio = folio;
        this.materia = materia;
        this.fecha = fecha;
        this.metros = metros;
        this.codigo = codigo;
        this.rutProveedor = rutProveedor;
        this.ubicacion = ubicacion;
    }
    

    

}
