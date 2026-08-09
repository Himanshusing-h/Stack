import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
//using arraylist
public class ReversingStackM2 {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        //what done
        //we created arraylist
        //removing element and adding it to arraylist
        //when the stack is empty
        //traversing arraylist in reverse order and adding element to stack that how we reverse stack using arraylist

        st1.push(10);
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        while (st1.size()>0){
            int temp=st1.pop();
            arr.add(temp);
        }
        int n=arr.size()-1;//last index
        while (n>=0){
            st1.push(arr.get(n));
            n--;
        }
        System.out.println(st1);

    }

}
