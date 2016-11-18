import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int N, divisor; boolean esPrimo = false;
N = teclado.nextInt();
	while(!esPrimo){
		N++;
		esPrimo = true;
		divisor = 2;
		while(esPrimo && divisor<N){
			esPrimo = N % divisor != 0;
			divisor++;
					}
		if(esPrimo){
			System.out.println("El numero primo mas cercano por exceso es: " + N);
			}
	}
	}
	}
