package vn.enclave.gesturelistener.Level2;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.widget.TextView;

import vn.enclave.gesturelistener.R;

public class Level2 extends Activity{

    /** [NEXT 1] */
    GestureDetector gestureDetector;
    TextView gesture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gesture_listener);

        /**
         * START RESEARCHING
         */
        gesture = (TextView)this.findViewById(R.id.gesture);

        /**
         * [NEXT 0] Readme: https://medium.com/@harivigneshjayapalan/android-recyclerview-implementing-single-item-click-and-long-press-part-ii-b43ef8cb6ad8
         */
    }
}
