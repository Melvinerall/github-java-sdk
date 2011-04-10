package com.github.api.v2.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserFeed extends SchemaEntity {

    /** The enum Type */
    public enum Type implements ValueEnum {
        
        /** The IssuesEvent. */
        ISSUES_EVENT("IssuesEvent"), 
 
        /** The PushEvent. */
        PUSH_EVENT("PushEvent"),
        
        /** The CommitCommentEvent. */
        COMMIT_COMMENT_EVENT("CommitCommentEvent"),
        
        /** The PullRequestEvent. */
        PULL_REQUEST_EVENT("PullRequestEvent"),
        
        /** The WatchEvent */
        WATCH_EVENT("WatchEvent"),
        
        /** The GistEvent */
        GIST_EVENT("GistEvent"),
        
        /** The ForkEvent */
        FORK_EVENT("ForkEvent"),
        
        /** The ForkApplyEvent */
        FORK_APPLY_EVENT("ForkApplyEvent"),
        
        /** The FollowEvent */
        FOLLOW_EVENT("FollowEvent"),
        
        /** The CreateEvent */
        CREATE_EVENT("CreateEvent"),
        
        /** The DeleteEvent */
        DELETE_EVENT("DeleteEvent"),
        
        /** The WikiEvent */
        WIKI_EVENT("WikiEvent"),
        
        /** The MemberEvent */
        MEMBER_EVENT("MemberEvent"),
        
        /** The DownloadEvent */
        DOWNLOAD_EVENT("DownloadEvent"),
        
        /** The GollumEvent */
        GOLLUM_EVENT("GollumEvent"),
        
        /** The PublicEvent */
        PUBLIC_EVENT("PublicEvent"),
        
        /** The IssueCommentEvent */
        ISSUE_COMMENT_EVENT("IssueCommentEvent")
        ;
        
        /** The Constant stringToEnum. */
        private static final Map<String, Type> stringToEnum = new HashMap<String, Type>();

        static { // Initialize map from constant name to enum constant
            for (Type op : values()) {
                stringToEnum.put(op.value(), op);
            }
        }
        
        /** The value. */
        private final String value;
        
        /**
         * Instantiates a new type.
         * @param value the value
         */
        Type(String value) {
            this.value = value;
        }

        /* (non-Javadoc)
         * @see com.github.api.v2.schema.ValueEnum#value()
         */
        @Override
        public String value() {
            return value;
        }
        
        /**
         * From value.
         * @param value the value
         * @return the type
         */
        public static Type fromValue(String value) {
            return stringToEnum.get(value);
        }
    }

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3211495454271146055L;
    
    /** The actor. */
    private User actorAttributes;
    
    /** The payload */
    private Payload payload;
    
    /** The repository */
    private Repository repository;
    
    /** The created at */
    private Date createdAt;
    
    /** The public */
    private boolean isPublic;
    
    /** The actor */
    private String actor;
    
    /** The url */
    private String url;
    
    /** The times */
    private int times;
    
    private Type type;

    public User getActorAttributes() {
        return actorAttributes;
    }

    public void setActorAttributes(User actorAttributes) {
        this.actorAttributes = actorAttributes;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    } 
}
