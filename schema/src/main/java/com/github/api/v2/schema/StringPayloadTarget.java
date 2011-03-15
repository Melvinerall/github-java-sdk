package com.github.api.v2.schema;

public class StringPayloadTarget extends SchemaEntity implements PayloadTarget {

    private String login;
    
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int getFollowers() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getGravatarId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public int getRepos() {
        // TODO Auto-generated method stub
        return 0;
    }

}
