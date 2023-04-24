package edu.step.comparator;

import java.util.Scanner;

public class ComparatorExecutor
{
    public static void execute()
    {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter a: ");
        a = in.nextInt();
        System.out.println("Enter b: ");
        b = in.nextInt();
        System.out.println("Enter c: ");
        c = in.nextInt();
        System.out.println("Enter d: ");
        d = in.nextInt();

        System.out.println("Min: " + NumbersComparator.min(a,b,c,d));
        System.out.println("Max: " + NumbersComparator.max(a,b,c,d));
    }
}
