package com.radabaugh.tyler.geoquiz;

/**
 * Created by Tyler Radabaugh on 9/26/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
