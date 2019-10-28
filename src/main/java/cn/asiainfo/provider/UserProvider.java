package cn.asiainfo.provider;

import cn.asiainfo.bean.User;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserProvider {
    public static String selectUserByInfo(User user) {
        return new SQL() {{
            SELECT("id,name,age,sex,create_time,update_time");
            FROM("user");
            if (!StringUtils.isEmpty(user.getName())) {
                WHERE("name = #{name}");
            }
            if (!StringUtils.isEmpty(user.getSex())) {
                WHERE(("sex = #{sex}"));
            }
            if (user.getAge() != null) {
                WHERE("age = #{age}");
            }
        }}.toString();
    }

    public static String deleteUserById(Map map) {
        List<Integer> ids = (List<Integer>) map.get("ids");
        StringBuilder sb = new StringBuilder("delete from user where id in (");
        for (int i = 0; i < ids.size(); i++) {
            sb.append(" #{ids[" + i + "]},");
        }
        String sql = sb.substring(0, sb.length() - 1);
        sql += " )";
        return sql;
    }

    public static String insertUserList(Map map) {
        List<User> list = (List<User>) map.get("list");
        StringBuilder sb = new StringBuilder("insert into user (name,age,sex,create_time,update_time) values ");
        for (int i = 0; i < list.size(); i++) {
            sb.append("( #{list[" + i + "].name}, #{list[" + i + "].age}, #{list[" + i + "].sex}, #{list[" + i + "].createTime}, #{list[" + i + "].updateTime} ),");
        }

        return sb.substring(0, sb.length() - 1).toString();
    }

}
