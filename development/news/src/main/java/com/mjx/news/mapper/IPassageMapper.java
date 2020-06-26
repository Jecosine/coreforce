package com.mjx.news.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.mjx.news.entity.*;

public interface IPassageMapper {
  @Insert("insert into passage(pid, uid, title, part_id, datetime) values (#{id}, #{uid}, #{title}, #{part_id}, now())")
  public int addPassage(Passage passage);
  @Delete("delete from passage where id=#{id}")
  public int deleteById(String id);
  @Update("update passage set pid=#{id}, uid=#{uid}, title=#{title}, part_id=#{part_id}")
  public int updatePassage(Passage passage);
  @Select("select * from passage where pid=#{id}")
  public Passage getPassageById(String id);
  // get all passage
  @Select("select * from passage")
  public List<Passage> getAllPassages();
  // get passage by part
  @Select("select * from passage where part_id=#{id}")
  public List<Passage> getPassageByPart(int id);
}