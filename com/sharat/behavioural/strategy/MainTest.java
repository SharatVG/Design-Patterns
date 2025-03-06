package com.sharat.behavioural.strategy;

import com.sharat.behavioural.strategy.proposal.ExistingProposalStrategy;
import com.sharat.behavioural.strategy.proposal.NewProposalStrategy;
import com.sharat.behavioural.strategy.proposal.ProposalContext;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("Started the Create Case");
        ProposalContext proposalContext = new ProposalContext();
        proposalContext.setProposalStrategy(new ExistingProposalStrategy());
        String result1 = proposalContext.execute("Create Request Body using Existing Strategy");
        System.out.println(result1);

        proposalContext.setProposalStrategy(new NewProposalStrategy());
        String result2 =proposalContext.execute("Create Request Body using new Strategy");
        System.out.println(result2);
    }
}
