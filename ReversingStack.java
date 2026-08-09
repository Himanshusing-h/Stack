import java.util.Stack;

public class ReversingStack {
    public static void main(String[] args) {
        //using three stack
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        st1.push(10);
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        //we will move element from 1 to 2 2 to 3 and then 3 to 1
        moveElement(st1,st2);
        moveElement(st2,st3);
        moveElement(st3,st1);
        System.out.println(st1);
    }
    //implementing DRY dont repeat yourself as we are just moving element so we make functionn which will do it
    public static void moveElement(Stack<Integer>sto,Stack <Integer>stt){
    while(sto.size()>0){
    int temp=sto.pop();
    stt.push(temp);
    }
    }
}