package com.mjx.news.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.mjx.news.entity.*;

public interface IUserMapper {
  @Insert("insert into user(uid, realname, email, role_id) values (#{id}, #{name}, #{email}, #{role_id})")
  public int addUser(User user);
  @Delete("delete from user where id=#{id}")
  public int deleteById(String id);
  @Update("insert into user(uid, realname, email, role_id) values (#{id}, #{name}, #{email}, #{role_id})")
  public int updateUser(User user);
  @Select("select * from user where uid=#{id}")
  public User getUserById(String id);
  // get all user
  @Select("select * from user")
  public List<User> getAllUsers();
  // get user by role
  @Select("select * from user where role_id=#{id}")
  public List<User> getUserByRole(int id);
}