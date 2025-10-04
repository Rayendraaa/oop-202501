# Laporan Praktikum Minggu 1
Topik: Implementasi 3 Paradigma Pemrograman: Procedural, OOP, dan Functional

## Identitas
- Nama: Ray
- NIM: 240202880
- Kelas: 3IKRA

---

## Tujuan
Mahasiswa memahami perbedaan konsep dan implementasi antara tiga paradigma pemrograman yaitu procedural, object-oriented (OOP), dan functional, serta mampu mengaplikasikan ketiganya dalam pemrograman Java untuk kasus sederhana seperti pengolahan data produk.
---

## Dasar Teori
1. Pemrograman Prosedural adalah paradigma pemrograman yang berfokus pada urutan instruksi atau langkah-langkah prosedural yang dijalankan dari atas ke bawah.
2. Pemrograman Berorientasi Objek (OOP) menekankan konsep class dan object untuk mengelompokkan data serta perilaku ke dalam satu kesatuan.
3. Class merupakan cetak biru (blueprint) dari objek yang berisi atribut dan metode.
4. Functional Programming memanfaatkan fungsi murni dan operasi berbasis stream untuk mengolah data tanpa perubahan status (immutable).
5. Java mendukung ketiga paradigma tersebut sehingga fleksibel dalam berbagai gaya pemrograman.
---

## Langkah Praktikum
(Tuliskan Langkah-langkah dalam prakrikum, contoh:
1. Membuat tiga file Java:
   - HelloProcedural.java
   - HelloOOP.java
   - HelloFunctional.java
2. Menulis kode untuk menampilkan daftar produk beserta harga dan menghitung total harga.
3. Melakukan compile dan run masing-masing file.
   
---

## Kode Program  

```HelloProsedural.java
public class HelloProcedural {
   public static void main(String[] args) {
      String nim = "240202880";
      String nama = "Ray";
      String[] produk = {"Beras", "Pupuk", "Benih"};
      int[] harga = {10000, 15000, 12000};
      int total = 0;

      System.out.println("Nama: " + nama + ", NIM: " + nim);
      System.out.println("Daftar Produk:");
      for (int i = 0; i < produk.length; i++) {
         System.out.println("- " + produk[i] + ": " + harga[i]);
         total += harga[i];
      }
      System.out.println("Total harga semua produk: " + total);
   }
}

```HelloOOP.java
class Produk {
   String nama;
   int harga;
   Produk(String nama, int harga) {
      this.nama = nama;
      this.harga = harga;
   }
}

public class HelloOOP { 
   public static void main(String[] args) {
      String nim = "240202880";
      String namaMhs = "Ray";
      Produk[] daftar = {
         new Produk("Beras", 10000),
         new Produk("Pupuk", 15000),
         new Produk("Benih", 12000)
      }; 
      int total = 0;

      System.out.println("Nama: " + namaMhs + ", NIM: " + nim);
      System.out.println("Daftar Produk:");
      for (Produk p : daftar) {
         System.out.println("- " + p.nama + ": " + p.harga);
         total += p.harga;
      }
      System.out.println("Total harga semua produk: " + total);
   }
}



)
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
(
- Jelaskan bagaimana kode berjalan.  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
- Kendala yang dihadapi dan cara mengatasinya.  
)
---

## Kesimpulan
(Tuliskan kesimpulan dari praktikum minggu ini.  
Contoh: *Dengan menggunakan class dan object, program menjadi lebih terstruktur dan mudah dikembangkan.*)

---

## Quiz
(1. [Tuliskan kembali pertanyaan 1 dari panduan]  
   **Jawaban:** …  

2. [Tuliskan kembali pertanyaan 2 dari panduan]  
   **Jawaban:** …  

3. [Tuliskan kembali pertanyaan 3 dari panduan]  
   **Jawaban:** …  )
