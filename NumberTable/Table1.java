public class Table1
{
    public void getNumber(int height, int width)
    {
        int counter = 1;
      for (int i = 0; i < height; i++) 
      {
        System.out.println("");
        for (int j = 0; j < width; j++) 
        {
          if(counter<=9)
          {
              if(j>=0 && j<width-1)
              {
                System.out.print("|  " + counter++ + "   ");
              }
              else
              {
                System.out.print("|  " + counter++ + "   |");
              }
          }
          else if(counter>=10 && counter<100)
          {
              if(j>=0 && j<width-1)
              {
                System.out.print("|  " + counter++ + "  ");
              }
              else
              {
                System.out.print("|  " + counter++ + "  |");
              }
          }
          else
          {
            if(j>=0 && j<width-1)
            {
              System.out.print("| " + counter++ + " ");
            }
            else
            {
              System.out.print("| " + counter++ + " |");
          }
        }           
      } 
    }
}}