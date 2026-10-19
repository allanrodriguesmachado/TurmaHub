package br.com.policy;

public class SchoolPolicy implements ApprovalPolicy{
    @Override
    public boolean isApproved(double average) {
        return average > 6;
    }
}
