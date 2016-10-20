

import static org.junit.Assert.*;


import org.junit.Test;

public class AreaTest {

	@Test
	public void test() {
		AreaOfSquare testarea = new AreaOfSquare();
		String myresult = testarea.areainput(10.0);
		Double testside = 10.0;
		
		String res = "@Produces(\"application/xml\") \n Area of Square: ";
		String results = "<conversion>" + "<side>" + testside + "</side>" + "<output>" + res + "</output>" + "</conversion>";
		System.out.println("@Test area(): " + results + " = " + myresult);
		assertEquals(results, myresult);
	}
	@Test
	public void test2() {
		AreaOfSquare testarea2 = new AreaOfSquare();
		String myresult2 = testarea2.areainput(50.0);
		Double testside2 = 50.0;
		Double area2 = 2500.0;
		String res2 = "@Produces(\"application/xml\") \n Area of Square: " + area2;
		String results2 = "<conversion>" + "<side>" + testside2 + "</side>" + "<output>" + res2 + "</output>" + "</conversion>";
		System.out.println("@Test area(): " + results2 + " = " + myresult2);
		assertEquals(results2, myresult2);
	}
}