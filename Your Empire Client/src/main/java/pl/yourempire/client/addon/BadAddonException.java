package pl.yourempire.client.addon;

import java.io.IOException;

public class BadAddonException extends IOException
{
    public BadAddonException()
    {
    }

    public BadAddonException(String message)
    {
        super(message);
    }

    public BadAddonException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public BadAddonException(Throwable cause)
    {
        super(cause);
    }
}
