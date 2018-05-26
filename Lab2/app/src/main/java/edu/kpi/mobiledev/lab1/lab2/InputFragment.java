package edu.kpi.mobiledev.lab1.lab2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class InputFragment extends Fragment {

    Button okButton;
    RadioGroup radiogroup,radiogroup1;
    public String message = "";
    public String message1="Піца: Не обрано \n";
    public String message2="Розмір: Не обрано \n";

    private OnFragmentInteractionListener mListener;

    public InputFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_input, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        okButton = view.findViewById(R.id.buttonOk);
        radiogroup = view.findViewById(R.id.radioGroup);
        radiogroup1 = view.findViewById(R.id.radioGroup1);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
        @Override
        public void onCheckedChanged (RadioGroup group,int checkedId){

        switch (checkedId) {
            case -1:
                message1 = "Не обрано \n";
                break;
            case R.id.radioButtonMargo:
                message1 = "Піца Маргарита\n";
                break;
            case R.id.radioButtonFour:
                message1 = "Піца Чотири Сира\n";
                break;
            case R.id.radioButtonHav:
                message1 = "Піца Гавайська \n";
                break;
            default:
                break;
        }
    }
    });
    RadioGroup radioGroup1 = (RadioGroup) view.findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                switch (checkedId) {
                    case -1:
                        message2 = "Не обрано \n";
                        break;
                        case R.id.radioButtonM:
                            message2 = "Розмір: М( 30 см)\n";
                            break;
                            case R.id.radioButtonL:
                                message2 = "Розмір: L( 40 см)\n";
                                break;
                                case R.id.radioButtonXL:
                                    message2 = "Розмір: XL( 50 см)\n";
                                    break;
                                    default:
                                        break;
                                        }
                                        message+=message1;
                                        message+=message2;
                                        EditText editText = (EditText) view.findViewById(R.id.EditText);
                                        message+="Адреса: "+ editText.getText() + "\n";
                                        message+="\n";
                                        }
        });
        okButton.setOnClickListener(v -> mListener.OnClickButtonOK(message));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnFragmentInteractionListener {

        void OnClickButtonOK(String message);
    }
}