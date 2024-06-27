package entities;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Post{
    private Date moment;
    private String title;
    private String cotent;
    private Integer likes;

    private List<Comment> commentList = new ArrayList<>();
    public Post(){}

    public Post(Date moment, String title, String cotent, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.cotent = cotent;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }
    public void addComment(Comment comment){
        commentList.add(comment);
    }
    public void removeComment(Comment comment){
        commentList.remove(comment);
    }
}