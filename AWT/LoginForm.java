import java.awt.*;
import java.awt.event.*;

public class LoginForm {

    public static void main(String[] args) {
        Frame frame = new Frame("Login Form");

        Label l1 = new Label("Username:");
        Label l2 = new Label("Password:");
        TextField t1 = new TextField(20);
        TextField t2 = new TextField(20);
        t2.setEchoChar('*');
        Button loginBtn = new Button("Login");

        loginBtn.addActionListener(e -> {
            System.out.println("Username: " + t1.getText());
            System.out.println("Password: " + t2.getText());
        });

        frame.setLayout(new FlowLayout());
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(loginBtn);

        frame.setSize(300, 250);
        frame.setVisible(true);
    }
}
