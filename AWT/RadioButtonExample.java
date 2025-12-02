import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample {

    public static void main(String[] args) {
        Frame frame = new Frame("AWT Radio Button Example");

        
        CheckboxGroup group = new CheckboxGroup();

        
        Checkbox rb1 = new Checkbox("Male", group, false);
        Checkbox rb2 = new Checkbox("Female", group, false);
        Checkbox rb3 = new Checkbox("Other", group, false);

        
        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Checkbox selected = group.getSelectedCheckbox();
                System.out.println("Selected Option: " + selected.getLabel());
            }
        };


        rb1.addItemListener(listener);
        rb2.addItemListener(listener);
        rb3.addItemListener(listener);

        
        frame.setLayout(new FlowLayout());
        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);

        frame.setSize(300, 200);
        frame.setVisible(true);

        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
