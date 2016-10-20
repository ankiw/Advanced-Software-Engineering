

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/arearect")
public class AreaOfRect {
 
	  @GET
	  @Produces("application/xml")
	  public String rectanglearea() {
 
		Double sideA = 10.0;
		Double sideB = 5.0;
		Double area;
		area = (sideA * sideB); 
		String result = "@Produces(\"application/xml\") \n Area of Rectangle: " + area;
		return "<areaofrectangle>" + "<sideA>" + sideA + "</sideA>"+ "<sideB>" + sideB + "</sideB>" + "<area>" + result + "</area>" + "</areaofrectangle>";
	  }
 
	  @Path("/{l}/{b}")
	  @GET
	  @Produces("application/xml")
	  public String rectangleareainput(@PathParam("l") Double l, @PathParam("b") Double b){
		Double area;
		Double sideA =l;
		Double sideB =b;
		area =  (sideA * sideB); 
		String result = "@Produces(\"application/xml\") \n Area of Rectangle: " + area;
		return "<areaofrectangle>" + "<sideA>" + sideA + "</sideA>"+ "<sideB>" + sideB + "</sideB>" + "<area>" + result + "</area>" + "</areaofrectangle>";	  		
	  }
}