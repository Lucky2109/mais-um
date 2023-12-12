package atividade12;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class atividade12n4 {

	public static void main(String[] args) {
	
		Set<Integer> numero = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		int valores;
		
		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);
		
		System.out.println("Digite um numero para encontrar no indice: ");
		valores =leia.nextInt();
		
		if (numero.contains(valores)) {
			System.out.println("O numero digitado "+valores+" foi encontrado");					
		}else {
			
			System.out.println("O numero digitado "+valores+" não foi encontrado");
		}
		

	}

}
