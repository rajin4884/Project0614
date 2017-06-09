package com.example.jhj.project0614;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button mBtn2 = (Button ) findViewById(R.id.button2);

        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( SubActivity.this , MainActivity.class   );
                startActivity( intent);


            }
        });

        Button mBtn3 = (Button)findViewById(R.id.button3);
        mBtn3.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent ( SubActivity.this , SubActivity2.class   );
                startActivity( intent);
                return false;
            }
        });

    }


}


