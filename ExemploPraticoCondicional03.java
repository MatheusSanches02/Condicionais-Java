package Aula7_Condicionais;

import java.util.Scanner;

public class ExemploPraticoCondicional03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade;
		float peso;
		
		System.out.println("Idade: ");
		idade = input.nextInt();
		System.out.println("Peso: ");
		peso = input.nextFloat();
		
		if(idade > 18) 
		{
			if(peso > 50) 
			{
				System.out.println("Você pode doar sangue!");
			}
		}
		

	}

}
