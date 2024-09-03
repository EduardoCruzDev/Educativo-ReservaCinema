import java.util.Scanner;

/*Este codigo fue escrito con fines academicos.
No representa un codigo optimizado.
 */

import static com.cedproperu.Cinema.*;

public class Main {
    public static void main(String[] args) {
        iniciarAsientos();
        Scanner sc = new Scanner(System.in);
        boolean salir =false;

        while(!salir){
            mostrarMenu();
            try{
                salir = Opciones(sc);
            }catch (Exception e){
                System.out.println("Ocurrio un error " +e.getMessage());
            }
        }


        Pantalla();
        mostrarAsientos();
    }

    public static void Pantalla(){

        int filas = 5;
        int columnas = 46;

        for(int i =0;i<filas;i++){
            for(int j =0;j<columnas;j++){
                if(i==0 ||i ==filas-1 || j==0 || j==columnas-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void mostrarMenu(){
        System.out.println("""
                1.- Revisar los asientos disponibles
                2.- Seleccionar un asiento
                3.- Terminar el programa
                """);
    }

    private static boolean Opciones(Scanner sc){

        int opcion = sc.nextInt();
        boolean salir =false;

        switch(opcion){
            case 1: Pantalla();
            mostrarAsientos();
            break;
            case 2:
                reservarAsientos();
            break;
            case 3: salir = true;
            break;
        }
        return salir;
    }
    }