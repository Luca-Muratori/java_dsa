public class LPS {
    private int findLPS(String st, int start, int end){
        if(start>end){
            return 0;
        }
        if(start==end){
            return 1;
        }
        int count1=0;
        if(st.charAt(start)==st.charAt(end)){
            count1=2+findLPS(st, start+1, end-1);
        }
        int count2=findLPS(st, start+1, end);
        int count3=findLPS(st, start, end-1);
        return Math.max(count1, Math.max(count2, count3));
    }

    public int findLPS(String st){
        return findLPS(st, 0, st.length()-1);
    }
}
