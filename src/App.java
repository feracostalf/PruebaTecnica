import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    App(){}
    public static void main(String[] args) throws Exception {
        System.out.println("is balanced: "+ isBalanced("( ( )"));
        System.out.println("is balanced: "+ isBalanced("( ( ) ) )"));
        System.out.println("is balanced: "+ isBalanced("( { [ ] } }"));
        System.out.println("is balanced: "+ isBalanced("( ( ( ) ) )"));
        System.out.println("is balanced: "+ isBalanced("( ) { } [ ]"));
        System.out.println("is balanced: "+ isBalanced("( { [ ] } )"));


    }

    public static boolean isBalanced(String input){
        String[] braces=input.split(" ");
        Deque<String> queue = new ArrayDeque<>();
        Map<String,String> map=new HashMap<String,String>();  
        map.put("}","{");  
        map.put("]","[");  
        map.put(")","(");  

        System.out.println(Arrays.asList(braces));

        for(String brace : braces){
            if(map.values().contains(brace)){ //open braces
                queue.add(brace);
                continue;
            }
          
            if(map.keySet().contains(brace)){ //close braces
                if(!map.get(brace).equals(queue.peekLast())){
                    return false;
                }
                queue.pollLast();
            }          
        }
        if(queue.isEmpty()) return true;
        return false;
    }
}
