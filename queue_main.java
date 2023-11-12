
public class queue_main{
    
public static void main(String[] args) 
{
    int x=1;
    LinkedStack<Integer> stack = new LinkedStack<Integer>();
    for (int i =0; i < 10; i++){
        stack.push(i);
    }
    LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
     for (int i =0; i < 10; i++){
        queue.enqueue(stack.pop());
    }
    Boolean check=false;
      for (int i =0; i < 10; i++){
        int element=queue.dequeue();
        if (element==x){
            check=true;
        }
        //System.out.println(element);
        stack.push(element);
    }
    for (int i =0; i < 10; i++){
        queue.enqueue(stack.pop());
    }
     for (int i =0; i < 10; i++){
        
        stack.push(queue.dequeue());
     }

    // for (int i =0; i < 10; i++){
        
    //     System.out.println(stack.pop());
    // }
    System.out.println(check);



}
}