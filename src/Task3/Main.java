package Task3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book() {
            Sale sale = (price, discount) -> price - price * discount;

            @Override
            public double bookWithSale(double price, double discount) {
                return sale.bookWithSale(price,discount);
            }

            @Override
            public String toString() {
                return "Book Name: " + name + "\nPrice: " + price + "\nDiscount: " + discount * 100 + "%" +
                        "\nPrice With Discount: " + bookWithSale(price, discount);
            }
        };
        book.name = "\"Harry Potter and the Chamber of Secrets\"";
        book.price = 500;
        book.discount = 0.1;

        Book book1 = new Book("\"Harry Potter and Sorcerer's Stone\"", 470, 0);

        System.out.println(book1);
        System.out.println("-----------------------------------");
        System.out.println(book);

    }
}
class Book implements Sale{
    String name;
    double price;
    double discount;

    public Book(){}

    public Book(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double bookWithSale(double price, double discount) {
        return 0;
    }

    @Override
    public String toString() {
        return "Book Name: " + name + "\nPrice: " + price + "\nDiscount: " + discount * 100 + "%";
    }
}
interface Sale {
    double bookWithSale(double price, double discount);
}

