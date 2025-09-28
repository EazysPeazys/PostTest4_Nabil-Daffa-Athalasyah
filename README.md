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
**(Saham)**

**Input:**

<img width="664" height="518" alt="Screenshot 2025-09-28 191701" src="https://github.com/user-attachments/assets/55b69c8d-1d50-4878-b5d2-93e4f6cad583" />

**Output:**

<img width="631" height="555" alt="Screenshot 2025-09-28 182446" src="https://github.com/user-attachments/assets/3ccfbcd4-2c4b-4e2c-ba50-f1ff72a6174e" />
<img width="628" height="539" alt="Screenshot 2025-09-28 181447" src="https://github.com/user-attachments/assets/a5059483-311c-4ca2-9e5c-0b4c67801797" />

Pada class abstract Saham yang merupakan turunan dari AsetInvestasi, didefinisikan atribut tambahan perusahaan untuk menyimpan nama perusahaan penerbit saham. Konstruktor Saham digunakan untuk menginisialisasi nama aset, nilai aset, dan nama perusahaan. Method infoAset() yang di-override digunakan untuk menampilkan informasi lengkap mengenai saham tersebut, seperti jenis aset, nama aset, nilai aset, dan nama perusahaan. Pada saat program dijalankan, pengguna memilih menu pencarian aset berdasarkan nama atau nilai. Setelah pengguna memasukkan data pencarian (misalnya nilai 5000000 atau nama “BBNI”), program menemukan objek saham yang sesuai lalu memanggil infoAset() sehingga dihasilkan output berupa: “Ini merupakan Aset Saham” diikuti detail nama aset, nilai aset, dan perusahaan seperti yang tampil pada output program.

**(Obligasi)**
**Input:**

<img width="641" height="522" alt="Screenshot 2025-09-28 191648" src="https://github.com/user-attachments/assets/7639cc52-66bb-49e5-9e28-24e6b7be9d8b" />

**Output:**

<img width="643" height="568" alt="Screenshot 2025-09-28 183524" src="https://github.com/user-attachments/assets/5c31716b-ea0b-4e28-878c-a391310f4963" />
<img width="617" height="560" alt="Screenshot 2025-09-28 182507" src="https://github.com/user-attachments/assets/86041e99-3bc9-4a31-a32f-0b3e717fedfa" />

Pada class abstract Obligasi yang merupakan turunan dari AsetInvestasi, didefinisikan atribut tambahan bunga untuk menyimpan besar bunga obligasi. Konstruktor Obligasi digunakan untuk menginisialisasi nama aset, nilai aset, dan besaran bunga. Method infoAset() yang di-override digunakan untuk menampilkan informasi lengkap mengenai obligasi tersebut, seperti jenis aset, nama aset, nilai aset, dan bunga. Pada saat program dijalankan, pengguna memilih menu pencarian aset berdasarkan nama atau nilai. Setelah pengguna memasukkan data pencarian (misalnya nama “SBN75” atau nilai 4500000), program menemukan objek obligasi yang sesuai lalu memanggil infoAset() sehingga dihasilkan output berupa: “Ini merupakan Aset Obligasi” diikuti detail nama aset, nilai aset, dan bunga seperti yang tampil pada output program.

## Interface
<img width="385" height="209" alt="Screenshot 2025-09-28 181018" src="https://github.com/user-attachments/assets/ae837d74-75d2-42ff-b644-a509f0beb9db" />

Interface Transaksi adalah sebuah antarmuka yang berfungsi sebagai kontrak atau standar untuk proses transaksi jual beli pada aset. Di dalam interface ini terdapat dua method, yaitu beli(double jumlah) dan jual(double jumlah). Method beli() digunakan untuk mendefinisikan perilaku pembelian aset dalam jumlah tertentu, sedangkan method jual() digunakan untuk mendefinisikan perilaku penjualan aset dalam jumlah tertentu. Penerapan interface Transaksi memastikan bahwa setiap kelas yang berhubungan dengan transaksi (contohnya Saham dan Obligasi) mengimplementasikan kedua metode yang ditetapkan sesuai kebutuhan. Hal ini menjadikan sistem lebih rapi, konsisten, dan mudah diperluas karena meskipun mengikuti standar yang sama, setiap kelas dapat mengatur sendiri mekanisme pembelian dan penjualannya.

## Polymorphism (Overloading & Overriding):
**(Overloading)**

**1. Saham:**

<img width="1080" height="250" alt="Screenshot 2025-09-28 181204" src="https://github.com/user-attachments/assets/02a07d0c-15a3-4a47-b187-960e0c842839" />

Pada Overloading di Class Saham Method infoAset(String keterangan) digunakan untuk menampilkan informasi saham berupa nama saham dan nama perusahaan yang menerbitkan saham tersebut dengan tambahan keterangan tertentu. Sedangkan method infoAset(int jumlahLot) digunakan untuk menampilkan nama saham, perusahaan, serta jumlah lot saham yang dimiliki sesuai input pengguna. Dengan cara ini, pengguna dapat melihat informasi saham yang lebih fleksibel: apakah ingin menambahkan keterangan khusus atau menampilkan jumlah lot yang dimiliki.

**2. Obligasi:**

<img width="1133" height="274" alt="Screenshot 2025-09-28 181219" src="https://github.com/user-attachments/assets/f1e153a8-6845-4ed9-bba1-7af5bc4e35a5" />

Pada Overloading di Class Obligasi Method infoAset(String keterangan) digunakan untuk menampilkan informasi nama obligasi disertai keterangan tambahan yang diinginkan pengguna. Sedangkan method infoAset(double tambahanNilai) digunakan untuk menampilkan nama obligasi dengan nilai aset yang sudah ditambahkan nilai tambahan tertentu. Dengan cara ini, pengguna dapat memilih apakah ingin melihat obligasi dengan keterangan tertentu atau dengan nilai aset yang sudah ditambah, tanpa mengganggu method infoAset() utama yang ada di superclass-nya.

**(Override)**

**1. Saham:**

<img width="800" height="177" alt="Screenshot 2025-09-28 181139" src="https://github.com/user-attachments/assets/035834ca-dbd7-4c4d-ad03-776912c729b0" />

Pada class Saham, method infoAset() yang di-override digunakan untuk menampilkan detail lengkap tentang aset saham. Method ini akan mencetak keterangan bahwa data tersebut merupakan aset saham, kemudian menampilkan nama aset (nama saham), nilai aset (harga total saham yang dimiliki), dan nama perusahaan penerbit saham tersebut. Dengan begitu, method ini menyajikan informasi spesifik tentang saham yang dimiliki secara lengkap.

**2. Obligasi:**

<img width="798" height="182" alt="Screenshot 2025-09-28 181120" src="https://github.com/user-attachments/assets/c2946b55-e2b6-440c-ab1f-5ba83a75645f" />

Pada class Obligasi, method infoAset() yang di-override digunakan untuk menampilkan detail lengkap tentang aset obligasi. Method ini akan mencetak keterangan bahwa data tersebut merupakan aset obligasi, kemudian menampilkan nama aset (nama obligasi), nilai aset (nilai investasi obligasi), dan tingkat bunga yang berlaku pada obligasi tersebut. Dengan begitu, method ini menyajikan informasi spesifik tentang obligasi yang dimiliki secara lengkap.
