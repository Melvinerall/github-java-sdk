package com.github.api.v2.schema;

public class PayloadTarget extends SchemaEntity {

    /** The repos */
    private int repos;
    
    /** The followers */
    private int followers;
    
    /** The login */
    private String login;
    
    /** The gravatarId */
    private String gravatarId;

    public int getRepos() {
        return repos;
    }

    public void setRepos(int repos) {
        this.repos = repos;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }
    
    
}
