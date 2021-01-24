package luv2code.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
	
	public static void showCourseswithTeachers(List<Course> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getCourseName() + ", " + list.get(i).getTeacherName());
		}
	}
	
	public static void showRoutine(List<Routine> routineList[]) {
		System.out.println();
		
		for(int i=0; i<5; i++) {
			if(routineList[i].size() > 0) {
				for(int j=0; j<routineList[i].size(); j++) {
					System.out.println(routineList[i].get(j).getDay() + " " + routineList[i].get(j).getHour() + " " + routineList[i].get(j).getCourseName());
				}
				
				System.out.println();
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Course> courseList = new ArrayList<Course>();
		List<Routine> routineList[] = new ArrayList[5];
		
		for(int i=0; i<5; i++) {
			routineList[i] = new ArrayList<>();
		}
		
		courseList.add(new Course(1, "English Grammar", "John Smith"));
		courseList.add(new Course(2, "Mathematics", "Lara Gilbert"));
		courseList.add(new Course(3, "Physics", "Johanna Kabir"));
		courseList.add(new Course(4, "Chemistry", "Danniel Robertson"));
		courseList.add(new Course(5, "Biology", "Larry Cooper"));
		
		while(true) {
			System.out.println("A. " + "Create Routine");
			System.out.println("B. " + "Show Routine");
			System.out.println("C. " + "List Courses with Teachers Name");
			
			System.out.println();
			char ch = s.next().charAt(0);
			if(Character.toUpperCase(ch) == 'A') {
				System.out.println();
				for(int i=0; i<5; i++) {
					for(int j=0; j<4; j++) {
						//int day = s.nextInt();
						System.out.print(i + " " + j);
						Course course = courseList.get(s.nextInt());
						routineList[i].add(new Routine(1, i, j, course.getCourseName()));
					}
					System.out.println();
				}
			} 
			else if(Character.toUpperCase(ch) == 'B') {
				showRoutine(routineList);
			}
			else if(Character.toUpperCase(ch) == 'C') {
				System.out.println();
				showCourseswithTeachers(courseList);
				System.out.println();
			}
		}

	}

}
