package hassan_mastinoz.loginformb;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.TintTypedArray;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsernameET;
    private EditText mPasswordET;

    private Button mSigninBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsernameET = (EditText)findViewById(R.id.usernameET);
        mUsernameET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
            {
                if (actionId == EditorInfo.IME_ACTION_NEXT || actionId == EditorInfo.IME_ACTION_DONE)
                {
                    mPasswordET.requestFocus();
                    return true;
                }
                return false;
            }
        });

        mPasswordET = (EditText)findViewById(R.id.passwordET);
        mPasswordET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
            {
                if (actionId == EditorInfo.IME_ACTION_NEXT || actionId == EditorInfo.IME_ACTION_DONE)
                {
                    attempLogin();
                }
                return false;
            }
        });

        mSigninBtn = (Button) findViewById(R.id.signingBtn);

        mSigninBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                attempLogin();
            }
        });

    }

    private void attempLogin()
    {
        String Username = mUsernameET.getText().toString();
        String Password = mPasswordET.getText().toString();

        if (TextUtils.isEmpty(Username))
        {
            mUsernameET.setError(getString(R.string.error_empty_field));
            return;
        }
        else if (TextUtils.isEmpty(Password))
        {
            mPasswordET.setError(getString(R.string.error_empty_field));
            return;
        }
        if (Username.equals("bassam") && Password.equals("123"))
        {
            Intent mIntent = new Intent(LoginActivity.this, MyActivity.class);
            startActivity(mIntent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), getString(R.string.error_invalid_dada), Toast.LENGTH_LONG).show();
        }
    }

}
