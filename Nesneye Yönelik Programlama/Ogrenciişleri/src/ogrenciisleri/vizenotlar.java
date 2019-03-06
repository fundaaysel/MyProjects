
package ogrenciisleri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class vizenotlar extends notlar {
    String dosyayolu = System.getProperty("user.dir");
 int i;
  
 
 public void listeleme(int id){
 int i;
 String a = String.valueOf(id);
 String[] not;
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\vizenotlar.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 BufferedReader br = new BufferedReader(fileReader);
  
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 not=line.split(" ");
 System.out.println(not[3]);
 break;
 }
 else{continue;}
 } 
  
 }
 catch(Exception e) {}
 }
 

 public void notekleme() {
  
 int not;
 ArrayList<String> list = new ArrayList<>();
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 Scanner vize=new Scanner(System.in);
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((line = br.readLine()) != null) {
 System.out.println(line+"isimli ogrencinin vize notunu giriniz");
 not=vize.nextInt();
 list.add(line+" "+not);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\vizenotlar.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
  
  
  
 }
}
