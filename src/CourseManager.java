public class CourseManager {
    public void enterCourse(Course course){
        System.out.println("Kursa kayıt oldundu : " + course.name);
    }
    public void cancelCourse(Course course){
        System.out.println("Kurs kaydınız silindi : " + course.name);
    }

}
