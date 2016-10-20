

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/areacircle")
public class AreaofCircle {
	@GET
	@Produces("application/xml")
	public String areastatic() {
 
		Double area;
		Double radius = 10.0;
		area = 3.14*(radius * radius);
 
		String result = "@Produces(\"application/xml\") \n Area of circle: " + area;
		return "<conversion>" + "<radius>" + radius + "</radius>" + "<output>" + result + "</output>" + "</conversion>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String areainput(@PathParam("c") Double c) {
		Double area;
		Double radius = c;
		area = 3.14*(radius * radius);
 
		String result = "@Produces(\"application/xml\") \n Area of Circle: " + area;
		return "<conversion>" + "<radius>" + radius + "</radius>" + "<output>" + result + "</output>" + "</conversion>";
	}
}