
package reminderminumair;

import java.time.LocalDate;
import java.util.Scanner;

public class ReminderMinumAir {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            LocalDate hariIni = LocalDate.now();
            
            System.out.println("====================");
            System.out.println("APLIKASI PENGINGAT MINUM AIR SEDERHANA");
            System.out.println("====================");
            
            System.out.println("Masukkan nama Anda: ");
            String nama = input.nextLine();
            
            System.out.println("Masukkan Target Minum Harian Anda (ml) : ");
            int target = input.nextInt();
            
            WaterReminder reminder = new WaterReminder(nama, target);
            
            int pilihan =-1;
            
            while (pilihan !=0){
                System.out.println("\n===== MENU =====");
                System.out.println("1. Tambah Minum Hari Ini: ");
                System.out.println("2. Lihat Progress Hari Ini");
                System.out.println("3. Tambah Minum pada Tanggal Lain");
                System.out.println("4. Edit Minum Pada Tangga; Tertentu");
                System.out.println("5. Lihat Riwayat Minum");
                System.out.println("0. Keluar");
                System.out.println("Pilihan: ");
                pilihan = input.nextInt();
            }
        }
    }
 
}
