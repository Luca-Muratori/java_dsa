public class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
        System.out.println("the trie has been created");
    }

    // insert
    public void insert(String word) {//TC ON----SC ON
        TrieNode currentNode = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                currentNode.children.put(ch, node);
            }
            currentNode = node;
        }
        currentNode.endOfString = true;
        System.out.println("word Succesfully inserted ");

    }

    public boolean search(String word){//TC ON----SC O1
        TrieNode currentNode=root;
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            TrieNode node=currentNode.children.get(ch);
            if(node==null){
                System.out.println("WOrd does not exist in trie");
                return false;
            }
            currentNode=node;
        }
        if(currentNode.endOfString==true){
            System.out.println("WOrd does exist in trie");
            return true;
        }else{
            System.out.println("WOrd does not exist in trie, but it's a prefix of another string");
        }
        return currentNode.endOfString;
    }


    public boolean delete(TrieNode parentNode, String word, int index){
        char ch=word.charAt(index);
        TrieNode currentNode=parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
        if(currentNode.children.size()>1){
            delete(currentNode, word, index+1);
            return false;
        }
        if(index==word.length()-1){
            if(currentNode.children.size()>=1){
                currentNode.endOfString=false;
                return false;
            }else{
                parentNode.children.remove(ch);
                return true;
            }
        }
        if(currentNode.endOfString==true){
            delete(currentNode, word, index+1);
            return false;
        }
        canThisNodeBeDeleted=delete(currentNode, word, index+1);
        if(canThisNodeBeDeleted){
            parentNode.children.remove(ch);
            return true;
        }else{
            return false;
        }
    }

    public void delete(String word){
        if(search(word)==true){
            delete(root,word, 0);
        }
    }

}
