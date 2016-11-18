import java.util.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int N, numero=1, divisor;
boolean esPrimo=true;
System.out.println("Introduzca un número: ");
N = teclado.nextInt();

if (N <= 1) {
	System.out.print("1");
} else if (N <= 2) {
	System.out.print("1 2");
} else {
	
	System.out.print("1 2 3 ");
	numero  = 4;
	
	while(numero<=N) {
		
//		while (numero==1 || numero==2 || numero==3){
//			System.out.print(numero + " ");
//			numero++;
//		}
		//	System.out.println(numero + " " + N);
		if(numero%2!=0) {
			divisor=3;
			
			while (esPrimo && divisor<numero){
				if(numero%divisor!=0){
					///esPrimo=true;						
					divisor+=2;
				}
				else{
					esPrimo=false;	
				}
			}
			
			if (esPrimo){
				System.out.println(numero+ " ");
			} else {
				esPrimo = true; // lo ponemos a cierto, para comprobar el siguiente número
			}
		}
		
		numero++;
	}
}

}
	
}
	