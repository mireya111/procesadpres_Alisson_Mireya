package procesadores;

public class procesadores_moviles extends procesadores{
    boolean optimizacion_energia;
    //Constructores
    public procesadores_moviles() {}
    public procesadores_moviles(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }

    public procesadores_moviles(int nucleos, double velocidad, double consumo, String nombre, boolean optimizacion_energia) {
        super(nucleos, velocidad, consumo, nombre);
        this.optimizacion_energia = optimizacion_energia;
    }
    //Stters y Getters
    public boolean getOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }
    //Metodo persomalizado
    public void imprimir_datos_moviles() {
        System.out.println(this.optimizacion_energia);
    }
}
