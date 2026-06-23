import java.util.Scanner;

class third{
    public static void main(String[] args) {
        int age = 18;
        Scanner b = new Scanner(System.in);
        System.out.println("Enter Your age number");
        int no2 = b.nextInt();

        //logic part if/else

        if(age == no2){
            System.out.println("You are verified");
        }
        else if(age >= no2){
            System.out.println("You are verified  cause verified age limit is less then enterd age " + age );
        }
        else{
            System.out.println("age is not greater  cause verified age limit is more then enterd age ");
        }
    

    }
}