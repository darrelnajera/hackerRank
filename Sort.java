import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//solution
public class Sort {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
        //while loop that goes on until test cases run out
		while(testCases>0){
            //user input for student info
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			//add info to Student class
			Student st = new Student(id, fname, cgpa);
            //add new student to studentList
			studentList.add(st);
			//reduce test cases by 1
			testCases--;
		}
        //sort the elements in this studentList List after user input
        studentList.sort(new Comparator<Student>(){
                //integer method containing elements of student 1 and 2
                public int compare(Student s1,Student s2){
                    //if gpa is equal compare two students string names lexicographically and return the result
                    if(s1.getCgpa()==s2.getCgpa()){
                        return s1.getFname().compareTo(s2.getFname());
                    //rearrange gpa is ascending order by using .get method
                    }else if(s1.getCgpa()<s2.getCgpa()){
                        return 1;
                    }
                    else{
                        return -1;
                        }
                }
            });
        //for each loop to get fName String
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}

