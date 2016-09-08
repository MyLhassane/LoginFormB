package hassan_mastinoz.loginformb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

import hassan_mastinoz.loginformb.R;

/**
 * Created by hassan on 9/7/16.
 */
public class CustomeButton extends Button {

    public CustomeButton(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(attrs);
    }

    public CustomeButton(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(attrs);

    }

    public CustomeButton(Context context)
    {
        super(context);
        init(null);

    }

    private void init(AttributeSet attrs)
    {
        if (attrs!=null)
        {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomeFont);

            String fontName = "";

            if (Locale.getDefault().getDisplayLanguage().toString().equals("English"))
            {
                fontName = a.getString(R.styleable.CustomeFont_armalite_rifle);
            }

            if (Locale.getDefault().getDisplayLanguage().toString().equals("Arabic"))
            {
                fontName = a.getString(R.styleable.CustomeFont_AraJozoor_Regular);
            }
            else
            {
                fontName = a.getString(R.styleable.CustomeFont_AraJozoor_Regular);
            }
            if (fontName!=null)
            {
                Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" +fontName);
                setTypeface(myTypeface);
            }
            a.recycle();
        }

    }

}
