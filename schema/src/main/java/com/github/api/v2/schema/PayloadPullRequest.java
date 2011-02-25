package com.github.api.v2.schema;

public interface PayloadPullRequest {

    public String getTitle();
    public int getDeletions();
    public int getIssueId();
    public int getCommits();
    public int getNumber();
    public int getId();
    public int getAdditions();
    
}