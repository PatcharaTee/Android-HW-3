package com.example.quizgame;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManger;
    MyAdapter adapter;
    DriverList[] driverLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        driverLists = getDriverLists();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManger = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManger);

        adapter = new MyAdapter(driverLists);
        recyclerView.setAdapter(adapter);
    }

    public DriverList[] getDriverLists() {
        return new DriverList[]{
                new DriverList(R.drawable.alfaro_1, "Kimi Räikkönen", "Alfa Romeo"),
                new DriverList(R.drawable.alfaro_2, "Antonio Giovinazzi", "Alfa Romeo"),
                new DriverList(R.drawable.apla_1, "Pierre Gasly", "AlphaTauri"),
                new DriverList(R.drawable.apla_2, "Daniil Kvyat", "AlphaTauri"),
                new DriverList(R.drawable.bull_1, "Max Verstappen", "Red Bull Racing"),
                new DriverList(R.drawable.bull_2, "Alexander Albon", "Red Bull Racing"),
                new DriverList(R.drawable.ferra_1, "Charles Leclerc", "Ferrari"),
                new DriverList(R.drawable.ferra_2, "Sebastian Vettel", "Ferrari"),
                new DriverList(R.drawable.haas_1, "Kevin Magnussen", "Haas"),
                new DriverList(R.drawable.haas_2, "Romain Grosjean", "Haas"),
                new DriverList(R.drawable.mclar_1, "Lando Norris", "McLaren"),
                new DriverList(R.drawable.mclar_2, "Carlos Sainz", "McLaren"),
                new DriverList(R.drawable.merc_1, "Lewis Hamilton", "Mercedes"),
                new DriverList(R.drawable.merc_2, "Valtteri Bottas", "Mercedes"),
                new DriverList(R.drawable.renal_1, "Daniel Ricciardo", "Renault"),
                new DriverList(R.drawable.renal_2, "Esteban Ocon", "Renault"),
                new DriverList(R.drawable.rp_1, "Lance Stroll", "Racing Point"),
                new DriverList(R.drawable.rp_2, "Sergio Perez", "Racing Point"),
                new DriverList(R.drawable.william_1, "George Russell", "Williams"),
                new DriverList(R.drawable.william_2, "Nicholas Latifi", "Williams")
        };
    }
}

class DriverList {

    private int imgId;
    private String driverName;
    private String team;

    public DriverList(int imgId, String driverName, String team) {
        this.imgId = imgId;
        this.driverName = driverName;
        this.team = team;
    }

    public int getImgId() {
        return imgId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getTeam() {
        return team;
    }
}