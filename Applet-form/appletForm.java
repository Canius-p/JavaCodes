import java.awt.*;
import java.applet.*;

public class appletForm extends Applet {

    public void init() {
        Label nameLabel = new Label("Name");
        Label passLabel = new Label("password");
        TextField name = new TextField(20);
        TextField pass = new TextField(20);
        pass.setEchoChar('$');
        Button b1 = new Button("submit");
        Button b2 = new Button("cancel");
        add(nameLabel);
        add(name);
        add(passLabel);
        add(pass);
        add(b1);
        add(b2);
        nameLabel.setBounds(70, 90, 90, 60);
        passLabel.setBounds(70, 130, 90, 60);
        name.setBounds(280, 100, 90, 20);
        pass.setBounds(200, 140, 90, 20);
        b1.setBounds(100, 260, 70, 40);
        b2.setBounds(180, 260, 70, 40);
    }

    public void paint(Graphics g) {
        repaint();
    }
}
