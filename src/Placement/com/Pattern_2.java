package Placement.com;

public class Pattern_2 {
    public static void main(String[] args) {
        /*
        1.
        for (int i=1;i<=5;i++)
        {
          for (int j=1;j<=i;j++)
          {
              System.out.print(j);
          }
            System.out.println(" ");
        }

        2.
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }


        3.
        int count=0;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println(" ");
        }
        Alphabet
        1.
         */
        char i,j;
        for (i='A';i<='E';i++)
        {
            for (j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}
