public class NUmberOfPath {
    public int numberOfPath(int arr[][], int row, int col, int cost){
        if(cost<0){
            return 0;
        }
        if(row==0&&col==0){
            return (arr[0][0]-cost==0)?1:0;
        }
        if(row==0){
            return numberOfPath(arr, 0, col-1, cost-arr[row][col]);
        }
        if(col==0){
            return numberOfPath(arr, row-1, 0, cost-arr[row][col]);
        }

        int numberOfPathRow =numberOfPath(arr, row-1, col, cost-arr[row][col]);
        int numberOfPathCol =numberOfPath(arr, row, col-1, cost-arr[row][col]);

        return numberOfPathRow+numberOfPathCol;
    }
}
