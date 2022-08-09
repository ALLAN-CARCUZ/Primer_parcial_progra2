package modelo;

public class Avion extends Vehiculo_aereo{
    private final String aeromozas;

    public Avion(String aeromozas, String paracaidas, String num_alas, String nombre, String vel_max, String pasajeros, String km_recorridos) {
        super(paracaidas, num_alas, nombre, vel_max, pasajeros, km_recorridos);
        this.aeromozas = aeromozas;
    }

    public String getAeromozas() {
        return aeromozas;
    }
    
    @Override
    public void encender(){
    System.out.println("Aeromozas: " + this.getAeromozas());
    System.out.println("Paracaidas: " + this.getParacaidas());
    System.out.println("Numero de alas: "  + this.getNum_alas());
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Velocidad maxima: " + this.getVel_max());
    System.out.println("Pasajeros: " + this.getPasajeros());
    System.out.println("Kilometros recorridos: " + this.getKm_recorridos());
    System.out.println("-------------------------------------------");
    
    }
    
}
