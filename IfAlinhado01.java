package Aula7_Condicionais;

import java.util.Scanner;

public class IfAlinhado01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Numero inteiro: ");
		num = input.nextInt();
		
		if (num > 0)
		{
			System.out.println("O numero digitado � positivo!");
			if (num % 2 == 0) 
			{
				System.out.println("O numero digitado � par!");
			}
			else 
			{
				System.out.println("O numero digitado � impar!");
			}
		}
		else 
		{
			System.out.println("O numero digitado � negativo!");
		}

	}

}
