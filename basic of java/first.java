import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Hello Bhai");
        //Scanner is funtion to take input form user
        //sc is variable
        //new is use to crete obj
        //System.in use to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        System.out.println("Enter age:");
        //nextInt()    → integer
        //nextDouble() → decimal
        //next()       → one word
        //nextLine()   → full sentence
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name+"age is : "+age);

        //variables baisc
//        int a = 10;
//        String b = "yash";
//        float c = 1.5f;
//        boolean d = true;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
    }
}
