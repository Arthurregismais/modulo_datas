package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
 
	

	public static void main(String[] args) throws ParseException {
	
		String diaSemana = null;
		
		Date date = new Date();
		
		
		/* O método getDay() retorna um número de 0 a 6 que possui um dia da semana correspondente.
		 * Por meio deste switch case podemos fazer a conversão para o dia da semana, utilizando a variável do tipo
		 * String diaSemana */
		switch (date.getDay()) {
		case 0:
			diaSemana = "Domingo";
			break;
			
		case 1: 
			diaSemana = "Segunda-feira";
			break;
			
		case 2:
			diaSemana = "Terça-feira";
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
			diaSemana = "Sábado";
			break;
		}
		
		
		System.out.println("Data em milisegundos: " + date.getTime());
		
		System.out.println("Dia do mês: " + date.getDate());
		
		System.out.println("Dia da semana: " + diaSemana);
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Minutos da hora: " + date.getMinutes());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano " + (date.getYear() + 1900));
		
		
		/*------------------------ SimpleDateFormat ------------------------- */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrão e String " + simpleDateFormat.format(date));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato de banco de dados: " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-10-18"));
		
		simpleDateFormat = new SimpleDateFormat("yyyy:mm:dd");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1987:10:18"));
		
		simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1987/10/18"));
	}
	
}
