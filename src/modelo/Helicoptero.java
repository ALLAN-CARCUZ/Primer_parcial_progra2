package modelo;

public class Helicoptero extends Vehiculo_aereo{
    private final String gafas;

    public Helicoptero(String gafas, String paracaidas, String num_alas, String nombre, String vel_max, String pasajeros, String km_recorridos) {
        super(paracaidas, num_alas, nombre, vel_max, pasajeros, km_recorridos);
        this.gafas = gafas;
    }

    public String getGafas() {
        return gafas;
    }
    
    @Override
    public void encender(){
    System.out.println("Gafas: " + this.getGafas());
    System.out.println("Paracaidas: " + this.getParacaidas());
    System.out.println("Numero de alas: "  + this.getNum_alas());
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Velocidad maxima: " + this.getVel_max());
    System.out.println("Pasajeros: " + this.getPasajeros());
    System.out.println("Kilometros recorridos: " + this.getKm_recorridos());
    System.out.println("-------------------------------------------");
        
    }
    
}
