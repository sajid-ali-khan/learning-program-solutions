package searchers;

import product.Product;

import java.util.List;

public interface ISearcher {
    Product searchProduct(List<Product> products, int productId);
}
