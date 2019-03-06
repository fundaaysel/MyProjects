
package ogrenciisleri;

import java.io.*;

public class ortalama {
    String dosyayolu = System.getProperty("user.dir");
 int i;
 int j;
 float ortalama;
 public void ortalamaalma(int id) {
 String a = String.valueOf(id);
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\vizenotlar.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 String[] not;
 not=line.split(" ");
 i=Integer.parseInt(not[3]);
 }
 else{}
 } 
 }
 }
 catch(Exception e){
 }
 try{
 File file = new File(dosyayolu+"\\src\\ogrencisleri\\finalnotlar.txt");
 FileReader fileReader2 = new FileReader(file);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader2)) {
 line = br.readLine();
 while (line != null) {
 if((line=br.readLine()).startsWith(a)){
 String[] not;
 not=line.split(" ");
 j=Integer.parseInt(not[3]);
 }
 else{}
 } 
 }
 }
 catch(Exception e){
 }
 System.out.println("vize notu: "+i+"final notu "+j);
 ortalama=(float)(i+j)/2;
 System.out.println("ORTALAMA: "+ortalama);
 } 
}

