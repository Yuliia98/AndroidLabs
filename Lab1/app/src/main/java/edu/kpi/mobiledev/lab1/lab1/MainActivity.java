package edu.kpi.mobiledev.lab1.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public String message = "Пользователь выбрал \n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox language = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        boolean checked = language.isChecked();

        // Смотрим, какой именно из флажков отмечен
        switch (view.getId()) {
            case -1:
                message="Не выбрано \n";

                break;
            case R.id.havawi:
                if (checked)
                    message += "Пицца Гавайская \n";

                break;
            case R.id.margarita:
                if (checked)
                    message += "Пицца Маргарита \n";

                break;
            case R.id.fourcheese:
                if (checked)
                    message += "Пицца Четыре сыра \n";

                break;

            case R.id.sizeM:
                if (checked)
                    message += "Размер пиццы М \n";

                break;
            case R.id.sizeL:
                if (checked)
                    message += "Размер пиццы L \n";

                break;
            case R.id.sizeXL:
                if (checked)
                    message += "Размер пиццы XL \n";


                break;
            default:
                break;
        }

    }
    public void OnClickButtonOK(View view) {
        TextView result = (TextView)findViewById(R.id.selection);
        EditText editText = (EditText) findViewById(R.id.editText);
        result.setText(editText.getText()+ "\n" + message);

    }

}