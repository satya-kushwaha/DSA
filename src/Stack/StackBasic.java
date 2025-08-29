package Stack;

import java.awt.*;
import java.util.LinkedList;
import java.util.Vector;

public class StackBasic {

    //Using Vector implimations
//    Vector<Integer> num = new Vector();
    //Using list Vector implimeation
    List l = new List();
    LinkedList<Integer> num = new LinkedList<>();
    void push(int n){  //O(1)
         num.add(n);
    }
    void pop(){  //O(1)
        int size = num.size();
        if(size == 0){
            System.out.println("Stack is under flow");
        }else {
            num.remove(size-1);
        }

    }
    int top(){ //O(1)
        if(num.size() == 0){
            System.out.println("Stack is UnderFlow");
            return 0;
        }
        return num.size() -1;
    }
    boolean empty(){
        int si = num.size();
        if(si < 0 ){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }
    void travers(){
        for(int i =0;i<num.size()-1;i++){
            System.out.print(num.get(i));
        }
        System.out.println();
    }
    //using link list implemaion

    public static void main(String[] args) {
        StackBasic s = new StackBasic();
        //Vector
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.travers();
        s.pop();
        s.travers();

    }
}
