package edu.step.comparator;

public class NumbersComparator
{
    public static int min(int a, int b, int c, int d)
    {
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static int max(int a, int b, int c, int d)
    {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }
}
