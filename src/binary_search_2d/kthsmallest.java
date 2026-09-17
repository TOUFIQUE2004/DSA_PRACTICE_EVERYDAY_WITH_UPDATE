package binary_search_2d;

public class kthsmallest {
   /* 378. Kth Smallest Element in a Sorted Matrix
            Medium
    Topics
    premium lock icon
            Companies
    Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.

    Note that it is the kth smallest element in the sorted order, not the kth distinct element.

    You must find a solution with a memory complexity better than O(n2)*/
    public int kthSmallest(int[][] matrix, int k) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]<k){}
        }
        return 0;
    }
}
