package controller;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinasController {
    //Método que ordene un listado de maquinas por su subred y luego por el nombre
    // si ambas son iguales se consideran maquinas iguales y se descartan
    public Set<Maquina> ordenarPorSubRed(List<Maquina> maquinas){
        Set<Maquina> maquina = new TreeSet<>();
        for (Maquina maquina2 : maquinas) {
            maquina.add(maquina2);
        }
        return maquina;
    }
}
