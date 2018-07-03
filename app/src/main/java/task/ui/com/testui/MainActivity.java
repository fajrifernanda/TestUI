package task.ui.com.testui;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import task.ui.com.testui.adapter.NewsAdapter;
import task.ui.com.testui.model.News;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<News> newsList;
    RecyclerView recyclerView;
    NewsAdapter adapter;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsList = new ArrayList<>();
        fab = findViewById(R.id.fab);
        newsList.add(new News("imageone","There are a million reasons to use Live UI kit and build an awesome app with.","MARINE LE GRAND","authorone",45,5));
        newsList.add(new News("imageone","There are a million reasons to use Live UI kit and build an awesome app with.","MARINE LE GRAND","authorone",45,5));
        newsList.add(new News("imageone","There are a million reasons to use Live UI kit and build an awesome app with.","MARINE LE GRAND","authorone",45,5));
        newsList.add(new News("imageone","There are a million reasons to use Live UI kit and build an awesome app with.","MARINE LE GRAND","authorone",45,5));
        newsList.add(new News("imageone","There are a million reasons to use Live UI kit and build an awesome app with.","MARINE LE GRAND","authorone",45,5));
//
        recyclerView = this.findViewById(R.id.rv_news);
        adapter = new NewsAdapter(newsList,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                newsList.add(new News("imageone", "There are a million reasons to use Live UI kit and build an awesome app with.", "MARINE LE GRAND", "authorone", 45, 5));
                adapter.notifyDataSetChanged();
                Toast.makeText(this, "New data added", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
