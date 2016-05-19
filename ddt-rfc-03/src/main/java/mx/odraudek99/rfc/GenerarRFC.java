package mx.odraudek99.rfc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GenerarRFC {

	static String[] abc = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
		"X", "Y", "Z" };

	static String[] mes = { "01", "02", "03", "04", "05", "06", "07", "08",
		"09", "10", "11", "12" };


	static String[] tipoPersona = { "F", "M" };
	static SimpleDateFormat sf = new SimpleDateFormat("yyMMdd");
	
	private Random rand = new Random();
	
	public String generarRFCAleatorio() {
		
		StringBuffer rfc = new StringBuffer();
		
		String tipo = randomString(tipoPersona);
		rfc.append(generaRFC(tipo));
		
		
		
		
		return rfc.toString();
	}
	
	private String generaRFC(String tipoPersona) {
		StringBuffer sb = new StringBuffer();

		sb.append(randomString(abc));
		sb.append(randomString(abc));
		sb.append(randomString(abc));
		if ("F".equals(tipoPersona)) {
			sb.append(randomString(abc));
		}

		

		return sb.toString();
	}
	
	
	
	private  String randomString(String[] str) {
		int randomNum = rand.nextInt((str.length - 0)) + 0;
		return str[randomNum];
	}
	
	public double randomNum(double max) {
		double randomNum = (double) (Math.random() * max);
		return randomNum;
	}
	
}
