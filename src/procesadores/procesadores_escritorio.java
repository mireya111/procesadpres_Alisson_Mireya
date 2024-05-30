package procesadores;

public class procesadores_escritorio extends procesadores{
    String socket;
    public procesadores_escritorio() {}
    //Constructores
    public procesadores_escritorio(String socket) {
        this.socket = socket;
    }
    public procesadores_escritorio(int nucleos, double velocidad, double consumo, String nombre, String socket) {
        super(nucleos, velocidad, consumo, nombre);
        this.socket = socket;
    }
    //Setters y getters
    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
    //metodos personalizados
    public void imprimir_datos_escritorio(){
        System.out.println(this.socket);
    }
}
