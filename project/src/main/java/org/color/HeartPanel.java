package org.color;

import javax.swing.*;
import java.awt.*;

public class HeartPanel extends JPanel {
    public HeartPanel() {
        setOpaque(true);
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.RED);

        int x = getWidth() / 2 - 100;
        int y = getHeight() / 2 - 50;

        g2d.fillArc(x, y - 50, 100, 100, 0, 180);
        g2d.fillArc(x + 100, y - 50, 100, 100, 0, 180);
        g2d.fillPolygon(new int[]{x, x + 100, x + 200}, new int[]{y, y + 100, y}, 3);

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        FontMetrics fm = g2d.getFontMetrics();
        String text = "Max Krutoi";
        int textX = getWidth() / 2 - fm.stringWidth(text) / 2;
        int textY = y + 30;
        g2d.drawString(text, textX, textY);
    }
}
