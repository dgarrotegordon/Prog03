import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int N;
int divisores=0;
int divisor=1;
System.out.println("Introduzca un número para saber si es primo: ");
N = teclado.nextInt();
	while(divisor <= N){
	int modulo = N%divisor;
	divisor++;
		if (modulo==0){
		divisores++;
		}
}
	if (divisores==2){
System.out.println("El número es primo");}
	else {
	System.out.println("El número no es primo");}
	}
	}


