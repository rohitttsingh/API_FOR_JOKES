package com.example.nasa_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);


        RetrofitInstance.getApiInerface().getposts().enqueue(new Callback<List<NASA_api>>() {

            @Override
            public void onResponse(Call<List<NASA_api>> call, Response<List<NASA_api>> response) {
                if (response.body().size()>0)
                {

                    List<NASA_api> data = response.body();

                    for (int  i=0  ;i<data.size(); i++)
                        textView.append("Question: "+data.get(i).getQuestion() +"\n"+
                                "\n Punchline: "+ data.get(i).getPunchline());
                }
                else
                {
                    Toast.makeText(MainActivity.this,"NOt WORKING",Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onFailure(Call<List<NASA_api> >call, Throwable t) {
                textView.setText(""+ t.getLocalizedMessage());

            }
        });

    }
}