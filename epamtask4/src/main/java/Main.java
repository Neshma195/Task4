package com.epamtask4;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("\n-----calculate simple interest and compound interest------");
        System.out.println("Enter values in Principle,Time and rate_of_interest:");
        double p=s.nextDouble();
        double t=s.nextDouble();
        double r=s.nextDouble();
        System.out.println("-----Enter construction details-----");
        System.out.println("Select\n0.if you want not Automated house\n1.if you want Automated house");
        int a=s.nextInt();
        int m;
        if(a==0)
        {
            System.out.println("Select type of material you want:\n1.standard\n2.above_standard\n3.high_standard");
            m = s.nextInt();
        }
        else
            m=0;
        System.out.println("Enter area:");
        double area=s.nextDouble();

        simple_compound_Interest sci= new simple_compound_Interest();
        double SI=sci.simple_interest(p,t,r);
        System.out.println("\nSimple Interest : "+SI);
        double CI=sci.compound_interest(p,t,r);
        System.out.println("Compound Interest : "+CI);

        Construction_cost cc=new Construction_cost();
        double total_cost=cc.total_construction_cost(a,m,area);
        System.out.println("Total construction cost of house : "+total_cost);
    }
}
