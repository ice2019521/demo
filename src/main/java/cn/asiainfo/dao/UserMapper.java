package cn.asiainfo.dao;

import cn.asiainfo.bean.User;
import cn.asiainfo.provider.UserProvider;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
@Mapper
@Repository
public interface UserMapper {

    @Select(value = "select id,name,age,sex,create_time,update_time from user")
    @Results(id = "user", value = {
            @Result(property = "id", javaType = Integer.class, column = "id", jdbcType = JdbcType.INTEGER),
            @Result(property = "name", javaType = String.class, column = "name", jdbcType = JdbcType.VARCHAR),
            @Result(property = "age", javaType = Integer.class, column = "age", jdbcType = JdbcType.INTEGER),
            @Result(property = "sex", javaType = String.class, column = "sex", jdbcType = JdbcType.VARCHAR),
            @Result(property = "createTime", javaType = Date.class, column = "create_time", jdbcType = JdbcType.DATE),
            @Result(property = "updateTime", javaType = Date.class, column = "update_time", jdbcType = JdbcType.DATE)
    })
    List<User> selectUserList();

    @SelectProvider(type = UserProvider.class, method = "selectUserByInfo")
    @ResultMap(value = "user")
    List<User> selectUserByInfo(User user);

    @Insert(value = "insert into user(name,age,sex,create_time,update_time) values(#{name},#{age},#{sex},#{createTime},#{updateTime})")
    int insertUser(User user);

    @DeleteProvider(type = UserProvider.class, method = "deleteUserById")
    int deleteUserById(@Param("ids") List<Integer> ids);

    @Select(value = "select id,name,age,sex,create_time,update_time from  user where id = #{id}")
    @ResultMap(value = "user")
    User selectUserById(String id);

    @InsertProvider(type = UserProvider.class, method = "insertUserList")
    int insertUserList(@Param("list") List<User> list);

    @Update(value = "update user set name=#{name},age=#{age},sex=#{sex},update_time=#{updateTime} where id = #{id}")
    int updateUserById(User user);

}
