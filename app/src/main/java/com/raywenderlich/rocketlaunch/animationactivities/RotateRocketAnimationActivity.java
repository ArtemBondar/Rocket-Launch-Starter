package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

public class RotateRocketAnimationActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, 360);
    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
      @Override
      public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float value = (float) valueAnimator.getAnimatedValue();
        mRocket.setRotation(value);
      }
    });
    valueAnimator.setInterpolator(new LinearInterpolator());
    valueAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
    valueAnimator.start();
  }
}
