package pl.yourempire.api;


import java.util.ArrayList;
import java.util.List;

public class Technology
{
private String name;
private int price;
private List<Technology> requierdTech = new ArrayList<Technology>();


    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Technology> getRequierdTech()
    {
        return this.requierdTech;
    }

    public void setRequierdTech(List<Technology> val)
    {
        this.requierdTech = val;
    }

    public void addRequiredTe(Technology val)
    {
        if(!this.getRequierdTech().contains(val))
        {
        this.getRequierdTech().add(val);
        }
    }
}
