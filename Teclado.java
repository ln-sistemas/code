import java.util.Scanner;

public class Teclado {
	public static void main(String[] args) {
		System.out.println("Digite alguma coisa ");
		Scanner in = new Scanner (System.in);
		System.out.println("Você digitou " + in.nextLine());
		
	}
}