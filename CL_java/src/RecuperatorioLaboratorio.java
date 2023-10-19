import java.util.Scanner;

public class RecuperatorioLaboratorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        double  iva,product,result,ivaFinal;
        result = 0;
        System.out.println("BIENVENIDO A L CALCULADORA DE IVA");
        System.out.println("Ingrese el monto del producto");
        product = sc.nextDouble();
        while (true){
            System.out.println("Ingrese la opcion correspondinte a la operacion que desea hacer");
            System.out.println("1.Sumar Iva del Producto");
            System.out.println("2.Restar Iva del Producto");
            System.out.println("3.Multiplicar Iva del Producto");
            System.out.println("4.Dividir Iva del Producto");
            System.out.println("0.Salir");
            opc = sc.nextInt();
            if (opc == 1){
                System.out.println("Ingrese el valor del Iva en porcentaje");
                iva = sc.nextInt();
                ivaFinal = (iva*product)/100;
                result = product + ivaFinal;
                System.out.println("El precio del producto mas el Iva es de ["+result+"]");

            } else if (opc == 2) {
                System.out.println("Ingrese el valor del Iva en porcentaje");
                iva = sc.nextInt();
                ivaFinal = (iva*product)/100;
                result = product - ivaFinal;
                System.out.println("El precio del producto menos el Iva es de ["+result+"]");
            } else if (opc == 3) {
                System.out.println("Ingrese el valor del Iva en porcentaje");
                iva = sc.nextInt();
                ivaFinal = (iva*product)/100;
                result = product * ivaFinal;
                System.out.println("El precio del producto multiplicado por el Iva es de ["+result+"]");
            } else if (opc == 4) {
                System.out.println("Ingrese el valor del Iva en porcentaje");
                iva = sc.nextInt();
                ivaFinal = (iva*product)/100;
                if (ivaFinal == 0){
                    System.out.println("Error");
                    System.out.println("No se puede dividir por cero");
                }else {
                    result = product / ivaFinal;
                    System.out.println("El precio del producto dividido por el Iva es de ["+result+"]");
                }
            } else if (opc == 0) {
                break;

            }
        }
    System.out.println("¡¡HASTA LUEGO!!");
    }
}

