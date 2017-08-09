package vn.enclave.gesturelistener.Level0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

import vn.enclave.gesturelistener.R;

public class Level0 extends AppCompatActivity implements GestureDetector.OnGestureListener{

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
         * [NEXT 2]
         * IMPLEMENTS GestureDetector.OnGestureListener to MyActivity
         */

        /**
         * [NEXT 3]
         * IMPLEMENTS Interface and execute
         * public GestureDetector(Context context, GestureDetector.OnGestureListener listener) {
         *      throw new RuntimeException("Stub!");
         * }
         */
        gestureDetector = new GestureDetector(Level0.this, this);

        /**
         * [NEXT 4] Which constructor do you use?
         * public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
         *  throw new RuntimeException("Stub!");
         * }
         */

        /**
         * [NEXT 4] NO RUNNING
         */

    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        gesture.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        gesture.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        gesture.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        gesture.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        gesture.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        gesture.setText("onFling");
        return true;
    }
}
