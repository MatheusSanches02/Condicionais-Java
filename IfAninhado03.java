package Aula7_Condicionais;

import java.util.Scanner;

public class IfAninhado03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num ;
		
		System.out.println("Digite um numero inteiro: ");
		num = input.nextInt();
		
		if(num > 10 ) 
		{
			System.out.println("O numero � maior que 10!");
			if (num == 10) 
			{
				System.out.println("Voc� acertou! O numero � igual a 10!");
				if (num < 10) 
				{
					System.out.println("O numero � menor que 10!");
				}
			}
		}
		

	}

}
