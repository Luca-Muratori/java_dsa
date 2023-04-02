import java.util.*;

public class DoubleHashing {
    String[] hashTable;
    int usedCellNumber;

    DoubleHashing(int size) {
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

    public void rehashKeys(String word) {
        usedCellNumber = 0;
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

    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCII(word, hashTable.length);
            int counter=0;
            for (int i = index; i < index + hashTable.length; i++) {
                int newIndex = (i+(counter*counter)) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex]=word;
                    System.out.println("word succesfully inserted");
                    break;
                } else {
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

    private int addDigitsTogether(int sum){
        int value=0;
        while (sum>0) {
            value=sum%10;
            sum=sum/10;
        }
        return value;
    }

    public int secondHash(String x, int lenght){
        char ch[];
        ch=x.toCharArray();
        int i, sum;
        for(sum=0,i=0;i<x.length();i++){
            sum+=ch[i];
        }
        while(sum>hashTable.length){
            sum=addDigitsTogether(sum);
        }
        return sum % lenght;
    }

    public double getLoadFactor(){
        return  usedCellNumber*1.0/hashTable.length;
    }

    public void insertKey(String value){
        double loadFactor=getLoadFactor();
        if(loadFactor>=0.75){
            rehashKeys(value);
        }else{
            int x=modASCII(value,hashTable.length);
            int y=secondHash(value, hashTable.length);
            for (int i = 0; i < hashTable.length; i++) {
                int newIndex=(x+i*y)%hashTable.length;
                if(hashTable[newIndex]==null){
                    hashTable[newIndex]=value;
                    System.out.println("value inserted");
                    break;
                }else{
                    System.out.println("try next index....");
                }
            }
        }
        usedCellNumber++;
    }



    public boolean search(String word) {
        int index = modASCII(word, hashTable.length);
        for (int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                System.out.println("found at location " + newIndex);
                return true;
            }
        }
        System.out.println("word not found");
        return false;
    }

    public void delete(String word) {
        int index = modASCII(word, hashTable.length);
        for (int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println("word elted");
                return;
            }
        }
        System.out.println("value does not exist");
    }

}
