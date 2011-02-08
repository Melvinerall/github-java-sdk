package com.github.api.v2.schema;

public class PayloadPullRequest {

    private String title;
    private int deletions;
    private int issueId;
    private int commits;
    private int number;
    private int id;
    private int additions;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getDeletions() {
        return deletions;
    }
    public void setDeletions(int deletions) {
        this.deletions = deletions;
    }
    public int getIssueId() {
        return issueId;
    }
    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }
    public int getCommits() {
        return commits;
    }
    public void setCommits(int commits) {
        this.commits = commits;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAdditions() {
        return additions;
    }
    public void setAdditions(int additions) {
        this.additions = additions;
    }
}
