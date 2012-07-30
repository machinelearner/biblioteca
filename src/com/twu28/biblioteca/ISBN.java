package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: pramod
 * Date: 30/7/12
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ISBN {
    String value;

    public ISBN(String value) {
        this.value = value;
    }

    public boolean isValid() {
        char value[] = this.value.toCharArray();
        int i,sum =0,checkSum=0;
        for (i = 0; i < 9; i++)
            if ((value[i]<'0') || (value[i]>'9')) return false;

        // The last symbol is a digit or an 'X'
        if ((value[9]!='X') && ((value[9]<'0') || (value[9]>'9'))) return false;

        // The checksum is computed by adding, at each step, the running total (a) to the checksum (b)
        for (i = 0; i < 10; i++) {
            if ( value[i] == 'X' )
                sum+=10;
            else
                sum += value[9-i]-'0';
            checkSum += sum;
        }
        return checkSum % 11 == 0;
    }

    @Override
    public String toString() {
        return value;
    }
}
