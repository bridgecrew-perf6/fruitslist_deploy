package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.User;

@Mapper
public interface FruitsMapper {
	
	@Select("SELECT * FROM fruits WHERE id = #{id}")
    public User findOne(Integer id);
    
    @Select("SELECT * FROM fruits")
    public List<User> find();
    
    @Insert("INSERT INTO fruits VALUES(#{id}, #{name}, #{price})")
    public void insertOne(User u);
    
    @Update("UPDATE fruits SET name = #{name}, price = #{price} WHERE id = #{id}")
    public void updateOne(@Param("id") Integer id,
    		@Param("name") String name, @Param("price") Integer price);
    
    @Delete("DELETE FROM fruits WHERE id = #{id}")
    public void deleteOne(Integer id);
}
