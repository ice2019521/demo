package cn.asiainfo.serviceimpl;

import cn.asiainfo.bean.User;
import cn.asiainfo.dao.UserMapper;
import cn.asiainfo.result.BaseResult;
import cn.asiainfo.result.ErrorCode;
import cn.asiainfo.service.UserService;
import cn.asiainfo.web.request.UserVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
@Service
public class UserServiceImpl implements UserService {
    //打印日志
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserMapper userMapper;

    /***
     * 查询User信息
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult selectUserList() throws Exception {
        try {
            List<User> users = userMapper.selectUserList();
            if (users == null || users.size() < 1) {
                logger.error(ErrorCode.GetErrorInfo + ", 查询User信息");
                return BaseResult.fail(ErrorCode.GetErrorCode, ErrorCode.GetErrorInfo + ", 查询User信息");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("users", users);

            logger.info("查询User信息，成功");
            return BaseResult.success(map);
        } catch (Exception e) {
            logger.error(ErrorCode.GetErrorInfo + ", 查询User信息");
            throw new Exception(ErrorCode.GetErrorInfo + ", 查询User信息");
        }
    }

    /***
     * 根据信息查询User信息
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult selectUserByInfo(User user) throws Exception {
        try {
            List<User> users = userMapper.selectUserByInfo(user);
            if (users == null || users.size() < 1) {
                logger.error(ErrorCode.GetErrorInfo + ", 根据信息查询User信息");
                return BaseResult.fail(ErrorCode.GetErrorCode, ErrorCode.GetErrorInfo + ", 根据信息查询User信息");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("users", users);

            logger.info("根据信息查询User信息，成功");
            return BaseResult.success(map);
        } catch (Exception e) {
            logger.error(ErrorCode.GetErrorInfo + ", 根据信息查询User信息");
            throw new Exception(ErrorCode.GetErrorInfo + ", 根据信息查询User信息");
        }
    }

    /***
     * 添加User信息
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult insertUser(User user) throws Exception {
        try {
            int result = userMapper.insertUser(user);
            if (result != 1) {
                logger.error(ErrorCode.AddIsErrorInfo + ", 添加User信息");
                return BaseResult.fail(ErrorCode.AddIsErrorCode, ErrorCode.AddIsErrorInfo + ", 添加User信息");
            }

            logger.info("添加User信息，成功");
            return BaseResult.success();
        } catch (Exception e) {
            logger.error(ErrorCode.AddIsErrorCode + ", 添加User信息");
            throw new Exception(ErrorCode.AddIsErrorInfo + ", 添加User信息");
        }
    }


    /***
     * 根据id删除User记录
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult deleteUserById(String ids) throws Exception {
        try {
            List<Integer> list = new ArrayList<>();
            String[] idss = ids.split(",");
            for (String id : idss) {
                list.add(Integer.parseInt(id));
            }
            int result = userMapper.deleteUserById(list);

            logger.info("根据id删除User记录" + result + "条，成功");
            System.out.println();
            return BaseResult.success();
        } catch (Exception e) {
            logger.error(ErrorCode.DeleteIsErrorInfo + ", 根据id删除User记录");
            throw new Exception(ErrorCode.DeleteIsErrorInfo + ", 根据id删除User记录");
        }
    }


    public BaseResult selectUsePage(Integer pageNum, Integer pageSize) {
        Page<User> page = PageHelper.startPage(pageNum, pageSize);
        List<User> list = userMapper.selectUserList();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", list);
        map.put("pageInfo", pageInfo);
        return BaseResult.success(map);
    }

    /***
     * 根据id查询User记录
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult selectUserById(String id) throws Exception {
        try {
            User user = userMapper.selectUserById(id);
            if (user == null) {
                logger.error(ErrorCode.GetErrorInfo + ", 根据id查询User记录");
                return BaseResult.fail(ErrorCode.GetErrorCode, ErrorCode.GetErrorInfo + ", 根据id查询User记录");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("user", user);

            logger.info("根据id查询User记录，成功");
            return BaseResult.success(map);
        } catch (Exception e) {
            logger.error(ErrorCode.GetErrorInfo + ", 根据id查询User记录");
            throw new Exception(ErrorCode.GetErrorInfo + ", 根据id查询User记录");
        }
    }


    /***
     * 批量插入User数据
     * @param userVO
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult insertUserList(UserVO userVO) throws Exception {
        try {
            int result = userMapper.insertUserList(userVO.getUsers());
            if (result != userVO.getUsers().size()) {
                logger.error(ErrorCode.AddIsErrorInfo + ", 批量插入User数据");
                return BaseResult.fail(ErrorCode.AddIsErrorCode, ErrorCode.AddIsErrorInfo + ", 批量插入User数据");
            }

            logger.info("批量插入User数据，成功");
            return BaseResult.success();
        } catch (Exception e) {
            logger.error(ErrorCode.AddIsErrorCode + ", 批量插入User数据");
            throw new Exception(ErrorCode.AddIsErrorInfo + ", 批量插入User数据");
        }
    }


    /***
     * 根据id修改User信息
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public BaseResult updateUserById(User user) throws Exception {
        try {
            user.setUpdateTime(new Date());
            int result = userMapper.updateUserById(user);
            if (result != 1) {
                logger.error(ErrorCode.UpdateErrorInfo + ", 根据id修改User信息");
                return BaseResult.fail(ErrorCode.UpdateErrorCode, ErrorCode.UpdateErrorInfo + ", 根据id修改User信息");
            }

            logger.info("根据id修改User信息，成功");
            return BaseResult.success();
        } catch (Exception e) {
            logger.error(ErrorCode.UpdateErrorCode + ", 根据id修改User信息");
            throw new Exception(ErrorCode.UpdateErrorInfo + ", 根据id修改User信息");
        }
    }
}
