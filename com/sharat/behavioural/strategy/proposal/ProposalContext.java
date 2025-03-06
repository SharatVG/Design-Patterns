package com.sharat.behavioural.strategy.proposal;

public class ProposalContext {

    private ProposalStrategy proposalStrategy;

    public void setProposalStrategy(ProposalStrategy proposalStrategy) {
        this.proposalStrategy = proposalStrategy;
    }

    public String execute(Object requestBody){
        return proposalStrategy.execute(requestBody);
    }
}
