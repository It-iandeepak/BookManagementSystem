import java.util.Scanner;

public class Books {
    String title;
    double price;

    public Books(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + " | Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books:");
        int n = sc.nextInt();
        sc.nextLine();

        Books[] book = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the title of book " + (i + 1) + ":");
            String title = sc.nextLine();

            System.out.println("Enter the price of book " + (i + 1) + ":");
            double price = sc.nextDouble();
            sc.nextLine();

            book[i] = new Books(title, price);
        }

        System.out.println("Enter a search keyword:");
        String search = sc.nextLine();

        System.out.println("\nBooks matching your keyword:");
        boolean found = false;

        for (Books b : book) {
            if (b.title.toLowerCase().contains(search.toLowerCase())) {
                b.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found with that word in the title.");
        }

        sc.close();
    }
}
