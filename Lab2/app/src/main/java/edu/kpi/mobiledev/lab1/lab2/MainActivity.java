package edu.kpi.mobiledev.lab1.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements InputFragment.OnFragmentInteractionListener {

    OutputFragment outputFragment;
    InputFragment inputFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputFragment = (OutputFragment) getSupportFragmentManager().findFragmentById(R.id.output_fragment);
        inputFragment = (InputFragment) getSupportFragmentManager().findFragmentById(R.id.input_fragment);
    }

    @Override
    public void OnClickButtonOK(String message) {
        outputFragment.showResult(message);
    }

}
