package springboot.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 留言评论Comment
 *
 * @author LiuDeCai
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "评论ID")
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "parent_comment_id")
    @ApiModelProperty(value = "上一评论ID")
    private Comment comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @ApiModelProperty(value = "文章ID")
    private Article article;

    @ManyToOne(fetch = FetchType.LAZY)
    @ApiModelProperty(value = "用户ID")
    private User user;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

}
