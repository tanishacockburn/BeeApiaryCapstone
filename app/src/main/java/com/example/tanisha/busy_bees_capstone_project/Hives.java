package com.example.tanisha.busy_bees_capstone_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hives extends AppCompatActivity {
    Button btn_add_hive ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hives);
        AddHivesPage();

    }
    public  void AddHivesPage()
    {
        btn_add_hive=(Button)findViewById(R.id.btnAddHive);
        btn_add_hive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addHive = new Intent(Hives.this, AddHive.class);
                startActivity(addHive);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.activityHome:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                Intent homePage = new Intent(Hives.this, MainActivity.class);
                startActivity(homePage);

                break;
            case R.id.activity_hives:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                Intent hivesPage = new Intent(Hives.this, Hives.class);
                startActivity(hivesPage);

                break;
            case R.id.activity_records:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                Intent recordPage = new Intent(Hives.this, Records.class);
                startActivity(recordPage);

                break;
            case R.id.activity_new_record:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                Intent newRecordPage = new Intent(Hives.this, NewRecord.class);
                startActivity(newRecordPage);

                break;




        }



        return super.onOptionsItemSelected(item);
    }
}
