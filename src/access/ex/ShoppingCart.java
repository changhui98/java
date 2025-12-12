package access.ex;

public class ShoppingCart {

    private int count;
    private Item[] items = new Item[10];

    public void addItem(Item item) {
        if (count > items.length) {
            System.out.println("최대 등록 가능한 장바구니는 10개 입니다.");
            return;
        }

        items[count] = item;
        count++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + items[i].totalPrice());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            total += item.totalPrice();
        }
        return total;
    }
}
