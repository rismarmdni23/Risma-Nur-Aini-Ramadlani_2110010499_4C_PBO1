# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh aplikasi sederhana Penjualan Pulsa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nomor telpon dan nominal pembelian, dan memberikan output berupa informasi nama operator dari nomor seperti Telkomsel, XL DLL dan total harga pembelian pulsa yang harus dibayar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pulsa`, `PulsaDetail`, dan `PulsaBeraksi` adalah contoh dari class.

```bash
public class Pulsa {
    ...
}

public class PulsaDetail extends Pulsa {
    ...
}

public class PulsaBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pls[i] = new PulsaDetail (nomor, beli);` adalah contoh pembuatan object.

```bash
pls[i] = new PulsaDetail (nomor, beli);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nomor` dan `beli` adalah contoh atribut.

```bash
String nomor;
String beli;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pulsa` dan `PulsaDetail`.

```bash
public Pulsa(String nomor, String beli) {
    this.nomor = nomor;
    this.beli = beli;
}

public PulsaDetail(String nomor, String beli) {
    super(nomor, beli);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNomor` dan `setBeli` adalah contoh method mutator.

```bash
public void setNomor(String nomor) {
    this.nomor = nomor;
}

public void setBeli(String beli) {
    this.beli = beli;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNomor`, `getBeli`, `getNominal`, dan `getOperator` adalah contoh method accessor.

```bash
public String getNomor() {
    return nomor;
}

public String getBeli() {
    return beli;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nomor` dan `beli` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nomor;
private String beli;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PulsaDetail` mewarisi `Pulsa` dengan sintaks `extends`.

```bash
public class PulsaDetail extends Pulsa {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Pulsa` merupakan overloading method `displayInfo` dan `displayInfo` di `PulsaDetail` merupakan override dari method `displayInfo` di `Pulsa`.

```bash
public String displayInfo(String harga){
        return displayInfo() + "\nHarga: "+harga;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getOperator`.

```bash
public String getOperator(){
        String kodeOperator = getNomor().substring(0, 3);
        switch (kodeOperator){
            case "082":
                return "Telkomsel";
            case "085":
                return "Indosat";
            case "087":
                return "XL";
            case "083":
                return "AXIS";
            default:
                return "Operator Lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<pls.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nomor : ");
String nomor = scanner.nextLine();
System.out.print("Masukkan Nominal Pulsa: ");
String beli = scanner.nextLine();
System.out.println("==============================");

System.out.println("******************************");
System.out.println("             NOTA ");
System.out.println("         KONTER IMAMA   ");
System.out.println("******************************");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PulsaDetail[] pls = new PulsaDetail[2];` adalah contoh penggunaan array.

```bash
PulsaDetail[] pls = new PulsaDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
} catch (NumberFormatException e){
        System.out.println("Kesalahan Umum: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Risma Nur Aini Ramadlani
NPM: 2110010499
