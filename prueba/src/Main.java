//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Valores quemados por cuestiones de prueba
        int numero = 1;
        int numero2 = 4;
        int resultado = SumaNumeros(numero, numero2);
        System.out.println(resultado);
    }
    public static int SumaNumeros(int numero, int numero2){
        return numero + numero2;
    }
}