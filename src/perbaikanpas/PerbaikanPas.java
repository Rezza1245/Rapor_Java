package perbaikanpas;

import java.util.Scanner;



public class PerbaikanPas {
        static Scanner input = new Scanner(System.in);
        static int pilihmenu;
        static String namalengkap, nisn, kelas, jawab;
        static double nilaiTugas1, nilaiTugas2, nilaiTugas3;
        static double nilaiUh, nilaiUts, nilaiUas, nilaiAkhir;
        static char grade;
        static boolean running = true;
        
        static  void pilih(){
            System.out.println("======MENU======");
            System.out.println("1. INPUT DATA");
            System.out.println("2. CETAK RAPOT");
            System.out.println("3. KELUAR");
            System.out.println("==================");
            System.out.print("MASUKAN PILIHAN ANDA : ");
            pilihmenu = input.nextInt();
            
            switch(pilihmenu){
                case 1:
                    inputData();
                    break;
                case 2:
                    System.out.println("Maaf Silahkan Input Data Terlebih Dahulu");
                    pilih();
                    break;
                case 3:
                    System.exit(0);
                    
            }
        }
        
        static void inputData(){
            
            System.out.println("==============INPUT=============");
            System.out.print("Masukan Nama Anda : ");
            namalengkap = input.next();
            System.out.print("Masukan NISN Anda : ");
            nisn = input.next();
            System.out.print("Masukann Kelas Anda : ");
            kelas = input.next();
            System.out.println("=================================");
            System.out.print("Masukan Nilai Tugas 1 Anda : ");
            nilaiTugas1  = input.nextDouble();
            System.out.print("Masukan Nilai Tugas 2 Anda : ");
            nilaiTugas2 = input.nextDouble();
            System.out.print("Masukan Nilai Tugas 3 Anda : ");
            nilaiTugas3 = input.nextDouble();
            System.out.println("==================================");
            System.out.print("Masukan Nilai Harian Anda : ");
            nilaiUh = input.nextDouble();
            System.out.print("Masukan Nilai UTS Anda : ");
            nilaiUts = input.nextDouble();
            System.out.print("Masukan Nilai UAS Anda : ");
            nilaiUas = input.nextDouble();
            System.out.println("==================================");
            
        }
    public static void main(String[] args) {
        pilih();
        System.out.println("=================================");
        System.out.println("             RAPOT KELAS - X ");
        System.out.println("            SMK TELKOM MALANG ");
        System.out.println("           TAHUN AJARAN 2020 - 2021");
        System.out.println("==================================");
        System.out.println("NAMA : "+namalengkap);
        System.out.println("NISN : "+nisn);
        System.out.println("KELAS : "+kelas);
        System.out.println("====================================");
        System.out.println("NILAI TUGAS 1 : "+nilaiTugas1);
        System.out.println("NILAI TUGAS 2 : "+nilaiTugas2);
        System.out.println("NILAI TUGAS 3 : "+nilaiTugas3);
        System.out.println("=====================================");
        System.out.println("NILAI TUGAS UH : "+nilaiUh);
        System.out.println("NILAI TUGAS UTS : "+nilaiUts);
        System.out.println("NILAI TUGAS UAS : "+nilaiUas);
        System.out.println("======================================");
        nilaiAkhir = (nilaiTugas1+nilaiTugas2+nilaiTugas3+nilaiUh+nilaiUts+nilaiUas)/6;
        System.out.println("NILAI AKHIR ANDA : "+nilaiAkhir);
        if(nilaiAkhir>=91 && nilaiAkhir<=100){
            grade = 'A';
        }else if(nilaiAkhir>=81 && nilaiAkhir<=90){
            grade = 'B';
        }else if (nilaiAkhir>=71 && nilaiAkhir<=80){
            grade = 'C';
        }else if (nilaiAkhir>=61 && nilaiAkhir<=70){
            grade = 'D';
        }else{
            grade = 'E';
        }
        System.out.println("GRADE ANDA    ; "+grade);
        
        while(running){
            System.out.println("APAKAH ANDA INGIN MENCETAK RAPOT LAGI : [Y/T]");
            System.out.print("JAWAB [Y/T] :");
            jawab = input.nextLine();
            
            if(jawab.equalsIgnoreCase("Y")){
                pilih();
                running = false;
            }
        }System.exit(0);
        }
}
