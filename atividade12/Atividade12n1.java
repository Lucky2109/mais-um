package atividade12;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Atividade12n1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nomes = new ArrayList<String>();
		String cores;
		
		
		for(int i=0; i < 5; i++) {
		System.out.println("\nDigite um cor");
		cores =leia.nextLine();
		nomes.add(cores);
		}
		
		System.out.println("As cores digitadas foram "+nomes);
		
		Collections.sort(nomes);
		System.out.println("As cores digitadas foram "+nomes);
		
		

	}

}
