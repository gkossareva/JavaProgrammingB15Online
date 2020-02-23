package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Iphone XL", 1299) ) ;
        productList.add( new Product("Sumsung 10", 499) ) ;

        System.out.println("productList.size() = " + productList.size());
//        boolean result=false;
//        for (Product each:productList
//             ) {
////         if (each.getName().equals("Sony TV")&&each.getPrice()==499){
////            result=true;
////         }
// if (each.equals(new Product("Sony TV", 499) )){
//result =true;
// }
//        }
Product sony=new Product("Sony TV", 499);
        boolean result=productList.contains(sony );
        System.out.println("Has sony tv "+result);

        productList.remove(sony);
        System.out.println("productList  contains sony tv " + productList.contains(result));

        boolean result2=productList.contains(new Product("Apple TV", 299) );
        System.out.println("Has Apple TV "+result2);
    }

}
