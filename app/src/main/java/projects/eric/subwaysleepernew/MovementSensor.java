package projects.eric.subwaysleepernew;

import android.hardware.SensorEvent;

/**
 * Created by Eric on 4/15/2015.
 */
public class MovementSensor {
    static float getAccelerometer(SensorEvent event) {
        float[] values = event.values;
        float[]vector2 = {1, 1, 1};
        return getScalar(values);
    }

    static float getScalar(float[]v) {
        float x = v[0];
        float y = v[1];
        float z = v[2];
        float pyth = x * x + y * y + z * z;
        return (float) Math.sqrt((double) pyth);

    }

}
