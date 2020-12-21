package test.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rendered_body",
        "body",
        "coediting",
        "comments_count",
        "created_at",
        "group",
        "id",
        "likes_count",
        "private",
        "reactions_count",
        "tags",
        "title",
        "updated_at",
        "url",
        "user",
        "page_views_count"
})

public class ResData {

    @JsonProperty("rendered_body")
    private String renderedBody;
    @JsonProperty("body")
    private String body;
    @JsonProperty("coediting")
    private Boolean coediting;
    @JsonProperty("comments_count")
    private Integer commentsCount;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("group")
    private Group group;
    @JsonProperty("id")
    private String id;
    @JsonProperty("likes_count")
    private Integer likesCount;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("reactions_count")
    private Integer reactionsCount;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("title")
    private String title;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("url")
    private String url;
    @JsonProperty("user")
    private User user;
    @JsonProperty("page_views_count")
    private Integer pageViewsCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rendered_body")
    public String getRenderedBody() {
        return renderedBody;
    }

    @JsonProperty("rendered_body")
    public void setRenderedBody(String renderedBody) {
        this.renderedBody = renderedBody;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("coediting")
    public Boolean getCoediting() {
        return coediting;
    }

    @JsonProperty("coediting")
    public void setCoediting(Boolean coediting) {
        this.coediting = coediting;
    }

    @JsonProperty("comments_count")
    public Integer getCommentsCount() {
        return commentsCount;
    }

    @JsonProperty("comments_count")
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("group")
    public Group getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(Group group) {
        this.group = group;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("likes_count")
    public Integer getLikesCount() {
        return likesCount;
    }

    @JsonProperty("likes_count")
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("reactions_count")
    public Integer getReactionsCount() {
        return reactionsCount;
    }

    @JsonProperty("reactions_count")
    public void setReactionsCount(Integer reactionsCount) {
        this.reactionsCount = reactionsCount;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("page_views_count")
    public Integer getPageViewsCount() {
        return pageViewsCount;
    }

    @JsonProperty("page_views_count")
    public void setPageViewsCount(Integer pageViewsCount) {
        this.pageViewsCount = pageViewsCount;
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
