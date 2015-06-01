package com.bojie.sunshine_advanced_android;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

/**
 * Created by bojiejiang on 5/30/15.
 */
public class LocationEditTextPreference extends EditTextPreference {

    private int mMinLength;
    private static final int DEFAULT_MINIMUM_LOCATION_LENGTH = 2;

    public LocationEditTextPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs, R.styleable.LocationEditTextPreference, 0, 0);

        try {
            mMinLength = typedArray.getInteger(R.styleable.LocationEditTextPreference_minLength,
                    DEFAULT_MINIMUM_LOCATION_LENGTH);
        } finally {
            typedArray.recycle();
        }
    }
}
