package net.zjitc.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.zjitc.model.domain.Blog;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(value = "博文返回-修改后")
public class BlogVO1 extends Blog implements Serializable {
    /**
     * 串行版本uid
     */
    private static final long serialVersionUID = -1461567317259590205L;
    /**
     * 就像
     */
    @ApiModelProperty(value = "是否点赞")
    private Boolean isLike;
    /**
     * 封面图片
     */
    @ApiModelProperty(value = "封面图片")
    private String coverImage;
    /**
     * 作者
     */
    @ApiModelProperty(value = "作者")
    private UserVO author;

    /**
     * 用户昵称
     */
    @ApiModelProperty(value = "用户昵称")
    private String username;

    /**
     * 用户头像
     */
    @ApiModelProperty(value = "用户头像")
    private String avatarUrl;

    private String profile;


}
