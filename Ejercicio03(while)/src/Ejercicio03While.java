import java.util.*;
public class Ejercicio03While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Este programa calcula el n�mero de divisores de un n�mero N sin
		//Sin contarse a si mismo
Scanner teclado = new Scanner(System.in);
int N;
int divisor=1;
int resultado=0;
System.out.println("Introduzca un n�mero para saber sus divisores: ");
N = teclado.nextInt();
	while(divisor >= 1 && divisor < N){
	resultado = N%divisor;
		if(resultado == 0){
		System.out.println(divisor);
		}
	divisor++;
	}	
	}
}
//Despu�s de hacerlo con un for, he visto como hacerlo con un while y un if.