package cn.asiainfo.serviceimpl;

import cn.asiainfo.dao.RoleMapper;
import cn.asiainfo.result.BaseResult;
import cn.asiainfo.service.RoleService;
import cn.asiainfo.web.request.Ids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    /**
     * 批量删除
     *
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult deleteRoleByIds(Ids ids) throws Exception {

        int result = roleMapper.deleteRoleByIds(ids.getIds());
        System.out.println(result);


        return BaseResult.success();
    }
}
