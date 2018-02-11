package rhynix.eliud.pokemonapi.models;

import java.util.ArrayList;

/**
 * Created by eliud on 1/18/18.
 */

public class PokemonResponse {

    private ArrayList<Pokemon> results;

    public ArrayList<Pokemon> getResults(){
        return results;
    }

    public void setResults(ArrayList<Pokemon> results){
        this.results = results;
    }
}
