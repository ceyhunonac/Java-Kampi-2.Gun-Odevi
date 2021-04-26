public class Category extends CategoryManager {

    public Category(){
        System.out.println("Kategori sisteme işlendi");
    }
    public Category(int id,String categoryName){
        this.categoryName = categoryName;
        this.id=id;
    }

    int id;
    String categoryName;
}
