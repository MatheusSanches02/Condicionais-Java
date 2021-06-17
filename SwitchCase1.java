package Aula7_Condicionais;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String mes;
		
		System.out.println("Digite um mes: ");
		mes = input.next();
		
		switch (mes) 
		{
		case "janeiro":
			System.out.println("Mes de alta temporada!");
			break;
		case "fevereiro":
			System.out.println("Mes de alta temporada!");
			break;
		case "dezembro":
			System.out.println("Mes de alta temporada!");
			break;
		case "junho":
			System.out.println("Mes de alta temporada!");
			break;
		case "julho":
			System.out.println("Mes de alta temporada!");
			break;
		default:
			System.out.println("Mes de baixa temporada!");
		}

	}

}
