package com.android.insecurebankv2;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;
import es.dmoral.toasty.Toasty; 

public class Toasteroid {
    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    public static class STYLES {
        public static final int SUCCESS = 1;
        public static final int ERROR = 2;
    }

    public static class POSITION {
        public static final int BOTTOM = Gravity.BOTTOM;
        public static final int TOP = Gravity.TOP;
    }

    public static void show(Context context, String message, int style, int duration, int position) {
        switch (style) {
            case STYLES.SUCCESS:
                Toasty.success(context, message, duration, true).show();
                break;
            case STYLES.ERROR:
                Toasty.error(context, message, duration, true).show();
                break;
            default:
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(position | Gravity.CENTER_HORIZONTAL, 0, 100);
                toast.show();
        }
    }
}