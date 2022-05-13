package servicio;
import java.util.List;

import modelo.Existencia;

// una clase de servicio.

public class ExistenciaServicio {
    
    // quiero hacer una funcion para mostrar datos.
    // 1) que quiero como parametro de entrada. Que valores necesito para que funcione? Existencia
    // 2) que va a regresar. Va a regresar un valor? nada.

    public void mostrar(Existencia ex) {
        System.out.println("---------------------------------------------------");
        System.out.println("Folio :" + ex.folio);
        System.out.println("Materia :" + ex.materia);
        System.out.println("Fecha :" + ex.fecha);
        System.out.println("Rut Proveedor :" + ex.rutProveedor);
        System.out.println("---------------------------------------------------");
    }
    public void mostrarEnColumnas(Existencia ex) {
        System.out.println(ex.folio+"\t|\t"+ex.materia+"|\t"+ex.fecha+"|\t"+ex.rutProveedor);
    }

    // 
    // 1) que quiero como parametro de entrada. Que valores necesito para que funcione? Existencia
    // 2) que va a regresar. Va a regresar un valor? entero.
    // 3) nombre de la funcion: calcularCostoPorMetro
    public int calcularCostoPorMetro(Existencia ex) {
        int resultado=0;
        resultado=ex.metros*100;

        return resultado;
    }
    public void mostrarListado(List<Existencia> existencias) {
        System.out.println("Folio\t|\tMateria|\tfecha|\tProveedor");
        System.out.println("------------------------------------------------");
        mostrarEnColumnas(existencias.get(0));
        mostrarEnColumnas(existencias.get(1));
        mostrarEnColumnas(existencias.get(2));
    }


}
