package org.color;

import javax.swing.*;
import java.awt.*;

public class SpecialFrame extends JFrame {
    public SpecialFrame() {
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);
        add(new HeartPanel());
        setVisible(true);
    }
}
