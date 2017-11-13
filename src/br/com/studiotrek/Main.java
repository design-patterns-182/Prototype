package br.com.studiotrek;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Kleber";
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("curso");
		hashSet.add("java");
		hashSet.add("k19");
		
		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha.toString());
		
		Campanha clone = campanha.clone();
		clone.setNome("Cornelio");
		System.out.println(clone.toString());
	}
	
}
