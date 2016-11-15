import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Este programa suma los números que se van introduciendo separando
//los que se introducen en posición impar y los que se introducen en
//posición par y además nos dice la cantidad de números de cada introducidos
Scanner teclado = new Scanner(System.in);
int numero=0;
int sumaPar=0;
int sumaImpar=0;
int contadorImpar=0;
int contadorPar=0;
System.out.println("Introduce un número: ");
numero = teclado.nextInt();
	while(numero!=0){
	sumaImpar = sumaImpar + numero;
	contadorImpar++;
	System.out.println("Introduce un número: ");
	numero = teclado.nextInt();
	sumaPar = sumaPar + numero;
	contadorPar++;
	System.out.println("Introduce un número: ");
	numero = teclado.nextInt();
	}
System.out.println("La suma de todos los números en posición par es: " + sumaPar);
System.out.println("La suma de todos los números en posición impar es: " + sumaImpar);
System.out.println("Se han introducido " + contadorPar + " números pares");
System.out.println("Se han introducido " + contadorImpar + " números impares");
	}

}
