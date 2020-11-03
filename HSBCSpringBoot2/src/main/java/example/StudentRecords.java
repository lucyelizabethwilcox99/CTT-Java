package example;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StudentRecords {
	
	ArrayList<Student> list=new ArrayList<Student>();

	public StudentRecords() {
		
		Student stu1=new Student(102, "shafeeq", 149);
			list.add(stu1);
		
			Student stu2=new Student(100, "lucy", 160);
			list.add(stu2);
		
		
			Student stu3=new Student(90, "ben", 140);
			list.add(stu3);
		}
	
		public ArrayList<Student> showStudents(){
			return list;
			
		}
		public String getStudent(int r){
			int i;
			for(i=0;i<list.size(); i++) {
				if(list.get(i).regno==r) {
				System.out.println(list.get(i).name);
					return(list.get(i).name);
					
				}
			}
			return "not in list";
		}
		
		public void addrecord(Student st) {
			list.add(st);
		}
	
}
