package com.epamtask4;
public class Construction_cost
{
    public double total_construction_cost(int a,int m,double area)
    {
        if(a==0)
        {
            if(m==1)
                return (1200 * area);
            else if(m==2)
                return (1500 * area);
            else if(m==3)
                return (1800 * area);
        }
        else if(a==1)
            return (2500 * area);
        return 0;
    }
}
