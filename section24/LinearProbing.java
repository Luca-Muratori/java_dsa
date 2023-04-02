import java.util.*;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
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

    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0 / hashTable.length;
        return loadFactor;
    }

    public void rehashKeys(String word) {
        usedCellNumber=0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
            data.add(word);
            hashTable = new String[hashTable.length * 2];
            for (String st : data) {
                insertInHashTable(st);
            }
        }
    }

    public void insertInHashTable(String word){
        double loadFactor=getLoadFactor();
        if(loadFactor>=0.75){
            rehashKeys(word);
        }else{
            int index=modASCII(word, hashTable.length);
            for (int i = index; i < index+hashTable.length; i++) {
                int newIndex=i%hashTable.length;
                if (hashTable[newIndex]==null) {
                    System.out.println("word succesfully inserted");
                    break;
                }else{
                    System.out.println("index is already occupied");
                }
            }
        }
        usedCellNumber++;
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

    public boolean search(String word){
        int index=modASCII(word, hashTable.length);
        for (int i = index; i < index+hashTable.length; i++) {
            int newIndex=i%hashTable.length;
            if(hashTable[newIndex]!=null&&hashTable[newIndex].equals(word)){
                System.out.println("found at location "+newIndex);
                return true;
            }
        }        
        System.out.println("word not found");
        return false;
    }

    public void delete(String word){
        int index=modASCII(word, hashTable.length);
        for (int i = index; i < index+hashTable.length; i++) {
            int newIndex=i%hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word)){
                hashTable[newIndex]=null;
                System.out.println("word elted");
                return;
            }
        }
        System.out.println("value does not exist");
    }

    
}
