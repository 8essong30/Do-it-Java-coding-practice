package section2.classpart;


public class ExampleOnlineShop {
    long orderNumber; // orderID
    String orderID;  //customerID
    String orderDate;
    String orderName; // customerName
    String orderThingNumber; //productID
    String orderAddress; //shippingAddress

    public static void main(String[] args) {
        ExampleOnlineShop shoppingMall = new ExampleOnlineShop();
        shoppingMall.orderNumber = 201803120001L; // L을 안붙이면 Integer로 받아들여 에러남
        shoppingMall.orderID = "abc123";
        shoppingMall.orderDate = "2018년 3월 12일";
        shoppingMall.orderName = "홍길순";
        shoppingMall.orderThingNumber = "PD0345-12";
        shoppingMall.orderAddress = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문번호: " + shoppingMall.orderNumber);
        System.out.println("주문자 아이디: " + shoppingMall.orderID);
        System.out.println("주문날짜: " + shoppingMall.orderDate);
        System.out.println("주문자 이름: " + shoppingMall.orderName);
        System.out.println("주문 상품 번호: " + shoppingMall.orderThingNumber);
        System.out.println("배송 주소: " + shoppingMall.orderAddress);
    }
}
