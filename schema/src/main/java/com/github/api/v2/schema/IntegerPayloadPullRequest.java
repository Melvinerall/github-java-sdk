package com.github.api.v2.schema;

public class IntegerPayloadPullRequest implements PayloadPullRequest {

    private int number;
    
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getAdditions() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getCommits() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getDeletions() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getIssueId() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }
}
