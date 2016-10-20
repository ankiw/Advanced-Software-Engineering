

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/areasquare")
public class AreaOfSquare {
	@GET
	@Produces("application/xml")
	public String areastatic() {
 
		Double area;
		Double side = 10.0;
		area = (side * side);
 
		String result = "@Produces(\"application/xml\") \n Area of square: " + area;
		return "<conversion>" + "<side>" + side + "</side>" + "<output>" + result + "</output>" + "</conversion>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String areainput(@PathParam("c") Double c) {
		Double area;
		Double side = c;
		area = (side * side);
 
		String result = "@Produces(\"application/xml\") \n Area of Square: " + area;
		return "<conversion>" + "<side>" + side + "</side>" + "<output>" + result + "</output>" + "</conversion>";
	}
}