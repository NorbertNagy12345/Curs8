import Exercise1.Cosmetics;
import Exercise1.Electronics;
import Exercise1.Fridge;
import Exercise1.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(200,"First product","WhoKnowsWhat",100);
        Cosmetics cosmetics = new Cosmetics(1000,"First Cosmetic Product","Makes you nice",200,"greenish red",10);
        Electronics electronics =new Electronics(100,"Cell phone","Smart-ish",100,"Big",100,50,200,20);
        Fridge fridge = new Fridge(10000,"Brrrr","Brrrrrrr",2,"Small",10,10,10,10,-273);
    }
}
