package Aula7_Condicionais;

import java.util.Scanner;

public class IfAlinhado02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Primeiro numero inteiro: ");
		n1 = input.nextInt();
		System.out.println("Segundo numero inteiro: ");
		n2 = input.nextInt();
		System.out.println("Terceiro numero inteiro: ");
		n3 = input.nextInt();
		
		if (n1 > n2 ) 
		{
			if (n1 > n3) 
			{
				System.out.println("O primeiro numero é o maior!");
			}
		}
		else if (n2 > n1) 
		{
			if(n2 > n3) 
			{
				System.out.println("O segundo numero é o maior!");
			}
		}
		else if(n3 > n1) 
		{
			if(n3 > n2) 
			{
				System.out.println("O terceiro numero é o maior!");
			}
		}

	}

}
