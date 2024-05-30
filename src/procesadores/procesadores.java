package procesadores;

public class procesadores {
    int nucleos;
    double velocidad;
    double consumo;
    String nombre;
    //  Constructores
    public procesadores(){}
    public procesadores(int nucleos, double velocidad, double consumo, String nombre) {
        this.nucleos = nucleos;
        this.velocidad = velocidad;
        this.consumo = consumo;
        this.nombre = nombre;
    }
    //Setters y getters
    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos personalizados
    public void imprimir_datos(){
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Consumo: " + consumo);
        System.out.println("Nombre: " + nombre);
    }

}
