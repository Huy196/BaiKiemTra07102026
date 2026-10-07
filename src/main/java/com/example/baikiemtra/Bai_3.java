package com.example.baikiemtra;

public class Bai_3 {

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