package creational.prototype;

import java.util.List;

public class PlanBenefits implements Prototype{

    private List<String> planBenefits;

    public PlanBenefits(List<String> planBenefits) {
        this.planBenefits = planBenefits;
    }

    @Override
    public PlanBenefits clone() {
        return new PlanBenefits(this.planBenefits);
    }
}
