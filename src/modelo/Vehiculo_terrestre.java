package modelo;

public class Vehiculo_terrestre extends Vehiculo{
    private String num_llantas;

    public Vehiculo_terrestre(String num_llantas, String nombre, String vel_max, String pasajeros, String km_recorridos) {
        super(nombre, vel_max, pasajeros, km_recorridos);
        this.num_llantas = num_llantas;
    }

    public String getNum_llantas() {
        return num_llantas;
    }

    public void setNum_llantas(String num_llantas) {
        this.num_llantas = num_llantas;
    }
    
    @Override
    public void encender(){
    System.out.println("Numero de llantas: " + this.getNum_llantas() );
    System.out.println("Nombre: " + this.getNombre() );
    System.out.println("Velocidad maxima: " + this.getVel_max() );
    System.out.println("Pasajeros: " + this.getPasajeros() );
    System.out.println("Kilometros recorridos: " + this.getKm_recorridos() );
    System.out.println("---------------------------------------");
    }
}
