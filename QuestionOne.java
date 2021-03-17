import java.util.Scanner;

public class QuestionOne {
    public static void main(String []args){
        Scanner numberScan = new Scanner(System.in);
        System.out.println ("Enter the desired width");
        int column=numberScan.nextInt();
        System.out.println("Enter the desired height");
        int row=numberScan.nextInt();

        int indexOfRowSpace = row / 2;
        int indexOfColumnSpace = column/2;

        for(int rowIndex=0; rowIndex<=row;rowIndex=rowIndex+1) {
             
            for(int columnIndex= 0; columnIndex <=column; columnIndex =  columnIndex+1){
                if(columnIndex == indexOfColumnSpace){
                    System.out.print("  ");
                }else{
                    
                    System.out.print("#"); 
                }
                 
            }
            if(rowIndex == indexOfRowSpace){
                System.out.println("");
                System.out.println("");
            }else{
                
                System.out.println("");
            }
        }
    }
}