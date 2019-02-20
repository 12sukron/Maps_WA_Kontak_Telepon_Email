package com.kamus.maps_wa_no_telepon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);

        ActionBar actionBar = getSupportActionBar();
        TextView mDetailTv = (TextView) findViewById(R.id.textView);
        TextView mDetailTv1 = (TextView) findViewById(R.id.textView1);

        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();

        String mContent = intent.getStringExtra("contentTv");
        String mContent1 = intent.getStringExtra("contentTv1");

        //set actionbar title
        //set text in textview
        mDetailTv.setText(mContent);
        mDetailTv1.setText(mContent1);

//        // open kontak di bawah
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:082330940164"));
                startActivity(intent);

            }
        });
        // open kontak di atas

        // go WatsApp di bawah
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent, chooser;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=62082330940164"));
                chooser = Intent.createChooser(intent, "Telephon");
                startActivity(chooser);
            }
        });
        // go WatsApp di atas

        // send email di bawah
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rtc822");
                String[] to={"sukronjazuli7@gmail.com"};
                emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
                startActivity(emailIntent);
                //send jamak dibawah
//              String[] to={"sukronjazuli7@gmail.com", "dolphindevlopers@gmail.com"};
//                ***send jamak atas****
//              intent.putExtra(Intent.EXTRA_SUBJECT, "hi. this was sent from my app");
//              intent.putExtra(Intent.EXTRA_TEXT, "hey whats up, how you doing? this is my first email message");

            }
        });
        // send email di atas

        // go maps di bawah
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent, chooser;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/maps/mGpeavBzAA32"));
                chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);
            }
        });
    }
}

// go maps di atas

//    public void button1(View view) {
//        Toast.makeText(Cari_kontak_1_Nindi.this, "Selalu dukung kami dan nantikan update terbaru aplikasi STIA malang", Toast.LENGTH_LONG).show();
//    }
//
//    public void button2(View view) {
//        Toast.makeText(Cari_kontak_1_Nindi.this, "Selalu dukung kami dan nantikan update terbaru aplikasi STIA malang", Toast.LENGTH_LONG).show();
//    }
//
//    public void button3(View view) {
//        Toast.makeText(Cari_kontak_1_Nindi.this, "Selalu dukung kami dan nantikan update terbaru aplikasi STIA malang", Toast.LENGTH_LONG).show();
//    }
//
//    public void button4(View view) {
//        Toast.makeText(Cari_kontak_1_Nindi.this, "Selalu dukung kami dan nantikan update terbaru aplikasi STIA malang", Toast.LENGTH_LONG).show();
//    }
//}


