/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import javax.ws.rs.core.MediaType; 
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;
/**
 *
 * @author Marcelo
 */
public class JavaApplication7 {

//   public static String SERVER_ROOT_URI = "http://localhost:7687/db/data/";

//  public static void main(String[] args) {
//        Client client = Client.create();
//       client.addFilter(new LoggingFilter(System.out));
////        WebResource cypher = client.resource(SERVER_ROOT_URI + "cypher");
////        String request = "{\"query\":\"MATCH (n) RETURN n\"}";
////        ClientResponse cypherResponse = cypher.accept(MediaType.APPLICATION_JSON).post(ClientResponse.class, request);
////        //cypherResponse..close();
////        System.out.println(cypherResponse);
//
////String url="http://localhost:7474/db/data";
////RestApi rest = new RestApiFacade(url,"neo4j","123456");
////
////QueryExecutor executor = new RestCypherQueryExecutor(rest);
////executor.query("start n=node:node_auto_index(title={title}) return n",map("title","Forrest Gump"));
////
////GraphDatabaseService rdb = new RestGraphDatabase(rest);
////RestNode node = rdb.findNodeById(100);
//    }
   
   public static final String ENDPOINT = "http://localhost:7474/db/data";

            public static final String USERNAME = "neo4j";

            public static final String PASSWORD = "123456";

        private String callRest(String query) {
                final String cypherUrl = ENDPOINT + "/cypher";
                Client c = Client.create();
                c.addFilter(new HTTPBasicAuthFilter(USERNAME, PASSWORD));
                WebResource resource = c.resource(cypherUrl);
                String request = "{\"query\":\"" + query + "\"}";
                ClientResponse response = resource.accept(MediaType.APPLICATION_JSON)
                        .type(MediaType.APPLICATION_JSON).entity(request)
                        .post(ClientResponse.class);
                String object = response.getEntity(String.class);
//                response.close();
                return object;
        }
    
}
