package itts.volta.quintocinf.movieactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

public class PosterActiviy extends AppCompatActivity {
    ImageView imgVolto;
    ImageView imgSpider;
    ImageView imgSuper;
    ImageView imgTitanic;
    ImageView imgBatman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poster_activiy);

        imgVolto.setImageResource(R.drawable.volto);
        imgSpider.setImageResource(R.drawable.spiderman);
        imgSuper.setImageResource(R.drawable.superman);
        imgTitanic.setImageResource(R.drawable.titanic);
        imgBatman.setImageResource(R.drawable.batman);


        Intent secInt = getIntent();
        String titolo = secInt.getStringExtra("tit");

        if (titolo=="spiderman")
        {
            imgSpider.setImageResource(R.drawable.spiderman);
        }
        if (titolo=="superman")
        {
            imgSpider.setImageResource(R.drawable.superman);
        }if (titolo=="titanic")
        {
            imgSpider.setImageResource(R.drawable.titanic);
        }if (titolo=="batman")
        {
            imgSpider.setImageResource(R.drawable.batman);
        }

        Toast.makeText(getApplicationContext(),titolo,Toast.LENGTH_LONG).show();
    }
}