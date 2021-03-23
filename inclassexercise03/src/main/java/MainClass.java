import java.util.*;

public class MainClass {
    
    public static void main(String[] args){
        
        Queue<Integer> myQueue = new LinkedList();
        Stack<Integer> myStack = new Stack();
        
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        
        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        
        System.out.println("My queue: " + myQueue);
        System.out.println("My stack: " + myStack);
        //dont need a for loop to go through the queue and stack
        
        int headOfQueue = myQueue.remove();
        int headOfStack = myStack.pop();
        
        System.out.println("After removing/popping the head element:");
        System.out.println("My queue: " + myQueue);
        System.out.println("My stack: " + myStack);
        
//        Queue<String> myStringQueue = new LinkedList();
//        Stack<String> myStringStack = new Stack();
//        
//        myStringQueue.add("Racecar");
//        myStringStack.add("Racecar");
//        
//        String lastLetterQueue = myStringQueue.remove();
//        String lastletterStack = myStringQueue.element();
//        
//        System.out.println(lastLetterQueue);
//        System.out.println(lastletterStack);
        
          System.out.println(isPalindrome("abcba"));
    }
    
    public static Boolean isPalindrome(String word){
        char[] wordArray = word.toCharArray();
        
        Queue<Character> wordQueue = new LinkedList();
        Stack<Character> wordStack = new Stack();
        
        for (int i = 0; i<wordArray.length; i++){
            wordQueue.add(wordArray[i]);
            wordStack.add(wordArray[i]);
        }
        
        for (int i = 0; i<wordArray.length; i++){
            if(wordQueue.remove() != wordStack.pop()){
                return false;
            }
        }
        
        return true;
        
    }
    
}
