// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
public class Main
{
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int counter = 1;
    double gradeCurrent = 0; 
    int top1num = 0;
    String top1name = "-";
    
    System.out.print("Enter number of Student/s: ");
    int studCount = sc.nextInt();

     while(counter  <= studCount){
        double quiz1, quiz2, quiz3, standing , project , finalExam; 
        double totalQuiz, finalGrade;
            
        System.out.print("Student No."+counter+"\n");
        System.out.print("Enter Student Name: ");
        String studentName = sc.next();

        System.out.print("Enter Year and Section: ");
        String studentYrSec = sc.next();
        
        System.out.print("Enter Quiz 1: ");
        quiz1 = sc.nextInt();
        
        System.out.print("Enter Quiz 2: ");
        quiz2 = sc.nextInt();
        
        System.out.print("Enter Quiz 3: ");
        quiz3 = sc.nextInt();
        
        System.out.print("Enter Class Standing: ");
        standing = sc.nextInt();
        
        System.out.print("Enter Project: ");
        project = sc.nextInt();
        
        System.out.print("Final Exam: ");
        finalExam = sc.nextInt();
        
        totalQuiz = (((quiz1 + quiz2 + quiz3)/3)*.15);
        standing = (standing*.15);
        project = (project*.30);
        finalExam = (finalExam*.40);
        
        finalGrade = (totalQuiz + standing + project + finalExam);

        System.out.print("\nStudent Name: "+studentName+"\n");
        System.out.print("Year and Section: "+studentYrSec+"\n");
        System.out.print("Final Grade: "+finalGrade+"\n");
        if (finalGrade >+ 75){
            System.out.print("Remarks: PASSED\n\n");
        }else{
            System.out.print("Remarks: FAILED\n\n");
        }
        
        if(finalGrade>gradeCurrent){
            top1name = studentName;
            top1num +=1;
            gradeCurrent = finalGrade;
        }else{
            //
        }
        counter += 1;
      }
    System.out.print("The top 1 student is "+top1name+"\n");
    System.out.print("Student no. "+top1num+"\n");
    System.out.print("With the Final Grade of "+gradeCurrent+"\n");
 }
}
