package dieguez.multivistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).
                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this,Main2Activity.class));
                    }
                });

        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        Intent a= new Intent(this,Main2Activity.class);
        startActivity(a);
    }
}
