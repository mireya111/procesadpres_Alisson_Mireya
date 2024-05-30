package procesadores;

public class procesadores_amd extends procesadores_escritorio{
    Boolean sensor_temperatura;

    //Constructores
    public procesadores_amd() {

    }

    public procesadores_amd(Boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    public procesadores_amd(String socket, Boolean sensor_temperatura) {
        super(socket);
        this.sensor_temperatura = sensor_temperatura;
    }

    public procesadores_amd(int nucleos, double velocidad, double consumo, String nombre, String socket, Boolean sensor_temperatura) {
        super(nucleos, velocidad, consumo, nombre, socket);
        this.sensor_temperatura = sensor_temperatura;
    }
    //gett y sett

    public Boolean getSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(Boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }
    //metodos personalizados
    public void imprimir_datos_escritorio(){
        System.out.println(this.socket);
    }
}
