package by.bsu.metelskaya.lab4;


import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

public class CustomDialogFragment extends DialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Окно")
                .setIcon(android.R.drawable.btn_star_big_off)
                .setMessage("Чтобы закрыть нажмите ОК")
                .setPositiveButton("OK", null)
                .create();
    }
}