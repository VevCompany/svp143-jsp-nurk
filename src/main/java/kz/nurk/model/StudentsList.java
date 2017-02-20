package kz.nurk.model;

import java.util.ArrayList;

public class StudentsList {
	
	public static ArrayList<Student> getStudent(){
		ArrayList<Student> list = new ArrayList<Student>();
		
		/*for(int i=0; i<6; i++) {
			list.add(new Student("Name" + i, "Group" + i));
		}*/
		return list;
	}
}
