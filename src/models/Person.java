package models;

public class Person implements Comparable<Person> {
    private String nombre;
    private int edad;
    private int cedula;
    
    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Person(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    @Override
    public int compareTo(Person o) {
        int comN = this.nombre.compareTo(o.getNombre());
        if (comN != 0) {
            return comN;
        }
        int comE = Integer.compare(this.edad, o.getEdad());
        return comE;
    }
    
    
    
}