package co.com.fredymosquera.easylevel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GradingStudentsWithStreams {

	public static void main(String[] args) {
		//System.out.println(getNextMultipleOf(73, 5));
		List<Integer> grades = Arrays.asList(4, 73, 67, 38, 33);
		System.out.println(gradingStudents(grades));
		
	}
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
		return grades.stream().map(n -> getGrade(n)).collect(Collectors.toList());

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
