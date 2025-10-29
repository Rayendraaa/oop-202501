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
