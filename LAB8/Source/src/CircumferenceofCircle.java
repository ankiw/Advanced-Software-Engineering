

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/circumferencecircle")
public class CircumferenceofCircle {
	@GET
	@Produces("application/xml")
	public String circumferencestatic() {
 
		Double circumference;
		Double radius = 10.0;
		circumference = 2*3.14*(radius);
 
		String result = "@Produces(\"application/xml\") \n Circumference of circle: " + circumference;
		return "<conversion>" + "<radius>" + radius + "</radius>" + "<output>" + result + "</output>" + "</conversion>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String circumferenceinput(@PathParam("c") Double c) {
		Double circumference;
		Double radius = c;
		circumference = 2*3.14*(radius);
 
		String result = "@Produces(\"application/xml\") \n Circumference of Circle: " + circumference;
		return "<conversion>" + "<radius>" + radius + "</radius>" + "<output>" + result + "</output>" + "</conversion>";
	}
}