import java.util.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int figura;
int base, altura, area;
System.out.println("Introduzca 1 para calcular el área de un Triángulo: ");
System.out.println("Introduzca 2 para calcular el área de un Cuadrado: ");
System.out.println("Introduzca 3 para calcular el área de un Rectángulo: ");
figura = teclado.nextInt();

	switch (figura){
	case 1:
		System.out.println("Ha seleccionado calcular el área de un triángulo");
		System.out.println("Introduzca el valor de la base: ");
		base = teclado.nextInt();
		System.out.println("Introduzca el valor de la altura: ");
		altura = teclado.nextInt();
		area = base * altura / 2;
		System.out.println("El área del Triángulo es: " + area);		
		break;
	case 2:
		System.out.println("Ha seleccionado calcular el área de un cuadrado");
		System.out.println("Introduzca el valor de un lado: ");
		base = teclado.nextInt();
		area = base * base;
		System.out.println("El área del Cuadrado es: " + area);		
		break;
	case 3:
		System.out.println("Ha seleccionado calcular el área de un rectángulo");
		System.out.println("Introduzca el valor de la base: ");
		base = teclado.nextInt();
		System.out.println("Introduzca el valor de la altura: ");
		altura = teclado.nextInt();
		area = base * altura;
		System.out.println("El área del Rectángulo es: " + area);		
		break;
	
	default:
		System.out.println("¿No sabe contar? He dicho del 1 al 3");
	


}
	}
}
