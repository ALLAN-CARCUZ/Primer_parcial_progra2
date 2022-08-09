package modelo;

abstract class Vehiculo {
    private String nombre, vel_max, pasajeros, km_recorridos;

    public Vehiculo(){}
    public Vehiculo(String nombre, String vel_max, String pasajeros, String km_recorridos) {
        this.nombre = nombre;
        this.vel_max = vel_max;
        this.pasajeros = pasajeros;
        this.km_recorridos = km_recorridos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVel_max() {
        return vel_max;
    }

    public void setVel_max(String vel_max) {
        this.vel_max = vel_max;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getKm_recorridos() {
        return km_recorridos;
    }

    public void setKm_recorridos(String km_recorridos) {
        this.km_recorridos = km_recorridos;
    }
    
    
    protected void encender(){}
    protected void apagar(){}
}
