###### Bop It 
###### Brian Lin, Aleksandra Koroza, Isaac Jon  
###### APCS2 pd2
###### L00 -- But What Does the Data Say?
###### 2018-02-08

# Hypothesis
*For an n x n matrix, the worst-case execution time of our search method is O(n)*

# Background 
The Mechanics of Our Algorithm: 
1) Start in the bottom left corner of the matrix
2) If the value at that index is larger than the target, move up a row 
3) Otherwise, move right across the column
4) Repeat steps 2-3 on whatever element it is currently on, until the target is found, then return the coordinates of the vaule
5) If not, return (-1,-1)


Let x = size of the matrix <br />
Best Case: Target is at the bottom left corner; (array[x-1][0]) <br />
Worst Case: Target is at top right corner; (array[0][x-1]) <br />
For the purposes of our experiment, we also defined a middle case to be (array[x/2][x/2]) which is roughly the center of the matrix.

# Experiment methodology
For our experiment, we wanted to test the runtime of our algorithm as the n x n matrix increases in size. 
First, we created two methods, populateArray() and getAverage(). Method populate fills a matrix with consecutive integers 
increasing by 1, starting at 1. 

For example, in a 3 x 3 matrix, the elements would be <br />
| 1 2 3 | <br />
| 4 5 6 | <br />
| 7 8 9 | <br />

Our method getAverage() returned the average time, in nanoseconds, it takes for the search algorithm to find its value in a given matrix. Average runtime is computed by repeating each matrixSearch() operation 10,000 times and dividing by number of iterations.


Procedure:
1) Start with a 1,000 x 1,000 matrix
2) Find the average runtime of the best, worst, and middle case for the matrix.
3) Repeat step 2 on each matrix with size increasing by 50, up to size 10,000 x 10,000. 
4) Input the data into the csv file through a terminal redirect


# Results
![alt text](screenshots/result.png "") <br />
Link to GoogleSheets: https://docs.google.com/spreadsheets/d/1Yr_G6eNgB9Mb6IuLTP8lBSbK6iTulzi0MC4QCRFjxJg/edit?usp=sharing

# Discussions and Sources of Error
Our results show a generally linear trend. However, towards the end of the data, the line becomes a bit random, spiking up and back down. The spiking increases as the matrix size approaches 10,000 and we predict that the trend would continue if the size were to be increased. This may be due to not enough repetitions (10,000) of our experiment and background processes on our computers. When running the experiment, we noticed that the spiking was inconsistent, meaning that at certain matrix sizes there were outliers. Thus, we are not sure if we are truly timing only the process of our search algorithm and not extraneous tasks.

As expected, the best case results returned a relatively constant runtime. This can be seen on the graph as the blue line. 
Both the middle and worst cases returned a general linear trend. We hypothesized that the middle case would return a linear increase of a shorter average runtime than the worst case.

We chose to run the same matrix for each trial of matrix size x and chose a specific target location (instead of searching for an actual value) to try to ensure that we use the case we desired. It was easier and more efficient for us as coders to create matrices in this way. 

# Conclusion
Based on our results, we can conclude that the algorithm is indeed O(n) runtime for the worst and middle cases. As the size of the matrix increases, the resulting line steadily increases at a linear rate for both the worst case and middle case scenarios. 

