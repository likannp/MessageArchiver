package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Program {
    public static void main(String[] args) throws ParseException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that´s awesome!");
        Post post = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I´m going to visit this wonderful country!",
                12);
        post.addComment(c1);
        post.addComment(c2);

        System.out.println(post);
    }
}