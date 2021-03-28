package jp.learningdesign.javastudy;

public class BmiCalc {

	public static void main(String[] args) {
		double weight, height, bmi;
		
		weight = 71;
		height = 180;
		
		height /= 100;
		
		bmi = weight / (height * height);
		
		System.out.println(bmi);

	}

}
