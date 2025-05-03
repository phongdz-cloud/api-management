package com.example.common.util;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
    public static boolean isNullOrEmpty(String str) {
        return StringUtils.isEmpty(str);
    }

    public static boolean isNullOrBlank(String str) {
        return StringUtils.isBlank(str);
    }

    public static String trimToNull(String str) {
        return StringUtils.trimToNull(str);
    }

    public static String capitalize(String str) {
        return StringUtils.capitalize(str);
    }
} 