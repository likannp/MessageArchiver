package entities;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Post{

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title + "\n");
        stringBuilder.append(likes);
        stringBuilder.append(" Likes - ");
        stringBuilder.append(sdf.format(moment) + "\n");
        stringBuilder.append(cotent + "\n");
        stringBuilder.append("Comments: \n");
        for (Comment c : commentList){
            stringBuilder.append(c.getText() + "\n");
        }
        return stringBuilder.toString();
    }
}