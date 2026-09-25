import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class RegistroParticipantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        Set<String> estudiantes = new HashSet<>();

        do {
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Mostrar número de estudiantes");
            System.out.println("6. Salir");
            System.out.print("\nSelecciona una opcion: ");

            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID estudiante: ");
                    String nuevo = input.nextLine();
                    if (estudiantes.add(nuevo)) {
                        System.out.println("Estudiante registrado.");
                    } else {
                        System.out.println("El estudiante ya existia.");
                    }
                    break;

                case 2:
                    System.out.print("ID a buscar: ");
                    String buscar = input.nextLine();
                    if (estudiantes.contains(buscar)) {
                        System.out.println("Estudiante encontrado.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("ID a eliminar: ");
                    String eliminar = input.nextLine();
                    if (estudiantes.remove(eliminar)) {
                        System.out.println("Estudiante eliminado.");
                    } else {
                        System.out.println("El estudiante no existia.");
                    }
                    break;

                case 4:
                    System.out.println("Estudiantes: " + estudiantes);
                    break;

                case 5:
                    System.out.println("Numero de estudiantes: " + estudiantes.size());
                    break;
            }
            System.out.println();
        } while (opcion != 6);

        input.close();
    }
}