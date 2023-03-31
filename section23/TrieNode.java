import java.util.*;
public class TrieNode {
    Map<Character, TrieNode> children;
    boolean endOfString;

    public TrieNode(){
        children=new HashMap<>();
        endOfString=false;
    }

    
}
