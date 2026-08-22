 import java.util.Scanner;
public class smallestelement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int r = sc.nextInt();
        System.out.print("Enter colunms:");
        int c = sc.nextInt();
        int [][] a= new int[r][c];
        System.out.println("Enter the matix elements:");

         for(int i=0;i < r;i++){
            for(int j=0;j < c;j++){
                a[i][j]= sc.nextInt();
            }
        }
        int min = a[0][0];

for (int i = 0; i < a.length; i++) {
    for (int j = 0; j < a[i].length; j++) {
        if (a [i][j] < min) {
            min = a [i][j];
        }
    }
}

System.out.println("Smallest element = " + min);

    }
}

