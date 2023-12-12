package atividade12;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade12n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> inteiros = new ArrayList<Integer>();
		int leitura;
		
		inteiros.add(2);
		inteiros.add(5);
		inteiros.add(1);
		inteiros.add(3);
		inteiros.add(4);
		inteiros.add(9);
		inteiros.add(7);
		inteiros.add(8);
		inteiros.add(10);
		inteiros.add(6);
		
		System.out.println("Digite o numero ao qual deseja encontrar o indice: ");
		leitura = leia.nextInt();
		
		if (inteiros.contains(inteiros.indexOf(leitura))) {
			System.out.println("O indice do numero digitado é: "+inteiros.indexOf(leitura));
			
		}else {
			
			System.out.println("O indice do numero digitado não foi encontrado");
		}

	}

}
