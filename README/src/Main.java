//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        public int calcularOperacion(int valorI, int valorII, char opcion) {
            switch (opcion) {
                case '+':
                    return valorI + valorII;
                case '-':
                    return valorI - valorII;
                case '':
                    return valorI valorII;
                case '/':
                    if (valorII != 0) {
                        return valorI / valorII;
                    } else {
                        System.out.println("No se puede dividir entre 0");
                        return 0;
                    }
                default:
                    System.out.println("Operación no válida");
                    return 0;
            }
        }

        public String generarMensaje(int valorI, int valorII, char opcion, int operacion) {
            return "El resultado de " + valorI + " " + opcion + " " + valorII + " es: " + operacion;
        }
    }
    }
}