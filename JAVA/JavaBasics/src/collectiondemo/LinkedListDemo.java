

package collectiondemo;

import java.util.*;
/* LINKEDLIST
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> language = new LinkedList<String>();
        language.add("java");
        language.add("python");
        language.add("js");
        language.add("HTML");
        language.add("CSS");
        System.out.println(language);
        if(language.contains("java"))
        {
        	System.out.println("yes java is there");
        }
        else {
        	System.out.println("there is no java");
        }
    }
}

*/

/*
 * QUEUE LIST
public class LinkedListDemo {

    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<String>();
        
        //String[]listfruits= {"apple"}
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("grapes");
        System.out.println(fruits);
        System.out.println("first element of queue is :"+fruits.peek());
        String ele=fruits.poll();
        System.out.println("first element to out of the  queue is :"+ele);
        System.out.println("now fst element of the queue is :" +fruits.peek());
        
        
//        if(fruits.contains("java"))
//        {
//        	System.out.println("yes java is there");
//        }
//        else {
//        	System.out.println("there is no java");
//        }
    }
}

*/


/*
//DEQUE LIST
public class LinkedListDemo {

    public static void main(String[] args) {
    	Deque<String> fruits = new LinkedList<String>();
        
        //String[]listfruits= {"apple"}
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("grapes");
        System.out.println(fruits);
        System.out.println("first element of queue is :"+fruits.peek());
        String ele=fruits.poll();
        System.out.println("first element to out of the  queue is :"+ele);
        System.out.println("now fst element of the queue is :" +fruits.peek());
        System.out.println(fruits.offer("dragonFruit"));
        System.out.println(fruits);
        
        
//        if(fruits.contains("java"))
//        {
//        	System.out.println("yes java is there");
//        }
//        else {
//        	System.out.println("there is no java");
//        }
 
    }
}
*/


public class LinkedListDemo {

    public static void main(String[] args) {
        Stack<Integer> scores = new Stack<>();
        scores.push(120);
        scores.push(220);
        scores.push(200);
        scores.push(70);
        System.out.println("scores in stack :"+scores);
        System.out.println("remove the last score: "+scores.pop());
        System.out.println(scores);
        System.out.println("add the score is :"+ scores.push(20));
        System.out.println(scores);
        System.out.println("the last element of the score is : "+scores.peek());
        int position=scores.search(220);
        System.out.println("position of 220 score is "+position);
    }
}














