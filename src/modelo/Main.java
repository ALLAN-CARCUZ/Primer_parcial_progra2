package modelo;

public class Main {
    public static void main(String [] args){
        
    Automovil C1 = new Automovil("Una", "Cuatro", "Camaro", "Cien km/h", "Cinco", "Quinientos Km");
    C1.encender();
    
    Moto M1 = new Moto("Si", "Dos", "Honda", "Ochenta km/h", "Dos", "Veinte Km");
    M1.encender();
    
    Avion A1 = new Avion("Seis", "Si", "Dos", "Emirates Fly", "Trescientos Km/h", "Cien", "Treinta Mil");
    A1.encender();
    
    Helicoptero H1 = new Helicoptero("Si", "Si", "Dos", "Emirates Fly", "Doscientos Km/h", "Seis", "Quince Mil");
    H1.encender();
    
    
    }
}
