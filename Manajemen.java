package Service;

import Model.Aktivitas;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Manajemen {
    public ArrayList<Aktivitas> daftarKegiatan = new ArrayList<>();

    public void tambahKegiatan(String nama, LocalDate tenggat) {
        daftarKegiatan.add(new Aktivitas(nama, tenggat));
        System.out.println(nama + " berhasil ditambahkan!");
    }

    public void tampilkanKegiatan() {
        if (daftarKegiatan.isEmpty()) {
            System.out.println("Kegiatan kamu kosong.");
        } else {
            System.out.println("\n==============================");
            System.out.println("    DAFTAR KEGIATAN KAMU    ");
            System.out.println("==============================");
            for (int i = 0; i < daftarKegiatan.size(); i++) {
                Aktivitas k = daftarKegiatan.get(i);
                System.out.println("No     : " + (i + 1));
                System.out.println("Nama   : " + k.nama);
                System.out.println("Tenggat: " + k.tenggat);
                System.out.println("Status : " + k.status);
                System.out.println("-----------------------------");
            }
        }
    }

    public void tandaiSelesai(int index) {
        if (index >= 0 && index < daftarKegiatan.size()) {
            daftarKegiatan.get(index).status = "Selesai";
            System.out.println("\nKegiatan " + daftarKegiatan.get(index).nama + " berhasil diselesaikan!");
        } else {
            System.out.println("Input tidak valid.");
        }
    }

    public void updateTenggat(int index, LocalDate tenggatBaru) {
        if (index >= 0 && index < daftarKegiatan.size()) {
            daftarKegiatan.get(index).tenggat = tenggatBaru;
            System.out.println("\nTenggat kegiatan " + daftarKegiatan.get(index).nama + " diperbarui menjadi " + tenggatBaru + "!");
        } else {
            System.out.println("Input tidak valid.");
        }
    }

    public void hapusKegiatan(int index) {
        if (index >= 0 && index < daftarKegiatan.size()) {
            String nama = daftarKegiatan.get(index).nama;
            daftarKegiatan.remove(index);
            System.out.println("\nKegiatan " + nama + " berhasil dihapus!");
        } else {
            System.out.println("Input tidak valid.");
        }
    }

    public ArrayList<Aktivitas> getDaftarKegiatan() {
        return daftarKegiatan;
    }

    public List<Aktivitas> cariKegiatan(String keyword) {
        List<Aktivitas> hasil = new ArrayList<>();
        for (Aktivitas a : daftarKegiatan) {
            if (a.nama.toLowerCase().contains(keyword.toLowerCase())) {
                hasil.add(a);
            }
        }
        return hasil;
    }
}
