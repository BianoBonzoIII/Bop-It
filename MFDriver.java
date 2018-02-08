/*
  Bop It 
  Brian Lin, Aleksandra Koroza, Isaac Jon  
  APCS2 pd2
  L00 -- But What Does the Data Say?
  2018-02-08
*/

public class MFDriver {

    //populates a matrix
    public static int[][] populateArray (int length) {
	int[][] arr = new int[length][length];
	int pop = 1;
	for (int x = 0; x < arr.length; x++){
	    for (int y = 0; y < arr[x].length; y++){
		arr[x][y] = pop;
		pop += 1;
	    }
	}
	return arr;
    }
    
    //runs matrixSearch 1 million times, calculate the average run time, and 
    //send that data to a csv file
    public static long getAverage (int[][] arr, int target) { 
	long sum = 0;
	for (int x = 0; x < 1000000; x++) {
	    long startTime = System.nanoTime();
	    MatrixFinder.matrixSearch(arr, target);
	    long endTime = System.nanoTime();
	    sum += (startTime - endTime);
	}
	long averageTime = (long) (sum / 1000000.0);
	return averageTime;
    }

    
    public static void main (String[] args) {
	/************
         a few lines of csv file stuff will go in between each of those 3 sections
	 *********/
        for (int x = 1000; x < 10000; x+=100) {
	    int[][] array = populateArray(x);
	    // =============== Best ===============
	    getAverage( array, (array[x-1][0]) );
	    // ====================================
	    
	    // =============== Middle ===============
	    getAverage( array, (array[x/2][x/2]) );
	    // ====================================

	    // =============== Worst ===============
	    getAverage( array, (array[0][x-1]) );
	    // ====================================
	    
	}
    }
}
