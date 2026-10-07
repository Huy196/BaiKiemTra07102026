package com.example.baikiemtra;

public class Bai_3 {

//     Các bước thực hiện bằng mã giả:
//        Bước 1: Bắt đầu.
//        Bước 2: Nhập số nguyên n cần tính giai thừa.
//        Bước 3: Xây dựng hàm factorial(n):
//           - Nếu n = 0 thì trả về 1.
//           - Ngược lại, trả về n * factorial(n - 1).
//        Bước 4: Gọi hàm factorial(n) để tính giai thừa.
//        Bước 5: Lưu kết quả vào biến result.
//        Bước 6: In ra kết quả n! = result.
//        Bước 7: Kết thúc.

    //	Cài đặt thuật toán bằng ngôn ngữ tùy chọn.

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