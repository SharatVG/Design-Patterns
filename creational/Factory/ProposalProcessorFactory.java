package creational.Factory;

public class ProposalProcessorFactory {

    public static ProposalProcess getProposalProcessor(ProcessorEnum processorEnum) {
        if(processorEnum.equals(ProcessorEnum.BASIC)){
            return new BasicProposalProcessor();
        } else if(processorEnum.equals(ProcessorEnum.AI)){
            return new AIProposalProcessor();
        } else {
            return null;
        }
    }
}
