# Laporan Praktikum Minggu 3 
Topik: inheritance

## Identitas
- Nama  : Rayendra Apta Nayottama
- NIM   : 240202880
- Kelas : 3IKRA

---

## Tujuan
Mahasiswa memahami dan mampu menerapkan konsep inheritance (pewarisan) dalam pemrograman berorientasi objek menggunakan bahasa Java, sehingga dapat membuat class turunan yang mewarisi atribut dan method dari class induk.

Dasar Teori

---

## Dasar Teori
Dasar Teori
Inheritance adalah mekanisme di mana suatu class dapat mewarisi atribut dan method dari class lain.
Class yang diwarisi disebut superclass (parent class), sedangkan class yang mewarisi disebut subclass (child class).
Inheritance digunakan untuk mengurangi duplikasi kode dan memperluas fungsionalitas class.
Keyword extends digunakan dalam Java untuk menunjukkan hubungan pewarisan.
Subclass dapat menambahkan atribut/method baru atau meng-override method dari superclass.

---

## Langkah Praktikum
Membuka proyek Java yang sudah dibuat pada minggu sebelumnya.
Membuat class induk bernama Produk dengan atribut dasar seperti kode, nama, harga, dan stok.
Membuat class turunan ProdukMakanan dan ProdukElektronik yang mewarisi class Produk.
Menambahkan atribut tambahan pada masing-masing subclass, misalnya tanggalKadaluarsa pada ProdukMakanan, dan garansi pada ProdukElektronik.
Menjalankan program utama (Main.java) untuk menampilkan data produk menggunakan inheritance.
Melakukan commit dengan pesan:
"Menambahkan implementasi inheritance pada class Produk"
---

## Kode Program
(Tuliskan kode utama yang dibuat, contoh:  

```java
package com.upb.agripos;

import com.upb.agripos.model.*;
import com.upb.agripos.util.CreditBy;

public class MainInheritance {
    public static void main(String[] args) {
        Benih benih = new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64");
        Pupuk pupuk = new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea");
        AlatPertanian alat = new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja");

        System.out.println(benih.deskripsi());
        System.out.println(pupuk.deskripsi());
        System.out.println(alat.deskripsi());

        CreditBy.print("240202880", "Rayendra Apta Nayottama");
    }
}

```
)
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
<img width="1920" height="1200" alt="Screenshot (4)" src="https://github.com/user-attachments/assets/8682a559-db94-45ac-86b9-2aee45fd9386" />

---

## Analisis
Program menggunakan konsep inheritance di mana ProdukMakanan dan ProdukElektronik mewarisi atribut dan method dari class Produk.
Subclass dapat menambahkan atribut baru dan meng-override method tampilkanInfo() agar menampilkan informasi tambahan sesuai jenis produk.
Dibanding minggu sebelumnya (enkapsulasi), kali ini program lebih efisien karena tidak perlu menulis ulang atribut yang sama di setiap class.
Kendala yang muncul adalah ketika lupa menulis super() di konstruktor subclass, menyebabkan error saat kompilasi. Setelah menambahkan super(), program berjalan lancar.
---

## Kesimpulan
Dengan menggunakan konsep inheritance, kode program menjadi lebih efisien dan terstruktur. Class turunan dapat memanfaatkan fitur dari class induk tanpa harus menulis ulang kode yang sama, sehingga memudahkan proses pengembangan dan pemeliharaan aplikasi.
---

## Quiz
Apa yang dimaksud dengan inheritance dalam pemrograman berorientasi objek?
Jawaban: Inheritance adalah konsep pewarisan di mana sebuah class (subclass) dapat mewarisi atribut dan method dari class lain (superclass).

Apa perbedaan antara override dan overload dalam Java?
Jawaban: Override terjadi ketika subclass mendefinisikan ulang method dari superclass dengan nama dan parameter yang sama, sedangkan overload terjadi ketika ada beberapa method dengan nama sama namun parameter berbeda.

Mengapa inheritance dianggap penting dalam OOP?
Jawaban: Karena inheritance memungkinkan reusability kode, meminimalkan duplikasi, dan membuat sistem lebih mudah dikembangkan.
