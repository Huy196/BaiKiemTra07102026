package com.example.baikiemtra;

public class Bai_2 {
//    Các bước thực hiện bằng mã giả
//    Bước 1: Kiểm tra nếu phần tử đầu tiên đã được sắp xếp. trả về 1
//    Bước 2: Lấy phần tử kế tiếp
//    Bước 3: So sánh với tất cả phần tử trong danh sách con đã qua sắp xếp
//    Bước 4: Dịch chuyển tất cả phần tử trong danh sách con mà lớn hơn giá trị để được sắp xếp
//    Bước 5: Chèn giá trị đó
//    Bước 6: Lặp lại cho tới khi danh sách được sắp xếp

//	Cài đặt thuật toán bằng ngôn ngữ tùy chọn.

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

        // Khởi tạo mảng cần sắp xếp
        int[] listNumber = {5, 2, 8, 1, 9, 3, 4};

        // In mảng trước khi sắp xếp
        System.out.println("Mang truoc khi sap xep: ");
        for (int x : listNumber) {
            System.out.print(x + " ");
        }

        // Gọi thuật toán Insertion Sort
        insertionSort(listNumber);

        // In mảng sau khi sắp xếp
        System.out.println("\nMang sau khi sap xep: ");
        for (int x : listNumber) {
            System.out.print(x + " ");
        }
    }
}
