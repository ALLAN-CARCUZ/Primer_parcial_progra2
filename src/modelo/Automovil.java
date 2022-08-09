package modelo;

public class Automovil extends Vehiculo_terrestre{
    private final String llantas_repuesto;

    public Automovil(String llantas_repuesto, String num_llantas, String nombre, String vel_max, String pasajeros, String km_recorridos) {
        super(num_llantas, nombre, vel_max, pasajeros, km_recorridos);
        this.llantas_repuesto = llantas_repuesto;
    }

    public String getLlantas_repuesto() {
        return llantas_repuesto;
    }
    
    @Override
 public void encender(){
    System.out.println("Llantas de repuesto: " + this.getLlantas_repuesto());
    System.out.println("Numero de llantas: " + this.getNum_llantas() );
    System.out.println("Nombre: " + this.getNombre() );
    System.out.println("Velocidad maxima: " + this.getVel_max() );
    System.out.println("Pasajeros: " + this.getPasajeros() );
    System.out.println("Kilometros recorridos: " + this.getKm_recorridos() );
    System.out.println("---------------------------------------");
     
 }
    
}
