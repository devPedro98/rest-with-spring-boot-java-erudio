package br.com.erudio.demo.operations.math;

import static br.com.erudio.demo.operations.math.IsNumeric.isNumeric;

public class ConvertToDouble {

    public static Double convertToDouble(String strNumber){
        if(strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");
        if(isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }
}
