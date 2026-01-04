package basic.extends1.ex;

public class Item {

    private String name;
    private Integer price;

    public Item(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }

}
