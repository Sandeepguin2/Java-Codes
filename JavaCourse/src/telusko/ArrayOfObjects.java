package telusko;
class Student{
	int rollno;
	String name;
	int marks;
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Sandeep";
		s1.marks=78;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Sanjeeb";
		s2.marks=58;
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Lipsa";
		s3.marks=28;
		
		
		
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name+ ":"+students[i].marks);
		}
//		int nums[]=new int[4];
//		nums[0]=4;
//		nums[1]=5;
//		nums[2]=7;
//		nums[3]=3;
//	for(int i=0;i<nums.length;i++) {
//		System.out.println(nums[i]);
//	}
		

	}

}
