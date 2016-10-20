

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTestcases {

	@Test
	public void test1() {
		AreaOfRect testcase = new AreaOfRect();
		String myresult = testcase.rectangleareainput(10.0, 5.0);
		Double testsideA = 10.0;
		Double testsideB = 5.0;
		Double area = 50.0;
		String res = "@Produces(\"application/xml\") \n Area of Rectangle: " + area;
		String results = "<areaofrectangle>" + "<sideA>" + testsideA + "</sideA>"+ "<sideB>" + testsideB + "</sideB>" + "<area>" + res + "</area>" + "</areaofrectangle>";
		System.out.println("@Test area(): " + results + " = " + myresult);
		assertEquals(results, myresult);
	}
	@Test
	public void test2()
	{
		AreaOfRect testcase2 = new AreaOfRect();
		String myresult2 = testcase2.rectangleareainput(20.0, 10.0);
		Double testsideA2 = 20.0;
		Double testsideB2 = 10.0;
		Double area2 = 200.0;
		String res2 = "@Produces(\"application/xml\") \n Area of Rectangle: " + area2;
		String results2 = "<areaofrectangle>" + "<sideA>" + testsideA2 + "</sideA>"+ "<sideB>" + testsideB2 + "</sideB>" + "<area>" + res2 + "</area>" + "</areaofrectangle>";
		System.out.println("@Test area(): " + results2 + " = " + myresult2);
		assertEquals(results2, myresult2);
	}

}