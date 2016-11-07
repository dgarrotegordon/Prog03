import java.util.*;
public class Ejercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int A;
int B;
int resultado=0;
System.out.println("Inserte valor de A: ");
A = teclado.nextInt();
System.out.println("Inserte valor de B: ");
B = teclado.nextInt();
while (A > B){
	System.out.println("Inserte valor de A: ");
A = teclado.nextInt();
System.out.println("Inserte valor de B: ");
B = teclado.nextInt();
}
while (A != B-1){
	A++;
	resultado = resultado + A;

}
System.out.println(resultado);


		
		
}
}