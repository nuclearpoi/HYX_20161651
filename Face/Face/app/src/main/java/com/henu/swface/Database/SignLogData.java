package com.henu.swface.Database;

import android.provider.BaseColumns;

/**
 */

public final class SignLogData{
    public SignLogData() {
    }

    public static abstract class SignLogTable implements BaseColumns{
        public static final String TABLE_NAME = "SignLog";
        public static final String USER_NAME = "user_name";
        public static final String CONFIDENCE = "confidence";
        public static final String TIME = "time";
    }
}
