package Aula7_Condicionais;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int soma, multi, div, sub, num1, num2;
		String operador;
		
		System.out.println("Digite um numero inteiro: ");
		num1 = input.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		num2 = input.nextInt();
		System.out.println("Digite o operador que deseja fazer a conta '+, -, *, /': ");
		operador = input.next();
		
		switch(operador) 
		{
		case("+"):
			soma = num1 + num2;
			System.out.println("A soma entre os dois numeros é: " + soma);
			break;
		case("-"):
			sub = num1 - num2;
			System.out.println("A subtaçao entre os dois numero é: " + sub);
			break;
		case("/"):
			div = num1  / num2;
			System.out.println("A divisao entre os dois numeros é: " + div);
			break;
		case("*"):
			multi = num1 * num2;
			System.out.println("A multiplicaçao entre os dois numeros é: " + multi);
			break;
			
		}

	}

}
