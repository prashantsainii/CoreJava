package prashant.MethodReferences.ConstructorReference;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {

        ProductFuncInterface product = (name, price) -> new Product(name, price);
        System.out.println(product.getProduct("iPhone", 1000));

        ProductFuncInterface productByConstructorRef = Product::new;
        System.out.println(productByConstructorRef.getProduct("Macbook", 2000));
    }
}
