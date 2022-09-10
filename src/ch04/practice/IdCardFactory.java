package ch04.practice;

import ch04.framework.Product;
import ch04.framework.ProductFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

class IdCardFactory extends ProductFactory {
    private Map<Integer, Product> idCards = new HashMap();
    private AtomicInteger index = new AtomicInteger(0);

    @Override
    protected void registerProduct(Product product) {
        System.out.println("No . "+ index + " : " + ((IdCard)product).getOwner() +" 의 id 카드 등록 완료");
        idCards.put(index.addAndGet(1),product);
    }

    @Override
    protected Product createProduct(String owner) {
        System.out.println("No . "+ index + " : " + owner +" 의 id 카드 생성 완료");
        return new IdCard(owner);
    }

}
