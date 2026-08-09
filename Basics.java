import java.util.Stack;

public class Basics {
    public static void main(String[] args) {


        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        //this pop will remove element from the top
        st.pop();
        //this pop will print last element and then removes it
        System.out.println(st.pop());
        System.out.println(st);

    }
}
