package com.polarnick.javahomework.task8;

/**
 * @author Polyarnyi Nikolay
 */
public class Utils {

    public static final int COMMAND_NEW_MESSAGE = 0;
    public static final int COMMAND_GOT_RESULT = 1;
    public static final int COMMAND_RESULT = 2;
    public static final int TIMEOUT = 15_000;
    public static final int MAX_BUFFER_SIZE = 1024;

    private Utils() {
    }

    public static long getPassedTimeFrom(long start) {
        return System.currentTimeMillis() - start;
    }

}
