package atividade12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade12n3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numero = new HashSet<Integer>();
		int leitura;
		// TODO Auto-generated method stub

		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite valor "+(i+1)+ " não repetido(s): ");
			leitura=leia.nextInt();	
			numero.add(leitura);
								
		}
		Iterator<Integer> inumeros = numero.iterator();

		while (inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}
		
	}

}
