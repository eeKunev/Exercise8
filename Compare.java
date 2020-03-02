package Exercise8;
	import fmi.informatics.extending.Student;
	import java.util.Arrays;
	import java.util.List;
	public class Compare { 

	    public static  void sortingWithLambdastwo() {
	        List<Student> randomStudents =
	                Arrays.asList(
	                        Student.StudentGenerator.make(),
	                        Student.StudentGenerator.make(),
	                        Student.StudentGenerator.make(),
	                        Student.StudentGenerator.make()
	                 );
	        randomStudents.sort((a, b) -> b.getName().compareTo(a.getName()));
	        System.out.println(randomStudents);
	    }

	        
	     public static void sortingWithLambdas() {
	    		List<Student> randomStudents = 
	    			Arrays.asList(
	    				Student.StudentGenerator.make(),
	    				Student.StudentGenerator.make(),
	    				Student.StudentGenerator.make(),
	    				Student.StudentGenerator.make()
	    			);
	    		
	        randomStudents.sort((b, a) ->  a.getName().compareTo(b.getName()));
	    	System.out.println(randomStudents);
	}
}

