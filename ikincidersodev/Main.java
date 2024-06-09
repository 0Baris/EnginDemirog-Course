//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Courses course1 = new Courses(1,
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                "Engin Demiroğ");
        Courses course2 = new Courses(2,
                "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)",
                "1,5 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                "Engin Demiroğ");
        Courses course3 = new Courses(3,
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "Profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
                "Engin Demiroğ");

        CourseManager courseManager = new CourseManager();
        courseManager.printCourse(course1);
        courseManager.printCourse(course2);
        courseManager.printCourse(course3);

        Teachers teacher1 = new Teachers(1,"Engin Demiroğ");
        Teachers teacher2 = new Teachers(2,"Mustafa Murat Coşkun");

        TeacherManager teacherManager = new TeacherManager();
        teacherManager.printName(teacher1);
        teacherManager.printName(teacher2);

    }
}