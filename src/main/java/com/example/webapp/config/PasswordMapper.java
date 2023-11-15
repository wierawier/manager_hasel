package com.example.webapp.config;

import com.example.webapp.models.Password;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//public class PasswordMapper implements RowMapper<Password> {
//        @Override
//        public Password mapRow(ResultSet rs, int rowNum) throws SQLException {
//            Password password = new Password();
//
//            password.setId(rs.getLong("id"));
//            password.setTitle(rs.getString("title"));
//            password.setSite(rs.getString("site"));
//            password.setLogin(rs.getString("login"));
//            password.setPassword(rs.getString("password"));
//
//            return password;
//        }
//    }
