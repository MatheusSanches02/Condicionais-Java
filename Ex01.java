package Aula7_Condicionais;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Numero: ");
		num = entrada.nextInt();
		if(num > 100)
		{
			num = num + 150;
			System.out.println("O numero agora vale: " + num);
		}
		else 
		{
			System.out.println("Não foi atribuida soma ao numero!");
		}
	}

}
