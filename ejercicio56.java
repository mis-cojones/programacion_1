import java.util.Scanner;

public class ejercicio56 {
    public static void main(String[] args) {
        System.out.println("mi primer programa de java en github");
        Scanner leer = new Scanner(System.in);
        System.out.println("digite la cantidad de estudiantes: ");
        int estudiantes = leer.nextInt();
        double nota = 0.0;
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 1; i <= estudiantes; i++) {
            System.out.println("nota del estudiante" + i + ":");
            nota = leer.nextDouble();
            if (nota >= 5.0) {
                aprobados++;

            } else {
                reprobados++;
            }
        }
        System.out.println("aprobados: " + aprobados + " reprobados " + reprobados);
        System.out.println("termine");

    }
}
