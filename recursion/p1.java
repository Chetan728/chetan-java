
// problem 1 - print the number from 5 to 1 with the help of recursion concept 
public class p1 {
    public static void main(String[] args) {
        printNum(5);
    }
  public static void printNum(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    printNum(n-1);
  }
}
