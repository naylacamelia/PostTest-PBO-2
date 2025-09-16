# PostTest-PBO-2

Nayla Camelia Indraswari | A | 2409116009

# Sistem Manajemen Aktivitas Harian (Activity Log)
## Deskripsi Tema
Program ini merupakan sistem pencatat aktivitas harian sederhana yang dirancang untuk membantu pengguna dalam menyusun dan memantau tugas atau kegiatannya sehari-hari. Melalui program ini, setiap kegiatan penting dapat dicatat dengan detail, diberi tenggat waktu, diperbarui statusnya, hingga dihapus jika sudah tidak diperlukan. Dengan begitu, pengguna dapat lebih mudah mengelola aktivitas dan memastikan setiap tugas terselesaikan tepat waktu.
## Penjelasan Struktur Packages

<img width="441" height="166" alt="image" src="https://github.com/user-attachments/assets/e683759a-c559-436c-93f9-c002ee260751" />


**1. Package Model**

package ini berisi class Aktivitas yang merepresentasikan objek  program sehingga pengguna dapat menyimpan data kegiatan, seperti nama, tenggat, dan status. Package ini hanya fokus pada pendefinisian data.

**2. Package Service**

Package ini berisi class Manajemen yang berperan sebagai controller yang mengelola objek. Class ini mengatur semua logika pengelolaan kegiatan, seperti tambah, tampilkan, hapus, update, tandai selesai, dan cari kegiatan.

**3. Package Main**

Package ini berisi class Main yang menjadi kode utama program. class ini menyediakan menu, menerima input dari pengguna, dan memanggil method di Manajemen untuk menjalankan perintah.
## Penjelasan Alur Program
### Menu Utama

<img width="367" height="198" alt="image" src="https://github.com/user-attachments/assets/0cd611d9-8d6a-4479-950a-6b85f4172f35" />

program ini memiliki 7 fitur, diantaranya yakni pilihan untuk menambah kegiatan, menampilkan kegiatan, memperbarui deadline kegiatan, menghapus kegiatan, mencari kegiatan dan pilihan untuk keluar dari program.

### 1. Fitur Tambah Kegiatan 📝
<img width="368" height="269" alt="image" src="https://github.com/user-attachments/assets/556b11ae-e366-43b4-a219-2c791cfe16e7" />

Ketika pengguna memilih menu dengan memasukkan angka "1", mereka akan masuk ke fitur Tambah Kegiatan. Di fitur ini, pengguna akan diminta untuk memasukkan nama kegiatan serta tenggat waktu yang terkait dengan kegiatan tersebut. Status kegiatan akan otomatis tersimpan "belum selesai".

<img width="373" height="270" alt="image" src="https://github.com/user-attachments/assets/cbac42a7-a3cc-4068-9cbb-2e9040d97436" />

Ketika pengguna memasukan format tanggal yang salah atau tidak sesuai, maka program akan muncul keterangan bahwa input tidak valid dan otomatis kembali ke menu utama.

### 2. Fitur Menampilkan Daftar Kegiatan 📃
<img width="459" height="399" alt="image" src="https://github.com/user-attachments/assets/57c89995-4c70-4df4-a55e-f99d4e79d11e" />

Ketika pengguna memilih menu dengan memasukkan angka "2", ia akan masuk ke fitur yang amenampilkan seluruh daftar kegiatan beserta detail informasinya, seperti tenggat waktu dan status kegiatan (selesai atau belum).

### 3. Fitur Tandai Selesai ✅
<img width="619" height="453" alt="image" src="https://github.com/user-attachments/assets/0c073ead-56c9-40f7-8dc9-44793b28c62b" />

Jika pengguna memasukkan angka "3", mereka akan diarahkan ke fitur Tandai Selesai. Pada fitur ini, pengguna diminta memasukkan nomor kegiatan yang telah diselesaikan atau yang ingin ditandai selesai. Setelah berhasil, status kegiatan akan diperbarui menjadi Selesai.
Berikut adalah tampilan daftar kegiatan setelah di perbarui:

<img width="420" height="392" alt="image" src="https://github.com/user-attachments/assets/e0576f10-ceb3-4952-ba3a-3ca9eb18788d" />

- Ketika pengguna menginput nomor kegiatan yang tidak tersedia, maka akan muncul output berupa informasi "Input tidak valid" dan program kembali ke menu utama.

<img width="352" height="398" alt="image" src="https://github.com/user-attachments/assets/a21adf40-62c5-4c3c-983d-795ed01133a4" />

- Ketika pengguna tidak menginput angka, maka akan muncul output berupa informasi "Input harus angka" dan program kembali ke menu utama.

<img width="330" height="390" alt="image" src="https://github.com/user-attachments/assets/0fd851a7-90fa-44b9-9c16-d43347a7411e" />


### 4. Fitur Update Tenggat Kegiatan 📆
<img width="605" height="340" alt="image" src="https://github.com/user-attachments/assets/794a4050-f7e8-452a-be49-98e11be2a50f" />

Ketika pengguna memilih menu dengan memasukkan angka "4", mereka akan masuk ke fitur Update Tenggat. Di fitur ini, pengguna diminta untuk memasukkan nomor kegiatan yang ingin diperbarui, kemudian ia akab diminta memasukkan tenggat waktu baru dari kegiatan tersebut.

- Ketika pengguna menginputkan nomor kegiatan yang tidak tersedia, akan muncul output berupa "nomor tidak valid" dan program akan kembali ke menu utama.

<img width="417" height="298" alt="image" src="https://github.com/user-attachments/assets/e4d7c036-62cd-4c03-b37f-ee7f0f47a491" />

- Ketika pengguna melakukan input selain angka, maka akan muncul output berupa informasi "input harus berupa angka" dan program kembali ke menu utama.
  
<img width="369" height="299" alt="image" src="https://github.com/user-attachments/assets/c3706f29-4df7-4d90-9e71-94358d85b1d3" />



### 5. Fitur Hapus Kegiatan ✏️

<img width="460" height="359" alt="image" src="https://github.com/user-attachments/assets/3b9cf350-149d-4b2a-a7f1-f5472d6faea7" />

Ketika pengguna menginputkan angka "5", ia akan masuk ke fitur Hapus Kegiatan. Di fitur ini, pengguna diminta memasukkan nomor kegiatan yang ingin dihapus. Kemudian kegiatan yang dipilih beserta seluruh detailnya informasinya akan dihapus dari daftar kegiatan.

- Ketika pengguna menginput nomor kegiatan yang tidak tersedia, akan muncul output berupa "input tidak valid" dan program akan kembali ke menu utama.

<img width="335" height="199" alt="image" src="https://github.com/user-attachments/assets/16486367-7a87-4dee-9d7c-c8d86abb43c6" />

- ketika pengguna menginput selain angka, maka akan muncul output berupa "input harus angka" dan program akan kembali ke menu utama.

<img width="373" height="207" alt="image" src="https://github.com/user-attachments/assets/d717b166-faee-4a9e-9dc5-ba47036cdb0b" />


### 6. Fitur Search Kegiatan 🔍
<img width="606" height="321" alt="image" src="https://github.com/user-attachments/assets/fc08a8c7-6571-4b3e-bec9-21a0af5e7838" />

Saat pengguna menginputkan angka "6" pada menu, ia akan beralih menuju fitur search program ini. Fitur ini merupakan fitur pencarian kegiatan berdasarkan input yang diberikan pengguna. Jika kata kunci yang dimasukkan oleh pengguna terdapat dalam daftar kegiatan, maka output akan memunculkan nama kegiatan beserta detail informasinya.

- ketika kata kunci yang diinput pengguna tidak terdapat dalam daftar kegiatan, maka akan muncul output berupa informasi bahwa kegiatan tersebut tidak ada.

<img width="446" height="241" alt="image" src="https://github.com/user-attachments/assets/6336e987-48b6-41ad-9a63-66c82945532e" />


### 7. Keluar dari Program ❌
<img width="561" height="259" alt="image" src="https://github.com/user-attachments/assets/b8217008-e9aa-4c2f-8d26-8f14f6f0b241" />

Pengguna dapat keluar dari program dengan memasukkan angka "6" pada pilihan menu, sehingga program akan berhenti berjalan dan sesi penggunaan berakhir.







