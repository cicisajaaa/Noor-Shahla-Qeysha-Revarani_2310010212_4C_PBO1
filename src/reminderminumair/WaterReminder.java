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

}
