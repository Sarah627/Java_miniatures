package com.company;
import java.util.Scanner;
public class Main {
    static final int SIZE  = 6;

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // declare identifiers
        String name, id;
        String[] coursesNames , letterGrades ;
        int[] creditHours, grades ;
        int totalHours, oldCompletedHours;
        float[] weights;
        float cgpa,gpa,oldGPA;

        // processing inputs:
        System.out.println("enter your name: ");
        name  = input.nextLine();
        System.out.println("Welcome! "+name);
        System.out.println("enter your id: ");
        id  = input.nextLine();
        System.out.println("enter current semester courses names: ");
        coursesNames = processingLiteralInput();
        System.out.println("enter credit hours for each course in the same order as courses names: ");
        creditHours = processingNumericalInput();
        System.out.println("enter grades in the same order as courses names: ");
        grades = processingNumericalInput();
        System.out.println("enter total completed hours this semester: ");
        totalHours = input.nextInt();
        System.out.println("enter your old gpa: ");
        oldGPA = input.nextFloat();
        System.out.println("enter the previous completed hours before this semester: ");
        oldCompletedHours = input.nextInt();

        // print the transcript:
        letterGrades = getLiteralGrades(grades);
        weights = calculateWeights(letterGrades);
        gpa = gpaCalculator(weights,totalHours,SIZE,creditHours);
        cgpa = cumulativeGPA(gpa,oldGPA,totalHours,oldCompletedHours);

        printTranscript(cgpa,gpa,name,id,letterGrades,coursesNames,oldCompletedHours,totalHours);


    }


    public static int[] processingNumericalInput(){
        int[] arr = new int[SIZE];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<SIZE;i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static String[] processingLiteralInput(){
        String[] arr = new String[SIZE];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<SIZE;i++){
            arr[i] = input.nextLine();
        }
        return arr;
    }


    public static void printTranscript(float cgpa , float gpa,
                                       String name, String id,
                                       String[] letterGrades, String[] coursesNames,
                                       int oldCompletedHours, int currentSemesterCompletedHours){
        String classification = id.substring(7);
        int index = 0;

        // identify the academic year of the student from his/her id
        int academicYear = switch(classification){
            case "Fr" -> 1;
            case "So" -> 2;
            case "Jr" -> 3;
            case "Sr" -> 4;
            default -> 0;
        };

        //print transcript
        System.out.printf(
                "Student's Name: %s \n" +
                "ID: %s \n" +
                "Academic Year: %d \n" +
                "Current Semester GPA: %.2f \n" +
                "CGPA: %.2f \n " +
                "Total Completed Hours: %d \n",
                name,
                id,
                academicYear,
                gpa,
                cgpa,
                (oldCompletedHours+currentSemesterCompletedHours));

        // print student's literal grades of each course:
        for(String grade : letterGrades){
            System.out.println("Course Name: " + coursesNames[index++] + " grade: "+ grade);
        }
    }


    public static float cumulativeGPA(float gpa, float oldGPA,
                                      int totalCompletedHours,int oldCompletedHours){

        return (gpa * totalCompletedHours + oldGPA * oldCompletedHours)/(oldCompletedHours+totalCompletedHours);
    }


    public static float gpaCalculator(float[] weights,
                                      int totalHours,
                                      int numberOfRegisteredCourses,
                                      int[] creditHours){
        float sum = 0.0f;


        for(int i = 0; i < numberOfRegisteredCourses; i++){
            sum += weights[i] * creditHours[i];
        }
        return sum / totalHours;
    }

    public static float[] calculateWeights(String[] letterGrade){
        float[] weights = new float[letterGrade.length];
        int index = 0;
        for(String grade : letterGrade){
            switch(grade){
                case "A+" -> weights[index++] = 4.0f;
                case "A" -> weights[index++] = 3.75f;
                case "B+" -> weights[index++] = 3.4f;
                case "B" -> weights[index++] = 3.1f;
                case "C+" -> weights[index++] = 2.8f;
                case "C" -> weights[index++] = 2.5f;
                case "D+" -> weights[index++] = 2.25f;
                case "D" -> weights[index++] = 2;
                default -> weights[index++] = 1;
            }
        }

        return weights;
    }

    public static String[] getLiteralGrades(int[] grades){
        String[] letterGrades = new String[grades.length];
        int index = 0;
        for(int grade : grades){
            if(grade < 50)
                letterGrades[index++] = "F";
            else if(grade < 60)
                letterGrades[index++] = "D";
            else if (grade < 65)
                letterGrades[index++] = "D+";
            else if (grade < 70)
                letterGrades[index++] = "C";
            else if (grade < 75)
                letterGrades[index++] = "C+";
            else if (grade < 80)
                letterGrades[index++] = "B";
            else if (grade < 85)
                letterGrades[index++] = "B+";
            else if (grade < 90)
                letterGrades[index++] = "A";
            else
                letterGrades[index++] = "A+";


        }

        return letterGrades;
    }


}
