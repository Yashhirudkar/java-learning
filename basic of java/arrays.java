
// syntax of array
//datatype[] arrayName = new datatype[size];
//datatype arrayName[] = { , };

// class DemoArray{
//     public static void main(String[] args){
//         int a[] = new int[5];
//         a[0] = 5;
//         a[1] = 2;
//         a[2] = 10;
//         a[3] = 8;
//         a[4] = 3;

//         for(int i = 0 ; i < a.length ; i++){
//             System.out.println("Array element at index " + i + " is : " + a[i]);
//         }
//     }
// }

// class DemoArray{
//  public static void main(String[] args){
//     int[] a = {5,2,10,8,3};  

//     for(int i = 0 ; i < a.length ; i++){
//         System.out.println("Array element at index " + i + " is : " + a[i]);
//     }
//    }   
// }

//class DemoArray1{
//    public static void main(String[] args){
//        int sum = 0;
//        int arr[] = {1,2,3,4,5};
//
//        for(int i = 0; i < arr.length; i++){
//             sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }
//}

//class arrays{
//    public static void main(String[] args) {
//        int[] arr = {5, 10, 15};
//
//        System.out.println(arr[1]);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
//    }
//}
//

//sum of numbers
//class dsaarrys1{
//    public static void main(String[] args){
//        int[] arr = {10, 20, 30, 40};
//        int sum = 0;
//        for(int a = 0 ; a < arr.length; a++){
//            sum = sum + arr[a];
//        }
//        System.out.println(sum);
//    }
//}

//max no in array
//class MaxNo{
//    public static void main(String[] args){
//        int[] arr = {5, 12, 3, 20, 8};
//        int max =0;
//        for(int i = 0; i <= arr.length - 1 ; i++){
//            if(max < arr[i]){
//             max = arr[i];
//            }
//
//        }
//        System.out.println(max);
//    }
//}

//even/odd no
//class EvenOdd {
//   public static void main(String[] args) {
//       int[] arr = {2, 5, 8, 7, 10, 3};
//
//       for(int i=0; i<arr.length; i++){
//
//       if(arr[i] % 2 == 0){
//           System.out.println("Even no is " +arr[i]);
//       }else {
//           System.out.println("Odd no is " +arr[i]);
//       }
//       }
//    }
//}

//Reverse Array Print
//class reverseArray{
//    public static void main(String[] args){
//   int[] arr = {10,20,30,40,50};
//   for (int i = arr.length -1 ; i >= 0 ; i--){
//            System.out.println("reverys arrays is "+arr[i]);
//        }
//
//    }
//}

//Find Element (Linear Search)
//class SearchingElement{
//    static void main(String[] args) {
//        int[] arr = {5,10,15,20,25};
//        int a =15;
//        for(int i=0; i < arr.length-1 ; i++){
//            if(arr[i] == a){
//                System.out.println("Element "+arr[i]+" is Found in arrry");
//            }else{
//                System.out.println("Element "+arr[i]+" is not Found in arrry");
//            }
//        }
//
//    }
//}


//Duplicate Element find in array
// class DuplicateElement{
//     public static void main() {
//         int[] arr = {5,10,15,20,25};
//         boolean found = false;
//         for(int i=0; i < arr.length; i++){
//             for(int j=i+1; j < arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     System.out.println("Duplicate Element Finded "+arr[i]);
//                      found = true;
//                 }
//             }
//         }
//         if(!false){
//             System.out.println("There is no duplicate");
//         }
//     }
// }