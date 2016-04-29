package pl.yourempire.client.gui;

import pl.yourempire.client.Start;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame
{
    public GameFrame() throws IOException {
        super("Your Empire " + Start.VERSION);
        // this.setIconImage(ImageIO.read(new File("icon")));
    }
}
