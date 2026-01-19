package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Person;

public class Maps {
    //Mapas o DICCIONARIOS
    public Map<String, Integer> construirHashMap(){
        Map <String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 3);
        hashMap.put("A", 5);
        hashMap.size();
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.values().toArray()[i]);
            
        }for (String key : hashMap.keySet()) {
            System.out.println("Llave: " + key +" Valor: " + hashMap.get(key));
        }

        return hashMap;
    } 
    public Map<String, Integer> construirLinkedHashMap(){
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 2);
        linkedHashMap.put("B", 3);
        linkedHashMap.put("A", 5);
        linkedHashMap.put("C", 50);
        linkedHashMap.put("D", 5);
        linkedHashMap.put("F", 3);
        linkedHashMap.put("G", 8);
        linkedHashMap.put("H", 85);
        linkedHashMap.put("I", 5);
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.keySet());
        return construirHashMap();
    }

    public Map<String, Integer> connstruirTreeMap(){
        Map<String, Integer> treeMap = new TreeMap<>();
        
        treeMap.put("B", 3);
        treeMap.put("C", 50);
        treeMap.put("A", 2);
        treeMap.put("I", 5);
        treeMap.put("F", 3);
        treeMap.put("D", 5);
        treeMap.put("G", 8);
        treeMap.put("H", 85);
        treeMap.put("A", 5);

        return treeMap;

    }

    public Map<Person, Integer> construirTreeM(){
        Map<Person, Integer> treePersons = new TreeMap<>();

        treePersons.put(new Person("Carlos", 23),1000);
        treePersons.put(new Person("Ana", 30),2000);
        treePersons.put(new Person("Luis", 18),3000);
        treePersons.put(new Person("Ana", 20),4000);
        treePersons.put(new Person("Andres", 23),5000);
        treePersons.put(new Person("Luis", 18),6000);

        return treePersons;
    }

    public void printFilter(Map<Person, Integer> treePersons){
        //Imprimir todas las personas que el valor sea > 2000
        // y la edad sea >=20

        for(Map.Entry<Person, Integer> entry : treePersons.entrySet()){
            Person person = entry.getKey();
            Integer value = entry.getValue();

            if (value > 2000 && person.getEdad() >= 20) {
                System.out.println(person + "-> " + value);
            }

        }
    }

    public Map<Integer, Person> construirTreeMapPersonasInverso(){
        
        Map<Integer, Person> personas = new TreeMap<>();
        personas.put(11, new Person("Carlos", 23));
        personas.put(9, new Person("Ana", 30));
        personas.put(70, new Person("Luis", 18));
        personas.put(8, new Person("Ana", 20));
        personas.put(7, new Person("Andres", 23));
        personas.put(10, new Person("Luis", 18));

        return personas;
    }

    public Map<Integer, Person> construirTreeMapPersonasObj(){
        
        // Map<Integer, Person> personas = new TreeMap<>();
        List<Person> list = new ArrayList<>();
        list.add(new Person("Carlos", 23, 123));
        list.add(new Person("Ana", 30, 124));
        list.add(new Person("Luis", 18, 125));
        list.add(new Person("Ana", 20, 123));
        list.add(new Person("Andres", 23, 129));
        list.add(new Person("Luis", 18, 124));
        //Ordenar por la edad y nombre y
        //No permita duplicados por la cedula
        //Map<Cedula, Persona>
        Map<Integer, Person> persons = new TreeMap<>();
        for (Person p : list) {
            persons.put(p.getCedula(), p);
        }
        return persons;
    }
    
}