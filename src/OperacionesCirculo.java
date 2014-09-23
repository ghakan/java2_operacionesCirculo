import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * de la suma y la resta de dos números.
 */
public class OperacionesCirculo {

	public static void main (String args[]) {

		float numero1, resultadoArea, resultadoCircun;
		Circulo operaciones = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa un número: ");
		numero1 = sc.nextFloat();

		resultadoArea = operaciones.area(numero1);
		resultadoCircun = operaciones.circunferencia(numero1);

		System.out.println("\nEl resultado del AREA es: " + resultadoArea);
		System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircun);
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
