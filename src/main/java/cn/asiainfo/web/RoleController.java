package cn.asiainfo.web;


import cn.asiainfo.result.BaseResult;
import cn.asiainfo.service.RoleService;
import cn.asiainfo.web.request.Ids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping(value = {"/deleteRoleByIds"})
    public BaseResult deleteRoleByIds(@RequestBody Ids ids) throws Exception {
        return roleService.deleteRoleByIds(ids);
    }

}

