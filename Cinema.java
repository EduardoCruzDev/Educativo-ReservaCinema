import java.util.Scanner;

public class Cinema {

    static Scanner sc = new Scanner(System.in);
    static char[][] asientosCinema = new char[10][10];

    public static void iniciarAsientos() {
        for (int i = 0; i < asientosCinema.length; i++) {
            for (int j = 0; j < asientosCinema[i].length; j++) {
                asientosCinema[i][j] = 'L';
            }
        }
    }

    public static void mostrarAsientos() {

        for (int i = 0; i < asientosCinema.length; i++) {
            for (int j = 0; j < asientosCinema[i].length; j++) {
                System.out.print(asientosCinema[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void reservarAsientos() {
        System.out.println("Ingresa la fila del asiento");
        int fila = sc.nextInt()-1;
        System.out.println("Ingresa la columna del asiento");
        int columna = sc.nextInt()-1;

        if(fila<0 || fila>=10 || columna<0 || columna>=10) {
            System.out.println("El asiento que ingresaste no existe");
            return;
        }
        if(asientosCinema[fila][columna] == 'X') {
            System.out.println("El asiento ya esta resarvado");
        }else{
            asientosCinema[fila][columna] = 'X';
            System.out.println("El asiento se reservo correctamente");
        }
    }
}