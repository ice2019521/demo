package cn.asiainfo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
public interface RoleMapper {

    int deleteRoleByIds(List<String> ids);
}
