package cn.asiainfo.web;

import cn.asiainfo.result.BaseResult;
import cn.asiainfo.service.PermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {
    //打印日志
    private final Logger logger = LoggerFactory.getLogger(PermissionController.class);
    @Autowired
    PermissionService permissionService;

    /***
     * 查询Permission记录
     * @return
     */
    @ResponseBody
    @GetMapping(value = {"/selectPermissionList"})
    public BaseResult selectPermissionList() {
        try {
            return permissionService.selectPermissionList();
        } catch (Exception e) {
            logger.error("查询Permission记录error: ", e);
            return BaseResult.exception("查询Permission记录, 错误");
        }
    }

}

