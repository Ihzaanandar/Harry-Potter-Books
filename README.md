# 📚 Aplikasi Daftar Buku Harry Potter --- Pemrograman Mobile

Proyek ini merupakan implementasi aplikasi **pengambilan data API dan
menampilkan daftar buku Harry Potter** menggunakan **Kotlin** di Android
Studio.\
Data diambil dari API publik:

🔗 **https://potterapi-fedeperin.vercel.app/en/books**

Aplikasi menampilkan **cover buku, judul, dan tanggal rilis**, serta
menyediakan halaman **detail buku** yang berisi deskripsi lengkap dan
jumlah halaman (*pages*).\
Pengguna dapat mengetuk salah satu buku untuk melihat rincian
lengkapnya.

------------------------------------------------------------------------

## 🚀 Fitur Utama

-   Menampilkan daftar **buku Harry Potter** dari API eksternal.\
-   Menggunakan **Retrofit + Gson Converter** untuk konsumsi API.\
-   Setiap item buku menampilkan:
    -   Cover buku\
    -   Judul\
    -   Tanggal rilis\
-   Saat buku diketuk:
    -   Muncul **halaman detail** berisi cover besar, judul, tanggal,
        deskripsi, dan jumlah halaman.\
-   Menggunakan **RecyclerView** dan **Custom Adapter**.\
-   Menggunakan **Glide** untuk memuat gambar cover dari URL.\
-   Terdapat **header tampilan** di halaman utama dan di halaman detail.

------------------------------------------------------------------------

## 🧠 Teknologi yang Digunakan

-   **Android Studio** --- IDE pengembangan.\
-   **Kotlin** --- bahasa pemrograman utama.\
-   **XML Layout** --- untuk membangun UI.\
-   **RecyclerView** --- menampilkan list buku.\
-   **Adapter & ViewHolder** --- mengatur data dan tampilan.\
-   **Retrofit2** --- mengambil data API.\
-   **Gson Converter** --- menerjemahkan JSON ke objek Kotlin.\
-   **Glide** --- memuat gambar cover buku.\
-   **Intent** --- mengirim data antar Activity (ke halaman detail).\
-   **ScrollView** --- untuk halaman detail buku.

------------------------------------------------------------------------

## 📦 Struktur Berkas Utama

  -----------------------------------------------------------------------
  File                           Fungsi
  ------------------------------ ----------------------------------------
  `ApiService.kt`                Menangani endpoint API (`/books`).

  `Book.kt`                      Data class untuk menampung struktur data
                                 dari API.

  `BookAdapter.kt`               Adapter RecyclerView untuk menampilkan
                                 daftar buku.

  `MainActivity.kt`              Mengambil data API & menampilkan list ke
                                 RecyclerView.

  `DetailActivity.kt`            Menampilkan detail buku yang dipilih.

  `activity_main.xml`            Layout halaman utama + Header +
                                 RecyclerView.

  `item_book.xml`                Layout tampilan tiap buku di list.

  `activity_detail.xml`          Layout halaman rincian buku.
  -----------------------------------------------------------------------

------------------------------------------------------------------------

## ⚙️ Dependensi Utama (build.gradle)

-   Retrofit\
-   Gson Converter\
-   RecyclerView\
-   OkHttp Logging Interceptor\
-   Glide

Semua dependensi telah terpasang agar aplikasi berjalan lancar.

------------------------------------------------------------------------

## 👤 Identitas Pengembang

-   **Nama:** Ihza Ananda Rachman\
-   **NIM:** 2300018284\
-   **Slot:** Kamis, 08:30--10:00\
-   **Praktikum:** Pemrograman Mobile

------------------------------------------------------------------------

## 📄 Lisensi

Proyek ini dibuat untuk keperluan **Posttest Pemrograman Mobile** dan
bersifat akademik.\
Dilarang memperbanyak, menyalin, atau menggunakan kode tanpa izin dari
pemilik repositori.
