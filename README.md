# Navigation List
- [Module 5](#module-5)

## Module 5
# ---Reflection 1---
### Lampiran Gambar Hasil Uji Performance Testing dengan Jmeter Test Plan dan Intellij IntelliJ Profiler

Hasil uji performance testing dengan endpoint /all-student-name:
![Screenshot 2025-03-11 112917](https://github.com/user-attachments/assets/b102ed20-ca85-408c-8c58-bec7771c4877)

Hasil uji performance testing dengan endpoint /highest-gpa:
![Screenshot 2025-03-11 113930](https://github.com/user-attachments/assets/80b75d51-4131-4da5-9273-1f73213902b9)

Hasil uji performance testingdengan endpoint /all-student-name via the command line:
![image](https://github.com/user-attachments/assets/7c9558dc-e8b0-4af7-9c81-530bc0e8a895)

Hasil uji performance testing dengan endpoint /highest-gpa via the command line:
![image](https://github.com/user-attachments/assets/8c991836-2815-4554-89ad-46c152267459)

(Before Optimization) Hasil uji performance testing dengan endpoint /all-student via IntelliJ Profiler: 
![image](https://github.com/user-attachments/assets/f95fc07a-af2e-44ce-9687-5595ad44c21d)

(After Optimization) Hasil uji performance testing dengan endpoint /all-student via IntelliJ Profiler: 
![image](https://github.com/user-attachments/assets/021d6543-d8df-486e-ae24-f37d58868e4d)

(Before Optimization) Hasil uji performance testing dengan endpoint /highest-gpa via IntelliJ Profiler: 
![image](https://github.com/user-attachments/assets/21b88475-bb03-4a9e-a83e-edf1435cc4f8)

(After Optimization) Hasil uji performance testing dengan endpoint /highest-gpa via IntelliJ Profiler:
![image](https://github.com/user-attachments/assets/5c5a7b2a-4706-4f76-8b3a-bea624c0d156)

(Before Optimization) Hasil uji performance testing dengan endpoint /all-student-name via IntelliJ Profiler: 
![image](https://github.com/user-attachments/assets/8af18896-63e1-4a35-a350-6bd5ac26ad84)

(After Optimization) Hasil uji performance testing dengan endpoint /all-student-name via IntelliJ Profiler: 
![image](https://github.com/user-attachments/assets/81dd56ae-b7e4-4935-a76c-d1291011e7a8)

### 1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?

Ketika saya menggunakan JMeter, saya ingin menguji seberapa tangguh aplikasi yang saya buat saat dihadapkan pada beban yang besar. Coba bayangkan saya sedang mensimulasikan banyak pengguna yang masuk secara bersamaan, mengirim permintaan (request) ke server, dan mencoba mengukur berapa lama respons yang diterima. Melalui JMeter, saya bisa membuat test plan yang menggambarkan skenario riil, misalnya ada 1000 pengguna yang masuk bersamaan dan melakukan tindakan tertentu di aplikasi. Hasilnya, saya mendapatkan metrik seperti response time, throughput, dan seberapa stabil aplikasi saat beban meningkat. Dari situ, saya bisa menyimpulkan apakah aplikasi saya masih cepat merespons atau justru kewalahan di titik tertentu.

Namun, jika saya hanya mengandalkan JMeter, saya memang tahu aplikasi saya mulai lambat saat ada banyak pengguna, tapi saya belum tahu bagian mana di dalam kode yang menyebabkan kelambatan. Nah, di sinilah IntelliJ Profiler membantu.
Ketika saya menggunakan IntelliJ Profiler, saya menjalankan aplikasi saya sambil memantau apa yang terjadi “di dalamnya”. Profiler ini menunjukkan metode mana yang paling sering dipanggil, berapa lama waktu eksekusinya, dan berapa banyak memori yang dipakai. Bahkan, saya bisa melihat call tree, yaitu urutan pemanggilan metode secara detail. Misalnya, kalau ada satu metode yang memakan 80% waktu eksekusi, maka saya langsung tahu bahwa metode itu adalah bottleneck yang harus saya optimasi.

Selain itu, IntelliJ Profiler juga menampilkan data hotspots—bagian-bagian kode yang paling banyak menghabiskan sumber daya. Jadi, alih-alih menebak-nebak atau membabi buta mencari sumber masalah, saya bisa fokus langsung pada titik lemah yang sudah ditunjukkan oleh profiler.

Setelah itu, biasanya saya kembali lagi ke JMeter, memperbarui skenario uji beban saya, dan menguji ulang aplikasi yang sudah dioptimasi. Dengan begitu, saya dapat melihat apakah perubahan kode yang saya lakukan benar-benar memperbaiki performa di level end-to-end.


### 2. How does the profiling process help you in identifying and understanding the weak points in your application?

Ketika saya melakukan profiling pada aplikasi, rasanya seperti saya sedang membongkar mesin mobil dan melihat setiap komponen di dalamnya. Sebelum saya melakukan profiling, saya hanya tahu kalau aplikasi saya “terasa” lambat di beberapa bagian, tapi saya tidak punya gambaran jelas di mana letak masalahnya.

Setelah menyalakan profiler, saya bisa melihat metode-metode mana yang paling sering dieksekusi dan berapa lama waktu yang mereka habiskan. Misalnya, tiba-tiba saya melihat ada satu metode yang ternyata menghabiskan 40% waktu eksekusi keseluruhan. Nah, ini seperti menemukan “mesin yang aus” di dalam mobil, dengan begitu saya tahu di mana masalahnya dan saya bisa fokus memperbaikinya.

Selain itu, profiler juga menampilkan call tree, yaitu urutan pemanggilan metode yang terjadi di balik layar. Dari sana, saya bisa menelusuri alur eksekusi aplikasi. Misalnya, saya melihat metode A memanggil metode B, lalu metode B memanggil metode C, dan ternyata metode C itulah yang memakan waktu paling banyak. Dengan informasi ini, saya jadi benar-benar memahami struktur dan arus logika di dalam aplikasi saya, bukan hanya sekadar menebak-nebak.


### 3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?

Tentu saja, menurut saya IntelliJ Profiler sangat efektif dalam membantu menganalisis dan menemukan bottleneck pada kode aplikasi. Saat saya menjalankan aplikasi di IntelliJ dan mengaktifkan profiler, seolah-olah saya mendapat peta jalur eksekusi yang menuntun saya langsung ke bagian kode mana yang paling banyak memakan waktu atau memori.

Bayangkan seperti saya sedang menyusuri sebuah labirin besar: tanpa petunjuk, saya harus mencoba-coba setiap jalan yang ada dan mungkin terjebak di jalan buntu. Namun dengan IntelliJ Profiler, saya memiliki kompas yang memberi tahu di mana jalan buntu dan di mana jalur utama. Dalam konteks aplikasi, profiler memperlihatkan metode-metode yang paling berat, menampilkan grafik penggunaan CPU, serta memudahkan saya untuk melompat ke baris kode sumber yang bermasalah.

Setelah melihat hasil profiling, saya langsung bisa mengambil tindakan—misalnya, mengoptimasi loop yang berulang terlalu banyak, memperbaiki query database yang kurang efisien, atau mengubah struktur data yang boros memori. Dengan begitu, waktu yang saya habiskan untuk trial and error jadi jauh berkurang.

Selain itu, Integrasi IntelliJ Profiler dengan IDE membuat proses ini terasa alami dan mulus. Begitu saya selesai menganalisis laporan profiler, saya bisa langsung mengedit kode di tempat yang sama, lalu menjalankan ulang aplikasi untuk melihat apakah performanya sudah membaik.


### 4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?

Ketika saya melakukan performance testing dan profiling, ada beberapa tantangan utama yang sering saya hadapi:

a. Menentukan Skenario Uji yang Realistis
Tantangannya adalah bagaimana memastikan skenario uji beban (load test) benar-benar mewakili kondisi di dunia nyata.
Solusi: Saya mencoba menganalisis pola penggunaan aplikasi misalnya, jam sibuk pengguna, fitur apa yang paling sering diakses lalu menirunya di JMeter. Dengan demikian, hasil tes lebih akurat dan relevan.

b. Menangani Variabel Lingkungan
Kondisi server, konfigurasi jaringan, dan spesifikasi hardware bisa sangat memengaruhi hasil tes. Kadang, performa terlihat buruk hanya karena konfigurasi lokal saya kurang optimal.
Solusi: Saya berusaha membuat lingkungan pengujian yang semirip mungkin dengan produksi (misalnya, menggunakan Docker atau VM yang sama spesifikasinya). Saya juga mencatat semua versi dan konfigurasi, sehingga hasil pengujian bisa dibandingkan secara konsisten.

c. Memahami Data dari Profiler
Saat pertama kali melihat laporan profiler, saya sempat kebingungan karena banyak metrik seperti CPU time, allocated memory, call tree, hotspots, dan sebagainya.
Solusi: Saya memulai dengan mencari hotspots atau metode yang paling dominan di laporan profiler. Dari sana, saya perlahan menelusuri call tree untuk memahami alur logika aplikasi. Saya juga banyak membaca dokumentasi dan mencoba-coba fitur profiler agar makin terbiasa.


### 5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?

Ketika saya menggunakan IntelliJ Profiler, manfaat utama yang paling saya rasakan adalah kemudahan integrasinya dengan IDE. Saya tidak perlu repot berpindah ke tool eksternal untuk melakukan profiling, karena begitu selesai melihat laporan, saya bisa langsung melompat ke baris kode terkait dan melakukan perubahan di tempat yang sama. Visualisasi yang ditawarkan pun sangat membantu mulai dari call tree hingga hotspots sehingga saya cepat mengetahui metode-metode yang paling banyak memakan waktu atau memori. Di samping itu, informasi detail mengenai CPU usage, alokasi memori, dan aktivitas garbage collection memudahkan saya menelusuri akar masalah performa, seperti loop yang tidak efisien atau query yang lambat. Hal ini pada akhirnya menghemat waktu dan tenaga, karena saya tidak lagi mengandalkan perkiraan untuk menemukan bottleneck. Saya juga bisa langsung memvalidasi efektivitas setiap perubahan yang saya lakukan, membuat proses optimasi menjadi jauh lebih terarah dan efisien.


### 6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?

Ketika saya baru mempelajari JMeter dan IntelliJ Profiler, saya sempat kebingungan karena hasil pengujian kinerja (performance testing) di JMeter tidak selalu sama dengan data yang muncul saat saya melakukan profiling di IntelliJ. Namun, begitu saya memahami perbedaan fokus dari kedua alat ini, saya mulai bisa melihat alasan di baliknya.

JMeter, sebagai alat performance testing, dirancang untuk meniru banyak pengguna yang mengakses aplikasi secara bersamaan. Dari situ, saya bisa melihat waktu respons aplikasi dan seberapa stabil aplikasi saat beban meningkat. Di sisi lain, IntelliJ Profiler memberi saya informasi mendalam tentang apa yang terjadi di dalam kode—metode mana yang paling banyak memakan waktu, bagaimana memori dialokasikan, dan di mana potensi bottleneck terjadi.

Untuk memastikan keduanya memberi gambaran yang lebih selaras, saya biasanya:

a. Menjalankan JMeter dan IntelliJ Profiler di lingkungan yang sama, misalnya server lokal dengan konfigurasi CPU dan memori yang sama.

b. Menyesuaikan jumlah beban yang diberikan JMeter agar serupa dengan skenario yang saya jalankan saat profiling. Jika di JMeter saya menggunakan 50 thread, maka saat profiling, saya usahakan agar aplikasi juga menghadapi beban mendekati 50 pengguna.

c. Mengurangi overhead dari profiler dengan memilih mode sampling daripada instrumentation penuh, sehingga aplikasi tidak terlalu lambat saat di-profile.

d. Mencatat konfigurasi (versi Java, parameter JVM, koneksi database, dsb.) supaya saya tahu persis apa yang berubah di setiap percobaan.

Dengan langkah-langkah sederhana ini, saya bisa lebih mudah membandingkan hasil dari JMeter dan IntelliJ Profiler, meskipun keduanya memang tidak akan pernah 100% identik karena cara pengukuran yang berbeda. Namun, ketika data sudah cukup dekat, saya bisa lebih percaya diri dalam menentukan area mana yang benar-benar butuh dioptimasi dan mengukur seberapa efektif perbaikan yang saya lakukan.

### 7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?
Ketika saya mengoptimasi kode aplikasi setelah memeriksa hasil dari performance testing dan profiling, saya biasanya menerapkan pendekatan yang terstruktur dan berhati-hati agar tidak merusak fungsionalitas yang sudah ada.

Pertama, saya mengidentifikasi bottleneck atau titik lemah spesifik yang muncul dari hasil uji beban (misalnya dengan JMeter) dan data profiling (misalnya dari IntelliJ Profiler). Saya memfokuskan diri pada metode atau proses yang menghabiskan waktu CPU paling banyak, menggunakan memori berlebihan, atau menyebabkan respons aplikasi menjadi lambat. Dengan menentukan prioritas area yang paling berdampak, saya dapat lebih efisien dalam mengalokasikan waktu dan usaha.

Setelah tahu bagian kode mana yang perlu diperbaiki—misalnya loop bersarang atau query database yang tidak efisien—saya melakukan refactoring atau penulisan ulang pada bagian tersebut. Strategi yang umum dilakukan adalah mengganti struktur data menjadi lebih tepat, menyederhanakan algoritma, memanfaatkan caching, atau memperbaiki query agar jumlah pemanggilan ke database berkurang.

Untuk memastikan bahwa perubahan ini tidak mengganggu fitur yang sudah berfungsi, saya selalu mengandalkan serangkaian pengujian—mulai dari unit test hingga integration test atau bahkan end-to-end test. Dengan cara ini, saya bisa memverifikasi bahwa optimasi yang saya lakukan tidak menimbulkan bug baru atau mengubah perilaku aplikasi secara tidak terduga.

Setelah proses optimasi selesai, saya menjalankan kembali pengujian performa dan profiling dengan skenario yang sama. Perbandingan hasil sebelum dan sesudah optimasi menunjukkan apakah perubahan benar-benar berdampak positif pada kinerja. Jika peningkatannya kurang signifikan, saya akan mencari alternatif lain atau melakukan analisis lebih dalam.

Terakhir, saya menerapkan strategi iterasi bertahap. Saya memulai dengan masalah kinerja yang paling kritis, kemudian memperbaikinya, dan menguji hasilnya. Jika masih ada hal yang perlu ditingkatkan, saya lanjutkan ke masalah berikutnya. Pendekatan bertahap ini mencegah perubahan kode yang berlebihan sekaligus, sehingga lebih mudah untuk melacak dan memperbaiki jika terjadi gangguan pada fungsi aplikasi.

Dengan mengikuti langkah-langkah tersebut—menargetkan bottleneck spesifik, melakukan refactoring secara hati-hati, selalu menguji ulang, dan melakukan perbaikan secara bertahap—saya dapat memastikan bahwa optimasi kinerja yang dilakukan benar-benar efektif tanpa mengorbankan fungsionalitas aplikasi.



