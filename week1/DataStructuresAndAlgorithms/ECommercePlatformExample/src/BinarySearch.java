import java.util.List;

public class BinarySearch implements ISearcher{
    @Override
    public Product searchProduct(List<Product> products, int productId) {
        int l = 0, h = products.size()-1;

        while(l <= h){
            int mid = (l+h)/2;
            if(products.get(mid).id == productId){
                return products.get(mid);
            }else if(products.get(mid).id < productId){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }

        return null;
    }
}
