
package ogrenciisleri;
 
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class finalnotlar extends notlar {
    String dosyayolu = System.getProperty("user.dir");
 
 public void listeleme(int id) {
 int i;
 String a = String.valueOf(id);
 String[] not;
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\finalnotlar.txt");
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
 Scanner finalnot=new Scanner(System.in);
 try (BufferedReader br = new BufferedReader(fileReader)) {
 while ((line = br.readLine()) != null) {
 System.out.println(line+"isimli ogrencinin final notunu giriniz");
 not=finalnot.nextInt();
 list.add(line+" "+not);
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\finalnotlar.txt");
 FileWriter outFile = new FileWriter(f);
 PrintWriter out = new PrintWriter(outFile,true);
 for (String d: list){out.println(d);}
 out.close();
 }catch (Exception e){
 System.err.println("Hata: " + e.getMessage());
 }
 }
 }

