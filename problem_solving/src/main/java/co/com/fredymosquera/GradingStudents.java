package co.com.fredymosquera;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		//System.out.println(getNextMultipleOf(73, 5));
		List<Integer> grades = Arrays.asList(4, 73, 67, 38, 33);
		System.out.println(gradingStudents(grades));
		
	}
	public static List<Integer> gradingStudents(List<Integer> grades) {

		for (int i = 0; i < grades.size(); i++) {
			grades.set(i, getGrade(grades.get(i)));
		}
		return grades;

	}
	

	static int getGrade(int n) {
		if(n >= 38) {
			int nextMultipleOf5 = getNextMultipleOf5(n);
			int diffBtwGran =  nextMultipleOf5 - n;
			if(diffBtwGran < 3) {
				return nextMultipleOf5;
			}
		}
		return n;
	}
	
	static int getNextMultipleOf5(int n) {
		return ((n + 5 - 1)/ 5) * 5;
	}

}
