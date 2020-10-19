package calcula;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("calcula/{opera}/{op1}/{op2}")
public class CalculaResource {

    public CalculaResource() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calcular(@PathParam("opera") String opera, @PathParam("op1") String op1, @PathParam("op2") String op2)  {
        int result;
        switch (opera) {
            case "soma":
                result = Integer.parseInt(op1)+Integer.parseInt(op2);
                break;
            case "subtrai":
                result = Integer.parseInt(op1)-Integer.parseInt(op2);
                break;
            case "mult":
                result = Integer.parseInt(op1)*Integer.parseInt(op2);
                break;
            default:
                return("Invalid operation");
        }
        return Integer.toString(result);
    }

    /**
     * PUT method for updating or creating an instance of CalculaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
