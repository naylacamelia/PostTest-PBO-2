package Main;

import Model.Aktivitas;
import Service.Manajemen;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manajemen service = new Manajemen();

        service.tambahKegiatan("Mengerjakan Tugas PBO", LocalDate.of(2025, 9, 15));
        service.tambahKegiatan("Mencuci baju", LocalDate.of(2025, 9, 16));

        while (true) {
            System.out.println("\n======== ACTIVITY LOG ========");
            System.out.println("1. Tambah Kegiatan");
            System.out.println("2. Tampilkan Daftar Kegiatan");
            System.out.println("3. Tandai Selesai");
            System.out.println("4. Update Tenggat Kegiatan");
            System.out.println("5. Hapus Kegiatan");
            System.out.println("6. Cari Kegiatan");
            System.out.println("7. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih menu (1 - 7): ");

            if (!input.hasNextInt()) {
                System.out.println("Input harus berupa angka! Coba lagi.");
                input.nextLine(); 
                continue;
            }

            int menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan kegiatan: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan tenggat (yyyy-mm-dd): ");
                    String tglInput = input.nextLine();
                    try {
                        LocalDate tgl = LocalDate.parse(tglInput);
                        service.tambahKegiatan(nama, tgl);
                    } catch (Exception e) {
                        System.out.println("Format tanggal salah! Gunakan yyyy-mm-dd.");
                    }
                    break;

                case 2:
                    service.tampilkanKegiatan();
                    break;

                case 3:
                    service.tampilkanKegiatan();
                    System.out.print("Masukkan nomor kegiatan: ");
                    if (input.hasNextInt()) {
                        service.tandaiSelesai(input.nextInt() - 1);
                    } else {
                        System.out.println("Input harus berupa angka!");
                        input.nextLine();
                    }
                    input.nextLine();
                    break;

                case 4:
                    service.tampilkanKegiatan();
                    System.out.print("Masukkan nomor kegiatan: ");
                    if (input.hasNextInt()) {
                        int idxUpdate = input.nextInt() - 1;
                        input.nextLine();
                         if (idxUpdate < 0 || idxUpdate >= service.daftarKegiatan.size()) {
                            System.out.println("Nomor kegiatan tidak valid! Silakan coba lagi.");
                            break;
                        }
                        System.out.print("Masukkan tenggat baru (yyyy-mm-dd): ");
                        String tglBaru = input.nextLine();
                        try {
                            service.updateTenggat(idxUpdate, LocalDate.parse(tglBaru));
                        } catch (Exception e) {
                            System.out.println("Format tanggal salah! Gunakan yyyy-mm-dd.");
                        }
                    } else {
                        System.out.println("Input harus berupa angka!");
                        input.nextLine();
                    }
                    break;

                case 5:
                    service.tampilkanKegiatan();
                    System.out.print("Masukkan nomor kegiatan: ");
                    if (input.hasNextInt()) {
                        service.hapusKegiatan(input.nextInt() - 1);
                    } else {
                        System.out.println("Input harus berupa angka!");
                        input.nextLine();
                    }
                    input.nextLine();
                    break;

                case 6:
                    System.out.print("Masukkan kata kunci pencarian: ");
                    String keyword = input.nextLine();
                    List<Aktivitas> hasil = service.cariKegiatan(keyword);

                    if (hasil.isEmpty()) {
                        System.out.println("Tidak ada kegiatan yang cocok dengan pencarian.");
                    } else {
                        System.out.println("\n==============================");
                        System.out.println("        HASIL PENCARIAN       ");
                        System.out.println("==============================");
                        for (int i = 0; i < hasil.size(); i++) {
                            Aktivitas a = hasil.get(i);
                            System.out.println((i + 1) + ". " + a.nama + " | Tenggat: " + a.tenggat + " | Status: " + a.status);
                        }
                    }
                    break;

                case 7:
                    System.out.println("\nTerima kasih telah menggunakan program ini~");
                    System.out.println("SEE YOU! (^_^)");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
