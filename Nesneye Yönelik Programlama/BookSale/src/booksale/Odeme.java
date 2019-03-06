
package booksale;
import javax.swing.JOptionPane;
public class Odeme {
    public static void OdemeYap(){
    String isimSoyisim=JOptionPane.showInputDialog("Kart üzerindeki ismi giriniz:");
        String KartNumarasi=JOptionPane.showInputDialog("Kart numarasini giriniz:");
        String SonKK=JOptionPane.showInputDialog("Son kullanma tarihi:");
        String Cvv=JOptionPane.showInputDialog("CVV:");
        
        String ad=String.valueOf(isimSoyisim);
        int kartno=Integer.parseInt(KartNumarasi);
        int Skk=Integer.parseInt(SonKK);
        int cvv=Integer.parseInt(Cvv);
        
        JOptionPane.showMessageDialog(null, "Ödemeniz yapildi");

}
}
