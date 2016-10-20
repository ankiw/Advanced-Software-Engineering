

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/areatriangle")
public class AreaOfTriangle {
 
	  @GET
	  @Produces("application/xml")
	  public String trianglearea() {
 
		Double height = 10.0;
		Double base = 5.0;
		Double area;
		area = 0.5*(height * base); 
		String result = "@Produces(\"application/xml\") \n Area of Triangle: " + area;
		return "<areaoftriangle>" + "<height>" + height + "</height>"+ "<base>" + base + "</base>" + "<area>" + result + "</area>" + "</areaoftriangle>";
	  }
 
	  @Path("/{h}/{b}")
	  @GET
	  @Produces("application/xml")
	  public String triangleareainput(@PathParam("h") Double h, @PathParam("b") Double b){
		Double area;
		Double height =h;
		Double base =b;
		area = 0.5*(height * base); 
		String result = "@Produces(\"application/xml\") \n Area of Triangle: " + area;
		return "<areaoftriangle>" + "<height>" + height + "</height>"+ "<base>" + base + "</base>" + "<area>" + result + "</area>" + "</areaoftriangle>";	  		
	  }
}