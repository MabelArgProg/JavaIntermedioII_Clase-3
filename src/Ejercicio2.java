import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    String separarComas(List<String> cadenas, int cantidad){
        return cadenas.stream().filter(cad -> cad.length()>cantidad).collect(Collectors.joining(","));
    }
}

