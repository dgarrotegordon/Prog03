import java.util.Scanner;
public class Ejercicio03For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero=0;
		int divisor=1;
		int resultado;
		
		System.out.println("introduzca un valor: ");
		numero = teclado.nextInt();
	for(divisor=1; divisor<numero; divisor++){
		resultado = numero%divisor;
		if(resultado==0){
			System.out.println(divisor);
			}
	}
		}
	}

