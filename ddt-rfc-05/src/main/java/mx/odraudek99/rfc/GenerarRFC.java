package mx.odraudek99.rfc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GenerarRFC {

	static String[] abc = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
		"X", "Y", "Z" };




	static String[] tipoPersona = { "F", "M" };
	
	
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

		sb.append(getFecha());
		
		sb.append(randomString(abc));
		sb.append(randomString(abc));
		sb.append(randomString(abc));

		return sb.toString();
	}
	
	
	 SimpleDateFormat sf = new SimpleDateFormat("yyMMdd");

	public  String getFecha() {
		double time = randomNum(1460483351583d);
		Date fecha = new Date((long) time);
		return sf.format(fecha);
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
