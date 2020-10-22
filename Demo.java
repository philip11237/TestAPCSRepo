public class Demo{
  public static void printLoop(int n){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n - i; j++){
        System.out.print(i+1);
      }
      System.out.println("");
    }
  }
  public static void main(String[] args){
    /*  if (args.length==0){
    printLoop(5);
  }
  else {printLoop( Integer.parseInt(args[0]));}*/
  int [][] nums=create2DArrayRandomized(5,14,5);
  System.out.println(arrayDeepToString(nums).replace("}, ","},\n "));

}
public static String arrToString(int [] arr){
  String empty = "{";
  for (int i = 0; i <arr.length; i++) {
    if (i==arr.length-1){
      empty += arr[i];
    }
    else {
      empty += arr[i]+", ";
    }
  }
  return empty+="}";
}
public static String arrayDeepToString(int [][] arr){
  String empty = "{";
  for (int i = 0; i <arr.length; i++) {
    if (i==arr.length-1){
      empty += arrToString(arr[i]);
    }
    else {
      empty += arrToString(arr[i])+", ";
    }
  }
  return empty+="}";
}
public static int [][] create2DArray(int rows, int cols, int MaxValue){
  int [][]result = new int [rows][cols];
  for (int r = 0; r <rows; r++){
      for (int c = 0;c<cols; c++) {
        result[r][c]=(int)((Math.random())*(MaxValue+1));
      }
    }
    return result;
}
public static int [][] create2DArrayRandomized(int rows, int cols, int MaxValue){

  int [][]result = new int [rows][];
  for (int r = 0; r <rows; r++){
    int rcols= (int)(Math.random()*(cols+1));
    result[r]=new int [rcols];
    for (int c = 0;c<rcols; c++) {
      result[r][c]=(int)((Math.random())*(MaxValue+1));
}
}
return result;
}
}
