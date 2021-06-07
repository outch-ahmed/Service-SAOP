package fr.aston.poec.formation.jee.ws.client;

import fr.aston.poec.formation.jee.ws.CalculatriceService;
import fr.aston.poec.formation.jee.ws.ICalculatrice;
import fr.aston.poec.formation.jee.ws.converer.ConverterService;
import fr.aston.poec.formation.jee.ws.converer.IConverter;

public class Client {
	public static void main(String[] args) {
//		try {
//			CalculatriceService service = new CalculatriceService();
//			ICalculatrice calculatrice = service.getCalculatricePort();
//			double resultat = calculatrice.addition(5.6, 2.);
//			System.out.println(resultat);
//		} catch (Exception e) {
//			e.fillInStackTrace();
//		}
		try {
			ConverterService service = new ConverterService();
			IConverter converter = service.getConverterPort();
			
			double resultat = converter.celsiusFahrenheit(10);
			System.out.println("resultat = " + resultat);
			
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
}
