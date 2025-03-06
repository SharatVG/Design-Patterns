package com.sharat.behavioural.strategy.proposal;

public class ExistingProposalStrategy implements ProposalStrategy {

    @Override
    public String execute(Object requestBody) {
        return "Created a proposal with Existing Proposal Strategy";
    }
}
