package ch04.idcard;

import ch04.framework.Product;
import ch04.framework.ProductFactory;

import java.util.HashSet;
import java.util.Set;

class IdCardFactory extends ProductFactory {
    private Set<Product> idCards = new HashSet<>();

    @Override
    protected void registerProduct(Product product) {
        System.out.println(((IdCard)product).getOwner() +"의 id 카드 등록 완료");
        idCards.add(product);
    }

    @Override
    protected Product createProduct(String owner) {
        System.out.println(owner +" 의 id 카드 생성 완료");
        return new IdCard(owner);
    }
}
