package reminderminumair;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class WaterReminder {
    private final String namaPengguna;                  // Nama pengguna
    private final int targetHarian;                     // Target minum harian dalam ml
    private final Map<LocalDate, Integer> catatanAir;   // Catatan jumlah minum per tanggal

    public WaterReminder(String nama, int target) {
        this.namaPengguna = nama;
        this.targetHarian = target;
        this.catatanAir = new HashMap<>();
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public int getTargetHarian() {
        return targetHarian;
    }
    public void tambahAir(LocalDate tanggal, int jumlah){
        int total = 
                catatanAir.getOrDefault(tanggal, 0);
                catatanAir.put(tanggal, total + jumlah);
                System.out.println("Berhasil Menambahkan " + jumlah + "ml untuk tanggal " + tanggal);
    }
    public void editAir(LocalDate tanggal, int jumlahBaru){
        if(catatanAir.containsKey(tanggal)){
            catatanAir.put(tanggal, jumlahBaru);
            System.out.println("Data Tanggal " + tanggal + " diubah menjadi " + jumlahBaru + "ml");
        } else {
            System.out.println("Tanggal tersebut belum ada catatan. Silahkan tambah dulu.");
        }
    }
    public void lihatProgress(LocalDate tanggal){
        int jumlah =
                catatanAir.getOrDefault(tanggal, 0);
        System.out.println("Progress Tanggal: "+ tanggal);
        System.out.println("Nama : " + namaPengguna + " telah minum " + jumlah + "ml dari target " + targetHarian + "ml");
        int persen = (int) ((double) jumlah / targetHarian * 100);
        System.out.println("Persentase : " + persen + "%");
        
        if (jumlah>= targetHarian){
            System.out.println("Target Harian telah tercapai.");
        } else {
            System.out.println("Belum Mencapai Target Harian Anda.");
        }
    }
    
    public void lihatRiwayat(){
        System.out.println("\nRIWAYAT MINUM ANDA");
        if (catatanAir.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (Map.Entry<LocalDate, Integer> entry : catatanAir.entrySet()){
                System.out.println("Tanggal " + entry.getKey()+ " : " + entry.getValue()+ "ml");
            }
        }
    }

}
