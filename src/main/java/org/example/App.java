package org.example;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.Request;

import java.io.IOException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        // Make the HTTP request and retrieve the response
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://pokeapi.co/api/v2/pokemon/1")//bulbasaur
                .build();
        Response response = client.newCall(request).execute();

// Use Gson to parse the JSON data into a Pokemon object
        Gson gson = new Gson();
        Pokemon pokemon = gson.fromJson(response.body().string(), Pokemon.class);

// Now you can access the properties of the Pokemon object
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getBaseExperience());

    }
}
