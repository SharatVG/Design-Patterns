package com.sharat.behavioural.strategy.proposal;

public class NewProposalStrategy implements ProposalStrategy  {

    @Override
    public String execute(Object requestBody) {
        return "Created a proposal with new Proposal Strategy";
    }
}
