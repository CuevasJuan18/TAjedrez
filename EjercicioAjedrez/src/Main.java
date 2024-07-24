import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del tablero de ajedrez: ");
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if ((i + j) % 2 == 0) {
                    //System.out.println("Rojo");
                    //https://emojipedia.org/es/cuadrado-rojo
                    System.out.print("🟥");
                } else {
                    //System.out.println("Azul");
                    //https://emojipedia.org/es/cuadrado-azul
                    System.out.print("🟦");
                }
            }
            System.out.println();
        }
        System.out.println("Medida = " + x + "x" + x);
        scanner.close();
    }

}