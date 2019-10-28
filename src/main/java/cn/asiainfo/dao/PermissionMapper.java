package cn.asiainfo.dao;

import cn.asiainfo.bean.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
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
public interface PermissionMapper {
    /***
     * 查询Permission记录
     * @return
     */
    @Select(value = "select id,per_id,name,url,create_time,update_time,describtion from permission")
    @Results(id = "permission", value = {
            @Result(property = "id", javaType = Integer.class, column = "id", jdbcType = JdbcType.INTEGER),
            @Result(property = "perId", javaType = Integer.class, column = "per_id", jdbcType = JdbcType.INTEGER),
            @Result(property = "name", javaType = String.class, column = "name", jdbcType = JdbcType.VARCHAR),
            @Result(property = "url", javaType = String.class, column = "url", jdbcType = JdbcType.VARCHAR),
            @Result(property = "createTime", javaType = Date.class, column = "create_time", jdbcType = JdbcType.DATE),
            @Result(property = "updateTime", javaType = Date.class, column = "update_time", jdbcType = JdbcType.DATE),
            @Result(property = "describtion", javaType = String.class, column = "describtion", jdbcType = JdbcType.VARCHAR)
    })
    List<Permission> selectPermissionList();
}
