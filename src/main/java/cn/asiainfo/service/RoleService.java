package cn.asiainfo.service;

import cn.asiainfo.result.BaseResult;
import cn.asiainfo.web.request.Ids;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
public interface RoleService {

    /**
     * 批量删除
     * @param ids
     * @return
     * @throws Exception
     */
    BaseResult deleteRoleByIds(Ids ids) throws Exception;
}
