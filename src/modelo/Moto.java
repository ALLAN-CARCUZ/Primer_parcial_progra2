package modelo;

public class Moto extends Vehiculo_terrestre{
    private final String casco;

    public Moto(String casco, String num_llantas, String nombre, String vel_max, String pasajeros, String km_recorridos) {
        super(num_llantas, nombre, vel_max, pasajeros, km_recorridos);
        this.casco = casco;
    }

    public String getCasco() {
        return casco;
    }
    
    @Override
   public void encender(){
    System.out.println("Casco: " + this.getCasco());
    System.out.println("Numero de llantas: " + this.getNum_llantas() );
    System.out.println("Nombre: " + this.getNombre() );
    System.out.println("Velocidad maxima: " + this.getVel_max() );
    System.out.println("Pasajeros: " + this.getPasajeros() );
    System.out.println("Kilometros recorridos: " + this.getKm_recorridos() );
    System.out.println("---------------------------------------");
       
   }
        
}
