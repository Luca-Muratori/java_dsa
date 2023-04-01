import java.util.*;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    public int modASCII(String word, int M) {
        char ch[];
        ch = word.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public void insert(String word) {
        int newIndex = modASCII(word, hashTable.length);
        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        } else {
            hashTable[newIndex].add(word);
        }
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash table does not exist");
            return;
        } else {
            System.out.println("----------hash table-------------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("index " + i + ", key =" + hashTable[i]);
            }
        }
    }

    public boolean search(String word) {
        int newIndex = modASCII(word, hashTable.length);
        if (hashTable[newIndex] != null && hashTable[newIndex].contains(word)) {
            System.out.println("word found at location " + newIndex);
            return true;
        } else {
            System.out.println("word not found");
            return false;
        }
    }

    public void delete(String word) {
        int newIndex = modASCII(word, hashTable.length);
        boolean result = search(word);
        if (result == true) {
            hashTable[newIndex].remove(word);
            System.out.println("word has been deleted");
        }
    }
}