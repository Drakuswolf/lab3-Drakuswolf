import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
     *
     */
    private static final long serialVersionUID = 7057541440811488699L;

            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        //Second border
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
//                       
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                       
//                        g.setColor(Color.RED);
//                        g.drawLine(x2, y1, x1, y2);
                       
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(width/2 - 27, height/2 - 27, 55, 55);
                       
                        g.setColor(Color.WHITE);
                        g.fillRect(x1+10, y1+10, x1+210, y1+150);
                       
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 10, y1 + 10);
                        p.addPoint(x1 + 10, y1 + 160);
                        p.addPoint(x1 + 120, y1 + 80);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                       
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                       
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1+10, y1+10);
                        p3.addPoint(x1+220, y1+10);
                        p3.addPoint(x1+220, y1+35);
                        p3.addPoint(x1+49, y1+35);
                        g.setColor(Color.RED);
                        g.fillPolygon(p3);
                       
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1+95, y1+65);
                        p4.addPoint(x1+220, y1+65);
                        p4.addPoint(x1+220, y1+100);
                        p4.addPoint(x1+92, y1+100);
                        p4.addPoint(x1+120, y1+80);
                        g.setColor(Color.RED);
                        g.fillPolygon(p4);
                       
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1+44, y1+135);
                        p5.addPoint(x1+220, y1+135);
                        p5.addPoint(x1+220, y1+160);
                        p5.addPoint(x1+10, y1+160);
                        g.setColor(Color.RED);
                        g.fillPolygon(p5);
            }
}