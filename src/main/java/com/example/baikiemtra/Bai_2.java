package com.example.baikiemtra;

public class Bai_2 {
    /*
     * MÃ GIẢ THUẬT TOÁN INSERTION SORT:
     *
     * ALGORITHM InsertionSort(a)
     * BEGIN
     *     FOR i ← 1 TO length(a) - 1 DO
     *         key ← a[i]
     *         j ← i - 1
     *
     *         WHILE j >= 0 AND a[j] > key DO
     *             a[j + 1] ← a[j]
     *             j ← j - 1
     *         END WHILE
     *
     *         a[j + 1] ← key
     *     END FOR
     * END
     */

    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] listNumber = {5, 2, 8, 1, 9, 3, 4};

        System.out.println("Mang truoc khi sap xep: ");
        for (int x : listNumber) {
            System.out.print(x + " ");
        }

        insertionSort(listNumber);

        System.out.println("\nMang sau khi sap xep: ");
        for (int x : listNumber) {
            System.out.print(x + " ");
        }
    }
}