package hassan_mastinoz.loginformb.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.Locale;

import hassan_mastinoz.loginformb.R;

/**
 * Created by hassan on 9/7/16.
 */
public class CustomeTextView extends TextView {

    public CustomeTextView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(attrs);
    }

    public CustomeTextView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(attrs);

    }

    public CustomeTextView(Context context)
    {
        super(context);
        init(null);

    }

    private void init(AttributeSet attrs)
    {
        if (attrs!=null)
        {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomeFont);
            String fontName = a.getString(R.styleable.CustomeFont_AraJozoor_Regular);
            if (Locale.getDefault().getDisplayLanguage().toString().equals("Arabic"))
            {


            }
            else
            {
                a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomeFont);
                fontName = a.getString(R.styleable.CustomeFont_armalite_rifle);
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
