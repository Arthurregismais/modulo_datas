package modulo_datas;

import java.util.Date;

public class DatasEmJava {
 
	

	public static void main(String[] args) {
	
		String diaSemana = null;
		
		Date date = new Date();
		
		
		/* O m�todo getDay() retorna um n�mero de 0 a 6 que possui um dia da semana correspondente.
		 * Por meio deste switch case podemos fazer a convers�o para o dia da semana, utilizando a vari�vel do tipo
		 * String diaSemana */
		switch (date.getDay()) {
		case 0:
			diaSemana = "Domingo";
			break;
			
		case 1: 
			diaSemana = "Segunda-feira";
			break;
			
		case 2:
			diaSemana = "Ter�a-feira";
			break;
			
		case 3:
			diaSemana = "Quarta-feira";
			break;

		case 4:
			diaSemana = "Quinta-feira";
			break;
			
		case 5:
			diaSemana = "Sexta-feira";
			break;
			
		case 6:
			diaSemana = "S�bado";
			break;
		}
		
		
		System.out.println("Data em milisegundos: " + date.getTime());
		
		System.out.println("Dia do m�s: " + date.getDate());
		
		System.out.println("Dia da semana: " + diaSemana);
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Minutos da hora: " + date.getMinutes());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano " + (date.getYear() + 1900));
		
		
	}
	
}
