package ch04.practice;

import ch04.framework.Product;

class IdCard extends Product {

    private final String owner;

    IdCard(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "owner='" + owner + '\'' +
                '}';
    }

    @Override
    public void use() {
        System.out.println(owner +"의 id card 를 사용합니당.");
    }
}
