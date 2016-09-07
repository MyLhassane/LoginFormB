package hassan_mastinoz.loginformb;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.TintTypedArray;
import android.view.Gravity;
import android.widget.EditText;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = (EditText) findViewById(R.id.usernameET);

        EditText password = (EditText) findViewById(R.id.passwordET);

        String getCurrentLocale = Locale.getDefault().getDisplayLanguage();

        if(getCurrentLocale.equalsIgnoreCase("English")){          //LTR languages

            username.setGravity(Gravity.LEFT);

            username.setCompoundDrawablesWithIntrinsicBounds(R.drawable.user_ic, 0, 0, 0);

            password.setGravity(Gravity.LEFT);

            password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.password_ic, 0, 0, 0);

        }else{                                                     //RTL languages

            username.setGravity(Gravity.RIGHT);

            username.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.user_ic, 0);

            password.setGravity(Gravity.RIGHT);

            password.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.password_ic, 0);

        }

        username.setCompoundDrawablePadding(20);
        password.setCompoundDrawablePadding(20);


    }


}
