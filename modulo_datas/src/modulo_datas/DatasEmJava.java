package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
 
	

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/07/2024");
		
		Date dataAtualHoje = simpleDateFormat.parse("07/07/2024");
		
		
		if (dataVencimentoBoleto.after(dataAtualHoje)) { // Posterior ou maior ou depois da data Atual
			System.out.println("Boleto ainda não venceu");
		} else {
			System.out.println("Boleto vencido - Urgente");
		}
	}
	
}
