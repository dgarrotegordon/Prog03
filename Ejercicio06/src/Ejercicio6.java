import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Este programa suma los n�meros que se van introduciendo separando
//los que se introducen en posici�n impar y los que se introducen en
//posici�n par y adem�s nos dice la cantidad de n�meros de cada introducidos
Scanner teclado = new Scanner(System.in);
int numero=0;
int sumaPar=0;
int sumaImpar=0;
int contadorImpar=0;
int contadorPar=0;
System.out.println("Introduce un n�mero: ");
numero = teclado.nextInt();
	while(numero!=0){
	sumaImpar = sumaImpar + numero;
	contadorImpar++;
	System.out.println("Introduce un n�mero: ");
	numero = teclado.nextInt();
	sumaPar = sumaPar + numero;
	contadorPar++;
	System.out.println("Introduce un n�mero: ");
	numero = teclado.nextInt();
	}
System.out.println("La suma de todos los n�meros en posici�n par es: " + sumaPar);
System.out.println("La suma de todos los n�meros en posici�n impar es: " + sumaImpar);
System.out.println("Se han introducido " + contadorPar + " n�meros pares");
System.out.println("Se han introducido " + contadorImpar + " n�meros impares");
	}

}
