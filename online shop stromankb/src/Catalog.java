import java.util.ArrayList;

public abstract class Catalog {
    ArrayList<Categories>mainCategories = new ArrayList<>();

    private int mainCategoryCount = 0;
    private int subCategoryCount = 0;

    public void addMainCategory(Categories category){
        mainCategories.add(category);
        mainCategoryCount++;

        for (Categories sub : category.getSubcategories()) {
            this.subCategoryCount++;
        }

    }
    public void showStats(){
        System.out.println(mainCategoryCount);
        System.out.println(subCategoryCount);
    }
}

