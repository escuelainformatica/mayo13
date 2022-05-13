import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Existencia;
import servicio.ClienteServicio;
import servicio.ExistenciaServicio;

// package ""



public class App {

    public static void main(String[] args) {

        // existencia #1 version
        int folio = 0;
        String materia = "";
        String fecha="";
        int metros=0;
        int codigo=0;
        String rutProveedor="";
        String ubicacion="";

        System.out.println("Folio :" + folio);
        System.out.println("materia :" + materia);
        System.out.println("fecha :" + fecha);



        // segunda version

        Existencia exi=new Existencia(); // clase de modelo que es este caso se llama Existencia.
        exi.folio=1;
        exi.materia="tela";
        exi.fecha="2/2/2";
        exi.metros=3;
        exi.codigo=3;

        System.out.println("Folio :" + exi.folio);
        System.out.println("materia :" + exi.materia);
        System.out.println("fecha :" + exi.fecha);

        // tercera version
        Existencia exi2=new Existencia(); // clase de modelo que es este caso se llama Existencia.
        exi2.folio=1;
        exi2.materia="tela";
        exi2.fecha="2/2/2";
        exi2.metros=3;
        exi2.codigo=3;

        ExistenciaServicio exsrv=new ExistenciaServicio();

        exsrv.mostrar(exi2);

        // cuarta version
        Existencia exi3=new Existencia(1,"tela","2/2/2",3,3,"111-1","Santiago");
        exsrv.mostrar(exi3);

        // donde tengo que hacer el cambio?

        // agregar una funcion para calcular el costo por metro. De la siguiente manera metro x 100

        int costo=exsrv.calcularCostoPorMetro(exi3);
        System.out.println("el precio del costo existencia 3 es :"+costo);
        
        // listado de existencia
        // < > = diamante.
        List<Existencia> existencias=new ArrayList<>();
        existencias.add(new Existencia(1,"tela1","2/2/2",3,3,"111-1","Santiago"));
        existencias.add(new Existencia(2,"tela2","2/3/2",3,3,"111-1","Santiago"));
        existencias.add(new Existencia(3,"tela3","2/3/2",3,3,"111-1","Santiago"));

        exsrv.mostrarListado(existencias);


        Cliente john=new Cliente("john","sunset blv");
        
        ClienteServicio clisrv=new ClienteServicio();
        clisrv.mostrar(john);


    }
}
