package cn.asiainfo.serviceimpl;

import cn.asiainfo.dao.RoleMapper;
import cn.asiainfo.result.BaseResult;
import cn.asiainfo.service.RoleService;
import cn.asiainfo.web.request.Ids;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    //打印日志
    private final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

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
        logger.info("result= " + result);
        return BaseResult.success();
    }
}
