public class Perro {
    
    String nombre;
    String raza;
    int edad;

    
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    
    public void ladrar() {
        System.out.println(nombre + " está ladrando: ¡Guau, guau!");
    }

    
    public void presentarse() {
        System.out.println("Hola, soy " + nombre +
                           ", soy de raza " + raza +
                           " y tengo " + edad + " años.");
    }

    
    public static void main(String[] args) {

        
        Perro perro1 = new Perro("Pastor", "alaska", 3);

        
        perro1.presentarse();
        perro1.ladrar();
    }
}
