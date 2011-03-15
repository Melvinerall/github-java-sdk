package com.github.api.v2.schema;

import java.util.List;

public class Payload extends SchemaEntity {

    /** The repo */
    private String repo;
    
    /** The actor */
    private String actor;
    
    /** The actor gravatar */
    private String actorGravatar;

    /** The ref */
    private String ref;
    
    /** The action */
    private String action;
    
    /** The number (issue number, pull request number)*/
    private int number;
    
    /** The commit (comment commit) */
    private String commit;
    
    /** The shas */
    private List<String[]> shas;
    
    /** The pull request */
    private PayloadPullRequest pullRequest;
    
    /** The pull request int */
//    @SerializedName("pull_request")
//    private int pullRequestInt;
    
    /** The name */
    private String name;
    
    /** The target */
    private PayloadTarget target;
    
    /** The object */
    private String object;
    
    /** The objectName */
    private String objectName;
    
    /** The member */
    private String member;
    
    /** The target id */
    private String targetId;
    
    /** The ref type */
    private String refType;
    
    /** The url */
    private String url;
    
    /** The id */
    private String id;
    
    /** The title. */
    private String title;
    
    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActorGravatar() {
        return actorGravatar;
    }

    public void setActorGravatar(String actorGravatar) {
        this.actorGravatar = actorGravatar;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<String[]> getShas() {
        return shas;
    }

    public void setShas(List<String[]> shas) {
        this.shas = shas;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }
    
    public PayloadPullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PayloadPullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PayloadTarget getTarget() {
        return target;
    }

    public void setTarget(PayloadTarget target) {
        this.target = target;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
