import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private static final String TITRE_FENETRE = "Lab 2 : LOG121 - Photoshop wannabe";
    private static final Dimension DIMENSION = new Dimension(1400, 700);

    public MainWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(TITRE_FENETRE);
        setSize(DIMENSION);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
