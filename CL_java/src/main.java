import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int calculadora;
        int salir = 0;

        while (salir != 5) {
            System.out.print("Ingrese La funcion que desea realizar: 1(Sumar) 2(Multiplicar) 3(Restar) 4(Dividir) 5(Salir)\n");
            calculadora = entrada.nextInt();
            switch (calculadora) {
                case 1:
                    System.out.println("Ingrese el valor del primer numero: ");
                    int numSuma1 = entrada.nextInt();
                    System.out.println("Ingrese el valor del segundo numero: ");
                    int numSuma2 = entrada.nextInt();

                    int suma = numSuma1 + numSuma2;
                    System.out.println("El valor de la suma es: " + suma);
                    continue;
                case 2:
                    System.out.println("Ingrese el valor del primer numero: ");
                    int numMulti1 = entrada.nextInt();
                    System.out.println("Ingrese el valor del segundo numero: ");
                    int numMulti2 = entrada.nextInt();

                    int multiplicar = numMulti1 * numMulti2;
                    System.out.println("El valor de la multiplicacion es: " + multiplicar);
                    continue;
                case 3:
                    System.out.println("Ingrese el valor del primer numero: ");
                    int numResta1 = entrada.nextInt();
                    System.out.println("Ingrese el valor del segundo numero: ");
                    int numResta2 = entrada.nextInt();

                    int resta = numResta1 - numResta2;
                    System.out.println("El valor de la resta es: " + resta);
                    continue;
                case 4:
                    System.out.println("Ingrese el valor del primer numero: ");
                    double numDiv1 = entrada.nextDouble();
                    System.out.println("Ingrese el valor del segundo numero: ");
                    double numDiv2 = entrada.nextDouble();
                    double dividir = numDiv1 / numDiv2;
                    if (numDiv2 == 0) {
                        System.out.println("NO se puede dividir por 0");}
                    else{
                        System.out.println("El valor de la Division es: " + dividir);
                    continue;}
                case 5:
                    System.out.println("El programa a finalizado!");
                    break;
                default:
                    System.out.println("codigo mal");
            }


        }

    }
}