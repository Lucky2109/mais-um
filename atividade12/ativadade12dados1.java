package atividade12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ativadade12dados1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int caso, contador = 0;
		String cliente;

		System.out.println("===========================================================================");
		System.out.println("1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.\r\n"
				+ "2: Listar todos os Clientes na fila\r\n" + "3: Chamar (retirar) uma pessoa da fila \r\n"
				+ "0: finalizar \r\n" + " ");
		System.out.println("===========================================================================");

		while (contador == 0) {

			System.out.println("escolha uma das opções: ");
			caso = leia.nextInt();
			switch (caso) {

			case 1:

				System.out.println("Adicione um novo cliente na fila");
				cliente = leia.next();
				fila.add(cliente);

				break;

			case 2:
				System.out.println(fila);

				break;

			case 3:

				System.out.println("O cliente: " + fila.poll() + " foi retirado da fila:  ");

				break;

			case 0:

				System.out.println("O programa sera finalizado");
				contador++;

				break;

			default:

				System.out.println("Opção invalida");

				

			}
		}

	}

}
