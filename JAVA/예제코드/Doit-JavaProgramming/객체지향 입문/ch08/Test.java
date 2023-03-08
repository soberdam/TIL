package ch08;

import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int subjectCount = scanner.nextInt();
        double sumScore = 0.0;
        double maxScore = 0.0;
        double [] scoreArr = new double[subjectCount];
        for(int i=0; i<subjectCount; i++){
            scoreArr[i] = scanner.nextInt();
        }
        maxScore = scoreArr[0];
        
        for(int i=1; i<subjectCount; i++){
            if(scoreArr[i]>maxScore) {
                maxScore = scoreArr[i];
            }
        }
        
        for(int i=0; i<subjectCount; i++){
            scoreArr[i] = scoreArr[i]/maxScore*100;
            sumScore += scoreArr[i];
        }
        
        double modifiedAvg = sumScore/subjectCount;
        System.out.print(modifiedAvg);
        
    }
}