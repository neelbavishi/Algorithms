package com.interview.random;

public class IntToRoman {

	public String intToRoman(int no) {
        int numeric[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String roman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        
        int len = numeric.length;
        String rom = "";
        for (int i = 0; i < len; i++) 
        {
            if (no >= numeric[i])
	        {
                rom += roman[i];
                no -= numeric[i];
                i--;
	        }
        }
        return rom;
    }
}
