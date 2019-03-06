package booksale;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BookSale extends JFrame {
    public static void main(String[] args) {
        System.out.println("Ne yapmak istersiniz?\n1-Üye olmak\n2-Kitap Listesini Görmek\n3-Sepete Ekleme\n4-Sepeti görüntüle\n5-Ödeme Yapma\n");
        Scanner input =new Scanner(System.in);
        int secim=input.nextInt();
        
        switch(secim)
        {
            case 1:
                Uyelik textFieldFrame=new Uyelik();
                textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                textFieldFrame.setSize(500, 450);
                textFieldFrame.setVisible(true);
                
                
                break;
            case 2:
                System.out.println("Kitap Listesi Görüntüleniyor:");
                StringBuffer icerik = new StringBuffer("");
                try{
                File f=new File("D:/KitapSitesi/KitapListem.txt");
                FileInputStream fi=new FileInputStream(f);
                int k;
                while ((k=fi.read())!=-1){
                icerik.append((char)k);}}
                 catch(FileNotFoundException f)
                {System.out.println("dosya yok");}
                catch(IOException ioex)
                {System.out.println("başka bir hata oldu"); }
        
                System.out.println(icerik);

                break;
            case 3:
                     String kitapismi = null;
                     int kitapsayisi;
     
                     System.out.println("Kaç kitap ekleyeceksiniz?");
                     kitapsayisi=input.nextInt();
                     System.out.println("Sepete eklenecek kitap isimlerini giriniz:");
                     for(int i=0;i<=kitapsayisi;i++)
                     {
                         kitapismi=input.nextLine();
                    try{
                      FileOutputStream f=new FileOutputStream("D:/KitapSitesi/Sepetim.txt",true) ;
                       PrintStream yaz=new PrintStream(f);
                      yaz.println(kitapismi);
                     }
                     catch(IOException e){        
                     } 
                     }

                break;
            case 4:
                   System.out.println("Sepetiniz görüntüleniyor:");
                StringBuffer sepet = new StringBuffer("");
                try{
                File f=new File("D:/KitapSitesi/Sepetim.txt");
                FileInputStream fi=new FileInputStream(f);
                int k;
                while ((k=fi.read())!=-1){
                sepet.append((char)k);}}
                 catch(FileNotFoundException f)
                {System.out.println("dosya yok");}
                catch(IOException ioex)
                {System.out.println("başka bir hata oldu"); }
        
                System.out.println(sepet);
                
                break;
                
            case 5:
                  Odeme odemeYap=new Odeme();
                  odemeYap.OdemeYap();
                break;
                
            default:
                System.out.println("Lütfen 1-5 arasinda sayi giriniz!!!");
                break;
                
        }
    }
    
}
