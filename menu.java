import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        boolean continuar = true;
        int n=0;
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        System.out.println("Ingrese el tamaño de la matriz");
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        objMatriz[][] MO = new objMatriz[n][n];
        
        while(continuar){
            System.out.println("\n1. Llenar Matriz de enteros");
            System.out.println("2. Mostrar Matriz de enteros");
            System.out.println("3. Llenar Matriz objetual");
            System.out.println("4. Mostrar Matriz objetual");
            System.out.println("5. Salir\n");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    matriz = m.LlenarMatriz(matriz);
                    break;
                case 2:
                    m.MostrarMatriz(matriz);
                    break;
                case 3:
                    MO = m.LlenarMatrizObj(MO);
                    break;
                case 4:
                    m.MostrarMatrizObj(MO);
                    break;
                case 5:
                    System.out.println("bye");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

    }
    
}
