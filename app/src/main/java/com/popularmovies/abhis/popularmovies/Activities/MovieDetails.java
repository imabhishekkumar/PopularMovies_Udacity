package com.popularmovies.abhis.popularmovies.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.popularmovies.abhis.popularmovies.R;
import com.squareup.picasso.Picasso;


public class MovieDetails extends AppCompatActivity {
    private TextView movieTitleTV, movieDetailsTV, movieVoteTV, movieReleasedTV;
    private ImageView moviePosterIV,bannerIV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        movieTitleTV= findViewById(R.id.movieTitleID);
        movieDetailsTV= findViewById(R.id.movieDetialsID);
        movieVoteTV= findViewById(R.id.movieVoteID);
        movieReleasedTV= findViewById(R.id.movieReleasedID);
        moviePosterIV= findViewById(R.id.moviePosterID);
        bannerIV= findViewById(R.id.banner);
        Intent intent=getIntent();

        movieReleasedTV.setText(intent.getStringExtra("movie_release"));
        movieTitleTV.setText(intent.getStringExtra("movie_name"));
        movieDetailsTV.setText(intent.getStringExtra("movie_description"));
        movieVoteTV.setText(intent.getStringExtra("movie_ratings"));
        Picasso.get()
                .load(intent.getStringExtra("movie_poster"))
                .placeholder(R.drawable.loading)
                .into(moviePosterIV);
        Picasso.get()
                .load(intent.getStringExtra("movie_poster"))
                .placeholder(R.drawable.loading)
                .into(bannerIV);






    }


    }
