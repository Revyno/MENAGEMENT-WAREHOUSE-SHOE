package Util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Money {public static String formatRupiah(int uang){
    DecimalFormat formater = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols symbol = formater.getDecimalFormatSymbols();

    symbol.setCurrencySymbol("Rp. ");
    symbol.setMonetaryDecimalSeparator(',');
    symbol.setGroupingSeparator('.');
    formater.setDecimalFormatSymbols(symbol);
    return formater.format(uang);
    }
}
