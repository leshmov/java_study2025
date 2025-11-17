// 이 문제의 정답이 혼공자 - 25000원이 되게끔 코드를 완성해주세요

class Book {
    String title;
    int price;

    Book(String title, int price) {
        // 여기를 완성해보세요
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
