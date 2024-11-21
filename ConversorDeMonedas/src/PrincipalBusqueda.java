
// Importa las librerías necesarias para hacer la conexión a la API
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalBusqueda {
    public Moneda buscaMoneda(String monedaBase, String monedaTarget) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/598939259efaebc89e0584e7/pair/"+monedaBase+"/"+monedaTarget);
        // Crea un objeto HttpClient para hacer la conexión a la API
        HttpClient client = HttpClient.newHttpClient();
        // Crea una solicitud HTTP con la información que necesitas
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion) // Reemplaza USD con la moneda de origen
                .build();
        // Envía la solicitud a la API y recibe la respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Imprime la respuesta de la API en la consola
        return new Gson().fromJson(response.body(), Moneda.class);
    }
}
