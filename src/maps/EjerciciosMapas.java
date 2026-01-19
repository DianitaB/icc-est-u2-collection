package maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjerciciosMapas {

    // Ejercicio 1
    public Map<Integer, Integer> contarDuplicados(List<Integer> list) {
        Map<Integer, Integer> conteo = new HashMap<>();
        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        return conteo;
    }

    // Ejercicio 2
    public int contarNoDuplicados(List<Integer> list2) {
        Map<Integer, Integer> conteo2 = new HashMap<>();
        for (Integer num : list2) {
            conteo2.put(num, conteo2.getOrDefault(num, 0) + 1);
        }
        for (Integer num : list2) {
            if (conteo2.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    // Ejercicio 3
    public void rankingPuntajes(List<String[]> entradas) {
        Map<String, Integer> punt = new HashMap<>();

        for (String[] ent : entradas) {
            String name = ent[0];
            int puntaje = Integer.parseInt(ent[1]);

            punt.put(name, Math.max(punt.getOrDefault(name, 0), puntaje));
        }

        for (String key : punt.keySet()) {
            System.out.println(key + " -> " + punt.get(key));
        }
    }
}