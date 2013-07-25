import java.util.*;

public class Application {
    public static void main(String args[]){
        prompt();
    }
    static Scanner scanner = new Scanner(System.in);

    //LINKED LIST TASK COMMENTED OUT
    /*
    static IntLinkedList myList = new IntLinkedList();

    public static void prompt(){
        System.out.println("Add n:");
        int n = scanner.nextInt();
        myList.insert(n);
        myList.print();
        prompt();
    }
    *///END LINKED LIST COMMENTED OUT


    //STACK TASK
    static IntStack myStack = new IntStack();

    public static void prompt(){
        System.out.println("Enter 'push' or 'pop'");
        String action = scanner.next();
        if(action.contains("push")){
            System.out.println("Enter n");
            int n = scanner.nextInt();
            myStack.push(n);
        }else {
            if (action.contains("pop")) {
                myStack.pop();
            }
        }
        myStack.print();
        prompt();
    }

}
