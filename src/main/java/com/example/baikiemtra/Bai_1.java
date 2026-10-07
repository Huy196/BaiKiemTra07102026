package com.example.baikiemtra;

public class Bai_1 {
    // Bước 1: Bắt đầu từ phần tử trái nhất của mảng và so sánh từng phần tử trong mảng với phần tử cần tìm
    // Bước 2: Nếu phần tử nào trùng với phần tử cần tìm thì trả về chỉ số của phần tử đó trong mảng
    // Bước 3: Nếu không có phần tử nào trùng thì trả về -1
       //     •	Cài đặt thuật toán

    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int listNumber[] = { 2, 3, 4, 10, 40 };
        int number_1 = 1;

        int result = linearSearch(listNumber, number_1);
        if(result == -1)
            System.out.print("Phần tử không có trong mảng");
        else
            System.out.print("Phần tử có mặt tại chỉ mục " + result);
    }
}

