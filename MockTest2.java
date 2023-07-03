import java.util.LinkedList;
import java.util.Scanner;

public class MockTest2 {
    // Question no. 1..
    // Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
    public static void Integer(int a){
        if(a == 0){
            System.out.println("The given number is 0");
        }
        else if (a > 0){
            System.out.println("The given number is positive..");
        }
        else if(a<0){
            System.out.println("The given number is negative..");
        }
    }
    // Question no. 2..
    // Write a java program to print fibonacci series up to given number...
    public static void FibonacciSeries(int n){
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    
    // Question no.. 3..
    // Writing a java program to calculate the average of a list of given numbers using do-while loop..
    public static float Average(){
       LinkedList<Integer> ll = new LinkedList<>();
       System.out.println("Enter negative number to stop..");
       Scanner sc = new Scanner(System.in); 
       int number;
        do{
            number = sc.nextInt();
            if(number > 0){
                ll.add(number);
            }
            else{
                break;
            }
    
       }while(true);
       int sum = 0;
       for(int ele : ll){
            sum += ele;

       }
       return sum / ll.size();
    }

    // Question no..4
    // Write a java program to find the largest of three numbers using nested if - else statement..
    public static void largestOfThree(int a, int b, int c){
        if(a> b){
            if(a>c){
                System.out.println("The largest of given three numbers the numbers is :: "+a);
            }
            else{
                System.out.println("The largest of given three numbers the numbers is :: " +c);
            }
        }
        else{
            if(b>c){
                System.out.println("The largest of given three numbers the numbers is :: " +b);
            }
            else{
                System.out.println("The largest of given three numbers the numbers is :: " +c);
            }
        }
    }

    // Question no.. 5..
    // Write a Java program to declare and initialize variables of different data types (int, double, String) with appropriate identifiers.
    public static void declareVariables(int age, double weight, String name){
        System.out.println("Age ::" + age);
        System.out.println("Weight ::" + weight);
        System.out.println("Name ::" + name);
    }
    public static void main(String[] args) {
        System.out.println(Average());
        // FibonacciSeries(a);
        // Integer(a);
        // largestOfThree(a, b, c);
    }
}
