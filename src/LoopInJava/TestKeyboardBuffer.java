package LoopInJava;
import java.util.Scanner;

// For-each trong java
public class TestKeyboardBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println("Cac phan tu trong mang:  ");
        for(int element : array){
            System.out.print(element+ " " );
        }
        System.out.println("");
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        scanner.nextLine(); // se lay ky tu Enter ban phim truoc khi nhap chuoi khac tu ban  phim
        System.out.println("Nhap b: ");
        String b = scanner.nextLine();
        System.out.println("B is "+ b + " a is " + a);

        //printf(" control string", danh sach tham so)
        /*
        - control string: chua ba thanh phan:
           + ky tu in ra duoc: giai thich cho phan in...
           + cac bo ma dinh dang nhu %c, %d...
           + cac ky tu dinh dang (khong in ra duoc): \n: new line, \s: space, \t: tab
         moi ma dinh dang se tuong ung voi caca tham so trong danh sach tham so sau dau phay
        - danh sach tham so:
           + co mot hay nhieu tham so phan cach voi nhau boi dau phay
           + ma dinh dang va danh sach tham so phai tuong ung
              * so luong bang nhau
              * thu tu va kieu du lieu phai tuong ung
              ** Cac ky tu di kem ma dinh dang de quy uoc dinh dang hien thi
                + do rong truong: duoc quy  dinh bang mot so nguyen n, vi du: %10d thi do rong truong toi thieu la 10
                + do chinh xac .n : n la do chinh xac sau dau phay la n chu so
        */
    }
}
