package com.moveo.aem.training.core.beans.bitcoin.davide;
import com.fasterxml.jackson.annotation.JsonProperty;
public class TimeSery{
    @JsonProperty("asset_id") 
    public int getAsset_id() { 
		 return this.asset_id; } 
    public void setAsset_id(int asset_id) { 
		 this.asset_id = asset_id; } 
    int asset_id;
    @JsonProperty("time") 
    public int getTime() { 
		 return this.time; } 
    public void setTime(int time) { 
		 this.time = time; } 
    int time;
    @JsonProperty("open") 
    public double getOpen() { 
		 return this.open; } 
    public void setOpen(double open) { 
		 this.open = open; } 
    double open;
    @JsonProperty("close") 
    public double getClose() { 
		 return this.close; } 
    public void setClose(double close) { 
		 this.close = close; } 
    double close;
    @JsonProperty("high") 
    public double getHigh() { 
		 return this.high; } 
    public void setHigh(double high) { 
		 this.high = high; } 
    double high;
    @JsonProperty("low") 
    public double getLow() { 
		 return this.low; } 
    public void setLow(double low) { 
		 this.low = low; } 
    double low;
    @JsonProperty("volume") 
    public double getVolume() { 
		 return this.volume; } 
    public void setVolume(double volume) { 
		 this.volume = volume; } 
    double volume;
    @JsonProperty("market_cap") 
    public Object getMarket_cap() { 
		 return this.market_cap; } 
    public void setMarket_cap(Object market_cap) { 
		 this.market_cap = market_cap; } 
    Object market_cap;
    @JsonProperty("url_shares") 
    public int getUrl_shares() { 
		 return this.url_shares; } 
    public void setUrl_shares(int url_shares) { 
		 this.url_shares = url_shares; } 
    int url_shares;
    @JsonProperty("unique_url_shares") 
    public int getUnique_url_shares() { 
		 return this.unique_url_shares; } 
    public void setUnique_url_shares(int unique_url_shares) { 
		 this.unique_url_shares = unique_url_shares; } 
    int unique_url_shares;
    @JsonProperty("reddit_posts") 
    public int getReddit_posts() { 
		 return this.reddit_posts; } 
    public void setReddit_posts(int reddit_posts) { 
		 this.reddit_posts = reddit_posts; } 
    int reddit_posts;
    @JsonProperty("reddit_posts_score") 
    public int getReddit_posts_score() { 
		 return this.reddit_posts_score; } 
    public void setReddit_posts_score(int reddit_posts_score) { 
		 this.reddit_posts_score = reddit_posts_score; } 
    int reddit_posts_score;
    @JsonProperty("reddit_comments") 
    public int getReddit_comments() { 
		 return this.reddit_comments; } 
    public void setReddit_comments(int reddit_comments) { 
		 this.reddit_comments = reddit_comments; } 
    int reddit_comments;
    @JsonProperty("reddit_comments_score") 
    public int getReddit_comments_score() { 
		 return this.reddit_comments_score; } 
    public void setReddit_comments_score(int reddit_comments_score) { 
		 this.reddit_comments_score = reddit_comments_score; } 
    int reddit_comments_score;
    @JsonProperty("tweets") 
    public int getTweets() { 
		 return this.tweets; } 
    public void setTweets(int tweets) { 
		 this.tweets = tweets; } 
    int tweets;
    @JsonProperty("tweet_spam") 
    public int getTweet_spam() { 
		 return this.tweet_spam; } 
    public void setTweet_spam(int tweet_spam) { 
		 this.tweet_spam = tweet_spam; } 
    int tweet_spam;
    @JsonProperty("tweet_followers") 
    public int getTweet_followers() { 
		 return this.tweet_followers; } 
    public void setTweet_followers(int tweet_followers) { 
		 this.tweet_followers = tweet_followers; } 
    int tweet_followers;
    @JsonProperty("tweet_quotes") 
    public int getTweet_quotes() { 
		 return this.tweet_quotes; } 
    public void setTweet_quotes(int tweet_quotes) { 
		 this.tweet_quotes = tweet_quotes; } 
    int tweet_quotes;
    @JsonProperty("tweet_retweets") 
    public int getTweet_retweets() { 
		 return this.tweet_retweets; } 
    public void setTweet_retweets(int tweet_retweets) { 
		 this.tweet_retweets = tweet_retweets; } 
    int tweet_retweets;
    @JsonProperty("tweet_replies") 
    public int getTweet_replies() { 
		 return this.tweet_replies; } 
    public void setTweet_replies(int tweet_replies) { 
		 this.tweet_replies = tweet_replies; } 
    int tweet_replies;
    @JsonProperty("tweet_favorites") 
    public int getTweet_favorites() { 
		 return this.tweet_favorites; } 
    public void setTweet_favorites(int tweet_favorites) { 
		 this.tweet_favorites = tweet_favorites; } 
    int tweet_favorites;
    @JsonProperty("tweet_sentiment1") 
    public int getTweet_sentiment1() { 
		 return this.tweet_sentiment1; } 
    public void setTweet_sentiment1(int tweet_sentiment1) { 
		 this.tweet_sentiment1 = tweet_sentiment1; } 
    int tweet_sentiment1;
    @JsonProperty("tweet_sentiment2") 
    public int getTweet_sentiment2() { 
		 return this.tweet_sentiment2; } 
    public void setTweet_sentiment2(int tweet_sentiment2) { 
		 this.tweet_sentiment2 = tweet_sentiment2; } 
    int tweet_sentiment2;
    @JsonProperty("tweet_sentiment3") 
    public int getTweet_sentiment3() { 
		 return this.tweet_sentiment3; } 
    public void setTweet_sentiment3(int tweet_sentiment3) { 
		 this.tweet_sentiment3 = tweet_sentiment3; } 
    int tweet_sentiment3;
    @JsonProperty("tweet_sentiment4") 
    public int getTweet_sentiment4() { 
		 return this.tweet_sentiment4; } 
    public void setTweet_sentiment4(int tweet_sentiment4) { 
		 this.tweet_sentiment4 = tweet_sentiment4; } 
    int tweet_sentiment4;
    @JsonProperty("tweet_sentiment5") 
    public int getTweet_sentiment5() { 
		 return this.tweet_sentiment5; } 
    public void setTweet_sentiment5(int tweet_sentiment5) { 
		 this.tweet_sentiment5 = tweet_sentiment5; } 
    int tweet_sentiment5;
    @JsonProperty("tweet_sentiment_impact1") 
    public int getTweet_sentiment_impact1() { 
		 return this.tweet_sentiment_impact1; } 
    public void setTweet_sentiment_impact1(int tweet_sentiment_impact1) { 
		 this.tweet_sentiment_impact1 = tweet_sentiment_impact1; } 
    int tweet_sentiment_impact1;
    @JsonProperty("tweet_sentiment_impact2") 
    public int getTweet_sentiment_impact2() { 
		 return this.tweet_sentiment_impact2; } 
    public void setTweet_sentiment_impact2(int tweet_sentiment_impact2) { 
		 this.tweet_sentiment_impact2 = tweet_sentiment_impact2; } 
    int tweet_sentiment_impact2;
    @JsonProperty("tweet_sentiment_impact3") 
    public int getTweet_sentiment_impact3() { 
		 return this.tweet_sentiment_impact3; } 
    public void setTweet_sentiment_impact3(int tweet_sentiment_impact3) { 
		 this.tweet_sentiment_impact3 = tweet_sentiment_impact3; } 
    int tweet_sentiment_impact3;
    @JsonProperty("tweet_sentiment_impact4") 
    public int getTweet_sentiment_impact4() { 
		 return this.tweet_sentiment_impact4; } 
    public void setTweet_sentiment_impact4(int tweet_sentiment_impact4) { 
		 this.tweet_sentiment_impact4 = tweet_sentiment_impact4; } 
    int tweet_sentiment_impact4;
    @JsonProperty("tweet_sentiment_impact5") 
    public int getTweet_sentiment_impact5() { 
		 return this.tweet_sentiment_impact5; } 
    public void setTweet_sentiment_impact5(int tweet_sentiment_impact5) { 
		 this.tweet_sentiment_impact5 = tweet_sentiment_impact5; } 
    int tweet_sentiment_impact5;
    @JsonProperty("social_score") 
    public int getSocial_score() { 
		 return this.social_score; } 
    public void setSocial_score(int social_score) { 
		 this.social_score = social_score; } 
    int social_score;
    @JsonProperty("average_sentiment") 
    public double getAverage_sentiment() { 
		 return this.average_sentiment; } 
    public void setAverage_sentiment(double average_sentiment) { 
		 this.average_sentiment = average_sentiment; } 
    double average_sentiment;
    @JsonProperty("sentiment_absolute") 
    public int getSentiment_absolute() { 
		 return this.sentiment_absolute; } 
    public void setSentiment_absolute(int sentiment_absolute) { 
		 this.sentiment_absolute = sentiment_absolute; } 
    int sentiment_absolute;
    @JsonProperty("sentiment_relative") 
    public int getSentiment_relative() { 
		 return this.sentiment_relative; } 
    public void setSentiment_relative(int sentiment_relative) { 
		 this.sentiment_relative = sentiment_relative; } 
    int sentiment_relative;
    @JsonProperty("search_average") 
    public Object getSearch_average() { 
		 return this.search_average; } 
    public void setSearch_average(Object search_average) { 
		 this.search_average = search_average; } 
    Object search_average;
    @JsonProperty("news") 
    public int getNews() { 
		 return this.news; } 
    public void setNews(int news) { 
		 this.news = news; } 
    int news;
    @JsonProperty("price_score") 
    public double getPrice_score() { 
		 return this.price_score; } 
    public void setPrice_score(double price_score) { 
		 this.price_score = price_score; } 
    double price_score;
    @JsonProperty("social_impact_score") 
    public double getSocial_impact_score() { 
		 return this.social_impact_score; } 
    public void setSocial_impact_score(double social_impact_score) { 
		 this.social_impact_score = social_impact_score; } 
    double social_impact_score;
    @JsonProperty("correlation_rank") 
    public double getCorrelation_rank() { 
		 return this.correlation_rank; } 
    public void setCorrelation_rank(double correlation_rank) { 
		 this.correlation_rank = correlation_rank; } 
    double correlation_rank;
    @JsonProperty("galaxy_score") 
    public double getGalaxy_score() { 
		 return this.galaxy_score; } 
    public void setGalaxy_score(double galaxy_score) { 
		 this.galaxy_score = galaxy_score; } 
    double galaxy_score;
    @JsonProperty("volatility") 
    public double getVolatility() { 
		 return this.volatility; } 
    public void setVolatility(double volatility) { 
		 this.volatility = volatility; } 
    double volatility;
    @JsonProperty("alt_rank") 
    public int getAlt_rank() { 
		 return this.alt_rank; } 
    public void setAlt_rank(int alt_rank) { 
		 this.alt_rank = alt_rank; } 
    int alt_rank;
    @JsonProperty("alt_rank_30d") 
    public int getAlt_rank_30d() { 
		 return this.alt_rank_30d; } 
    public void setAlt_rank_30d(int alt_rank_30d) { 
		 this.alt_rank_30d = alt_rank_30d; } 
    int alt_rank_30d;
    @JsonProperty("market_cap_rank") 
    public int getMarket_cap_rank() { 
		 return this.market_cap_rank; } 
    public void setMarket_cap_rank(int market_cap_rank) { 
		 this.market_cap_rank = market_cap_rank; } 
    int market_cap_rank;
    @JsonProperty("percent_change_24h_rank") 
    public int getPercent_change_24h_rank() { 
		 return this.percent_change_24h_rank; } 
    public void setPercent_change_24h_rank(int percent_change_24h_rank) { 
		 this.percent_change_24h_rank = percent_change_24h_rank; } 
    int percent_change_24h_rank;
    @JsonProperty("volume_24h_rank") 
    public int getVolume_24h_rank() { 
		 return this.volume_24h_rank; } 
    public void setVolume_24h_rank(int volume_24h_rank) { 
		 this.volume_24h_rank = volume_24h_rank; } 
    int volume_24h_rank;
    @JsonProperty("social_volume_24h_rank") 
    public int getSocial_volume_24h_rank() { 
		 return this.social_volume_24h_rank; } 
    public void setSocial_volume_24h_rank(int social_volume_24h_rank) { 
		 this.social_volume_24h_rank = social_volume_24h_rank; } 
    int social_volume_24h_rank;
    @JsonProperty("social_score_24h_rank") 
    public int getSocial_score_24h_rank() { 
		 return this.social_score_24h_rank; } 
    public void setSocial_score_24h_rank(int social_score_24h_rank) { 
		 this.social_score_24h_rank = social_score_24h_rank; } 
    int social_score_24h_rank;
    @JsonProperty("medium") 
    public int getMedium() { 
		 return this.medium; } 
    public void setMedium(int medium) { 
		 this.medium = medium; } 
    int medium;
    @JsonProperty("youtube") 
    public int getYoutube() { 
		 return this.youtube; } 
    public void setYoutube(int youtube) { 
		 this.youtube = youtube; } 
    int youtube;
    @JsonProperty("social_contributors") 
    public int getSocial_contributors() { 
		 return this.social_contributors; } 
    public void setSocial_contributors(int social_contributors) { 
		 this.social_contributors = social_contributors; } 
    int social_contributors;
    @JsonProperty("social_volume") 
    public int getSocial_volume() { 
		 return this.social_volume; } 
    public void setSocial_volume(int social_volume) { 
		 this.social_volume = social_volume; } 
    int social_volume;
    @JsonProperty("price_btc") 
    public double getPrice_btc() { 
		 return this.price_btc; } 
    public void setPrice_btc(double price_btc) { 
		 this.price_btc = price_btc; } 
    double price_btc;
    @JsonProperty("social_volume_global") 
    public int getSocial_volume_global() { 
		 return this.social_volume_global; } 
    public void setSocial_volume_global(int social_volume_global) { 
		 this.social_volume_global = social_volume_global; } 
    int social_volume_global;
    @JsonProperty("social_dominance") 
    public double getSocial_dominance() { 
		 return this.social_dominance; } 
    public void setSocial_dominance(double social_dominance) { 
		 this.social_dominance = social_dominance; } 
    double social_dominance;
    @JsonProperty("market_cap_global") 
    public Object getMarket_cap_global() { 
		 return this.market_cap_global; } 
    public void setMarket_cap_global(Object market_cap_global) { 
		 this.market_cap_global = market_cap_global; } 
    Object market_cap_global;
    @JsonProperty("market_dominance") 
    public double getMarket_dominance() { 
		 return this.market_dominance; } 
    public void setMarket_dominance(double market_dominance) { 
		 this.market_dominance = market_dominance; } 
    double market_dominance;
    @JsonProperty("percent_change_24h") 
    public double getPercent_change_24h() { 
		 return this.percent_change_24h; } 
    public void setPercent_change_24h(double percent_change_24h) { 
		 this.percent_change_24h = percent_change_24h; } 
    double percent_change_24h;
}
