import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int numero;
int divisor=1;
int sumaDivisores=0;
int modulo;
System.out.println("Introduzca un n�mero para saber si es perfecto: ");
numero = teclado.nextInt();
while(divisor < numero){
 modulo = numero%divisor;
		if(modulo == 0){
		sumaDivisores = sumaDivisores + divisor;
		}
	divisor++;
	
}
if(sumaDivisores == numero)
	System.out.println("El n�mero introducido es perfecto");

else
	System.out.println("El n�mero introducido no es perfecto");

	}

}
