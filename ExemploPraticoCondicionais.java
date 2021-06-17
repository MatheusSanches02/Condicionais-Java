package Aula7_Condicionais;

import java.util.Scanner;

public class ExemploPraticoCondicionais {
	public static void main(String[] args) {
		
		// input � um objeto da classe Scanner
		Scanner input = new Scanner(System.in);
		
		// Declara��o de variavel "estoque"
		int estoque;
		
		System.out.println("Estoque: ");
		estoque = input.nextInt();
		
		if(estoque >= 100) 
		{
			System.out.println("Produto com quantidade suficiente!");
			
		} 
		else if(estoque < 100 && estoque > 50) 
		{
			System.out.println("Alerta - estoque baixo");
		}
		else 
		{
			System.out.println("Aten��o - fazer novo pedido");
		}
	}

}
