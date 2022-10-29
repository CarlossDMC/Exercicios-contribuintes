package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		
		for(int i = 0; i<n; i++) {
	
			
			System.out.println("Tax payer #" + (i + 1) + " data:");
			
			System.out.println("Individual or Company: (i/c)");
			String op = sc.next().toLowerCase();
			
			if(op.equals("i")) {
				
				System.out.println("Name: ");
				String name = sc.next();
				
				System.out.println("Anual income: ");
				Double income = sc.nextDouble();
				
				System.out.println("health expenditures: ");
				Double expenditures = sc.nextDouble();
				
				Pessoa fisica = new PessoaFisica(name, income, expenditures);
				
				pessoas.add(fisica);
				
			}
			
			else if(op.equals("c")) {
				
				System.out.println("Name: ");
				String name = sc.next();
				
				System.out.println("Anual income: ");
				Double income = sc.nextDouble();
				
				System.out.println("Number of emplooyes: ");
				int emplooyes = sc.nextInt();
				
				Pessoa juridica = new PessoaJuridica(name, income, emplooyes);
				
				pessoas.add(juridica);
				
			}
			
		}
		
			System.out.println("TAXES PAID");
			
			Double total = 0.0;
			
			for(int i = 0; i<pessoas.size(); i++) {
				
				System.out.printf(pessoas.get(i).getNome() + ": $ %.2f" , pessoas.get(i).getImposto());
				System.out.println();
				total += pessoas.get(i).getImposto(); 
				
				
			}
			
			System.out.printf("TOTAL TAXES: $ %.2f" , total);
			
			
			
			
		}
		
		
	}


