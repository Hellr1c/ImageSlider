package alvaro.mt.noname;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] ids = {
            R.drawable.pgr1,
            R.drawable.pgr2,
            R.drawable.pgr3,
            R.drawable.pgr4,
            R.drawable.pgr5,
            R.drawable.pgr6,
            R.drawable.pgr7,
            R.drawable.pgr8,
            R.drawable.pgr9,
            R.drawable.pgr10,
    };

    String[] chars = {
            "Alpha Crimson A",
            "Alpha Crimson W",
            "Ayla Kaleido",
            "Bianca Abystigma",
            "Karenina Scire",
            "Lucia Dawn",
            "Luna Laurel",
            "Qu Pavo",
            "Vera Rozen",
            "Vera Garnet",
    };

    int index = 0;
    Handler handler = new Handler(Looper.getMainLooper());
    ImageView img;
    TextView character;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img);
        character = findViewById(R.id.character);
        ImageSlider();
    }

    private void ImageSlider() {
        if(index < ids.length) {
            img.setImageResource(ids[index]);
            character.setText(chars[index]);
            index++;
        }
        else {
            finish();
            System.exit(0);
        }
        handler.postDelayed(this::ImageSlider,2000);
    }
}