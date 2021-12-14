package itts.volta.quintocinf.movieactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lvFilm;
    String Film[]= {"Spiderman","Titanic","Batman","Superman" };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFilm = (ListView)findViewById(R.id.lvFilm);
        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Film);
        lvFilm.setAdapter(aaFilm);

        lvFilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String titolo= (String) lvFilm.getItemAtPosition(i);
                Log.d("errori nostri", "posizione: "+i);
                Toast.makeText(getApplicationContext(),titolo,Toast.LENGTH_LONG).show();
            }
        });
    }
}

       /* Button btnEsci = (Button)findViewById(R.id.btnEsci);
        btnEsci.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"Vuoi uscire", Toast.LENGTH_LONG).show();
            }
        });
    }
}*/