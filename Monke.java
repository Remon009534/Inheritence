package com.company;

public class Monke {
    private String monkeName;
    private int iq;
    private String monkeFamily;

    public Monke()
    {

    };

    public Monke(String monkeName, int iq, String monkeFamily)
    {
        this.monkeName = monkeName;
        this.iq = iq;
        this.monkeFamily = monkeFamily;
    }
    public String getmonkeName()
    {
        return monkeName;
    }
    public void setmonkeName(String monkeName)
    {
        this.monkeName = monkeName;
    }
    public int getmonkeiq()
    {
        return iq;
    }
    public void setmonkeiq(int iq)
    {
        this.iq = iq;
    }
    public String getmonkeFamily()
    {
        return monkeFamily;
    }
    public void setmonkeFamily(String monkeFamily)
    {
        this.monkeFamily = monkeFamily;
    }
    protected void printmonkeName()
    {
        System.out.println("Donald Trump");
    }
    public int printmonkeiq()
    {
        return this.iq;
    }
    protected void printmonkeFamily()
    {
        System.out.print("Africa jungle");
    }

}
