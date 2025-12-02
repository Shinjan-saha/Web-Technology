import java.awt.*;
import java.awt.event.*;

public class CheckboxExample {

    public static void main(String[] args) {
        Frame frame = new Frame("AWT Checkbox Example");


        Checkbox cb1 = new Checkbox("Java");
        Checkbox cb2 = new Checkbox("Python");
        Checkbox cb3 = new Checkbox("C++");


        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Checkbox source = (Checkbox) e.getSource();
                if (source.getState()) {
                    System.out.println(source.getLabel() + " Checked");
                } else {
                    System.out.println(source.getLabel() + " Unchecked");
                }
            }
        };

        
        cb1.addItemListener(listener);
        cb2.addItemListener(listener);
        cb3.addItemListener(listener);

        
        frame.setLayout(new FlowLayout());
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);

        frame.setSize(300, 200);
        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
