package com.company;

public class Child extends Monke {
    private String monkeName;
    private int iq;

    public Child(String monkeName,int iq)
    {
        this.monkeName = monkeName;
        this.iq = iq;

    }
    public String getname()
    {
        return monkeName;
    }
    public void setname(String name)
    {
        this.monkeName = name;
    }
    public int getiq()
    {
        return iq;
    }
    public void setiq(int iq)
    {
        this.iq = iq;
    }
    public void printmonkeName()
    {
        super.printmonkeName();

        System.out.println("KAKA");
    }
}
