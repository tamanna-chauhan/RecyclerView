package com.acadview.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> moviesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new MovieAdapter(moviesList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }


    private void prepareMovieData() {
        Movie movie = new Movie("Newton", "Drama", "2017");
        movie.setImage(R.drawable.newton);
        moviesList.add(movie);

        movie = new Movie("Dangal", "Drama", "2016");
        movie.setImage(R.drawable.dangal);
        moviesList.add(movie);

        movie = new Movie("Pk", "Romance", "2014");
        movie.setImage(R.drawable.pk);
        moviesList.add(movie);

        movie = new Movie("Ugly", "Thriller", "2014");
        movie.setImage(R.drawable.ugly);
        moviesList.add(movie);

        movie = new Movie("Zindgi Na Milegi Dubara", "Drama", "2011");
        movie.setImage(R.drawable.zindgi);
        moviesList.add(movie);

        movie = new Movie("No Smoking", "Mystery", "2007");
        movie.setImage(R.drawable.smoking);
        moviesList.add(movie);

        movie = new Movie("Hera Pheri", "Comedy", "2000");
        movie.setImage(R.drawable.hera);
        moviesList.add(movie);


        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        movie.setImage(R.drawable.ron);
        moviesList.add(movie);


        mAdapter.notifyDataSetChanged();
    }
}
