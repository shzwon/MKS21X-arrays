public class ArrayDemo {
  public static void printArray(int[] array){
    String string = "[";
    for(int i = 0; i<array.length; i++){
      string += array[i];
      if (i< array.length-1){
        string += ",";
      }
    }
    string += "]";
    System.out.println(string);
  }

  public static void printArray(int[][] array){
    String string = "[";
    for(int i = 0; i<array.length; i++){
      string += "{";
      for(int j=0; j<array[i].length; j++){
        string+=array[i][j];
        if (j<array[i].length-1){
          string += ",";
        }
      }
    string += "},\n";
  }
    string += "]";
    System.out.println(string);
  }

  public static int countZeros2D(int[][] vals) {
   int count = 0;
    for (int i = 0; i < vals.length ; i++) {
      for(int j = 0; j < vals[i].length ; j++) {
        if ( vals[i][j] == 0 ) {
          count += 1;
        }
      }
    }
    return count;
  }


  public static void fill2D(int[][] vals){
    for (int i=0; i<vals.length; i++) {
      for (int j=0; j<vals[i].length; j++) {
        if (i==j) {
          vals[i][j] = 3;
        } else {
          vals[i][j] = 1;
        }
      }
    }
  }

  public static int[][] fill2DCopy(int[][] vals){
      int[][] result = new int[vals.length][vals[0].length];
      for (int i = 0; i < vals.length; i++) {
        for (int j = 0; j < vals[i].length; j++) {
          if (vals[i][j] < 0) {
            result[i][j] = 3;
          } else {
            result[i][j] = 1;
          }
        }
      }
      return result;
    }


//Test case Functions

public static void main(String[] args) {
 // 0a. Make a function to print a 1D array of ints.
  printArray(new int[]{1,1});
  printArray(new int[]{1,2,3,4});
  printArray(new int[]{1,20,300,4000});



 // 0b. Make a function to print a 2d array of ints.
  int[][] testCase1 = new int [][]{
    {1,1,1,1},
    {10,10,10,10},
    {300,300,300,300,300},
  };

  printArray(testCase1);


 // F1. Calculate and return how many zeros are in the parameter
  int[][] testCase2 = new int [][]{
    {0,1},
    {2,0,2},
    {3,3,0,3},
  };

  System.out.println(countZeros2D(testCase1));
  System.out.println(countZeros2D(testCase2));



 /*2a. Modify a given 2D array of integer as follows:
Replace all the of values with 1's
EXCEPT when the row number is the same as the column number:
you must fill those with 3's instead.
  */
  int[][] testCase3 = new int [][]{
    {1,1,0,1,10},
    {0,2,2,2,20},
    {3,0,3,3,30},
  };
  fill2D(testCase1);
  fill2D(testCase2);
  fill2D(testCase3);


 /*2b. Make a new 2d array the same dimensions as the given parameter.
Fill that array with with 1's,
except where the value of the original array is negative:
you must fill those with 3's instead. Got help with test cases Functions
from neighbor. Had trouble with testCase functions.
  */
  int[][] testCase4 = new int [][]{
    {1,-1,0,1,10},
    {0,2,-2,2,20},
    {3,0,-3,3,30},
  };

  printArray(fill2DCopy(testCase4));
}

//neighbor helped me with test case functions and how to make them work.

}
