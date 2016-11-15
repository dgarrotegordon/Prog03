import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int N, numero=1, divisor=2, divisores, modulo;
boolean esPrimo;
System.out.println("Introduzca un número: ");
N = teclado.nextInt();
	while(numero<=N){
	divisores=0;	
	divisor=2;
		while(divisor <= numero){
			modulo = numero%divisor;
			divisor++;
			if (modulo==0){
				divisores++;}
			if (divisores!=0){
				esPrimo=false;
			System.out.print(numero);
			}
			}
numero++;}

	
		
	}
	
	}
	
	