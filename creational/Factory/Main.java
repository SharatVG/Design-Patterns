package creational.Factory;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        new Main().processProposal(ProcessorEnum.AI);

    }

    public void processProposal(ProcessorEnum processorEnum ) throws InterruptedException {
       ProposalProcessorFactory.getProposalProcessor(processorEnum).process();
    }
}
