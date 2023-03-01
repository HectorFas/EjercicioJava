package EX1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Personas personas = new Personas("Fulano", "Detal", "Ycual");

        boolean resultado = personas.esLoMismo("Juan");

        if (resultado) {
            System.out.println("El nombre ya esta");
        } else {
            System.out.println("El nombre no esta, quieres ponerlo a la lista?");
        }

        boolean resultado1 = personas.esLoMismo("Fulano");

        if (resultado1) {
            System.out.println("El nombre ya esta");
        } else {
            System.out.println("El nombre no esta, quieres ponerlo a la lista?");
        }




    }
}
