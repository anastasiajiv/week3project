import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.io.IOException;

class Calling_Api {
    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.spoonacular.com/recipes/findByNutrients?apiKey=bc2478d0611242ecac099d1e39b017fb&minSugar=20&minSodium=50&number=1"))
                .header("x-api-host", "https://api.spoonacular.com")
                .header("x-api-key", " bc2478d0611242ecac099d1e39b017fb")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(response.body());
    }




}
