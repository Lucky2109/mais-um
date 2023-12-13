package atividade12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class atividade12dados2 {

	public static void main(String[] args) {
		
		
		Queue<Integer> numero = new LinkedList<Integer>();
		Stack<String> pilha = new Stack<String>();
		int caso, contador = 0;
		String livro;
		Scanner leia = new Scanner(System.in);
		System.out.println("===========================================================================");
		System.out.println("1: Adicionar um novo livro na pilha.\r\n"
				+ "2: Listar todos os livros da Pilha\r\n"
				+ "3: Retirar um livro da pilha \r\n"
				+ "0: Finalizar programa. \r\n"
				+ "");
		System.out.println("===========================================================================");

		while (contador == 0) {

			System.out.println("escolha uma das opções: ");
			caso = leia.nextInt();
			leia.nextLine();
			switch (caso) {

			case 1:

				System.out.println("Adicione o nome do livro: ");
				livro = leia.nextLine();
				pilha.add(livro);

				break;

			case 2:
				System.out.println(pilha);

				break;

			case 3:
				if(pilha.isEmpty()==false) {
				System.out.println("O Livro: " + pilha.pop() + " foi retirado da Pilha:  ");}
				else {
					System.out.println("A fila esta vazia ");
				}
				
				
				break;

			case 0:

				System.out.println("O programa sera finalizado");
				contador++;

				break;

			default:

				System.out.println("Opção invalida");

				

			}
		}
		// TODO Auto-generated method stub

	}

}
