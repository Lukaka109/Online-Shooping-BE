public class Garden extends Categories {

    private String type;

    public Garden(String id, String title, double price, String type){
        super(id, title);
        setPrice(price);
        this.type = type;
    }
    @Override
    public double calcPrice(){
        return getPrice() * 0.9;
    }

}