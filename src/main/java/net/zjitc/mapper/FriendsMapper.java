package net.zjitc.mapper;

import net.zjitc.model.domain.Friends;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author OchiaMalu
* @description 针对表【friends(好友申请管理表)】的数据库操作Mapper
* @createDate 2023-06-18 14:10:45
* @Entity net.zjitc.model.domain.Friends
*/
@Mapper
public interface FriendsMapper extends BaseMapper<Friends> {

}




