package test.bean;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "description",
        "facebook_id",
        "followees_count",
        "followers_count",
        "github_login_name",
        "id",
        "items_count",
        "linkedin_id",
        "location",
        "name",
        "organization",
        "permanent_id",
        "profile_image_url",
        "team_only",
        "twitter_screen_name",
        "website_url"
})
public class User {

    @JsonProperty("description")
    private String description;
    @JsonProperty("facebook_id")
    private String facebookId;
    @JsonProperty("followees_count")
    private Integer followeesCount;
    @JsonProperty("followers_count")
    private Integer followersCount;
    @JsonProperty("github_login_name")
    private String githubLoginName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("items_count")
    private Integer itemsCount;
    @JsonProperty("linkedin_id")
    private String linkedinId;
    @JsonProperty("location")
    private String location;
    @JsonProperty("name")
    private String name;
    @JsonProperty("organization")
    private String organization;
    @JsonProperty("permanent_id")
    private Integer permanentId;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("team_only")
    private Boolean teamOnly;
    @JsonProperty("twitter_screen_name")
    private String twitterScreenName;
    @JsonProperty("website_url")
    private String websiteUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("facebook_id")
    public String getFacebookId() {
        return facebookId;
    }

    @JsonProperty("facebook_id")
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    @JsonProperty("followees_count")
    public Integer getFolloweesCount() {
        return followeesCount;
    }

    @JsonProperty("followees_count")
    public void setFolloweesCount(Integer followeesCount) {
        this.followeesCount = followeesCount;
    }

    @JsonProperty("followers_count")
    public Integer getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followers_count")
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    @JsonProperty("github_login_name")
    public String getGithubLoginName() {
        return githubLoginName;
    }

    @JsonProperty("github_login_name")
    public void setGithubLoginName(String githubLoginName) {
        this.githubLoginName = githubLoginName;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("items_count")
    public Integer getItemsCount() {
        return itemsCount;
    }

    @JsonProperty("items_count")
    public void setItemsCount(Integer itemsCount) {
        this.itemsCount = itemsCount;
    }

    @JsonProperty("linkedin_id")
    public String getLinkedinId() {
        return linkedinId;
    }

    @JsonProperty("linkedin_id")
    public void setLinkedinId(String linkedinId) {
        this.linkedinId = linkedinId;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @JsonProperty("permanent_id")
    public Integer getPermanentId() {
        return permanentId;
    }

    @JsonProperty("permanent_id")
    public void setPermanentId(Integer permanentId) {
        this.permanentId = permanentId;
    }

    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    @JsonProperty("team_only")
    public Boolean getTeamOnly() {
        return teamOnly;
    }

    @JsonProperty("team_only")
    public void setTeamOnly(Boolean teamOnly) {
        this.teamOnly = teamOnly;
    }

    @JsonProperty("twitter_screen_name")
    public String getTwitterScreenName() {
        return twitterScreenName;
    }

    @JsonProperty("twitter_screen_name")
    public void setTwitterScreenName(String twitterScreenName) {
        this.twitterScreenName = twitterScreenName;
    }

    @JsonProperty("website_url")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("website_url")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}