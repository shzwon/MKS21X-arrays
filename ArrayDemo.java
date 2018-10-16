public class ArrayDemo {
  public static void printArray(int[] array){
    String string = "{";
    for(int i = 0; i<array.length; i++){
      string += array[i];
      if (i< array.length-1){
        string += ",";
      }
    }
    string += "}";
    System.out.println(string);
  }

  public static void printArray(int[][] array){
    String string = "{";
    for(int i = 0; i<array.length; i++){
      string += "{";
      for(int j=0; r<array[i].length; j++){
        string+=array[i][j];
        if (r<array[i].length-1){
          string += ",";
        }
      }
    string += "},\n";
  }
    string += "}";
    System.out.println(string);
  }



  public static int countZeros2D(int[][] vals){
    int count = 0;
    for (int i=0; i<vals.length; i++) {
      for (int j=0; j<vals[i].length; j++) {
				if(array[i][j] == 0) {
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
      int[][] ans = new int[vals.length][vals[0].length];
      for (int i=0; i<vals.length; i++) {
        for (int j=0; j<vals[i].length; j++) {
          if (vals[i][j] < 0) {
            ans[i][j] = 3;
          } else {
            ans[i][j] = 1;
          }
        }
      }
      return ans;
    }






}
