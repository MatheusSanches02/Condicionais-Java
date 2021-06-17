package Aula7_Condicionais;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double anuidade, newAnuidade,newAnuidade1, newAnuidade2, 
		newAnuidade3, newAnuidade4, newAnuidade5, newAnuidade6, newAnuidade7, 
		newAnuidade8, newAnuidade9, newAnuidade10, juros;
		int mes;
		
		System.out.println("Qual o valor da anuidade? R$");
		anuidade = input.nextFloat();
		System.out.println("Qual mes foi paga a anuidade (Digite o numero do mes de referencia)? ");
		mes = input.nextInt();
		juros = anuidade * 0.05;
		newAnuidade = juros + anuidade;
		newAnuidade1 = (newAnuidade * 0.05) + newAnuidade;
		newAnuidade2 = (newAnuidade1 * 0.05) + newAnuidade1;
		newAnuidade3 = (newAnuidade2 * 0.05) + newAnuidade2;
		newAnuidade4 = (newAnuidade3 * 0.05) + newAnuidade3;
		newAnuidade5 = (newAnuidade4 * 0.05) + newAnuidade4;
		newAnuidade6 = (newAnuidade5 * 0.05) + newAnuidade5;
		newAnuidade7 = (newAnuidade6 * 0.05) + newAnuidade6;
		newAnuidade8 = (newAnuidade7 * 0.05) + newAnuidade7;
		newAnuidade9 = (newAnuidade8 * 0.05) + newAnuidade8;
		newAnuidade10 = (newAnuidade9 * 0.05) + newAnuidade9;
		switch(mes) 
		{
		case (1):
			System.out.println("O valor de anuidade é: R$" + anuidade);
			break;
		case(2):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade);
			break;
		case(3):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade1);
			break;
		case(4):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade2);
			break;
		case(5):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade3);
			break;
		case(6):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade4);
			break;
		case(7):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade5);
			break;
		case(8):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade6);
			break;
		case(9):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade7);
			break;
		case(10):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade8);
			break;
		case(11):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade9);
			break;
		case(12):
			System.out.println("O valor da anuidade com juros de atraso é R$" + newAnuidade10);
			break;
		}
		
		
		
	}

}
