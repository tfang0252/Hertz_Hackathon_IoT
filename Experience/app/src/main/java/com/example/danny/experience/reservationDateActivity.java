package com.example.danny.experience;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class reservationDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_date);

        configurePickSpinner();
        configureDropSpinner();
    }

    private void configurePickSpinner() {
        Spinner pickSpinner = (Spinner) findViewById(R.id.pickSpinner);
// Create an ArrayAdapter using the string array and a default pickSpinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pick, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the pickSpinner
        pickSpinner.setAdapter(adapter);

}

    private void configureDropSpinner() {
        Spinner dropSpinner = (Spinner) findViewById(R.id.dropSpinner);
// Create an ArrayAdapter using the string array and a default dropSpinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.drop, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the dropSpinner
        dropSpinner.setAdapter(adapter);

    }
}
