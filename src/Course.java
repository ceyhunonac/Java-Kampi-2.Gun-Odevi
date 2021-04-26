public class Course extends CourseManager{

    public Course(){
        System.out.println("Kurs sisteme işlendi");
    }

    public Course(int id,String name,String instructor,String courseDetail){
    this.name = name;
    this.id = id;
    this.instructor = instructor;
    this.courseDetail = courseDetail;
    }

    int id;
    String name;
    String instructor;
    String courseDetail;

}
