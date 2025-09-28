# LAPORAN POST-TEST 4 PEMROGRAMAN BERORIENTASI OBJEK (MANAJEMEN DATA ASET INVESTASI)

**Nama: Nabil Daffa Athalasyah
NIM: 2409116090
Kelas: C 2024**

## (Lanjutan POSTTEST 3 ==> POSTTEST 4)

# A. GAMBAR FULL INPUT CODINGAN JAVA
<img width="376" height="398" alt="image" src="https://github.com/user-attachments/assets/8aeaa069-ffb5-4968-9d7c-0e41cab58024" />

## Abstraction (Abstract Class):
**(Saham):**

<img width="1143" height="881" alt="Screenshot 2025-09-28 180952" src="https://github.com/user-attachments/assets/0e809591-c3a9-48ac-a634-da729462333c" />

**(Obligasi):**

<img width="1184" height="882" alt="Screenshot 2025-09-28 180936" src="https://github.com/user-attachments/assets/2fc0f653-8182-41d3-a3ad-afdb40dae7c6" />

## Interface:
**(Package Interface):**

<img width="396" height="45" alt="Screenshot 2025-09-28 181032" src="https://github.com/user-attachments/assets/3eaeb1a0-6a60-4ce4-be51-e99ac81cdd7b" />

**(Transaksi Interface)**

<img width="385" height="209" alt="Screenshot 2025-09-28 181018" src="https://github.com/user-attachments/assets/ace774a1-6e9b-4591-95a4-ee93a86ebae3" />

## Polymorphism ( 1 Overloading & 1 Overriding):
**(Saham):**

**1. Override**

<img width="800" height="177" alt="Screenshot 2025-09-28 181139" src="https://github.com/user-attachments/assets/73c14fe8-3891-44b4-a129-fd2e21115f91" />

**2. Overloading**

<img width="1082" height="251" alt="image" src="https://github.com/user-attachments/assets/91b1bac2-7a69-4fd5-80c6-1354c4af4918" />

**(Obligasi):**

**1. Override**

<img width="798" height="182" alt="Screenshot 2025-09-28 181120" src="https://github.com/user-attachments/assets/a25a7467-1e74-497e-9282-b0db52efe54a" />

**2. Overloading**

<img width="1133" height="274" alt="Screenshot 2025-09-28 181219" src="https://github.com/user-attachments/assets/a12e4dc1-8e6d-4ac0-90eb-f2e49d8c478d" />

# B. GAMBAR FULL OUTPUT CODINGAN JAVA
**(Saham):**

<img width="628" height="539" alt="Screenshot 2025-09-28 181447" src="https://github.com/user-attachments/assets/fdff4527-2e2e-403d-b194-1a783dbea13e" />
<img width="631" height="555" alt="Screenshot 2025-09-28 182446" src="https://github.com/user-attachments/assets/80aa4890-dd34-4fe0-a5b4-48afe5074e6c" />

**(Obligasi):**

<img width="643" height="568" alt="Screenshot 2025-09-28 183524" src="https://github.com/user-attachments/assets/dd898e9c-fa7f-4361-a407-16ed087ad70e" />
<img width="617" height="560" alt="Screenshot 2025-09-28 182507" src="https://github.com/user-attachments/assets/a53692c1-2006-4c76-b459-88da34b7357a" />

# C. PENJELASAN INPUT
## Abstraction (Abstract Class):
<img width="1184" height="882" alt="Screenshot 2025-09-28 180936" src="https://github.com/user-attachments/assets/4c5bfb6a-93cb-4718-bada-4fbbd01ce635" />

Pada abstract class Obligasi, terdapat atribut tambahan berupa bunga yang menunjukkan tingkat bunga obligasi. Class ini mengoverride method infoAset() untuk menampilkan detail aset obligasi, serta menerapkan overloading pada method yang sama dengan parameter berbeda sehingga informasi dapat ditampilkan lebih fleksibel.

<img width="1143" height="881" alt="Screenshot 2025-09-28 180952" src="https://github.com/user-attachments/assets/db62acdf-15c6-4ec4-8063-fd8353563a23" />

Dan pada abstract class Saham, terdapat atribut tambahan berupa perusahaan yang menunjukkan nama penerbit saham. Class ini juga mengoverride method infoAset() untuk menampilkan detail saham, dan menyediakan overloading pada method tersebut agar informasi saham dapat ditampilkan dengan tambahan keterangan atau jumlah lot.

## Polymorphism (Overloading & Overriding):
**(Overloading)**

<img width="628" height="539" alt="Screenshot 2025-09-28 181447" src="https://github.com/user-attachments/assets/715e2466-04bf-43d2-82c3-c70c3028c593" />

<img width="631" height="555" alt="Screenshot 2025-09-28 182446" src="https://github.com/user-attachments/assets/039d549f-fe27-4eba-a511-4e0485bdc1b0" />
Polymorphism dengan overloading di kelas Saham berarti kita membuat beberapa metode dengan nama yang sama, misalnya infoAset(), tetapi dibedakan berdasarkan parameter yang dimilikinya. Tujuannya agar satu nama metode bisa digunakan dalam berbagai situasi sesuai kebutuhan.
