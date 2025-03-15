package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LifeProduct> lifeProducts = new ArrayList<>();
        PlanBenefits planBenefits = new PlanBenefits(List.of("free dental upto 20,000", "No eye checkup covered"));
        LifeProduct lifeProduct = new LifeProduct("GCS","IND", planBenefits);
        lifeProducts.add(lifeProduct);

        lifeProducts.add(lifeProduct.clone());

        lifeProducts.add(lifeProduct.clone());

    }
}
