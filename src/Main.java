import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ejercicio1 ejercicio1 = new Ejercicio1();
        List<String> palabras = List.of("Mabel" , "cristiNa", "PietroBON", "Ejercicio 1", "ActIVIDADA 3");

        List<String> mayusculas = ejercicio1.convertir(palabras);
        mayusculas.forEach(cad -> System.out.println(cad));

        System.out.println("---------------------------------------------------");

        Ejercicio2 ejercicio2 = new Ejercicio2();
        String concatenacion = ejercicio2.separarComas(palabras, 4);
        System.out.println(concatenacion);
    }
}

