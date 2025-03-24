package com.example.calculadoraapi.Utils;

public class NumberConverter {
    public static Double convert (String strNumber) {
        if(strNumber == null) return 0D;
        // BR 10, 25 US 10.25
        String number = strNumber.replace(",",".");
        if (isNumeric(number))
            return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;

        String number = strNumber.replace(",",".");

        return  number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
