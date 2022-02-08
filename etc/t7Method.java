package etc;

public class t7Method {
    public static void main(String[] args) {
        int x=1;
        System.out.println("Before call x value: " + x);
        increment(x);
        System.out.println("After Call x value: " + x);
    }

    public static void increment(int n){
        ++n;
        System.out.println("Value of n: " + n);
    }
}
