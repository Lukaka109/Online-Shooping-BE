public  class Main {
    public static void main(String[] args){
        Catalog catalog1 = new Catalog();
        System.out.println(catalog1);
        System.out.print(catalog1.id);

        catalog1.id = "id";
        catalog1.catalog("title");
        catalog1.price = "price";

        Catalog catalog = new Catalog();
        System.out.println(catalog1);
        System.out.println(catalog1.id);

    }
}