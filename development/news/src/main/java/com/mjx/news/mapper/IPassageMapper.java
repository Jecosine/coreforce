package com.mjx.news.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.mjx.news.entity.*;

public interface IPassageMapper {
  @Insert("insert into passage(pid, uid, title, part_id) values (#{id}, #{uid}, #{title}, #{part_id})")
  public int addPassage(Passage passage);
  @Delete("delete from passage where id=#{id}")
  public int deleteById(String id);
  @Update("insert into passage(uid, realname, email, role_id) values (#{id}, #{name}, #{email}, #{role_id})")
  public int updatePassage(Passage passage);
  @Select("select * from passage where uid=#{id}")
  public Passage getPassageById(String id);
  // get all passage
  @Select("select * from passage")
  public List<Passage> getAllPassages();
  // get passage by role
  @Select("select * from passage where role_id=#{id}")
  public List<Passage> getUserByRole(int id);
}