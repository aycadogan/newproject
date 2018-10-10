package util.products;

import util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayProducts {

    public static void main(String[] args) {

        Product p1 = new Product("Arcturuse", 10000, true);
        Product p2 = new Product("Betelgeuze", 50000, false);
        Product p3 = new Product("Canopus", 20000, true);

        List<Product> productList = new ArrayList<Product>();

        productList . add(p1);
        productList . add(p2);
        productList . add(p3);

        //add yerine 3 elementle eklemek istersen:
        //List<Product> products2 = Arrays.asList(p1, p2, p3);

        int columnWidth = 10;

        List<String> fieldNames = Arrays.asList("Name", "Price", "Available");

        // Create a title
        String title ="";
        for(String fieldName : fieldNames){
            title += StringUtil.padRight(fieldName, columnWidth);
        }

      /*  String title = StringUtil.padRight("Name", columnWidth)
            + StringUtil.padRight("Price", columnWidth)
                + StringUtil.padRight("Available", columnWidth);
        String line = StringUtil.repeat("-", columnWidth * fieldNames.size());
       */

        for (Product product : productList){

            String productLine =
                    StringUtil.padRight(product.getName(), columnWidth)
                    + StringUtil.padRight(""+product.getName(), columnWidth)
                    + StringUtil.padRight(""+product.getName(), columnWidth);
        }

        System.out.println(title);
        System.out.println(productLine);

    }
}
