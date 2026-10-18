public class Dispositivo {

    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);

    }

    public void activar() {
        if (activo == false){
            activo = true;
            System.out.println("Activado");
        }else{
            System.out.println("Activo");
        }


    }

    void mostrarEstado() {
        System.out.println("Activo: " + activo);

    }


}
