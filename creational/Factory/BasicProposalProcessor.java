package creational.Factory;

public class BasicProposalProcessor implements ProposalProcess{

    @Override
    public void process() throws InterruptedException {
        System.out.println("Processing with the BASIC Proposal Processor Starts");
        Thread.sleep(3000);
        System.out.println("Processing with the BASIC Proposal Processor Ends");
    }
}
