package pl.yourempire.api.object;

import pl.mcplayg.quickrgba.QRGBAImage;

public class Texture
{
    public static final Texture EMPTY = new Texture(new QRGBAImage(64, 64));

    private QRGBAImage image;
    public Texture(QRGBAImage image)
    {
        if (image == null)
        {
            throw new IllegalArgumentException("Image cannot be null!");
        }
        this.image = image;
    }

    public QRGBAImage getTexture()
    {
        return this.image;
    }

    public void setTexture(QRGBAImage newTexture)
    {
        if (newTexture == null)
        {
            throw new IllegalArgumentException("New texture cannot be null!");
        }
        this.image = newTexture;
    }
}
