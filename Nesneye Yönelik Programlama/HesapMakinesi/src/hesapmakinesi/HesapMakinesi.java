package hesapmakinesi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HesapMakinesi extends JFrame implements ActionListener{
    JTextField tf1;
    JTextField tf2;
    
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    
    JLabel l1;
    
    JPanel panel;
    
    public HesapMakinesi(){
        panel =new JPanel();
        add(panel);     //frame'e paneli ekleme
        
        tf1=new JTextField(20);
        tf1.setText("İlk sayi");
        panel.add(tf1);
        
        tf2=new JTextField(20);
        tf1.setText("İkinci sayi");
        panel.add(tf2);
        
        b1=new JButton("+");
        b1.addActionListener(this);
        panel.add(b1);
        
        b2=new JButton("-");
        b2.addActionListener(this);
        panel.add(b2);
        
        b3=new JButton("*");
        b3.addActionListener(this);
        panel.add(b3);
        
        b4=new JButton("/");
        b4.addActionListener(this);
        panel.add(b4);
        
        l1=new JLabel("Islemin sonucu");
        panel.add(l1);
    }
    public void actionPerformed(ActionEvent e){  //Butona basıldığında çalışır
        if(e.getSource().equals(b1))   //Component b1 e eşitse
        {
            int ilkSayi =Integer.parseInt(tf1.getText());
            int ikinciSayi=Integer.parseInt(tf2.getText());
            l1.setText(" "+(ilkSayi+ikinciSayi));
        }
        else if(e.getSource().equals(b2))
        {
            int ilkSayi =Integer.parseInt(tf1.getText());
            int ikinciSayi=Integer.parseInt(tf2.getText());
            l1.setText(" "+(ilkSayi-ikinciSayi));
        }
        else if(e.getSource().equals(b3))
        {
            int ilkSayi =Integer.parseInt(tf1.getText());
            int ikinciSayi=Integer.parseInt(tf2.getText());
            l1.setText(" "+(ilkSayi*ikinciSayi));
        }
        else if(e.getSource().equals(b4))
        {
            int ilkSayi =Integer.parseInt(tf1.getText());
            int ikinciSayi=Integer.parseInt(tf2.getText());
            l1.setText(" "+(ilkSayi/ikinciSayi));
        }
    }

    public static void main(String[] args) {
        HesapMakinesi frame=new HesapMakinesi();
        frame.setVisible(true);
        frame.setSize(240, 480);  //boyut ayarlama
        frame.setLocation(120, 120);   //konum ayarlama
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //varsayilan kapatma
    }
    
}
