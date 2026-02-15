import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {

        int valorI = ingresarEntero("Ingrese el primer valor que desea operar: ");
        int valorII = ingresarEntero("Ingrese el segundo valor que desea operar: ");
        char opcion = ingresarCaracter("Ingrese la operación (+, -, *, /): ");
        int operacion = calcularOperacion(valorI, valorII, opcion);
        String mensaje = generarMensaje(valorI, valorII, opcion, operacion);
        System.out.println(mensaje);
    }

    public int ingresarEntero(String entrada) {
        System.out.print(entrada);
        return scanner.nextInt();
    }

    public char ingresarCaracter(String entrada) {
        System.out.print(entrada);
        return scanner.next().charAt(0);
    }

}

