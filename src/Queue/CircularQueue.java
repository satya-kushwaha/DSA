package Queue;

// Not come more quantion in interView but some time will asked their implemention
public class CircularQueue {
    int[] arr;
    int f,r;
    int cap, cSize;
    CircularQueue(int size){
        cap = size;
        cSize =0;
        arr = new int[cap];
        f=0;r=-1;
    }

    void push(int data){
        if(cSize == cap){ // Full
            System.out.println("Circular queue is full \n");
            return;
        }
        r =(r+1)% cap;
        arr[r] =data;
        cSize++;
    }
    void pop(){
        if(cSize == 0){
            System.out.println("Circular queue is Empty \n");
            return;
        }
        f = (f+1) % cap;
        cSize--;
    }
    int front(){
        if(isEmpty() ){
            System.out.println("Circular queue is Empty");
            return 0;
        }
        return arr[f];
    }
    boolean isEmpty(){
        return cSize == 0;
    }
    void printArr(){
        for(int i=0;i<cap;i++){
            System.out.println("\t"+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

     CircularQueue cir = new CircularQueue(3);
     cir.push(1);
     cir.push(2);
     cir.push(3);
        cir.pop();
     cir.push(4);
//        cir.printArr();
        while (!cir.isEmpty()){
            System.out.print(cir.front()+"\t");
            cir.pop();
        }
        System.out.println();
    }

}
