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
        this.setTitle("Your Empire " + Start.VERSION);
        this.setLayout(null);
        this.setIconImage(ImageIO.read(new File(Start.EXEC_JAR_DIR + "/icon.ico")));
    }
}
