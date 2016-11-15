import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int N = 1;
		int valorTabla = 1;
		int multiplicacion = 0;
		
		System.out.println("introduzca un valor entre 1 y 100: ");
		N = teclado.nextInt();
		
		while(N < 1 || N > 100){
		System.out.println("introduzca un valor entre 1 y 100: ");
		N = teclado.nextInt();	
		}
		for(valorTabla=1; valorTabla <= 10; valorTabla++){
			multiplicacion = N * valorTabla;
			System.out.println(N + " * " + valorTabla + " = " + multiplicacion);
		}
		
		
	}

}
