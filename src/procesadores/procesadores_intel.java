package procesadores;

public class procesadores_intel extends procesadores_escritorio{
    Boolean tarjeta_video;
    //Constructores
    public procesadores_intel() {

    }
    public procesadores_intel(Boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }

    public procesadores_intel(String socket, Boolean tarjeta_video) {
        super(socket);
        this.tarjeta_video = tarjeta_video;
    }

    public procesadores_intel(int nucleos, double velocidad, double consumo, String nombre, String socket, Boolean tarjeta_video) {
        super(nucleos, velocidad, consumo, nombre, socket);
        this.tarjeta_video = tarjeta_video;
    }
    //gett y sett
    public Boolean getTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(Boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }
    //metodos personalizados
    public void imprimir_datos_escritorio(){
        System.out.println(this.socket);
    }
}
