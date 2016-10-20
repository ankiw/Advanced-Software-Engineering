

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTestcases2 {

	@Test
	public void test1() {
		AreaOfTriangle testcase = new AreaOfTriangle();
		String myresult = testcase.triangleareainput(10.0, 5.0);
		Double testheight = 10.0;
		Double testbase = 5.0;
		Double area = 25.0;
		String res = "@Produces(\"application/xml\") \n Area of Triangle: " + area;
		String results = ("<areaoftriangle>" + "<height>" + testheight + "</height>"+ "<base>" + testbase + "</base>" + "<area>" + res + "</area>" + "</areaoftriangle>");
		System.out.println("@Test area(): " + results + " = " + myresult);
		assertEquals(results, myresult);
	}
	@Test
	public void test2()
	{
		AreaOfTriangle testcase2 = new AreaOfTriangle();
		String myresult2 = testcase2.triangleareainput(20.0, 10.0);
		Double testheight2 = 20.0;
		Double testbase2 = 10.0;
		Double area2 = 100.0;
		String res2 = "@Produces(\"application/xml\") \n Area of Triangle: " + area2;
		String results2 = ("<areaoftriangle>" + "<height>" + testheight2 + "</height>"+ "<base>" + testbase2 + "</base>" + "<area>" + res2 + "</area>" + "</areaoftriangle>");
		System.out.println("@Test area(): " + results2 + " = " + myresult2);
		assertEquals(results2, myresult2);
	}

}