package king.echomood.drug;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addingDrug extends Activity {
    Button insert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_drug);
        insert = (Button) findViewById(R.id.insertBtn);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
