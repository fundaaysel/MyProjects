
package booksale;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
public class Uyelik extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField;
    private JButton button;
  
    
    public Uyelik()
    {
        super("Uyelik için Bilgilerinizi giriniz");
        setLayout(new FlowLayout());
        
        textField1 = new JTextField("Ad Soyad",40);
        add(textField1);
        
        
         textField2=new JTextField("Email",40);
        add(textField2);
        
        
        passwordField=new JPasswordField("Password",40);
        add(passwordField);
        
        button=new JButton("Gönder");
        add(button);
            
        
        TextFieldHandler handler=new TextFieldHandler();
        textField1.addActionListener(handler);
         textField2.addActionListener(handler);
          passwordField.addActionListener(handler);
          button.addActionListener(handler);
          
    }

    private void add(booksale.JTextField textField1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private class TextFieldHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String string="";
            if(event.getSource()==textField1)
                string=String.format("textField1:%s",event.getActionCommand());
        
            else if(event.getSource()==textField2)
                string=String.format("textField2:%s",event.getActionCommand());
           
            
            else if(event.getSource()==passwordField)
                string=String.format("passwordField:%s",event.getActionCommand());
            
            else if(event.getSource()==button)
                string=String.format("button:%s",event.getActionCommand());
        
            JOptionPane.showMessageDialog(null, string);
            
        }
    }
}

