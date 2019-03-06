
package ogrenciisleri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class listeleme {
    String dosyayolu = System.getProperty("user.dir");
 public void ogrencilisteleme(){
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogrenci.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
  
 while ((line=br.readLine()) != null) {
 System.out.println(line);
  
 } 
 }
 }
 catch(Exception e){
 }
 }
  
 public void ogretimuyesilisteleme(){
 try{
 File f = new File(dosyayolu+"\\src\\ogrencisleri\\ogretimuyeleri.txt");
 FileReader fileReader = new FileReader(f);
 String line;
 try (BufferedReader br = new BufferedReader(fileReader)) {
  
 while ((line=br.readLine()) != null) {
 System.out.println(line);
  
 } 
 }
 }
 catch(Exception e){
 }
 }
}

