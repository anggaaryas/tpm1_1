package indonesia.angarsalabs.tpm11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUname , etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUname = (EditText) findViewById(R.id.etUname);
        etPass = (EditText) findViewById(R.id.etPass);
    }

    public void loginFunc(View view) {
        String uname, pass;
        uname = etUname.getText().toString();
        pass = etPass.getText().toString();
        String toast = "" + uname + pass;
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}
