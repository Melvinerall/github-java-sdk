/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.github.api.v2.services.impl;

import java.util.Collection;
import java.util.List;

import com.github.api.v2.schema.Feed;
import com.github.api.v2.schema.UserFeed;
import com.github.api.v2.services.FeedService;
import com.github.api.v2.services.GitHubException;
import com.github.api.v2.services.constant.GitHubApiUrls;
import com.github.api.v2.services.constant.ParameterNames;
import com.github.api.v2.services.constant.GitHubApiUrls.GitHubApiUrlBuilder;
import com.google.mygson.gh4a.Gson;
import com.google.mygson.gh4a.GsonBuilder;
import com.google.mygson.gh4a.JsonArray;
import com.google.mygson.gh4a.JsonElement;
import com.google.mygson.gh4a.JsonObject;
import com.google.mygson.gh4a.JsonParseException;
import com.google.mygson.gh4a.reflect.TypeToken;

/**
 * The Class FeedServiceImpl.
 */
public class FeedServiceImpl extends BaseGitHubService implements
		FeedService {
	
	/**
	 * Instantiates a new feed service impl.
	 */
	public FeedServiceImpl() {
        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getCommitFeed(java.lang.String, java.lang.String, java.lang.String, int)
	 */
	@Override
	public Feed getCommitFeed(String userName, String repositoryName, String branchName, int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_COMMIT_FEED_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withField(ParameterNames.BRANCH, branchName).withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getNetworkFeed(java.lang.String, java.lang.String, int)
	 */
	@Override
	public Feed getNetworkFeed(String userName, String repositoryName, int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_NETWORK_FEED_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getPrivateUserFeed(java.lang.String, int)
	 */
	@Override
	public Feed getPrivateUserFeed(String userName, int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_PRIVATE_USER_FEED_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getPublicTimelineFeed(int)
	 */
	@Override
	public Feed getPublicTimelineFeed(int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_PUBLIC_TIMELINE_FEED_URL);
        String                apiUrl  = builder.withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getPublicUserFeed(java.lang.String, int)
	 */
	@Override
	public Feed getPublicUserFeed(String userName, int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_PUBLIC_USER_FEED_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getWikiFeed(java.lang.String, java.lang.String, int)
	 */
	@Override
	public Feed getWikiFeed(String userName, String repositoryName, int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_WIKI_FEED_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).withField(ParameterNames.REPOSITORY_NAME, repositoryName).withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}
	
	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getBlogFeed(int)
	 */
	@Override
	public Feed getBlogFeed(int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_BLOG_FEED_URL);
        String                apiUrl  = builder.withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getDiscussionsFeed(int)
	 */
	@Override
	public Feed getDiscussionsFeed(int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_DISCUSSIONS_FEED_URL);
        String                apiUrl  = builder.withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getDiscussionsFeed(java.lang.String, int)
	 */
	@Override
	public Feed getDiscussionsFeed(String topic, int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_DISCUSSIONS_FEED_BY_TOPIC_URL);
        String                apiUrl  = builder.withField(ParameterNames.KEYWORD, topic).withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}

	/* (non-Javadoc)
	 * @see com.github.api.v2.services.FeedService#getJobPositionsFeed(int)
	 */
	@Override
	public Feed getJobPositionsFeed(int count) {
		GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_JOB_POSITIONS_FEED_URL);
        String                apiUrl  = builder.withParameter(ParameterNames.NUM, String.valueOf(count)).buildUrl();
        return unmarshall(apiUrl);
	}
	
	
	/**
	 * Unmarshall.
	 * 
	 * @param apiUrl
	 *            the api url
	 * 
	 * @return the feed
	 */
	protected Feed unmarshall(String apiUrl) {
        JsonObject response = unmarshall(callApiGet(apiUrl));
    	if (response.isJsonObject()) {
    		JsonObject json = response.getAsJsonObject();
    		int status = json.get("responseStatus").getAsInt();
    		if (status != 200) {
    			throw new GitHubException(json.get("responseDetails").getAsString());
    		}
    		JsonElement data = json.get("responseData");
    		if (data != null) {
    		    //Gson gson = getGsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
    		    //Gson gson = getGsonBuilder().create();
    		    //return gson.fromJson(data, new TypeToken<List<Feed>>(){}.getType());
    	        try {
                    return unmarshall(new TypeToken<Feed>(){}, data.getAsJsonObject().get("feed"));
                }
                catch (JsonParseException e) {
                    throw new GitHubException(e.getMessage(), e);
                }
    		}
    	}
    	return null;
	}
	
	/* (non-Javadoc)
	 * @see com.github.api.v2.services.impl.BaseGitHubService#getGsonBuilder()
	 */
	protected GsonBuilder getGsonBuilder() {
		GsonBuilder gson = super.getGsonBuilder();
		gson.setDateFormat("EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z");
		return gson;
	}

	/* (non-Javadoc)
     * @see com.github.api.v2.services.FeedService#getPrivateUserFeedJson(java.lang.String)
     */
    @Override
    public List<UserFeed> getPrivateUserFeedJson(String userName) {
        GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_PRIVATE_USER_FEED_JSON_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        JsonArray json = unmarshallArray(callApiGet(apiUrl));
        try {
            return unmarshall(new TypeToken<List<UserFeed>>(){}, json);
        }
        catch (JsonParseException e) {
            throw new GitHubException(e.getMessage(), e);
        }
    }

    @Override
    public List<UserFeed> getPublicUserFeedJson(String userName) {
        GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_PUBLIC_USER_FEED_JSON_URL);
        String                apiUrl  = builder.withField(ParameterNames.USER_NAME, userName).buildUrl();
        JsonArray json = unmarshallArray(callApiGet(apiUrl));
        
        Gson gson = getGsonBuilder().create();
        return gson.fromJson(json, new TypeToken<Collection<UserFeed>>(){}.getType());
//        try {
//            return unmarshall(new TypeToken<List<UserFeed>>(){}, json);
//        }
//        catch (JsonParseException e) {
//            throw new GitHubException(e.getMessage(), e);
//        }
    }

    @Override
    public List<UserFeed> getPublicTimelineFeedJson() {
        GitHubApiUrlBuilder builder = createGitHubApiUrlBuilder(GitHubApiUrls.FeedUrls.GET_PUBLIC_TIMELINE_FEED_JSON_URL);
        String                apiUrl  = builder.buildUrl();
        JsonArray json = unmarshallArray(callApiGet(apiUrl));
        
        Gson gson = getGsonBuilder().create();
        return gson.fromJson(json, new TypeToken<Collection<UserFeed>>(){}.getType());
    }
	
//	@SuppressWarnings("unchecked")
//	private Feed populateFeed(SyndFeed feed) {
//		Feed retVal = new Feed();
//		retVal.setAuthor(feed.getAuthor());
//		retVal.setDescription(feed.getDescription());
//		retVal.setLink(feed.getLink());
//		retVal.setTitle(feed.getTitle());
//		List<FeedEntry> entries = new ArrayList<FeedEntry>(feed.getEntries().size());
//		retVal.setEntries(entries);
//		
//		for (SyndEntry entry : (List<SyndEntry>) feed.getEntries()) {
//			FeedEntry feedEntry = new FeedEntry();
//			feedEntry.setAuthor(entry.getAuthor());
////			feedEntry.setCategories(entry.getCategories());
//			if (entry.getContents() != null) {
//				StringBuilder builder = new StringBuilder();
//				for (SyndContent content : (List<SyndContent>) entry.getContents()) {
//					builder.append(content.getValue());
//				}
//				feedEntry.setContent(builder.toString());
//			}
//			feedEntry.setLink(entry.getLink());
//			feedEntry.setPublishedDate(entry.getPublishedDate());
//			feedEntry.setTitle(entry.getTitle());
//			
//			entries.add(feedEntry);
//		}
//		return retVal;
//	}
//
//	/**
//	 * Creates the git hub api url builder.
//	 * 
//	 * @param urlFormat
//	 *            the url format
//	 * 
//	 * @return the git hub api url builder
//	 */
//	protected GitHubApiUrlBuilder createGitHubApiUrlBuilder(String urlFormat) {
//		return new GitHubApiUrlBuilder(urlFormat);
//	}
}
