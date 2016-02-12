package pl.yourempire.api.positioning;

public class Size implements Comparable<Size>, Cloneable
{
    private int width, height;

    public Size(int width, int height)
    {
        if (width < 0)
        {
            throw new IllegalArgumentException("Width cannot be lower than zero!");
        }
        if (height < 0)
        {
            throw new IllegalArgumentException("Height cannot be lower than zero!");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public int compareTo(Size o)
    {
        if (o.getHeight() < getHeight())
        {
            return 1;
        }
        else if (o.getHeight() > getHeight())
        {
            return -1;
        }
        else
        {
            if (o.getWidth() < getWidth())
            {
                return 1;
            }
            else if (o.getWidth() > getWidth())
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
    public Size clone() throws CloneNotSupportedException
    {
        return new Size(width, height);
    }

    @Override
    public boolean equals(Object o)
    {
        return o instanceof Size && compareTo((Size) o) == 0;
    }
}