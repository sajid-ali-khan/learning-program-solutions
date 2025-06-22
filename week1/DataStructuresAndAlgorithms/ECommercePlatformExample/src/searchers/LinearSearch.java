package searchers;

import product.Product;

import java.util.List;

public class LinearSearch implements ISearcher {
    @Override
    public Product searchProduct(List<Product> products, int productId) {
        for(Product product : products){
            if(product.id == productId){
                return product;
            }
        }
        return null;
    }
}
