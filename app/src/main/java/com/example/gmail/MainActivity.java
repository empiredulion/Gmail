package com.example.gmail;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    List<MailModel> singeMails;
    ListView listView = findViewById(R.id.list_view);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singeMails = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            singeMails.add(new MailModel("Peter" + i, "Hello", "How are you", "10:10"));
        }
        InboxAdapter adapter = new InboxAdapter(singeMails, this);
        listView.setAdapter(adapter);
    }
}