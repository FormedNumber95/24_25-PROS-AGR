//Problem solving
//I get an URISyntaxException. Change the uri to http://www.vitoria-gasteiz.com
package ejerciciosClase;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * The Class Actividad5.
 */
public class Actividad5 {

	/**
	 * Method that runs the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Conexión con www.vitoria-gasteiz.com");
		System.out.println("==========================");
		try {
			HttpClient client= HttpClient.newHttpClient();
			HttpRequest request=HttpRequest.newBuilder(new URI("http://www.vitoria-gasteiz.com")).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			VisualizarConexión(response);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method that shows the information.
	 *
	 * @param response the response
	 */
	private static void VisualizarConexión(HttpResponse<String> response) {
		System.out.println("\tMétodo toString():"+response);
		System.out.println("\tMétodo getStatusCode():"+response.statusCode());
		System.out.println("\tMétodo getContentType():"+response.headers().firstValue("Content-Type").orElse("N/A"));
	}

}
