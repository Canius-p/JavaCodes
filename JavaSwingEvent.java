    import java.awt.event.*;  
    import javax.swing.*;    
    public class JavaSwingEvent {  
    public static void main(String[] args) {  
        JFrame fr1=new JFrame("Button Example");  
        final JTextField tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  
        JButton btn=new JButton("Click Here");  
        btn.setBounds(50,100,95,30);  
        btn.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
                tf.setText("Hey there !!");  
            }  
        });  
        fr1.add(btn);fr1.add(tf);  
        fr1.setSize(400,400);  
        fr1.setLayout(null);  
        fr1.setVisible(true);   
    }  
    }  
