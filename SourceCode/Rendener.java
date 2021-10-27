package SourceCode;

import javax.swing.*;
import java.awt.*;

public class Rendener extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.system.repaint(g);
    }
}
