package com.Bhuvaneswar.Blog_App.Comments;

import com.Bhuvaneswar.Blog_App.Articles.ArticleModel;
import com.Bhuvaneswar.Blog_App.Users.UserModel;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Nullable
    private String title;

    @CreatedDate
    private Date createdAt;

    @NonNull
    private String body;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    private ArticleModel article;

    @ManyToOne
    @JoinColumn(name = "commenter_id", nullable = false)
    private UserModel commenter;


}
