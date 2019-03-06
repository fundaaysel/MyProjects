
package ogrenciisleri;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ogrenci implements kisiler{
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
 out = new PrintWriter(new BufferedWriter(new FileWriter(dosyayolu+"\\src\\ogrencisleri\\ogrenci.txt", true)));
 out.println(id+" "+ad+" "+soyad);
 } 
 catch (IOException ex) {
 Logger.getLogger(ogrenci.class.getName()).log(Level.SEVERE, null, ex);
 }
 out.close();
 }
 @Override
 public void silme(int id) {
 this.id = id;
 String a = String.valueOf(id);
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 continue;
 }
 else{list.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogrenci.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 ArrayList<String> list2 = new ArrayList<>();
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\vizenotlar.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 continue;
 }
 else{list2.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\vizenotlar.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list2){out.println(d);}
 out.close();
 }
 catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 ArrayList<String> list3 = new ArrayList<>();
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\finalnotlar.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 continue;
 }
 else{list3.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\finalnotlar.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list3){out.println(d);}
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
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 {list.add(id+" "+ad+" "+soyad);}
 }
 else{ list.add(line);}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogrenci.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
  
 }
  
}

