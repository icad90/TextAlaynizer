package whaapps.belajarmembuatlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.textalay.AlayHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = "Reno pergi ke pasar katanya";
        String textAlay = AlayHelper.alaynize(text);

        TextView textView = findViewById(R.id.textView);
        textView.setText(textAlay);
    }
}
