import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa lee una secuencia de n�meros y te devuelve la media
		//de estos n�meros, el mayor n�mero introducido y el menor.
Scanner teclado = new Scanner(System.in);
int numero;
int suma=0;
int contador=0;
int media;
int mayor=0;
int menor=1000;
System.out.println("Introduzca un n�mero: ");
numero = teclado.nextInt();
	while(numero!=0){
	suma = numero+suma;
	contador++;
		if(numero>mayor){
		mayor = numero;
			}
		if(numero<menor){
		menor = numero;	
		}				
	System.out.println("Introduzca un n�mero: ");
	numero = teclado.nextInt();
	}
	media=suma/contador;
	System.out.println("La media de estos n�meros es: " + media);
	System.out.println("El mayor n�mero es: " + mayor);
	System.out.println("El menor n�mero introducido es: " + menor);
	}
}
//He tenido que introducir 1000 en el valor de menor para que no se
//me quedase como 0. Averiguar como evitar este problema.