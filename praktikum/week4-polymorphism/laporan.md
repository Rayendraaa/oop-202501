# Laporan Praktikum Minggu 4 
Topik: polymorphism

## Identitas
- Nama  : Rayendra Apta Nayottama
- NIM   : 240202880
- Kelas : 3IKRA

---

## Tujuan
Mahasiswa memahami konsep polymorphism dalam pemrograman berorientasi objek, serta mampu mengimplementasikan method overriding dan method overloading dalam Java untuk menciptakan fleksibilitas pada kode program.

---

## Dasar Teori
Polymorphism adalah kemampuan suatu objek untuk memiliki banyak bentuk (bisa merujuk ke berbagai class dengan cara yang sama).
Dalam Java, polymorphism dibagi menjadi dua jenis:
Compile-time polymorphism (method overloading).
Runtime polymorphism (method overriding).
Method Overloading terjadi ketika dua atau lebih method memiliki nama yang sama tetapi parameter berbeda.
Method Overriding terjadi ketika subclass mendefinisikan kembali method yang sudah ada pada superclass.
Polymorphism membuat program lebih fleksibel, efisien, dan mudah dikembangkan tanpa mengubah banyak kode.

---

## Langkah Praktikum
Membuka IDE (misalnya IntelliJ IDEA / NetBeans / VS Code).

Membuat package baru dengan nama com.upb.polymorphism.

Membuat tiga class:

Hewan (superclass)

Kucing (subclass)

Anjing (subclass)

Mengimplementasikan method overriding pada subclass.

Membuat class Main untuk menjalankan program dan menampilkan hasil polymorphism.

Melakukan commit dengan pesan:
"Implementasi Polymorphism: Method Overriding Hewan-Kucing-Anjing"

---

## Kode Program
(Tuliskan kode utama yang dibuat, contoh:  

```java
package com.upb.agripos;

import com.upb.agripos.model.*;
import com.upb.agripos.util.CreditBy;

public class MainPolymorphism {
    public static void main(String[] args) {
        Produk[] daftarProduk = {
            new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64"),
            new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea"),
            new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja")
        };

        for (Produk p : daftarProduk) {
            System.out.println(p.getInfo()); // Dynamic Binding
        }

        System.out.println("\nDemonstrasi Overloading:");
        Produk p1 = new Produk("PRD-001", "Produk Umum", 10000, 5);
        p1.tambahStok(10);
        p1.tambahStok(2.5);
        System.out.println(p1.getInfo());

        CreditBy.print("240202880", "Rayendra Apta Nayottama");
    }
}

```
)
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
<img width="1920" height="1200" alt="Screenshot (6)" src="https://github.com/user-attachments/assets/871724ce-17ad-47f2-a858-bfddedc8d2cc" />

---

## Analisis
Program menunjukkan bahwa objek Hewan, Kucing, dan Anjing semuanya dapat dipanggil melalui referensi Hewan, tetapi menghasilkan perilaku berbeda karena method overriding.

Dibanding minggu sebelumnya (enkapsulasi dan inheritance), minggu ini fokus pada bagaimana kelas turunan dapat berperilaku berbeda meskipun memiliki method dengan nama yang sama.

Kendala yang sempat dihadapi: lupa menambahkan anotasi @Override sehingga method tidak dijalankan dengan benar. Solusi: memastikan method memiliki tanda tangan (nama dan parameter) yang sama dengan superclass.
---

## Kesimpulan
Dengan menerapkan polymorphism, program menjadi lebih dinamis dan fleksibel. Objek dapat diperlakukan secara umum (melalui superclass) namun tetap berperilaku spesifik sesuai class-nya masing-masing. Konsep ini sangat berguna dalam desain program yang modular dan mudah diperluas.

---

## Quiz
Apa yang dimaksud dengan polymorphism dalam OOP?
Jawaban: Polymorphism adalah kemampuan objek untuk mengambil berbagai bentuk, di mana method yang sama dapat menunjukkan perilaku berbeda tergantung objek yang memanggilnya.

Sebutkan dua jenis polymorphism dalam Java!
Jawaban:

Compile-time polymorphism (method overloading)

Runtime polymorphism (method overriding)

Apa manfaat polymorphism dalam pemrograman?
Jawaban:
Polymorphism membuat kode lebih fleksibel, mudah diperluas, dan memudahkan pemeliharaan program karena dapat mengubah perilaku objek tanpa mengubah struktur dasarnya.
