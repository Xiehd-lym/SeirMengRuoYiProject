package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.ExcelUser;
import com.ruoyi.system.mapper.ExcelUserMapper;
import com.ruoyi.system.service.IExcelUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户表格Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-06-01
 */
@Service
public class ExcelUserServiceImpl implements IExcelUserService 
{
    @Autowired
    private ExcelUserMapper excelUserMapper;

    /**
     * 查询用户表格
     * 
     * @param id 用户表格主键
     * @return 用户表格
     */
    @Override
    public ExcelUser selectExcelUserById(Long id)
    {
        return excelUserMapper.selectExcelUserById(id);
    }

    /**
     * 查询用户表格列表
     * 
     * @param excelUser 用户表格
     * @return 用户表格
     */
    @Override
    public List<ExcelUser> selectExcelUserList(ExcelUser excelUser)
    {
        return excelUserMapper.selectExcelUserList(excelUser);
    }

    /**
     * 新增用户表格
     * 
     * @param excelUser 用户表格
     * @return 结果
     */
    @Override
    public int insertExcelUser(ExcelUser excelUser)
    {
        return excelUserMapper.insertExcelUser(excelUser);
    }

    /**
     * 修改用户表格
     * 
     * @param excelUser 用户表格
     * @return 结果
     */
    @Override
    public int updateExcelUser(ExcelUser excelUser)
    {
        return excelUserMapper.updateExcelUser(excelUser);
    }

    /**
     * 批量删除用户表格
     * 
     * @param ids 需要删除的用户表格主键
     * @return 结果
     */
    @Override
    public int deleteExcelUserByIds(String ids)
    {
        return excelUserMapper.deleteExcelUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户表格信息
     * 
     * @param id 用户表格主键
     * @return 结果
     */
    @Override
    public int deleteExcelUserById(Long id)
    {
        return excelUserMapper.deleteExcelUserById(id);
    }
}
