package rhynix.eliud.pokemonapi.pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rhynix.eliud.pokemonapi.models.PokemonResponse;

/**
 * Created by eliud on 1/18/18.
 */

public interface PokeapiService {
    @GET("pokemon")
    Call<PokemonResponse> obtainListPokemon(@Query("limit") int limit, @Query("offset") int offset);
}
