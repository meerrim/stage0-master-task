package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int x = number / 100;
        int y = (number / 10) % 10;
        int z = number % 10;
        int result = z * 100 + y * 10 + x;
        System.out.println(result);
    }

}
