package ArrayInJava;

public class MainDiagonalOfMatrix {
    public static void main(String[] args) {
        int [][] array ={
                {1,2,3,4,5,6},
                {5,6,7,8,9,7},
                {7,5,12,5,9,8},
                {1,5,5,8,7,9},
                {2,5,7,9,1,10},
                {2,5,7,9,1,10}
        };

        int sum1 = 0;
        int sum2 = 0;

        for(int i =0; i <array.length; i++)
            for(int j =0; j< array[i].length; j++)
                if(i==j){
                    sum1 += array[i][j];
                }

        for (int i = 0; i< array.length; i++)
            for(int j = array[i].length -1; j >=0; j--)
                if((i+j)==array.length-1){
                    sum2 += array[i][j];
                }

        System.out.println("Tong so cac phan tu cua duong cheo chinh thu nhat la: " + sum1);
        System.out.println("Tong so cac phan tu cua duong cheo chinh thu hai la: " + sum2);
    }
}

