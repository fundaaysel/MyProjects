
package ogrenciisleri;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class ogretimUyesi implements kisiler {
    String dosyayolu = System.getProperty("user.dir");
 private String ad;
 private String soyad;
 private int id;
 @Override
 public void ekleme(String ad,String soyad,int id) {
 PrintWriter out = null;
 try {
 this.ad=ad;
 this.soyad=soyad;
 this.id=id;
  
 out = new PrintWriter(new BufferedWriter(new FileWriter(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt", true)));
 out.println(id+" "+ad+" "+soyad);
 System.out.println("Ogretim uyesi eklendi.");
 } catch (IOException ex) {
 Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
 } finally {
 out.close();
 }
  
 }
 
 @Override
 public void silme(int id) {
 this.id = id;
 String a = String.valueOf(id);
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){continue;}
 else{list.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 out.println("ID AD SOYAD");
 for (String d: list){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 }
 
 @Override
 public void guncelleme(String ad,String soyad,int id) {
 this.ad=ad;
 this.soyad=soyad;
 this.id=id;
  
 String a = String.valueOf(id);
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){list.add(id+" "+ad+" "+soyad);}
 else{ list.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 out.println("ID AD SOYAD");
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 }
  
}

