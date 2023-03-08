package com.epam;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    boolean isPositiveNumber(String str){
        if(str == null){
            return false;
        }
        double d = NumberUtils.toDouble(str);
        return d > 0 && NumberUtils.isCreatable(str);
    }
}