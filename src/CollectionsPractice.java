import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] arrayBiasa = new int[3];

        // - Buat ArrayList<Integer> kosong
        ArrayList<Integer> arrayList = new ArrayList<>();

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        arrayBiasa[0] = 1;
        arrayBiasa[1] = 2;
        arrayBiasa[2] = 3;
        //arrayBiasa[3] = 6;
        //arrayBiasa[4] = 10;
        // - Tambahkan 5 elemen ke ArrayList (dinamis)
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(1);

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar
        System.out.println("Ukuran Array biasa (tetap): " + arrayBiasa.length);
        System.out.println("Ukuran ArrayList (dinamis): " + arrayList.size());
        //Array: Ukuran tetap setelah dibuat, tidak bisa bertambah
        //ArrayList: Ukuran dinamis, bisa terus bertambah/berkurang

        // ===== GENERICS DASAR =====
        System.out.println("\\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList rawType = new ArrayList();
        rawType.add("HelloWorld!");
        rawType.add(321);
        rawType.add(43.60);
        rawType.add('z');
        rawType.add(true);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Josef");
        stringList.add("Batara");
        stringList.add("Hasiholan");

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal
        ArrayList<Double> doubleh = new ArrayList<>();
        doubleh.add(85.3);
        doubleh.add(77.7);

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah
        //stringList.add(4312);
        //doubleh.add("HelloWorld!");
        System.out.println("ArrayList raw: " + rawType);
        System.out.println("ArrayList<String>: " + stringList);
        System.out.println("ArrayList<Double>: " + doubleh);

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();

        // - Tambahkan 5 nama mahasiswa menggunakan add()
        daftarMahasiswa.add("Eben Zai");
        daftarMahasiswa.add("Billyandre");
        daftarMahasiswa.add("Josef Batara");
        daftarMahasiswa.add("Sebastian");
        daftarMahasiswa.add("Ricardo");

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)
        daftarMahasiswa.add(3, "Ronald Saut");

        // - Print daftar mahasiswa
        System.out.println("Daftar mahasiswa: " + daftarMahasiswa);

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)
        System.out.println("Mahasiswa pertama: " + daftarMahasiswa.get(0));

        // - Baca mahasiswa terakhir
        System.out.println("Mahasiswa terakhir: " + daftarMahasiswa.get(daftarMahasiswa.size()-1));

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()
        System.out.println("Ada mahasiswa dengan nama Josef Batara??" + daftarMahasiswa.contains("Josef Batara"));

        // - Temukan index mahasiswa tertentu menggunakan indexOf()
        System.out.println("Index Eben Zai: " + daftarMahasiswa.indexOf("Eben Zai"));

        // - Print ukuran ArrayList menggunakan size()
        System.out.println("Jumlah mahasiswa: " + daftarMahasiswa.size());

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()
        daftarMahasiswa.set(1, "Given Asser");

        // - Print daftar setelah update
        System.out.println("Setelah update index 1: " + daftarMahasiswa);

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)
        daftarMahasiswa.remove(0);

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)
        daftarMahasiswa.remove("Ricardo");

        // - Hapus semua mahasiswa menggunakan clear()
        daftarMahasiswa.clear();

        // - Cek apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("Apakah list kosong? " + daftarMahasiswa.isEmpty());

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        angka.add(10);
        angka.add(20);
        angka.add(30);
        angka.add(40);
        angka.add(50);

        // - Iterasi menggunakan traditional for loop
        for (int i = 0; i < angka.size(); i++) {
            System.out.println("index " + i + " : " +angka.get(i));
        }

        // - Iterasi menggunakan enhanced for loop (for-each)
        for (Integer num : angka) {
            System.out.print(num + " ");
        }
        System.out.println();

        // - Iterasi menggunakan while loop
        int i = 0;
        while (i < angka.size()) {
            System.out.print(angka.get(i) + " ");
            i++;
        }
        System.out.println();

        // - Iterasi menggunakan Iterator
        Iterator<Integer> iterator = angka.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\\\\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();

        // - Tambahkan 3 data mahasiswa
        // TODO: Tambahkan data mahasiswa
        dataMahasiswa.add(new String[]{"Eben", "2481014", "Teknik Informatika"});
        dataMahasiswa.add(new String[]{"Josmartio", "2482016", "Sistem Informasi"});
        dataMahasiswa.add(new String[]{"Saroha", "2432059", "Akuntansi"});

        // - Print semua data dengan format tabel
        // TODO: Print dalam format tabel
        System.out.println("Data Mahasiswa");
        System.out.printf("%-15s %-15s %-25s%n", "Nama", "NIM", "Jurusan");
        for (String[] mhs : dataMahasiswa) {
            System.out.printf("%-15s %-15s %-25s%n", mhs[0], mhs[1], mhs[2]);
        }

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\\\\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90
        numbers.add(64);
        numbers.add(34);
        numbers.add(25);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(90);

        // - Gunakan Collections.sort() untuk mengurutkan
        // TODO: Sort list
        Collections.sort(numbers);
        System.out.println("urutan koleksi: " + numbers);

        // - Gunakan Collections.reverse() untuk membalik urutan
        // TODO: Reverse list
        Collections.reverse(numbers);
        System.out.println("urutan terbalik koleksi: " + numbers);

        // - Gunakan Collections.shuffle() untuk mengacak
        // TODO: Shuffle list
        Collections.shuffle(numbers);
        System.out.println("koleksi acak: " + numbers);

        // - Gunakan Collections.max() dan Collections.min()
        // TODO: Find max dan min
        System.out.println("maksimum: " + Collections.max(numbers));
        System.out.println("minimum: " + Collections.min(numbers));

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        // TODO: Count frequency
        System.out.println("Menghitung kemunculan elemen koleksi: " + Collections.frequency(numbers, 22));

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\\\\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Pisang");
        buah.add("Anggur");

        // - Implementasikan linear search untuk list yang tidak diurutkan
        // TODO: Linear search
        String target2 = "Anggur";
        System.out.println("Linear search -> Anggur ada di index " + linearSearch(buah, target2));

        // - Sort secara alfabetis
        // TODO: Sort alphabetically
        Collections.sort(buah);
        System.out.println("urutan buah: " + buah);

        // - Implementasikan binary search pada list yang sudah diurutkan
        // TODO: Binary search
        String target1 = "Mangga";
        System.out.println("Binary search -> Mangga ada di index " + Collections.binarySearch(buah, target1));


        // ===== ARRAYLIST 2D =====
        System.out.println("\\\\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        // - Buat ArrayList<ArrayList<Integer>> untuk merepresentasikan matriks dinamis
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();

        // - Buat 3 baris dengan panjang yang berbeda-beda
        // TODO: Create jagged 2D ArrayList
        ArrayList<Integer> baris1 = new ArrayList<>();
        baris1.add(1);
        baris1.add(2);

        ArrayList<Integer> baris2 = new ArrayList<>();
        baris2.add(3);
        baris2.add(4);
        baris2.add(5);
        baris2.add(6);

        ArrayList<Integer> baris3 = new ArrayList<>();
        baris3.add(7);
        baris3.add(8);
        baris3.add(9);

        // - Isi dengan nilai dan print dalam format matriks
        // TODO: Fill dan print matrix
        matrix2D.add(baris1);
        matrix2D.add(baris2);
        matrix2D.add(baris3);

        printMatrix2D(matrix2D);

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"

        // - Tambahkan 5 buku
        // TODO: Tambahkan data buku
        daftarBuku.add(new String[]{"One Piece Vol. 1", "Eiichiro Oda", "1997", "dipinjam"});
        daftarBuku.add(new String[]{"Naruto Vol. 5", "Masashi Kishimoto", "2000", "tersedia"});
        daftarBuku.add(new String[]{"Laskar Pelangi", "Andrea Hirata", "2005", "dipinjam"});
        daftarBuku.add(new String[]{"Dilan 1990", "Pidi Baiq", "2014", "tersedia"});
        daftarBuku.add(new String[]{"To Kill a Mockingbird", "Harper Lee", "1960", "dipinjam"});

        // - Implementasikan fungsi pinjam buku (ubah status)
        // TODO: Implementasikan pinjam buku
        System.out.println("meminjam buku 'Naruto Vol. 5'");
        pinjamBuku(daftarBuku, "Naruto Vol. 5");
        System.out.println();

        // - Implementasikan fungsi kembalikan buku
        // TODO: Implementasikan kembalikan buku
        System.out.println("mengembalikan buku 'Laskar Pelangi'");
        kembalikanBuku(daftarBuku, "Laskar Pelangi");
        System.out.println();

        // - Implementasikan pencarian buku berdasarkan judul
        // TODO: Implementasikan search buku
        if(cariBuku(daftarBuku, "Dilan 1990") != null) {
            System.out.println("Ditemukan Judul: " + cariBuku(daftarBuku, "Dilan 1990")[0] + ", Status: " + cariBuku(daftarBuku, "Dilan 1990")[3]);
        }

        // - Print daftar buku yang tersedia
        // TODO: Print available books
        System.out.println("Daftar buku yang tersedia: ");
        for(String[] buku : daftarBuku) {
            if(buku[3].equals("tersedia")) {
                System.out.println("- " + buku[0] + " | Pengarang: " + buku[1] + " | Tahun terbit: " + buku[2]);
            }
        }
        System.out.println();

        // Latihan 13: Sistem nilai mahasiswa dinamis
        // TODO: Implementasikan sistem nilai yang bisa menambah mahasiswa dinamis
        ArrayList<String> namaMhs = new ArrayList<>(Arrays.asList("Aril"));
        ArrayList<ArrayList<Integer>> nilaiMahasiswa = new ArrayList<>();
        nilaiMahasiswa.add(new ArrayList<>(Arrays.asList(86, 88, 91)));

        for(int j = 0; j < namaMhs.size(); j++) {
            System.out.println("Nilai " + namaMhs.get(j) + ": " + nilaiMahasiswa.get(j) + " | Rata-rata: " + String.format("%.2f", hitungRataRata(nilaiMahasiswa.get(j))));
        }

        // ===== PERFORMANCE COMPARISON =====
        System.out.println("\\\\n=== PERFORMANCE COMPARISON ===");

        // Latihan 14: Bandingkan performa Array vs ArrayList
        // TODO: Implementasikan comparison waktu akses, insert, search
        System.out.println("Perbandingan Array vs ArrayList:");

        int size = 100000;
        long startTime, endTime;

        // Array access time
        int[] testArray = new int[size];
        startTime = System.nanoTime();
        for (int j = 0; j < size; j++) {
            testArray[j] = j;
        }
        endTime = System.nanoTime();
        System.out.println("Array - Insert " + size + " elements: " +
                (endTime - startTime) / 1000000.0 + " ms");

        // ArrayList access time
        ArrayList<Integer> testList = new ArrayList<>();
        startTime = System.nanoTime();
        for (int j = 0; j < size; j++) {
            testList.add(j);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList - Insert " + size + " elements: " +
                (endTime - startTime) / 1000000.0 + " ms");

        System.out.println("\nKesimpulan:");
        System.out.println("- Array: Lebih cepat untuk akses random, ukuran tetap");
        System.out.println("- ArrayList: Lebih fleksibel (dinamis), sedikit lebih lambat");

    }

    // ===== HELPER METHODS =====
    // TODO: Implementasikan method-method pembantu di sini

    public static void printArrayList(ArrayList<?> list, String title) {
        // TODO: Print ArrayList dengan title
        System.out.println(title + ": " + list.toString() + "\n");
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        // TODO: Implementasi linear search
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        // TODO: Print 2D ArrayList matrix
        for(ArrayList<Integer> baris : matrix) {
            for(Integer nilai : baris) {
                System.out.printf("%-4d", nilai);
            }
            System.out.println();
        }
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        for(String[] buku : daftarBuku) {
            if(buku[0].equalsIgnoreCase(judul) && buku[3].equals("tersedia")) {
                buku[3] = "dipinjam";
                System.out.println("Buku dgn judul '" + judul + "' berhasil dipinjam");
                return true;
            } else {
                System.out.println("Buku dgn judul '" + judul + "' sedang dipinjam");
                return false;
            }
        }
        return false;
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi kembalikan buku
        for(String[] buku : daftarBuku) {
            if(buku[0].equalsIgnoreCase(judul)) {
                if(buku[3].equals("dipinjam")){
                    buku[3] = "tersedia";
                    System.out.println("Buku dgn judul '" + judul + "' berhasil dikembalikan");
                    return true;
                } else {
                    System.out.println("Gagal mengembalikan. Buku dgn judul '" + judul + "' tidak sedang dipinjam");
                    return false;
                }
            }
        }
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        // TODO: Implementasi cari buku
        for(String[] buku : daftarBuku) {
            if(buku[0].equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        // TODO: Hitung rata-rata
        int total = 0;
        for(int nilai : values) {
            total += nilai;
        }
        return (double) total / values.size();
    }
}
