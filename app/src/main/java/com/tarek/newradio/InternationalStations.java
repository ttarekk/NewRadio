package com.tarek.newradio;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class InternationalStations extends AppCompatActivity {
    Button back;
    ListView channels;
    CustomAdabter customAdabter;
   // ImageView imageView;
    TextView Channel_Name;
    TextView Channel_Genere;
    TextView Channel_Country;

   // int[]    IMAGES={R.drawable.recordicon,R.drawable.recordicon,R.drawable.recordicon,R.drawable.recordicon,R.drawable.recordicon,R.drawable.recordicon,R.drawable.recordicon,R.drawable.recordicon };
    String[] ChannelsName={"Classic Rock Hits","Absolute Classic Rock","Jazz 88.3 FM","Jazz FM102.2","Powe-AddictedtoRadio","R101 Diretta","WNYC 820 AM","Radio Radio"};
    String[] ChannelsGener={"Classic Rock","Classic Rock","Jazz","Jazz","Pop","Pop","News","Jazz"};
    String[] ChannelsCountry={"Chicago","London","New York","London","Chicago","Milano","New york","Barcelona"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international_stations);

        // back button
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(InternationalStations.this,MainActivity.class);
                startActivity(i);
            }
        });

        //creating list view
         channels=(ListView)findViewById(R.id.ListView);

         customAdabter = new CustomAdabter(this , ChannelsName , ChannelsGener , ChannelsCountry);
        channels.setAdapter(customAdabter);



    }

    // Adabter Class
    class CustomAdabter extends BaseAdapter{

        String[] ChannelsN;
        String[] ChannelsG;
        String[] ChannelsC;
        Context c;
        public CustomAdabter(Context c , String[] N , String[] G , String[] C) {
            this.ChannelsN=N;
            this.ChannelsG=G;
            this.ChannelsC=C;
            this.c=c;
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int t, View view, ViewGroup viewGroup) {
            LayoutInflater myInflater = getLayoutInflater();
             view = myInflater.inflate(R.layout.interstations,null);

           //  imageView =(ImageView)findViewById(R.id.record_image);
             Channel_Name=(TextView)findViewById(R.id.textView_Name);
             Channel_Genere=(TextView)findViewById(R.id.textView_Genere);
             Channel_Country=(TextView)findViewById(R.id.textView_Country);

         //   imageView.setImageResource(IMAGES[t]);
            Channel_Name.setText(ChannelsN[t]);
            Channel_Genere.setText(ChannelsG[t]);
            Channel_Country.setText(ChannelsC[t]);


            return view;
        }
    }

    }


