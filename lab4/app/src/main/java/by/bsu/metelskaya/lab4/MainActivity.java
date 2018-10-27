package by.bsu.metelskaya.lab4;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = (TextView) findViewById(R.id.header);
        switch (id) {
            case R.id.open_fragment:
                NewFragment fragment = new NewFragment();
                FragmentManager fa = getSupportFragmentManager();
                fa.beginTransaction().replace(R.id.activity_main, fragment).addToBackStack(null).commit();
                return true;
            case R.id.open_toast:
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Привет",
                        Toast.LENGTH_SHORT);
                toast.show();
                return true;
            case R.id.open_dialogs:
                CustomDialogFragment dialog = new CustomDialogFragment();
                dialog.show(getSupportFragmentManager(), "custom");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void closeFragment(View view) {
        getSupportFragmentManager().popBackStack();
    }
}