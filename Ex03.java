package Aula7_Condicionais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double massa, peso, altura;
		
		System.out.println("Peso: ");
		peso = input.nextDouble();
		System.out.println("Altura: ");
		altura = input.nextDouble();
		massa = (peso / Math.pow(altura, altura));
		// massa = (peso / (altura * altura))
		
		if (massa < 26) 
		{
			System.out.println("Normal");
		}
		else if(massa >= 26 && massa < 30) 
		{
			System.out.println("Obeso");
		}
		else 
		{
			System.out.println("Obeso Morbido");
		}
		

	}

}
