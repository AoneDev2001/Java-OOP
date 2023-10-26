import java.util.Random;
import java.util.Scanner;

class MyArray1 {

    // MeThod inputInt2Array
    public int[] inputInt2Array(int n) {
        Scanner kb = new Scanner(System.in); // สร้างobj จากclass Scanner รับค่าจากเเป้นพิม
        int[] A2 = new int[n]; // สร้างArray ขนาดตาม พารามิสเตอร์ ที่รับมาจาก อากิเม้น
        for (int i = 0; i < n; i++) { // loop ข้อมูลใส่array เเต่ละ index
            System.out.print("Enter  number in Array " + i + ": ");
            A2[i] = kb.nextInt();
        }
        return A2; // return arr ส่งค่ากลับออกมา
    }

    // MeThod Max
    public int Max(int[] Array) {
        int maxvalue1 = Array[0]; // ประกาศตัวเเปล maxvalue1 เท่ากับarray ช่องที่ 0
        for (int i = 1; i < Array.length; i++) { // loop ข้อมูลใน array หาค่ามากสุด
            if (Array[i] > maxvalue1) {
                maxvalue1 = Array[i];
            }
        }
        return maxvalue1; // return max ส่งค่ากลับออกมา
    }

    // MeThod Min
    public int Min(int[] Array) {
        int minvalue1 = Array[0]; // ประกาศตัวเเปล maxvalue1 เท่ากับarray ช่องที่ 0
        for (int i = 1; i < Array.length; i++) { // loop ข้อมูลใน array หาค่ามากสุด
            if (Array[i] < minvalue1) {
                minvalue1 = Array[i];
            }
        }
        return minvalue1; // return max ส่งค่ากลับออกมา
    }

    // MeThod randomInt2Arra
    public int[] randomInt2Array(int n) {
        Random rand = new Random(); // สร้างobj จากclass Random
        int[] A2 = new int[n]; // สร้างArray ขนาดตาม พารามิสเตอร์ ที่รับมาจาก อากิเม้น
        for (int i = 0; i < A2.length; i++) { // loop Random ข้อมูลใส่array เเต่ละ index
            A2[i] = rand.nextInt();
        }
        return A2; // return arr ส่งค่ากลับออกมา
    }
}