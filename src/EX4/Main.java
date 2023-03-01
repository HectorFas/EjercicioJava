package EX4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Calendarios {
    static List<Examen> examen = new ArrayList<>();

    @Override
    public String toString() {
        return super.toString();
    }

    public void addExamenes (Examen... exas) {
        Collections.addAll(examen, exas);
    }
}

class Examen {
    String asignatura, aula;
    FechaHora fechaHora;

    public Examen(String asignatura, String aula, FechaHora fechaHora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fechaHora = fechaHora;
    }
}

class FechaHora {
   Fecha fecha;
   Hora hora;

    public FechaHora(Fecha fecha, Hora hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
}

class Fecha {
    int anyo, mes, dia;
    public Fecha(int anyo, int mes, int dia) {
        this.anyo = anyo;
        this.mes = mes;
        this.dia = dia;
    }
}

class Hora {
    int hora, minuto;
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
}

public class Main {
    public static void main(String[] args) {


        Examen examen1 = new Examen("Matematicas", "A_207", new FechaHora(new Fecha(2002,12,23), new Hora(10,10)));
        Examen examen2 = new Examen("Ingles", "J_48", new FechaHora(new Fecha(2045,1,23), new Hora(13,0)));
        Examen examen3 = new Examen("Historia", "H_88", new FechaHora(new Fecha(1715,4,15), new Hora(12,30)));

        Calendarios calendarios = new Calendarios();
        calendarios.addExamenes(examen1, examen2, examen3);


    }
}
