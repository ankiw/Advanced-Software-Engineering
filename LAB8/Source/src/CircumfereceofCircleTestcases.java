

import static org.junit.Assert.*;


import org.junit.Test;

public class CircumfereceofCircleTestcases {

	@Test
	public void test1() {
		CircumferenceofCircle testcase = new CircumferenceofCircle();
		String myresult = testcase.circumferenceinput(2.0);
		Double testradius = 2.0;
		Double circumference = 6.28;
		String res = "@Produces(\"application/xml\") \n Circumference of Circle: " + circumference;
		String results = ("<conversion>" + "<radius>" +testradius + "</radius>"+ "<output>" + res + "</output>" + "</conversion>");
		System.out.println("@Test circumference(): " + results + " = " + myresult);
		assertEquals(results, myresult);
	}
	@Test
	public void test2() {
		CircumferenceofCircle testcase = new CircumferenceofCircle();
		String myresult = testcase.circumferenceinput(2.0);
		Double testradius = 2.0;
		Double circumference = 12.56;
		String res = "@Produces(\"application/xml\") \n Circumference of Circle: " + circumference;
		String results2 = ("<conversion>" + "<radius>" +testradius + "</radius>"+ "<output>" + res + "</output>" + "</conversion>");
		System.out.println("@Test circumference(): " + results2 + " = " + myresult);
		assertEquals(results2, myresult);
	}
}
