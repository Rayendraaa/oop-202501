# **Laporan Praktikum Minggu 1**

**Topik:** *Class dan Object pada Java*

---

## **Identitas**

* **Nama:** Rayendra Apta Nayottama
* **NIM:** 240202880
* **Kelas:** 3IKRA

---

## **Tujuan**

* Mahasiswa memahami konsep **class** dan **object** dalam pemrograman berorientasi objek (OOP).
* Mahasiswa mampu membuat class dengan atribut dan method menggunakan **enkapsulasi**.
* Mahasiswa dapat mengimplementasikan class `Produk` yang merepresentasikan produk pertanian dengan operasi tambah dan kurangi stok.

---

## **Dasar Teori**

1. **Class** adalah blueprint atau template dari objek yang berisi atribut dan method.
2. **Object** adalah instansiasi dari class yang memiliki data dan perilaku.
3. **Atribut (field)** digunakan untuk menyimpan data atau properti dari objek.
4. **Method** adalah fungsi atau perilaku yang dimiliki oleh objek.
5. **Enkapsulasi** melindungi data agar tidak dapat diakses langsung dari luar class dengan menggunakan modifier `private` dan `public getter/setter`.

---

## **Langkah Praktikum**

1. Membuat package dengan nama `com.upb.agripos.model`.
2. Membuat class baru bernama `Produk.java` di dalam package tersebut.
3. Menambahkan atribut `kode`, `nama`, `harga`, dan `stok` dengan modifier `private`.
4. Menambahkan constructor untuk menginisialisasi nilai atribut.
5. Menambahkan method `get` dan `set` untuk setiap atribut.
6. Membuat method `tambahStok(int jumlah)` dan `kurangiStok(int jumlah)` untuk memodifikasi stok produk.
7. Melakukan **kompilasi dan eksekusi program** untuk memastikan tidak ada error.
8. Commit dengan pesan:

   > "Menambahkan class Produk dengan enkapsulasi dan method pengelolaan stok."

---

## **Kode Program**

```java
package com.upb.agripos.model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}
```

Contoh penggunaan class `Produk`:

```java
public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("BNH-001", "Benih Padi", 25000, 100);
        System.out.println("Nama Produk: " + p1.getNama());
        System.out.println("Stok Awal: " + p1.getStok());
        
        p1.tambahStok(20);
        System.out.println("Stok Setelah Ditambah: " + p1.getStok());
        
        p1.kurangiStok(50);
        System.out.println("Stok Setelah Dikurangi: " + p1.getStok());
    }
}
```

---

## **Hasil Eksekusi**

```
Nama Produk: Benih Padi
Stok Awal: 100
Stok Setelah Ditambah: 120
Stok Setelah Dikurangi: 70
```

<img width="737" height="319" alt="Cuplikan layar 2025-10-12 141939" src="https://github.com/user-attachments/assets/bfac52c6-8ba5-4c8a-a6cc-3622bf07e6de" />


---

## **Analisis**

* Program di atas menunjukkan implementasi **enkapsulasi** dengan penggunaan atribut `private` dan method `getter` serta `setter` untuk mengakses data.
* Method `tambahStok()` dan `kurangiStok()` memungkinkan manipulasi data dengan cara yang aman.
* Jika stok kurang dari jumlah yang ingin dikurangi, sistem menampilkan pesan “Stok tidak mencukupi!”.
* Dibandingkan dengan minggu sebelumnya (misalnya hanya penggunaan variabel sederhana), pendekatan OOP lebih **terstruktur**, **modular**, dan **mudah dikembangkan**.

---

## **Kesimpulan**

Dengan menggunakan konsep **class** dan **object**, program menjadi lebih mudah dipahami dan dikelola.
Enkapsulasi melindungi data dari akses langsung yang tidak aman, serta membantu menjaga integritas data produk dalam sistem agribisnis.

---

## **Quiz**

1. **Apa itu Class dalam Java?**
   **Jawaban:** Class adalah blueprint atau cetak biru dari objek yang berisi atribut dan method.

2. **Apa manfaat enkapsulasi dalam pemrograman OOP?**
   **Jawaban:** Enkapsulasi melindungi data agar tidak diakses langsung dari luar class dan menjaga konsistensi data.

3. **Apa yang terjadi jika stok dikurangi melebihi jumlah yang tersedia?**
   **Jawaban:** Program akan menampilkan pesan “Stok tidak mencukupi!” tanpa mengubah nilai stok.
