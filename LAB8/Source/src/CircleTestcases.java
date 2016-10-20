

import static org.junit.Assert.*;


import org.junit.Test;

public class CircleTestcases {

	@Test
	public void test1() {
		AreaofCircle testcase = new AreaofCircle();
		String myresult = testcase.areainput(10.0);
		Double testradius = 10.0;
		Double area = 314.0;
		String res = "@Produces(\"application/xml\") \n Area of Circle: " + area;
		String results = "<conversion>" + "<radius>" +testradius + "</radius>"+ "<output>" + res + "</output>" + "</conversion>";
		System.out.println("@Test area(): " + results + " = " + myresult);
		assertEquals(results, myresult);
	}
	@Test
	public void test2() {
		AreaofCircle testcase = new AreaofCircle();
		String myresult = testcase.areainput(1.0);
		Double testradius = 1.0;
		Double area = 3.14;
		String res = "@Produces(\"application/xml\") \n Area of Circle: " + area;
		String results2 = "<conversion>" + "<radius>" +testradius + "</radius>"+ "<output>" + res + "</output>" + "</conversion>";
		System.out.println("@Test area(): " + results2 + " = " + myresult);
		assertEquals(results2, myresult);
	}
}
