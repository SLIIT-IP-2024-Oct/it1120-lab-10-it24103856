import java.util.Scanner;
         public class IT24103856Lab10Q2{
            public static void main(String[] args){
      Scanner input=new Scanner(System.in);
    
           System.out.print("Enter marks(0-100) :");
            int mark=input.nextInt();
        
          assert (mark>=0 && mark<=100):"Invalid Mark";
         System.out.println("Marks is validated");
        
      char grade='F';
          if (mark >= 75) {
            grade = 'A';
      }else if(mark >=60){
             grade='B';
      }else if(mark >=50){
             grade='C';
     }else if (mark>=40){
            grade='D';
      }
          




   assert (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') : "Incorrect Grade Assigned";
        
          System.out.println("Grade is : " + grade);
      }          
} 
