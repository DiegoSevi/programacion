import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static class Golosinas {
        Scanner scanner = new Scanner(System.in);
        String[][] nombresGolosinas = {
                {"KitKat", "Chicles de fresa", "Lactose", "Palotes"},
                {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
                {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
                {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
        double[][] precio = {
                {1.1, 0.8, 1.5, 0.9},
                {1.8, 1, 1.2, 1},
                {1.8, 1.3, 1.2, 0.8},
                {1.5, 1.1, 1.1, 1.1}
        };
        int[][] cantidad = {
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
        };
        int [][] codigo={
                {01, 02, 03, 04, 05},
                {11, 12, 13, 14, 15},
                {21,22, 23, 24, 25},
                {31, 32, 33, 34, 35},
        };
        public void pedir(){
            int numero;
            numero=scanner.nextInt();
            int num1= numero/10;
            int num2= numero%10;
            if (num1>4 && num2>4) {
                System.out.println("no disponemos de esa golosina");
            }
            cantidad[num1][num2]--;
            System.out.println("El numero "+numero+" es la golosina "+nombresGolosinas[num1][num2]);
            System.out.println( "Cantidad de golosinas disponible: "+cantidad[num1][num2]);
        }
        public void mostrar(){
            for (int fila = 0; fila < nombresGolosinas.length  ; fila++) {
                for (int columna = 0; columna < nombresGolosinas[fila].length ; columna++) {
                    System.out.println("**************");
                    System.out.println("CODIGO: "+codigo[fila][columna]);
                    System.out.println("NOMBRE: "+nombresGolosinas[fila][columna]);
                    System.out.println("PRECIO: "+precio[fila][columna]);

                }
            }
        }
        public void rellenar(){
            int numero=0;
            int suma=0;
            int num1= numero/10;
            int num2= numero%10;
            String contraseña="MaquinaExpendedora2017";
            String contraseñaU = scanner.nextLine();
            if (contraseña.equals(contraseñaU)) {
                System.out.println("CONTRASEñA CORRECTA");
                System.out.println("Introduce la posicion de la golosina");
                numero=scanner.nextInt();
                System.out.println("Introduce la cantidad de golosinas que quieres rellenar");
                suma= scanner.nextInt();
                System.out.println("***********");
                suma+=cantidad[num1][num2];
                System.out.println(nombresGolosinas[num1][num2]+":"+suma);
            }else{
                System.out.println("CONTRASEÑA INCORRECTA");
                }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Golosinas p = new Golosinas();
                int opcion;

                do {
                    System.out.println("**** Menú ****");
                    System.out.println("1. PEDIR GOLOSINA");
                    System.out.println("2. MOSTRAR GOLOSINAS");
                    System.out.println("3. RELLENAR GOLSINAS");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción (1-4): ");

                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("INTRODUCE EL NUMERO DE LA GOLOSINA");
                            p.pedir();

                            break;
                        case 2:
                            System.out.println("MOSTRAR GOLOSINAS");
                            p.mostrar();
                            break;
                        case 3:
                            System.out.println("INTRODUCE LA CONTRASEÑA");
                            p.rellenar();
                            break;
                        case 4:
                            System.out.println("Saliendo del programa. ¡Hasta luego!");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                            break;
                    }

                } while (opcion != 4);





        }
    }

}