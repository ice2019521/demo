package cn.asiainfo.service;

import cn.asiainfo.result.BaseResult;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
public interface PermissionService {

    /***
     * 查询Permission记录
     * @return
     */
    BaseResult selectPermissionList() throws Exception;
}
