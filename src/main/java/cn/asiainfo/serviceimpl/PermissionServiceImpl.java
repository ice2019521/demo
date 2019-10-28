package cn.asiainfo.serviceimpl;

import cn.asiainfo.bean.Permission;
import cn.asiainfo.dao.PermissionMapper;
import cn.asiainfo.result.BaseResult;
import cn.asiainfo.result.ErrorCode;
import cn.asiainfo.service.PermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    //打印日志
    private final static Logger logger = LoggerFactory.getLogger(PermissionServiceImpl.class);
    @Autowired
    PermissionMapper permissionMapper;


    /***
     * 查询Permission记录
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult selectPermissionList() throws Exception {
        try {
            List<Permission> permissions = permissionMapper.selectPermissionList();
            if (permissions == null || permissions.size() < 1) {
                logger.error(ErrorCode.GetErrorInfo + ", 查询Permission记录");
                return BaseResult.fail(ErrorCode.GetErrorCode, ErrorCode.GetErrorInfo + ", 查询Permission记录");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("permissions", permissions);

            logger.info("查询Permission记录，成功");
            return BaseResult.success(map);
        } catch (Exception e) {
            logger.error(ErrorCode.GetErrorInfo + ", 查询Permission记录");
            throw new Exception(ErrorCode.GetErrorInfo + ", 查询Permission记录");
        }
    }
}
