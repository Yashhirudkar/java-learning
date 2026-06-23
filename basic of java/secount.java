import java.util.Scanner;

class secound {
  public static void main(String[] args) {
      Scanner a =  new Scanner(System.in);
      Scanner b =  new Scanner(System.in);

      System.out.println("Enter the First Number");
      int no1 = a.nextInt();
      System.out.println("Enter the Secount Number");
      int no2 = b.nextInt();

      int sum = no1 + no2;
      System.out.println("Sum of two numers are : "+sum);


    }
}