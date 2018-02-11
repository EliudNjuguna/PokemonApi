package rhynix.eliud.pokemonapi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

import rhynix.eliud.pokemonapi.models.Pokemon;

/**
 * Created by eliud on 1/18/18.
 */

public class ListPokemonAdapter extends RecyclerView.Adapter<ListPokemonAdapter.ViewHolder> {



    private ArrayList<Pokemon> dataset;
    private Context context;

    public ListPokemonAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ListPokemonAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListPokemonAdapter.ViewHolder holder, int position) {
        Pokemon p = dataset.get(position);
        holder.numberTextView.setText(p.getName());


        Glide.with(context)
                .load("https://pokeapi.co/media/sprites/pokemon/" + p.getNumber() + ".png")
                .centerCrop()
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.photoImageView);

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void addicianalListPokemon(ArrayList<Pokemon> listPokemon) {
        dataset.addAll(listPokemon);
        notifyDataSetChanged();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{

        private ImageView photoImageView;
        private TextView numberTextView;


        public ViewHolder(View itemView) {
            super(itemView);

            photoImageView = (ImageView)itemView.findViewById(R.id.photoImageView);
            numberTextView = (TextView)itemView.findViewById(R.id.numberTextView);
        }
    }
}
