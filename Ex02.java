package Aula7_Condicionais;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int n1, n2, r;
			
			
			System.out.println("Primeiro numero: ");
			n1 = teclado.nextInt();
			System.out.println("Segundo numero: ");
			n2 = teclado.nextInt();
			r = n1 % n2;
			if (r == 0)
			{
				System.out.println("Exato!");
			}
			else 
			{
				System.out.println("Não é exato!");
			}

	}

}
