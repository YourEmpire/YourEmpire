package pl.yourempire.client.map;

import java.io.IOException;
import java.io.InputStream;

import pl.yourempire.api.map.Map;

public abstract class MapLoader
{
    protected MapLoader()
    {
    }

    public abstract Map loadMap(InputStream is) throws IOException;
}
