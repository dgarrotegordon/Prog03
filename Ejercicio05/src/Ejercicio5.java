import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int numero=0;
int suma=0;
int contador=0;
System.out.println("Introduce un número: ");
numero = teclado.nextInt();
	while(numero!=0){
	suma = suma + numero;
	contador++;
	System.out.println("Introduce un número: ");
	numero = teclado.nextInt();
	}
System.out.println("La suma de todos los números introducidos es: " + suma);
System.out.println("Se han introducido " + contador + " números");
	
	
	}

}
