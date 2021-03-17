package application;

import java.util.Locale;
import java.util.Scanner;

import entities.dados_quartos;

public class front {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		dados_quartos[] aluguel = new dados_quartos[9];
		
		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		for(int i = 0;i < n;i++) {
			System.out.println();
			System.out.println("Rent #1: ");
			System.out.printf("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.printf("email: ");
			String email = sc.nextLine();
			
			System.out.println("room: ");
			int quarto = sc.nextInt();
			
			aluguel[quarto] = new dados_quartos(name,email);
			
			
		}
		
		
		System.out.println("Busy rooms: ");
		for(int i = 0;i < aluguel.length;i++) {
			if(aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i].getName() + ", " + aluguel[i].getEmail());
			}
		}
		
		
		
		
		 sc.close();
	}

}
