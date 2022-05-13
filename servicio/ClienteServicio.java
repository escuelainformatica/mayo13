package servicio;

import modelo.Cliente;

public class ClienteServicio {
    

    public void mostrar(Cliente cli) {
        System.out.println("Nombre: "+cli.nombre);
        System.out.println("Direccion: "+cli.direccion);
    }
}
