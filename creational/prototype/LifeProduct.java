package creational.prototype;

public class LifeProduct implements Prototype {
    private String benefitCode;

    private String region;

    private PlanBenefits planBenefits;

    public LifeProduct(String benefitCode, String region, PlanBenefits planBenefits){
        this.benefitCode = benefitCode;
        this.region = region;
        this.planBenefits = planBenefits;
    }

    @Override
    public LifeProduct clone() {
        return new LifeProduct(this.benefitCode, this.region, this.planBenefits.clone());
    }
}
