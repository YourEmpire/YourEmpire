package pl.yourempire.api.technology;

import java.util.ArrayList;
import java.util.List;

public class Technology
{
    private String name;
    private int price;
    private List<Technology> requiredTech = new ArrayList<>();


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

    public List<Technology> getRequiredTech()
    {
        return this.requiredTech;
    }

    public void setRequierdTech(List<Technology> val)
    {
        this.requiredTech = val;
    }

    public void addRequiredTech(Technology val)
    {
        if (! this.getRequiredTech().contains(val))
        {
            this.getRequiredTech().add(val);
        }
    }
}
