public class CourseManager {

    public void printCourse(Courses courses){
        System.out.println("Course Name: " + courses.getName());
        System.out.println("Course Description: "+ courses.getDescription());
        System.out.println("Course Coordinator: "+ courses.getCoordinator());
    }

}
