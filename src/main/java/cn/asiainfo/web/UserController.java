package cn.asiainfo.web;

import cn.asiainfo.bean.User;
import cn.asiainfo.result.BaseResult;
import cn.asiainfo.result.ErrorCode;
import cn.asiainfo.service.UserService;
import cn.asiainfo.web.request.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //打印日志
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    /****
     * 根据信息查询User信息
     * @param user
     * @return
     */
    @PostMapping(value = {"/selectUserByInfo"})
    public BaseResult selectUserByInfo(@RequestBody User user) {
        try {
            if (user == null) {
                logger.error(ErrorCode.ParaCheckErrorRetInfo + ", 根据信息查询User信息");
                return BaseResult.fail(ErrorCode.ParaCheckErrorRetCode, ErrorCode.ParaCheckErrorRetInfo + ", 根据信息查询User信息");
            }
            return userService.selectUserByInfo(user);
        } catch (Exception e) {
            logger.error("根据信息查询User信息error: ", e);
            return BaseResult.exception("根据信息查询User信息, 错误");
        }
    }

    /***
     * 根据id查询User记录
     * @param id
     * @return
     */
    @GetMapping(value = {"/selectUserById/{id}"})
    public BaseResult selectUserById(@PathVariable("id") String id) {
        try {
            if (StringUtils.isEmpty(id)) {
                logger.error(ErrorCode.ParaCheckErrorRetInfo + ", 根据id查询User记录");
                return BaseResult.fail(ErrorCode.ParaCheckErrorRetCode, ErrorCode.ParaCheckErrorRetInfo + ", 根据id查询User记录");
            }
            return userService.selectUserById(id);
        } catch (Exception e) {
            logger.error("根据id查询User记录error: ", e);
            return BaseResult.exception("根据id查询User记录, 错误");
        }
    }

    /***
     * 添加User信息
     * @param user
     * @return
     */
    @PostMapping(value = {"/insertUser"})
    public BaseResult insertUser(@RequestBody User user) {
        try {
            if (user == null) {
                logger.error(ErrorCode.ParaCheckErrorRetInfo + ", 添加User信息");
                return BaseResult.fail(ErrorCode.ParaCheckErrorRetCode, ErrorCode.ParaCheckErrorRetInfo + ", 添加User信息");
            }
            return userService.insertUser(user);
        } catch (Exception e) {
            logger.error("添加User信息error: ", e);
            return BaseResult.exception("添加User信息, 错误");
        }
    }

    /***
     * 批量插入User数据
     * @param userVO
     * @return
     */
    @PostMapping(value = {"/insertUserList"})
    public BaseResult insertUserList(@RequestBody UserVO userVO) {
        try {
            if (userVO == null || userVO.getUsers() == null || userVO.getUsers().isEmpty()) {
                logger.error(ErrorCode.ParaCheckErrorRetInfo + ", 批量插入User数据");
                return BaseResult.fail(ErrorCode.ParaCheckErrorRetCode, ErrorCode.ParaCheckErrorRetInfo + ", 批量插入User数据");
            }
            return userService.insertUserList(userVO);
        } catch (Exception e) {
            logger.error("批量插入User数据error: ", e);
            return BaseResult.exception("批量插入User数据, 错误");
        }
    }

    /***
     * 根据id修改User信息
     * @param user
     * @return
     */
    @PutMapping(value = {"/updateUserById"})
    public BaseResult updateUserById(@RequestBody User user) {
        try {
            if (user == null || user.getId() == null) {
                logger.error(ErrorCode.ParaCheckErrorRetInfo + ", 根据id修改User信息");
                return BaseResult.fail(ErrorCode.ParaCheckErrorRetCode, ErrorCode.ParaCheckErrorRetInfo + ", 根据id修改User信息");
            }
            return userService.updateUserById(user);
        } catch (Exception e) {
            logger.error("根据id修改User信息error: ", e);
            return BaseResult.exception("根据id修改User信息, 错误");
        }
    }

    /***
     * 根据id删除User记录
     * @param ids
     * @return
     */
    @GetMapping(value = {"/deleteUserById/{ids}"})
    public BaseResult deleteUserById(@PathVariable("ids") String ids) {
        try {
            if (StringUtils.isEmpty(ids)) {
                logger.error(ErrorCode.ParaCheckErrorRetInfo + ", 根据id删除User记录");
                return BaseResult.fail(ErrorCode.ParaCheckErrorRetCode, ErrorCode.ParaCheckErrorRetInfo + ", 根据id删除User记录");
            }
            return userService.deleteUserById(ids);
        } catch (Exception e) {
            logger.error("根据id删除User记录error: ", e);
            return BaseResult.exception("根据id删除User记录, 错误");
        }
    }

    /***
     * 查询User信息
     * @return
     */
    @GetMapping(value = {"/selectUserList"})
    public BaseResult selectUserList() {
        try {
            return userService.selectUserList();
        } catch (Exception e) {
            logger.error("查询User信息error: ", e);
            return BaseResult.exception("查询User信息, 错误");
        }
    }

}

