import java.util.Stack;

public class traversing {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        //removing from st one by one and printing it and adding to st2
        while(st.size()>=1){
            int temp=st.pop();
            System.out.println(temp);
            st2.push(temp);
        }
        System.out.println(st);
        System.out.println(st2);
        //removing from st2 and adding to st
        while(st2.size()>=1){
            int temp=st2.pop();
            st.push(temp);
        }
        System.out.println(st);
        System.out.println(st2);
    }

}
