import java.util.Scanner;
import java.util.Stack;

public class AddOrRemoveAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        Scanner sc=new Scanner(System.in);
        st1.push(10);
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        //adding element at index
        //size > ind will remove element above that index and we will store it in another stack
        //then will add element at thet index
        //then we will add element that we removed
        System.out.println("Enter number to be added");
        int ele=sc.nextInt();
        System.out.println("Enter index at which the number to be added");
        int ind=sc.nextInt();
        //important line st1.size()>ind
        while(st1.size()>ind)
        {
            int temp=st1.pop();
            st2.push(temp);
        }
        st1.push(ele);
        while(st2.size()>0){
            int temp=st2.pop();
            st1.push(temp);
        }
        System.out.println(st1);
    }
}
