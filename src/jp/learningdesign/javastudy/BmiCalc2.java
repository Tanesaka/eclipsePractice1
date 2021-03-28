package jp.learningdesign.javastudy;


import java.util.Scanner;

public class BmiCalc2 {

	public static void main(String[] args) {
		double weight, height, bmi;
		
//		weight = 71;
//		height = 180;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("体重は？（kg）：");
		weight = stdIn.nextDouble();
		System.out.print("身長は？（cm）：");
		height = stdIn.nextDouble();
		
		
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println("BMI:" + bmi + " です");

	}

}
