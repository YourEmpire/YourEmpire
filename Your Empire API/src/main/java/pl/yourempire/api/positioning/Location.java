package pl.yourempire.api.positioning;

public class Location implements Comparable<Location>, Cloneable
{
    private int x, y;

    public Location(int x, int y)
    {
        if (x < 0)
        {
            throw new IllegalArgumentException("X cannot be lower than zero!");
        }
        if (y < 0)
        {
            throw new IllegalArgumentException("Y cannot be lower than zero!");
        }
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    @Override
    public int compareTo(Location o)
    {
        if (o.getY() < getY())
        {
            return 1;
        }
        else if (o.getY() > getY())
        {
            return -1;
        }
        else
        {
            if (o.getX() < getX())
            {
                return 1;
            }
            else if (o.getX() > getX())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }

    @Override
    public Location clone() throws CloneNotSupportedException
    {
        return new Location(x, y);
    }

    @Override
    public boolean equals(Object o)
    {
        return o instanceof Location && compareTo((Location) o) == 0;
    }
}
