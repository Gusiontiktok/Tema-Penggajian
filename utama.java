/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaji;

/**
 *
 * @author acer
 */
public class utama {

 public static void main(String[] args) 
 {
  System.out.println("Program Testing Class Manager & Staff");
  manager man[]=new manager[2];
  staff staff1[]=new staff[2];
  staff staff2[]=new staff[3];
  
  //pembuatan manager
  
  man[0]=new manager();
  //Bedjo
  man[0].setNama("Surya");
  man[0].setNip("101");
  man[0].setGolongan("1");
  man[0].setTunjangan(5000000);
  man[0].setBagian("Administrasi");
  
  man[1]=new manager();
  //atika
  man[1].setNama("Anto");
  man[1].setNip("102");
  man[1].setGolongan("1");
  man[1].setTunjangan(2500000);
  man[1].setBagian("Pemasaran");
  
  // staff bedjo
  staff1[0]=new staff();
  staff1[0].setNama("Michelle");
  staff1[0].setNip("0003");
  staff1[0].setGolongan("2");
  staff1[0].setLembur(10);
  staff1[0].setGajiLembur(10000);
  
  staff1[1]=new staff();
  staff1[1].setNama("Joe");
  staff1[1].setNip("0005");
  staff1[1].setGolongan("2");
  staff1[1].setLembur(10);
  staff1[1].setGajiLembur(55000);
  man[0].setStaff(staff1);
  
  //staff atika
  staff2[0]=new staff();
  staff2[0].setNama("Yuyun");
  staff2[0].setNip("0004");
  staff2[0].setGolongan("3");
  staff2[0].setLembur(15);
  staff2[0].setGajiLembur(5500);

  staff2[1]=new staff();
  staff2[1].setNama("Wisnu");
  staff2[1].setNip("0006");
  staff2[1].setGolongan("4");
  staff2[1].setLembur(5);
  staff2[1].setGajiLembur(100000);

  staff2[2]=new staff();
  staff2[2].setNama("Kartika");
  staff2[2].setNip("0007");
  staff2[2].setGolongan("3");
  staff2[2].setLembur(6);
  staff2[2].setGajiLembur(20000);
  man[1].setStaff(staff2);
  
  //cetak informasi dari manager + staffnya
  man[0].lihatInfo();
  man[1].lihatInfo();
  }

}