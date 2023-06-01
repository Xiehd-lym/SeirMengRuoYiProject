package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ExcelUser;

/**
 * 用户表格Mapper接口
 * 
 * @author Xiehd
 * @date 2023-06-01
 */
public interface ExcelUserMapper 
{
    /**
     * 查询用户表格
     * 
     * @param id 用户表格主键
     * @return 用户表格
     */
    public ExcelUser selectExcelUserById(Long id);

    /**
     * 查询用户表格列表
     * 
     * @param excelUser 用户表格
     * @return 用户表格集合
     */
    public List<ExcelUser> selectExcelUserList(ExcelUser excelUser);

    /**
     * 新增用户表格
     * 
     * @param excelUser 用户表格
     * @return 结果
     */
    public int insertExcelUser(ExcelUser excelUser);

    /**
     * 修改用户表格
     * 
     * @param excelUser 用户表格
     * @return 结果
     */
    public int updateExcelUser(ExcelUser excelUser);

    /**
     * 删除用户表格
     * 
     * @param id 用户表格主键
     * @return 结果
     */
    public int deleteExcelUserById(Long id);

    /**
     * 批量删除用户表格
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExcelUserByIds(String[] ids);
}
