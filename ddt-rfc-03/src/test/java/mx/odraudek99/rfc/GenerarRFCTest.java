package mx.odraudek99.rfc;




import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GenerarRFCTest {

	private static final String RFC_EXPRESION_REGULAR =
			"^([A-Z]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1]))([A-Z]{3})?$";
	
	GenerarRFC generaRFC ;
	
	@Before
    public void prepare() {
		generaRFC  = new GenerarRFC();
	}
	
	
	@Test
    public void testNotNull() {
		
 
        Assert.assertNotNull(generaRFC.generarRFCAleatorio());
	}
	
	
	@Test
    public void testFormato() {
		String rfc = generaRFC.generarRFCAleatorio();
		System.out.println("rfc: "+rfc);
		Assert.assertTrue(rfc.matches(RFC_EXPRESION_REGULAR));
	}
	
	
}
