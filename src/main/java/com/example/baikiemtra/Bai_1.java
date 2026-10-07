package com.example.baikiemtra;

public class Bai_1 {
    /*
     * MÃ GIẢ THUẬT TOÁN TÌM KIẾM TUYẾN TÍNH:
     *
     * ALGORITHM LinearSearch(a, x)
     * BEGIN
     *     FOR i ← 0 TO length(a) - 1 DO
     *         IF a[i] = x THEN
     *             RETURN i
     *         END IF
     *     END FOR
     *
     *     RETURN -1
     * END
     *

     */

    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int listNumber[] = { 2, 3, 4, 10, 40 };
        int number_1 = 10;

        int result = linearSearch(listNumber, number_1);
        if(result == -1)
            System.out.print("Phần tử không có trong mảng");
        else
            System.out.print("Phần tử có mặt tại chỉ mục " + result);
    }
}