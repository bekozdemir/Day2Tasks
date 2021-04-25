
public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C# + Angular", 100, "Engin Demirog" );
		Course course2 = new Course(2, "Java + React", 32, "Engin Demirog" );
		Course course3 = new Course(3, "Intros", 0, "Engin Demirog" );
	
		Course[] courses = {course1, course2, course3};
		
		Category category1 = new Category(1, "All Categories");
		Category category2 = new Category(2, "Programming");
		
		Category[] categories = {category1, category2};	
		
		CourseManager courseManager = new CourseManager();
		courseManager.getAllCourses(courses);
		
		System.out.println("------------------");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.getAllCategories(categories);
		
		
	
	}

}
