package pl.yourempire.api.validator;

public final class Validator
{
    private Validator()
    {
    }

    public static void main(String[] args)
    {
        new NullPointerException(null);
    }
    public static void notNull(Object o, String errorMsg)
    {
        if (o == null)
        {
            throw new NullPointerException(errorMsg);
        }
    }
}
