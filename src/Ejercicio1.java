import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    List<String> convertir(List<String> minusculas) {
        return minusculas.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());

    }
}
