package modelo;

public class Vehiculo_aereo extends Vehiculo{
    private String paracaidas, num_alas;

    public Vehiculo_aereo(String paracaidas, String num_alas, String nombre, String vel_max, String pasajeros, String km_recorridos) {
        super(nombre, vel_max, pasajeros, km_recorridos);
        this.paracaidas = paracaidas;
        this.num_alas = num_alas;
    }

    public String getParacaidas() {
        return paracaidas;
    }

    public void setParacaidas(String paracaidas) {
        this.paracaidas = paracaidas;
    }

    public String getNum_alas() {
        return num_alas;
    }

    public void setNum_alas(String num_alas) {
        this.num_alas = num_alas;
    }
    
    @Override
    public void encender(){
    System.out.println("Paracaidas: " + this.getParacaidas());
    System.out.println("Numero de alas: "  + this.getNum_alas());
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Velocidad maxima: " + this.getVel_max());
    System.out.println("Pasajeros: " + this.getPasajeros());
    System.out.println("Kilometros recorridos: " + this.getKm_recorridos());
    System.out.println("-------------------------------------------");
    }
    
}
