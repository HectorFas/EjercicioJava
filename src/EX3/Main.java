package EX3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> pepe = List.of("hola", "papa","pepe");
        List<String> juanito = List.of("Malaga", "papa","Andaluz");

        System.out.println(StringListUtils.metodo1(pepe, "papa"));

        System.out.println(StringListUtils.metodo2(pepe, ","));

        System.out.println(StringListUtils.metodo3(pepe, juanito));

        System.out.println(StringListUtils.metodo4(pepe, "pepe"));


        System.out.println(StringListUtils.metodo5(pepe, juanito));

        System.out.println(StringListUtils.metodo6("pepe", 6));

        System.out.println(StringListUtils.metodo6("pepe", 0));
    }
}
