package com.example.danny.experience;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.Spinner;

public class Reservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        configureMakeSpinner();
        configureModelSpinner();
        configureNextActivity();
    }


    private void configureMakeSpinner() {
        Spinner makeSpinner = (Spinner) findViewById(R.id.dropSpinner);
// Create an ArrayAdapter using the string array and a default makeSpinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.make, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the makeSpinner
        makeSpinner.setAdapter(adapter);
    }

    private void configureModelSpinner() {
        Spinner modelSpinner = (Spinner) findViewById(R.id.pickSpinner);
// Create an ArrayAdapter using the string array and a default modelSpinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.model, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the modelSpinner
        modelSpinner.setAdapter(adapter);
    }

    private void configureNextActivity() {
        ImageButton next = (ImageButton) findViewById(R.id.nextButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Reservation.this, reservationDateActivity.class));
            }
        });
    }
}
