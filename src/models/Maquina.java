package models;

import java.util.List;

public class Maquina implements Comparable<Maquina>{
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subRed;
    private int riesgo;
    
    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subRed = calcularSubRed();
    }

    private int calcularSubRed(){ //IP: Conjunto de 4 trio de datos -> 192.168.100.1 -> 100
        // la subRed es el tercer argumento de la IP

        // split() : separa los strings de acuerdo a un caracter que yo le ponga 

        String [] octetos = ip.split("\\.");
        String subred = octetos[2];
        // split() : separa los strings de acuerdo a un caracter que yo le ponga 
        return Integer.parseInt(subred); // '55' -> 55
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public int getSubRed() {
        return subRed;
    }

    public void setSubRed(int subRed) {
        this.subRed = subRed;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    @Override
    //Método que ordene un listado de maquinas por su subred y luego por el nombre
    // si ambas son iguales se consideran maquinas iguales y se descartan
    public int compareTo(Maquina o) {
    int resultado = Integer.compare(this.subRed, o.getSubRed());
    if (resultado == 0) {
        resultado = this.nombre.compareTo(o.getNombre());
    }
    return resultado;
    }
}
