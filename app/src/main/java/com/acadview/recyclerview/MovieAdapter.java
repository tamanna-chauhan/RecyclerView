package com.acadview.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{

    private List<Movie> MoviesList;

    public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView title, year, genre;
            ImageView images;

        public ViewHolder(View view) {
            super(view);
                title = (TextView) view.findViewById(R.id.Title);
                genre = (TextView) view.findViewById(R.id.genre);
                year = (TextView) view.findViewById(R.id.year);
                images = (ImageView) view.findViewById(R.id.image);
            }
        }

        public MovieAdapter(List<Movie> MoviesList) {
            this.MoviesList = MoviesList;
        }


    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View View = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new ViewHolder(View);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Movie movie = MoviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        holder.images.setImageResource(movie.getImage());

    }

    @Override
    public int getItemCount() {
        return MoviesList.size();
    }


}
