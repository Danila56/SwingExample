import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 19.05.2017.
 */
public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dimension.width,dimension.height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Title");
        frame.setVisible(true);
        frame.setSize(800,800);
    }
}
