package com.techsonnet.mapper;

import com.techsonnet.pojo.Book;
import com.techsonnet.pojo.BookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int countByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int deleteByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    List<Book> selectByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    Book selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Mon May 15 10:56:50 CST 2023
     */
    int updateByPrimaryKey(Book record);
}