/*
 * Encoding: UTF-8 Cadena de comprobación de encoding: 'El veloz murciélago
 * hindú comía feliz cardillo y kiwi.' 'La cigüeña tocaba el saxofón detrás del
 * palenque de paja.'
 * 
 * @author Carlos G. Gonzalez <turntoplay<nospam>gmail.com>
 * 
 * @blog: http://cgonzalezblog.blogspot.com.es
 * 
 * @date 27/04/2013
 */
package es.test;

import java.util.List;
import java.util.Map;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OperacionesBD obd = new OperacionesBD(Constantes.JDBC_URL, "postgres", "postgres");
		
		obd.createTablePersons();
		
		obd.insertValueTest();
		
		obd.showFemales();
		
		List <Map<Integer,String>> l = obd.getFemales();
		
		for(Map<Integer,String> item:l){
			System.out.println(item.toString());
		}
		
		obd.update(6, "Rosa Rosae");
		
		obd.showFemales();
		
	}

}
