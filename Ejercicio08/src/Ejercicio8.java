import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Este programa calcula el factorial de un número.
Scanner teclado = new Scanner(System.in);
int N, factorial=1;
System.out.println("Introduzca un número para calcular el factorial: ");
N= teclado.nextInt();
final int valor=N;//Declaramos una constante con el mismo valor de N
	while(N!=0){  //y así podemos nombrarlo en el resultado sin que cambie
	factorial=factorial*N; //su valor.
	N--;
	}
System.out.println("El factorial de " + valor + " es: " + factorial);
	}

}
