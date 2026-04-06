import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Categories {

    private String id;
    private String title;
    private double price;
    private String name;

    private HashMap<String,String> categories = new HashMap<>();
    private List<Categories> subcategories = new ArrayList<>();

    Categories(){}

    Categories(String id,String title){
        this.id = id;
        this.title = title;
    }
    public void add(Categories category){
        subcategories.add(category);

    }
    public void show() {
        for (Categories c : subcategories) {
            System.out.println(c.getTitle());
        }
    }

    public String getId(){return this.id;}

    public String getTitle(){return this.title;}

    public double getPrice(){return this.price;}

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calcPrice();


    public Categories(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List<Categories> getSubcategories() {
        return subcategories;
    }
}

