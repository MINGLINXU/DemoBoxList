package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColor;
    ArrayList<Color>alColor;
    CustomerAdapter caColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor = findViewById(R.id.ListViewApp);
        alColor = new ArrayList<>();
        Color item1 = new Color("blue_box");
        alColor.add(item1);
        Color item2 = new Color("orange_box");
        alColor.add(item2);
        Color item3 = new Color("brown_box");
        alColor.add(item3);


        caColor = new CustomerAdapter(this,R.layout.row,alColor);
        lvColor.setAdapter(caColor);

    }
}
