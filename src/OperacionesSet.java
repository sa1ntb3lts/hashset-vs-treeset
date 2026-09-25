import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OperacionesSet {
    public static void main(String[] args) {
        TreeSet<Integer> calificaciones = new TreeSet<>();

        calificaciones.add(65);
        calificaciones.add(70);
        calificaciones.add(75);
        calificaciones.add(80);
        calificaciones.add(85);
        calificaciones.add(90);
        calificaciones.add(95);

        System.out.println("Mínimo: " + calificaciones.first());
        System.out.println("Máximo: " + calificaciones.last());
    }
}
