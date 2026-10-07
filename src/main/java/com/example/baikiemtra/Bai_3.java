package com.example.baikiemtra;

public class Bai_3 {

    /*
     * MÃ GIẢ THUẬT TOÁN TÍNH GIAI THỪA BẰNG ĐỆ QUY:
     *
     * ALGORITHM Factorial(n)
     * BEGIN
     *     IF n = 0 THEN
     *         RETURN 1
     *     END IF
     *
     *     RETURN n * Factorial(n - 1)
     * END
     *
     * ALGORITHM Main
     * BEGIN
     *     Nhập số nguyên n
     *     result ← Factorial(n)
     *     In n! = result
     * END
     */

    // Cài đặt thuật toán bằng ngôn ngữ tùy chọn.

    // Tính giai thừa bằng đệ quy
    static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // Giá trị cần tính giai thừa
        int n = 5;

        // Gọi hàm factorial
        int result = factorial(n);

        // In kết quả
        System.out.println(n + "! = " + result);
    }
}