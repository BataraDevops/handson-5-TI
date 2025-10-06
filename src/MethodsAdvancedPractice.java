import java.util.Arrays;

public class MethodsAdvancedPractice {

    // Static variable untuk demonstrasi
    private static int counter = 0;

    // Instance variable untuk demonstrasi
    private String instanceName;

    // Constructor
    public MethodsAdvancedPractice(String name) {
        this.instanceName = name;
        counter++;
    }

    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Methods Advanced
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * method signature, overloading, pass by value/reference, static vs instance methods.
         */

        // ===== METHOD SIGNATURE DAN DECLARATION =====
        System.out.println("=== METHOD SIGNATURE DAN DECLARATION ===");

        // Latihan 1: Memahami komponen method signature
        // - Panggil method dengan signature berbeda untuk melihat perbedaannya
        // - Gunakan method overloading untuk mendemonstrasikan signature
        System.out.println("Calculate int: " + calculate(5, 3));
        System.out.println("Calculate double: " + calculate(5.5, 3.2));
        System.out.println("Calculate 3 ints: " + calculate(5, 3, 2));
        System.out.println("Calculate strings: " + calculate("Hello", "World"));

        // ===== METHOD OVERLOADING =====
        System.out.println("\\n=== METHOD OVERLOADING ===");

        // Latihan 2: Implementasi dan penggunaan method overloading
        System.out.println("Overloaded calculate:");
        System.out.println("Int result: " + calculate(10, 5));
        System.out.println("Double result: " + calculate(10.5, 5.5));
        System.out.println("Three ints result: " + calculate(10, 5, 3));
        System.out.println("String result: " + calculate("Java", "Programming"));

        System.out.println("Overloaded print methods:");
        print(100);
        print(3.14159);
        print("Hello Josef!");
        print(new int[]{1, 2, 3, 4, 5});

        // ===== STATIC VS INSTANCE METHODS =====
        System.out.println("\\n=== STATIC VS INSTANCE METHODS ===");

        // Latihan 3: Perbedaan static dan instance methods
        // - Panggil static method tanpa membuat object
        System.out.println("Panggil static method tanpa membuat object: " + getCounter());
        incrementCounter();
        System.out.println("after increment: " + getCounter());

        // - Buat instance object dan panggil instance method
        MethodsAdvancedPractice obj1 = new MethodsAdvancedPractice("Object1");
        MethodsAdvancedPractice obj2 = new MethodsAdvancedPractice("Object2");

        System.out.println("instance objek1: " + obj1.getInstanceName());
        obj1.setInstanceName("Objek Satu");
        System.out.println("instance objek1 setelah diubah: " + obj1.getInstanceName());

        // - Demonstrasikan akses ke static vs instance variables
        obj1.displayInfo();
        obj2.displayInfo();
        System.out.println("Nilai counter static saat ini: " + getCounter());

        // - Coba akses instance method dari static context (akan error)
        //getInstanceName();

        // ===== PASS BY VALUE - PRIMITIVES =====
        System.out.println("\\n=== PASS BY VALUE - PRIMITIVES ===");

        // Latihan 4: Demonstrasi pass by value untuk primitive types
        int originalNumber = 10;

        System.out.println("Sebelum modifyPrimitive: " + originalNumber);
        modifyPrimitive(originalNumber);
        System.out.println("Setelah modifyPrimitive: " + originalNumber);
        //Nilai tidak berubah karena Java pass by value untuk primitives

        // ===== PASS BY VALUE OF REFERENCE - OBJECTS =====
        System.out.println("\\n=== PASS BY VALUE OF REFERENCE - OBJECTS ===");

        // Latihan 5: Demonstrasi pass by value of reference untuk objects
        int[] originalArray = {1, 2, 3, 4, 5};

        // - Print array sebelum modification
        System.out.println("Sebelum modifyArray: " + Arrays.toString(originalArray));

        // - Panggil method modifyArray dengan originalArray
        modifyArray(originalArray);

        // - Print array setelah modification
        System.out.println("Setelah modifyArray: " + Arrays.toString(originalArray));

        // - Jelaskan mengapa isi array berubah tetapi reference tidak
        //Isi array berubah karena reference menunjuk ke objek yang sama

        // Latihan 6: Reference reassignment dalam method
        int[] anotherArray = {10, 20, 30};

        // - Print array sebelum reassignment
        System.out.println("Sebelum reassignment: " + Arrays.toString(anotherArray));

        // - Panggil method reassignArray dengan anotherArray
        reassignArray(anotherArray);

        // - Print array setelah method call
        System.out.println("Setelah reassignment: " + Arrays.toString(anotherArray));

        // - Jelaskan mengapa reference asli tidak berubah
        //Array asli tidak berubah karena reassignment hanya mengubah local reference"

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 7: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method yang mengembalikan copy array yang diurutkan
        int[] sortedCopy = sortArrayCopy(numbers);
        System.out.println("copy yang diurutkan: " + Arrays.toString(sortedCopy));
        System.out.println("yang asli ngga berubah: " + Arrays.toString(numbers));

        // - Panggil method yang mengembalikan statistik array (min, max, avg)
        double[] stats = getArrayStats(numbers);
        System.out.println(" statistik array (min, max, avg): " + Arrays.toString(stats));

        // - Panggil method yang merge dua array
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        int[] gabung = mergeArrays(array1, array2);
        System.out.println("Hasil merged array: " + Arrays.toString(gabung));

        // ===== VARIABLE ARGUMENTS (VARARGS) =====
        System.out.println("\\n=== VARIABLE ARGUMENTS (VARARGS) ===");

        // Latihan 8: Implementasi dan penggunaan varargs
        // - Panggil method sum dengan jumlah parameter berbeda-beda
        System.out.println("Sum of 1,2,3: " + sum(1, 2, 3));
        System.out.println("Sum of 1,2,3,4: " + sum(1, 2, 3, 4));
        System.out.println("Sum of 10,20: " + sum(10, 20));

        // - Panggil method printInfo dengan berbagai kombinasi parameter
        System.out.println();
        printInfo("skor", 85, 90, 78, 92, 88);
        printInfo("id", 101, 102, 103);

        // ===== METHOD CHAINING =====
        System.out.println("\\n=== METHOD CHAINING ===");

        // Latihan 9: Implementasi method chaining
        // - Gunakan Calculator dengan method chaining untuk operasi berurutan
        Calculator kalkulator = new Calculator(9);
        double hasil = kalkulator.add(1).multiply(5).subtract(3 ).getResult();
        System.out.println("hasil = " + hasil);

        // ===== RECURSIVE METHODS =====
        System.out.println("\\n=== RECURSIVE METHODS ===");

        // Latihan 10: Implementasi dan penggunaan recursive methods
        // - Hitung faktorial menggunakan recursion
        System.out.println("faktorial 7: " + factorial(7));

        // - Hitung fibonacci menggunakan recursion
        System.out.println("Angka fibonacci 5 adalah: " + fibonacci(5));

        // - Implementasikan binary search recursive
        int[] arrayUrut = {2,4,6,8,10,12,14,34};
        int target = 10;
        int index = binarySearchRecursive(arrayUrut, target, 0, arrayUrut.length - 1);
        System.out.println("Angka " + target + " ada di index " + index);;

        // ===== UTILITY STATIC METHODS =====
        System.out.println("\\n=== UTILITY STATIC METHODS ===");

        // Latihan 11: Membuat utility class dengan static methods
        // - Gunakan MathUtils untuk berbagai operasi matematika
        System.out.println("2^10 = " + MathUtils.power(2, 10));
        System.out.println("MathUtils.isPrime(15) = " + MathUtils.isPrime(15));
        System.out.println("GCD(58, 18) = " + MathUtils.gcd(58, 18));

        // - Gunakan StringUtils untuk manipulasi string
        System.out.println("Reverse 'Mercedes': " + StringUtils.reverse("Mercedes"));
        System.out.println("StringUtils.isPalindrome(Ferrari): " + StringUtils.isPalindrome("Ferrari"));
        System.out.println("hituung kata pada 'Max Verstappen': " + StringUtils.countWords("Max Verstappen"));

        // - Gunakan ArrayUtils untuk operasi array
        int[][] matriks = {{6, 7, 3}, {8, 5, 1}, {2, 9, 4}};
        System.out.println("Matriks:");
        ArrayUtils.printMatrix(matriks);
        int[] duplikat = {1, 9, 10, 7, 3, 5, 9, 6, 7};
        System.out.println("temukan duplikat: " + Arrays.toString(ArrayUtils.findDuplicates(duplikat)));
        System.out.println("ArrayUtils.areEqual: " + ArrayUtils.areEqual(new int[]{7, 8}, new int[]{7, 8}));


        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem kalkulator dengan method overloading
        // - Implementasikan calculator yang bisa handle berbagai tipe data dan operasi
        System.out.println("Int: " + calculate(10, 30));
        System.out.println("Double: " + calculate(16.5, 33.2));
        System.out.println("String: " + calculate("Carlos", "Sainz"));

        // Latihan 13: Sistem processing data dengan static utilities
        // - Implementasikan data processor dengan berbagai method utility
        String data = "Coding itu gampang bro";
        System.out.println("StringUtils.reverse: " + StringUtils.reverse(data));
        System.out.println("StringUtils.isPalindrome: " + StringUtils.isPalindrome(data));
        System.out.println("StringUtils.countWords: " + StringUtils.countWords(data));
    }

    // ===== METHOD OVERLOADING EXAMPLES =====

    // TODO: Implementasikan method calculate yang di-overload
    public static int calculate(int a, int b) {
        // Penjumlahan dua integer
        return a + b; // Ganti dengan implementasi
    }

    public static double calculate(double a, double b) {
        // Penjumlahan dua double
        return a + b; // Ganti dengan implementasi
    }

    public static int calculate(int a, int b, int c) {
        // Penjumlahan tiga integer
        return a + b + c; // Ganti dengan implementasi
    }

    public static String calculate(String a, String b) {
        // Concatenation dua string
        return a + b; // Ganti dengan implementasi
    }

    // TODO: Implementasikan method print yang di-overload
    public static void print(int value) {
        // Print integer dengan format khusus
        System.out.println("Int: " + value);
    }

    public static void print(double value) {
        // Print double dengan format khusus
        System.out.println("Double: " + String.format("%.2f", value));
    }

    public static void print(String value) {
        // Print string dengan format khusus
        System.out.println("String: " + value );
    }

    public static void print(int[] array) {
        // Print array dengan format khusus
        System.out.println("Array: " + Arrays.toString(array));
    }

    // ===== STATIC VS INSTANCE METHODS =====

    public static int getCounter() {
        // TODO: Return nilai counter static
        return counter;
    }

    public static void incrementCounter() {
        // TODO: Increment counter static
        counter++;
    }

    public String getInstanceName() {
        // TODO: Return instance name
        return this.instanceName;
    }

    public void setInstanceName(String name) {
        // TODO: Set instance name
        this.instanceName = name;
    }

    public void displayInfo() {
        // TODO: Display instance dan static information
        System.out.println("Nama instance = " + this.instanceName + " , Total instance = " + counter);
    }

    // ===== PASS BY VALUE DEMONSTRATIONS =====

    public static void modifyPrimitive(int number) {
        // TODO: Modify parameter dan print perubahan
        number = number * 2;
        System.out.println("Inside modifyPrimitive: " + number);
    }

    public static void modifyArray(int[] array) {
        // TODO: Modify isi array
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        System.out.println("modify Array: " + Arrays.toString(array));
    }

    public static void reassignArray(int[] array) {
        // TODO: Reassign reference array
        array = new int[]{10, 40, 25};
        System.out.println("reassignArray: " + Arrays.toString(array));    }

    // ===== ARRAY METHODS =====

    public static int[] sortArrayCopy(int[] original) {
        // TODO: Return sorted copy tanpa mengubah original
        int[] copy = Arrays.copyOf(original, original.length);
        Arrays.sort(copy);
        return copy; // Ganti dengan implementasi
    }

    public static double[] getArrayStats(int[] array) {
        // TODO: Return array [min, max, average]
        int min = array[0];
        int max = array[0];
        long jumlah = 0;

        for(int nilai : array) {
            if(nilai < min) {
                min = nilai;
            }
            if(nilai > max) {
                max = nilai;
            }
            jumlah += nilai;
        }

        double rataRata = (double) jumlah / array.length;
        return new double[]{min, max, rataRata}; // Ganti dengan implementasi
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // TODO: Merge dua array dan return hasil
        int panjang = array1.length + array2.length;
        int[] hasil = new int[panjang];
        System.arraycopy(array1, 0, hasil, 0, array1.length);
        System.arraycopy(array2, 0, hasil, array1.length, array2.length);
        return hasil; // Ganti dengan implementasi
    }

    // ===== VARIABLE ARGUMENTS (VARARGS) =====

    public static int sum(int... numbers) {
        // TODO: Hitung sum dari varargs
        int total = 0;
        for(int angka : numbers) {
            total += angka;
        }
        return total;
    }

    public static void printInfo(String title, int... values) {
        // TODO: Print title dan semua values
        System.out.println(title + ":");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // ===== RECURSIVE METHODS =====

    public static long factorial(int n) {
        // TODO: Implementasi factorial recursive
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        // TODO: Implementasi fibonacci recursive
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // TODO: Implementasi binary search recursive
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }

    // ===== UTILITY CLASSES (INNER STATIC CLASSES) =====

    public static class MathUtils {
        public static double power(double base, int exponent) {
            // TODO: Implementasi power function
            return Math.pow(base, exponent);
        }

        public static boolean isPrime(int number) {
            // TODO: Check apakah number adalah prime
            if (number <= 1) return false;
            if (number <= 3) return true;
            if (number % 2 == 0 || number % 3 == 0) return false;

            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }

        public static int gcd(int a, int b) {
            // TODO: Greatest Common Divisor
            if (b == 0) return a;
            return gcd(b, a % b);
        }
    }

    public static class StringUtils {
        public static String reverse(String str) {
            // TODO: Reverse string
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }

        public static boolean isPalindrome(String str) {
            // TODO: Check palindrome
            String strPalindrome = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String balik = new StringBuilder(str).reverse().toString();
            return str.equals(balik);
        }

        public static int countWords(String str) {
            // TODO: Count words in string
            String[] kata = str.trim().split("\\s+");
            return kata.length;
        }
    }

    public static class ArrayUtils {
        public static void printMatrix(int[][] matrix) {
            // TODO: Print 2D array dengan format rapi
            for(int[] baris : matrix) {
                System.out.println(Arrays.toString(baris));
            }
        }

        public static int[] findDuplicates(int[] array) {
            // TODO: Find duplicate elements
            int[] temp = new int[array.length];
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        boolean sudahDitambahkan = false;
                        for (int k = 0; k < count; k++) {
                            if (temp[k] == array[i]) {
                                sudahDitambahkan = true;
                                break;
                            }
                        }
                        if (!sudahDitambahkan) {
                            temp[count++] = array[i];
                        }
                        break;
                    }
                }
            }

            return Arrays.copyOf(temp, count);
        }

        public static boolean areEqual(int[] array1, int[] array2) {
            // TODO: Compare dua array
            return Arrays.equals(array1, array2);
        }
    }

    // ===== METHOD CHAINING EXAMPLE =====

    public static class Calculator {
        private double value;

        public Calculator(double initial) {
            this.value = initial;
        }

        public Calculator add(double n) {
            // TODO: Add dan return this untuk chaining
            this.value += n;
            return this;
        }

        public Calculator multiply(double n) {
            // TODO: Multiply dan return this untuk chaining
            this.value *= n;
            return this;
        }

        public Calculator subtract(double n) {
            // TODO: Subtract dan return this untuk chaining
            this.value -= n;
            return this;
        }

        public double getResult() {
            return value;
        }
    }
}
