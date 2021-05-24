package com.geng.springbootjdbc.dao.impl;

import com.geng.springbootjdbc.dao.UsersDao;
import com.geng.springbootjdbc.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Time: 2021-05-21 08:41
 * @Author: geng
 * @WeChat: superior_god
 * @Email: yonglonggeng@163.com
 * @File: UsersDaoImpl.java
 * @Program: springbootfreemarker
 * @Package: com.geng.springbootjdbc.dao.impl
 **/
@Repository
public class UsersDaoImpl implements UsersDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertUsers(Users users) {
        String sql = "insert into users (username, usersex) values (?,?)";
        this.jdbcTemplate.update(sql, users.getUsername(), users.getUsersex());
    }

    /*
    结果集的映射
     */
    @Override
    public List<Users> selectUsersAll() {
        String sql = "select * from users";
        return this.jdbcTemplate.query(sql, new RowMapper<Users>() {
            @Override
            public Users mapRow(ResultSet resultSet, int i) throws SQLException {

                Users users = new Users();
                users.setUsername(resultSet.getString("username"));
                users.setUsersex(resultSet.getString("usersex"));
                users.setUserid(resultSet.getInt("userid"));
//                System.out.println(resultSet.getInt("userid"));
                return users;
            }

        });

    }

    @Override
    public Users selectUserById(Integer id) {
        Users users = new Users();
        String sql = "select * from users where userid = ? ";
        // 方法一
//        this.jdbcTemplate.query(sql, new RowCallbackHandler() {
//            @Override
//            public void processRow(ResultSet resultSet) throws SQLException {
//                users.setUserid(resultSet.getInt("userid"));
//                users.setUsername(resultSet.getString("username"));
//                users.setUsersex(resultSet.getString("usersex"));
//            }
//        });

        // 方法二
        Object[] arr = new Object[]{id};
        this.jdbcTemplate.query(sql, arr, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                users.setUserid(resultSet.getInt("userid"));
                users.setUsername(resultSet.getString("username"));
                users.setUsersex(resultSet.getString("usersex"));
            }
        });

        return users;
    }

    //更新用户
    @Override
    public void updateUsers(Users users) {
        String sql = "update users set username=?,usersex=? where userid=?";

        this.jdbcTemplate.update(sql, users.getUsername(), users.getUsersex(), users.getUserid());

        return;
    }

    public void deleteUserById(Integer id) {
        String sql = "delete from users  where userid=?";

        this.jdbcTemplate.update(sql, id);

    }
}
