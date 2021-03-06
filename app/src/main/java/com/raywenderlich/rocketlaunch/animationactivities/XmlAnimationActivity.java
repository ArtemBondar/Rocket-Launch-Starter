package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;

import com.raywenderlich.rocketlaunch.R;

public class XmlAnimationActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {
    AnimatorSet rocketAnimatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink);
    rocketAnimatorSet.setTarget(mRocket);
    AnimatorSet dogeAnimatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink);
    dogeAnimatorSet.setTarget(mDoge);

    AnimatorSet bothAnimatorSet = new AnimatorSet();
    bothAnimatorSet.playTogether(rocketAnimatorSet, dogeAnimatorSet);
    bothAnimatorSet.setDuration(DEFAULT_ANIMATION_DURATION);
    bothAnimatorSet.start();
  }
}
