
package ogrenciisleri;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
 
public class DersAtama {
    public void dersatama(){
 String dosyayolu = System.getProperty("user.dir");
 String ders;
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 Scanner d=new Scanner(System.in);
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((line = br.readLine()) != null) {
 System.out.println(line+"isimli ogretim uyesinin verdigi dersi giriniz:");
 ders=d.nextLine();
 list.add(line+" "+ders);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\dersler.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 } 
}

