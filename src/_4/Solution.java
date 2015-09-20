package _4;

import java.util.*;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 ? 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Solution {
    public static void main(String[] args) {
        int polindrom = 0;

        for (int i = 999; i > 99; i--) {
            for (int k = 999; k > 99; k--) {
                int num = i * (k);
                if (isPolindrom(num) && num > polindrom) {
                    polindrom = num;
                }
            }
        }
        System.out.println(polindrom);
    }

    private static boolean isPolindrom(int i) {
        String num = String.valueOf(i);
        StringBuilder opositeNum = new StringBuilder();
        while (i > 0) {
            opositeNum.append(i % 10);
            i = i / 10;
        }
        if (num.equalsIgnoreCase(opositeNum.toString())) {
            return true;
        }
        return false;

    }
}

