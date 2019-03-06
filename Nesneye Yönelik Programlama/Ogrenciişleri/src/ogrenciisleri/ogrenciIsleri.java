
package ogrenciisleri;

import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;

public class ogrenciIsleri {

    
    public static void main(String[] args) throws IOException {
       System.out.println("Lutfen yapmak istediginiz islemi seciniz.\n"
               + "(not:vize ve final notu listelenmesi istenmeden once notlarin girilmesi gerekmektedir "
               + "menuden gerekli secimi yaparak notlari ekleyebilirsiniz.)");
int x=0;
while(x!=5){
System.out.println("****************************************************");
System.out.println("Lutfen yapmak istediginiz islemi seciniz:");
System.out.println("1-->Ogrenci islemleri");
System.out.println("2-->Ogretim uyesi islemleri");

int secim;
Scanner s= new Scanner(System.in);
secim=s.nextInt();
switch (secim) {

case 1: {
int y=0;
while(y!=9){
System.out.println("****************************************************");
System.out.println("Ogrenci menusunden yapmak istediginiz islemi secin:");
System.out.println("1-->Ogrenci ekleme");
System.out.println("2-->Ogrenci silme");
System.out.println("3-->Ogrenci guncelleme");
System.out.println("4-->Ogrenciye vize notu ekleme");
System.out.println("5-->Ogrenciye final notu ekleme");
System.out.println("6-->Ogrencinin vize notunu listeleme");
System.out.println("7-->Ogrencinin final notunu listeleme");
System.out.println("8-->Ogrencinin ortalama notunu listeleme");
System.out.println("9-->Bir ust menuye don");
secim=s.nextInt();
switch (secim) {
case 1: {
System.out.println("Eklemek istediginiz ogrencinin adini giriniz:");
Scanner a=new Scanner(System.in);
String ad=a.nextLine();
System.out.println("Eklemek istediginiz ogrencinin soyadini giriniz:");
Scanner b=new Scanner(System.in);
String soyad=b.nextLine();
System.out.println("Eklemek istediginiz ogrencinin nosunu giriniz:");
Scanner c=new Scanner(System.in);
int id=c.nextInt();
ogrenci ogr =new ogrenci();
ogr.ekleme(ad, soyad, id);
System.out.println(ad+" "+soyad+" isimli ogrenci sisteme eklenmistir.");
}
break;
case 2: {System.out.println("Silmek istediginiz ogrencinin okul numarasini giriniz:");
Scanner a=new Scanner(System.in);
int id=a.nextInt();
ogrenci ogr1 = new ogrenci();
ogr1.silme(id);
System.out.println(id+" numarali ogrenci sistemden silinmistir.");
}
break;
case 3: {System.out.println("Guncellemek istediginiz ogrencinin numarasini giriniz:");
Scanner a=new Scanner(System.in);
int id=a.nextInt();
System.out.println("Guncellemek istediginiz ogrencinin adini giriniz:");
Scanner b=new Scanner(System.in);
String ad=b.nextLine();
System.out.println("Guncellemek istediginiz ogrencinin soyadini giriniz:");
Scanner c=new Scanner(System.in);
String soyad=c.nextLine();
ogrenci ogr2 = new ogrenci();
ogr2.guncelleme(ad, soyad, id);
System.out.println(id+" numarali ogrenci guncellendi");
}
break;
case 4: {
vizenotlar yeninot=new vizenotlar();
yeninot.notekleme();
}
break;
case 5: {
finalnotlar yeninot=new finalnotlar();
yeninot.notekleme();
}
break;
 
case 6: {System.out.println("Vize notunu gormek istediginiz ogrencinin numarasini giriniz");
Scanner a=new Scanner(System.in);
int id=a.nextInt();
vizenotlar yeninot = new vizenotlar();
yeninot.listeleme(id);
}
break;
case 7: {System.out.println("Final notunu gormek istediginiz ogrencinin numarasini giriniz");
Scanner a=new Scanner(System.in);
int id=a.nextInt();
finalnotlar yeninot=new finalnotlar();
yeninot.listeleme(id);
}
break;
case 8: {System.out.println("Ortalama notunu gormek istediginiz ogrencinin numarasini giriniz");
Scanner a=new Scanner(System.in);
int id=a.nextInt();
ortalama yeninot=new ortalama();
yeninot.ortalamaalma(id);
}
break;
case 9: y=9;
break;
default:System.out.println("Hatali secim yaptiniz lutfen yeniden deneyin");
break;
}
}
}
break;

case 2: {
int z=0;
while(z!=5){
System.out.println("****************************************************");
System.out.println("Ogretim uyesi menusunden yapmak istediginiz islemi secin:");
System.out.println("1-->Ogretim uyesi ekleme");
System.out.println("2-->Ogretim uyesi silme");
System.out.println("3-->Ogretim uyesi guncelleme");
System.out.println("4-->Ogretim uyesine ders atama");
System.out.println("5-->Bir ust menuye don");
secim=s.nextInt();
switch (secim) {
case 1: {
System.out.println("Eklemek istediginiz ogretim uyesinin adini giriniz:");
Scanner a=new Scanner(System.in);
String ad=a.nextLine();
System.out.println("Eklemek istediginiz ogretim uyesinin soyadini giriniz:");
Scanner b=new Scanner(System.in);
String soyad=b.nextLine();
System.out.println("Eklemek istediginiz ogretim uyesinin nosunu giriniz:");
Scanner c=new Scanner(System.in);
int id=c.nextInt();
ogretimUyesi ogr =new ogretimUyesi();
ogr.ekleme(ad, soyad, id);
System.out.println(ad+" "+soyad+" isimli ogretim uyesi sisteme eklenmistir.");
}
break;
case 2: {System.out.println("Silmek istediginiz ogretim uyesinin id'sini giriniz:");
Scanner a=new Scanner(System.in);
int id=a.nextInt();
ogretimUyesi ogr1 = new ogretimUyesi();
ogr1.silme(id);
System.out.println(id+" id'li ogretim uyesi sistemden silinmistir.");
}
break;
case 3: {System.out.println("Guncellemek istediginiz ogretim uyesinin id'sini giriniz:");
Scanner a=new Scanner(System.in);
int id=a.nextInt();
System.out.println("Guncellemek istediginiz ogretim uyesinin adini giriniz:");
Scanner b=new Scanner(System.in);
String ad=b.nextLine();
System.out.println("Guncellemek istediginiz ogretim uyesinin soyadini giriniz:");
Scanner c=new Scanner(System.in);
String soyad=c.nextLine();
ogretimUyesi ogr2 = new ogretimUyesi();
ogr2.guncelleme(ad, soyad, id);
System.out.println(id+" id'li ogretim uyesi guncellendi");
}
break;
case 4: { DersAtama yeni=new DersAtama();
yeni.dersatama();
}
break;
case 5: z=5;
break;
default:System.out.println("Hatali secim yaptiniz lutfen yeniden deneyin");
break;
}
}
}
break;
case 5: x=5;
break;

}
}
}
}
    
    

