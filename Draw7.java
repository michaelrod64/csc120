

import java.awt.*;

 public class Draw7 {
 public static void main(String[] args) {
 DrawingPanel panel = new DrawingPanel(200, 200);
 Graphics g = panel.getGraphics();
 int size = 200;
 for (int i = 0; i < 20; i++) {
 g.drawOval(i * 10, i * 10, size - (i * 10), size - (i * 10));
 }
 }
 }