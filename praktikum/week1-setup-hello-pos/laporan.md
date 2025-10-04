## **LAPORAN PRAKTIKUM MINGGU 1**

**Topik:** *Implementasi 3 Paradigma Pemrograman: Procedural, OOP, dan Functional*

---

### **Identitas**

* **Nama:** Rayendra Apta Nayottama
* **NIM:** 240202880
* **Kelas:** IKRA
---

### **Tujuan**

Mahasiswa memahami perbedaan konsep dan implementasi antara tiga paradigma pemrograman yaitu **procedural, object-oriented (OOP)**, dan **functional**, serta mampu mengaplikasikan ketiganya dalam pemrograman Java untuk kasus sederhana seperti pengolahan data produk.

---

### **Dasar Teori**

1. **Pemrograman Prosedural** adalah paradigma pemrograman yang berfokus pada urutan instruksi atau langkah-langkah prosedural yang dijalankan dari atas ke bawah.
2. **Pemrograman Berorientasi Objek (OOP)** menekankan konsep *class* dan *object* untuk mengelompokkan data serta perilaku ke dalam satu kesatuan.
3. **Class** merupakan cetak biru (blueprint) dari objek yang berisi atribut dan metode.
4. **Functional Programming** memanfaatkan fungsi murni dan operasi berbasis *stream* untuk mengolah data tanpa perubahan status (immutable).
5. Java mendukung ketiga paradigma tersebut sehingga fleksibel dalam berbagai gaya pemrograman.

---

### **Langkah Praktikum**

1. Membuat tiga file Java:

   * `HelloProcedural.java`
   * `HelloOOP.java`
   * `HelloFunctional.java`
2. Menulis kode untuk menampilkan daftar produk beserta harga dan menghitung total harga.
3. Melakukan *compile* dan *run* masing-masing file.
4. Melakukan *commit* ke repository Git dengan pesan:

   > `Implementasi program 3 paradigma (Procedural, OOP, Functional)`

---

### **Kode Program**

#### **1. HelloProcedural.java**

```java
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
```

#### **2. HelloOOP.java**

```java
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
```

#### **3. HelloFunctional.java**

```java
import java.util.*;
import java.util.stream.*;

public class HelloFunctional {
   public static void main(String[] args) {
      String nim = "240202880";
      String nama = "Ray";
      List<String> produk = Arrays.asList("Beras", "Pupuk", "Benih");
      List<Integer> harga = Arrays.asList(10000, 15000, 12000);

      System.out.println("Nama: " + nama + ", NIM: " + nim);
      System.out.println("Daftar Produk:");
      IntStream.range(0, produk.size())
         .forEach(i -> System.out.println("- " + produk.get(i) + ": " + harga.get(i)));
      int total = harga.stream().mapToInt(Integer::intValue).sum();
      System.out.println("Total harga semua produk: " + total);
   }
}
```

---

### **Hasil Eksekusi**

**Output dari ketiga program:**

```

*(Screenshot hasil eksekusi disertakan pada laporan asli)*
<img width="1202" height="297" alt="Cuplikan layar 2025-10-04 162912" src="https://github.com/user-attachments/assets/16050b27-0b9b-40aa-87e5-95df87a43067" />


---

### **Analisis**

* Pada **HelloProcedural**, seluruh logika ditulis dalam satu fungsi `main()` tanpa struktur objek. Program bersifat linier dan mudah dipahami.
* Pada **HelloOOP**, kode lebih terstruktur karena data produk dikemas dalam *class Produk*, menunjukkan prinsip **enkapsulasi**.
* Pada **HelloFunctional**, pendekatan *stream API* digunakan untuk mengelola data dengan gaya deklaratif, menghasilkan kode yang lebih ringkas.
* Perbedaan utama terletak pada cara berpikir: *procedural fokus pada langkah-langkah*, *OOP fokus pada objek*, dan *functional fokus pada operasi data tanpa efek samping*.
* Kendala: pada paradigma fungsional, perlu memahami konsep *lambda* dan *stream* agar tidak terjadi kesalahan sintaks. Solusinya dengan membaca dokumentasi `java.util.stream`.

---

### **Kesimpulan**

Dengan mempraktikkan tiga paradigma pemrograman (Procedural, OOP, dan Functional), mahasiswa dapat memahami bahwa satu masalah dapat diselesaikan dengan berbagai pendekatan yang berbeda.
Paradigma OOP dan Functional memberikan struktur yang lebih baik dan efisien dibanding pendekatan prosedural murni, khususnya dalam program yang lebih kompleks.

---

### **Quiz**

1. **Apa perbedaan utama antara paradigma prosedural dan OOP?**
   **Jawaban:** Paradigma prosedural berfokus pada urutan langkah-langkah instruksi, sedangkan OOP berfokus pada objek yang memiliki atribut dan perilaku.

2. **Mengapa paradigma fungsional dianggap lebih efisien pada pengolahan data kolektif?**
   **Jawaban:** Karena paradigma fungsional menggunakan operasi *stream* dan fungsi murni yang memungkinkan pemrosesan data paralel dan kode yang lebih ringkas.

3. **Sebutkan kelebihan penggunaan class dalam program Java!**
   **Jawaban:** Class memudahkan pengelompokan data dan perilaku, mendukung *reusability*, serta membuat program lebih terorganisir dan mudah dikembangkan.

---
