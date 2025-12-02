import java.awt.*;

public class GraphicsExample extends Frame {

    public GraphicsExample() {
        super("Graphics Example");
        setSize(400, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawLine(50, 50, 200, 50);
        g.drawRect(50, 70, 150, 80);
        g.drawOval(50, 170, 100, 100);
        g.drawString("Hello AWT", 60, 300);
    }

    public static void main(String[] args) {
        new GraphicsExample();
    }
}
