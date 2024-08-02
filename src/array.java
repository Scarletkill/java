public class array{
    public static void main(String[] args) throws Exception{
        //declaring and initializing 2D array
        //int[,] intarr = new int [2,3] {{1,2,3},{4,5,6}};
        int arr[][]={{1,2,3},{2,3,4},{3,4,5}};
        //printing 2D arrray
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}