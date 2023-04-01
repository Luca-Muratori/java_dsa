class Main {
    public static void main(String[] args) {
        DirectChaining dc=new DirectChaining(15);
        dc.insert("The");
        dc.insert("Quick");
        dc.insert("Brown");
        dc.insert("fox");
        dc.insert("over");
        dc.displayHashTable();
        dc.search("fox");
        dc.delete("fox");
        dc.displayHashTable();
    }
}
