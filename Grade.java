import java.util.*;
class Grade
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the  number of Subjects ::");
        n = sc.nextInt();
        int [] marks = new int[n];
        int totalmarks=0;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("Enter Marks of Subjects" + (i + 1) + " :");
            marks[i] = sc.nextInt();
            totalmarks += marks[i];
        }
        double averagePercentage = (double) totalmarks / n;
         
        char grade ;
         if(averagePercentage >= 90)
         {
            grade = 'A' ;
         }
         else if (averagePercentage >= 80)
         {
            grade = 'B';
         }
         else if (averagePercentage >= 70)
         {
            grade = 'C' ;
         }
         else if (averagePercentage >= 60)
         {
            grade = 'D' ;
         }
         else if(averagePercentage >= 50)
         {
            grade = 'E' ;
         }
         else
         {
            grade = 'F' ;
         }
         System.out.println("\n ___Results___ ");
         System.out.println("Total Marks : " + totalmarks);
         System.out.println("Averge Percentage :" +averagePercentage + "%");
         System.out.println("Grade : " + grade);

         sc.close();
    }
}