/*
Bop It 
Brian Lin, Aleksandra Koroza, Isaac Jon  
APCS2 pd2
 */

public class MFDriver {

    //populates a matrix
    public static int[][] populateArray (int length) {
	int[][] arr = new int[length][length];
	int pop = 1;
	for (int x = 0; x < arr.length;x++){
	    for (int y = 0;y < arr.length;y++){
		arr[x][y] = pop;
		pop += 1;
	    }
	}
	return arr;
    }
    
    //runs matrixSearch 1 million times, calculate the average run time, and 
    //send that data to a csv file
    public static void runTrial (int[][] arr, int target) { 
	double sum = 0;
	for (int x = 0, x < 1000000, x++) {
	    startTime = System.nanoTime();
	    MatrixFinder.matrixSearch(arr, target);
	    endTime = System.nanoTime();
	    sum += (startTime - endTime);
	}
	double averageTime = sum / 1000000.0;
	//insert csv stuff here
    }

    public static void main (String[] args) {
    }
}
