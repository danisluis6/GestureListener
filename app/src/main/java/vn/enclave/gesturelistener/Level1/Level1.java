package vn.enclave.gesturelistener.Level1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

import vn.enclave.gesturelistener.R;

public class Level1 extends Activity{

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
         * [NEXT 1]
         * Create a new class with CustomGestureListencer and implement two inferfaces
         */

        /**
         * [NEXT 2]
         * Execute
         */
        CustomGestureListener custom = new CustomGestureListener();
        gestureDetector = new GestureDetector(this, custom);
        gestureDetector.setOnDoubleTapListener(custom);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class CustomGestureListener implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

        @Override
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            gesture.setText("onSingleTapConfirmed");
            return true;
        }

        @Override
        public boolean onDoubleTap(MotionEvent motionEvent) {
            gesture.setText("onDoubleTap");
            return true;
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            gesture.setText("onDoubleTapEvent");
            return true;
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
            gesture.setText("onSingleTapUp");
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
}
