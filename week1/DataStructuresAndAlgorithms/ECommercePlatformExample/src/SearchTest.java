import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;

public class SearchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        seedProducts(products);

        System.out.println("Products: ");
        for (Product product : products) {
            System.out.print(product);
        }

        System.out.println("\nEnter the productId that you want to search: ");
        int key = sc.nextInt();

        System.out.println("Linear search: ");
        long ls = search(products, key, new LinearSearch());
        System.out.println("Binary search: ");
        long bs = search(products, key, new BinarySearch());

        long diff = Math.abs(bs - ls);

        if(diff == 0){
            System.out.println("Both search algorithms took same time.");
        }else if(ls < bs){
            System.out.println("Linear Search was faster by "+ diff + " nano seconds.");
        }else{
            System.out.println("Binary Search was faster by "+ diff + " nano seconds.");
        }
        System.out.println();
    }

    private static long search(List<Product> products, int productId, ISearcher searcher) {
        long startTime = System.nanoTime();
        Product product= searcher.searchProduct(products, productId);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("%s(%s nano seconds)\n\n", product, elapsedTime);
        return elapsedTime;
    }

    private static void seedProducts(List<Product> products) {
        products.add(new Product(101, "Watch", "Fashion"));
        products.add(new Product(102, "Bowl", "Kitchen"));
        products.add(new Product(103, "Oil", "Food"));
        products.add(new Product(104, "Necklace", "Fashion"));
        products.add(new Product(105, "ChessBoard", "Games"));
        products.add(new Product(106, "Knife", "Kitchen"));
        products.add(new Product(107, "Table", "Home"));
        products.add(new Product(109, "TV", "Electronics"));
        products.add(new Product(110, "Fridge", "Electronics"));
        products.add(new Product(111, "Microwave", "Electronics"));
        products.add(new Product(112, "Fan", "Electronics"));
        products.add(new Product(113, "Curtain", "Home"));
        products.add(new Product(114, "Bed", "Home"));
        products.add(new Product(115, "Keyboard", "Electronics"));
    }
}
