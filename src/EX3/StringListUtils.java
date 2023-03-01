package EX3;

import java.util.ArrayList;
import java.util.List;

public class StringListUtils {

    public static int metodo1 (List<String> param1, String param2) {
        if (param1 == null) return  0;
        if(param1.size() == 0) return 0;
        int nVeces = 0;
        for (String s : param1) {
            if (s.equals(param2)) {
                nVeces++;
            }
        }
        return nVeces;
    }

    public static String metodo2 (List<String> param1, String param2) {
        if (param1 == null) return "null";
        if(param1.size() == 0) return "";
        return String.join(param2, param1);
    }

    public static List<String> metodo3 (List<String> param1, List<String> param2) {
        List<String> nuevaLista = new ArrayList<>();
        nuevaLista.addAll(param1);
        nuevaLista.addAll(param2);
        return nuevaLista;
    }


    public static List<String> metodo4 (List<String> param1, String param2) {
        List<String> nuevaLista = new ArrayList<>();
        for (String s : param1) {
            if (!s.equals(param2)) {
                nuevaLista.add(s);
            }
        }
        return nuevaLista;
    }

    public static List<String> metodo5 (List<String> param1, List<String> param2) {
        List<String> param3 = new ArrayList<>();
       for(String s:param1) {
           if (!param2.contains(s)) {
               param3.add(s);
           }
       }

        return param3;
    }

    public static List<String> metodo6 (String param1, int param2) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < param2 ; i++) {
            newList.add(param1);
        }
//        if (param3.size() == 0) {
//            param3.add("Llena esto de algo");
//        }
        return newList;
    }
}
