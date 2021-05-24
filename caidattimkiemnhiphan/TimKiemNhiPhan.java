package caidattimkiemnhiphan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TimKiemNhiPhan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("các phần tử của mảng là");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------");
        sortASC(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("phần tử cần tìm là ");
        int value = scanner.nextInt();
        System.out.println(seachBinery(arr,0,n-1,value));
    }

    static int seachBinery(int[] arr, int left, int right, int value) {
        int mid = (right + left) / 2;
        if (arr[mid] > value && right > left) {
            return seachBinery(arr, left, mid - 1, value);
        }
        if (arr[mid] < value && right > left) {
            return seachBinery(arr, mid + 1, right, value);
        }
        if (arr[mid] == value && right > left) {
            return mid;
        }
        return -1;
    }
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
