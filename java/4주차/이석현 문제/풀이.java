
// 이 코드의 정답이 혼공자 - 25000원 이 되게하게끔 코드를 채워주세요!

class Book {
    String title;
    int price;

    Book(String title, int price) {
        // 이부분을 채워주세요
    }

    void printInfo() {
        System.out.println(title + " - " + price + "원");
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book("혼공자", 25000);
        b.printInfo();
    }
}
