package pl.yourempire.client.map;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import pl.yourempire.api.map.Map;
import pl.yourempire.api.object.ID;
import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.object.terrain.TerrainObjectType;

public class FileMapLoader extends MapLoader
{
    private static FileMapLoader ourInstance = new FileMapLoader();

    public static FileMapLoader getInstance()
    {
        return ourInstance;
    }

    private FileMapLoader()
    {
    }

    @Override
    public Map loadMap(InputStream is) throws IOException
    {
        String version;
        DataInputStream dis = new DataInputStream(is);
        Map result = new Map(dis.readUTF(), dis.readInt(), dis.readInt());
        result.setName(dis.readUTF());
        result.setDescription(dis.readUTF());
        result.setMinPlayers(dis.readByte());
        result.setMaxPlayers(dis.readByte());
        for (int y = 0; y < result.getHeight(); y++)
        {
            for (int x = 0; x < result.getWidth(); x++)
            {
                result.set(x, y, new TerrainObject(TerrainObjectType.getByID(new ID(dis.readUTF()))));
            }
        }
        int unitsPerTeam = dis.readInt();
        int x, y;
        String textID;
        byte unitState;
        for (int i = 0; i < unitsPerTeam; i++)
        {
            textID = dis.readUTF();
            unitState = dis.readByte();
            x = dis.readInt();
            y = dis.readInt();
            if (unitState == 0)
            {
            }
        }
        return result;
    }

    public Map loadMap(File f) throws IOException
    {
        return loadMap(new FileInputStream(f));
    }
}
