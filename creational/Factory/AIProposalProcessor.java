package creational.Factory;

public class AIProposalProcessor implements ProposalProcess {


    @Override
    public void process() throws InterruptedException {
        System.out.println("Processing with the AI Proposal Processor Starts");
        Thread.sleep(3000);
        System.out.println("Processing with the AI Proposal Processor Ends");
    }
}
