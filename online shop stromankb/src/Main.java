public class Main {
    public static void main(String[] args){

        Electronics p1 = new Electronics("848848", "frjijgoi",1500,3747);
        Garden l1 = new Garden("jjfiji", "a;ps;sl;", 234782,"74fjhfh");

        Garden sell = new Garden("dhed777", "Лопата", 50, "gjfjgjfgd");

        System.out.println(p1.calcPrice());
        System.out.println(sell.calcPrice());


    }
}
