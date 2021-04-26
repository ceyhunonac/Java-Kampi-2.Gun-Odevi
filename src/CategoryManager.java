public class CategoryManager {
    public  void addCategory(Category category){
        System.out.println("Kategori eklendi : " + category.categoryName);
    }
    public  void deleteCategory(Category category){
        System.out.println("Kategori silindi : " + category.categoryName);
    }
    public  void updateCategory(Category category){
        System.out.println("Kategori güncellendi : " + category.categoryName);
    }

}
