public class Main {

    public static void main(String[] args) {

        Category category1 = new Category(1,"BackEnd Geliştirme");
        Category category2 = new Category(2,"FrontEnd Geliştirme ");

        Category[] kategorilerim = {category1,category2};
        for (Category kategori : kategorilerim)
        {
            System.out.println(kategori.categoryName);
        }
        System.out.println("--------------------------------------------------");

        CategoryManager categoryManager = new CategoryManager();
       categoryManager.addCategory(category1);
        categoryManager.updateCategory(category2);
        categoryManager.deleteCategory(category2);
        System.out.println("--------------------------------------------------");

        Course course1 = new Course(1,"Modern Web Geliştirme Kursu | Sıfırdan Sektörün Yükseklerine","Engin DEMİROĞ & Mustafa Murat COŞKUN",
                "HTML,CSS vb");
        Course course2 = new Course(2,"(100+ Saat) Aranan Programcı Olma Kamp Kursu","Engin DEMİROĞ",
                "Python,Java,C#");
        Course course3 = new Course(3,"Modern C# Kursu : .NET Dünyası İçin Sıfırdan Profesyonelliğe","Engin DEMİROĞ",
                "C#");


        Course[] kurslar = {course1,course2,course3};
        for (Course kurslarım : kurslar){
            System.out.println(kurslarım.name);
        }
        System.out.println("--------------------------------------------------");
        CourseManager courseManager = new CourseManager();
        courseManager.enterCourse(course1);
        courseManager.enterCourse(course2);
        courseManager.cancelCourse(course3);

    }
}
