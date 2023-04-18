import java.util.Scanner;

public class HollowRectangle{
    public static void hollowrect(int totRows,int totCol){
        //outer loop(rows)
        for(int i=1 ; i<= totRows ; i++){
            //inner loop(columns)
            for(int j= 1 ;j<= totCol ;j++){
                //cell -(i,j)
                if( i==1 || i==totRows || j==1 || j==totCol){
                    // boundary cells
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            //next line
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Scanner read= new Scanner(System.in);
        System.out.println("Enter total number of rows :-");
        int Rows=read.nextInt();
        System.out.println("Enter total number of columns :-");
        int Col=read.nextInt();
        hollowrect(Rows,Col);

        read.close();
    }
}

/*

<<expected output>>
 rows-3
 columns-5


 *****
 *   *
 *****
 */