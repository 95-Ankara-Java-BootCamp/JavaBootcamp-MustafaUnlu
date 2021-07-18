package com.company;

public class GradeCalculation {

    public static void main(String[] args) {

        int[] grades = {85, 55, 48, 63, 84, 95, 29, 37, 84};

        for(int i=0; i<grades.length; i++){

            if(grades[i]>90){
                System.out.println("Letter grade of the "+ (i+1) +" student is : AA ");
            }
            else if(grades[i]>84 && grades[i]<91){
                System.out.println("Letter grade of the "+ (i+1) +" student is : BA");
            }
            else if(grades[i]>69 && grades[i]<85){
                System.out.println("Letter grade of the "+ (i+1) +" student is : BB");
            }
            else if(grades[i]>59 && grades[i]<70){
                System.out.println("Letter grade of the "+ (i+1) +" student is : CB");
            }
            else if(grades[i]>54 && grades[i]<60){
                System.out.println("Letter grade of the "+ (i+1) +" student is : CC");
            }
            else{
                System.out.println("Letter grade of the "+ (i+1) +" student is : FF");
            }
        }
    }
}
