package com.yan.dao.mapper.role;

import com.yan.dao.model.role.SysRole;
import com.yan.dao.model.role.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    long countByExample(SysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    int deleteByExample(SysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    int insert(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    int insertSelective(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    List<SysRole> selectByExample(SysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    SysRole selectByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLE
     *
     * @mbg.generated Sat Jan 27 17:46:59 CST 2018
     */
    int updateByPrimaryKey(SysRole record);
}