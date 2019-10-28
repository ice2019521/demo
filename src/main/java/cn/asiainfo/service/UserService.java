package cn.asiainfo.service;

import cn.asiainfo.bean.User;
import cn.asiainfo.result.BaseResult;
import cn.asiainfo.web.request.UserVO;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lichaoyuan
 * @since 2019-08-10
 */
public interface UserService {
    /***
     * 查询User信息
     * @return
     * @throws Exception
     */
    BaseResult selectUserList() throws Exception;

    /***
     * 根据信息查询User信息
     * @return
     * @throws Exception
     */
    BaseResult selectUserByInfo(User user) throws Exception;

    /***
     * 添加User信息
     * @param user
     * @return
     * @throws Exception
     */
    BaseResult insertUser(User user) throws Exception;

    /***
     * 根据id删除User记录
     * @param ids
     * @return
     * @throws Exception
     */
    BaseResult deleteUserById(String ids) throws Exception;

    /***
     * 根据id查询User记录
     * @param id
     * @return
     * @throws Exception
     */
    BaseResult selectUserById(String id) throws Exception;

    /***
     * 批量插入User数据
     * @param userVO
     * @return
     * @throws Exception
     */
    BaseResult insertUserList(UserVO userVO) throws Exception;

    /***
     * 根据id修改User信息
     * @param user
     * @return
     * @throws Exception
     */
    BaseResult updateUserById(User user) throws Exception;

    BaseResult selectUsePage(Integer pageNum, Integer pageSize);

}
