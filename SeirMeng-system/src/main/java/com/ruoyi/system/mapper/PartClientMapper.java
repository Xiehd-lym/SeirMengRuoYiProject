package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PartClient;

/**
 * 客户Mapper接口
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
public interface PartClientMapper 
{
    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    public PartClient selectPartClientById(Long id);

    /**
     * 查询客户列表
     * 
     * @param partClient 客户
     * @return 客户集合
     */
    public List<PartClient> selectPartClientList(PartClient partClient);

    /**
     * 新增客户
     * 
     * @param partClient 客户
     * @return 结果
     */
    public int insertPartClient(PartClient partClient);

    /**
     * 修改客户
     * 
     * @param partClient 客户
     * @return 结果
     */
    public int updatePartClient(PartClient partClient);

    /**
     * 删除客户
     * 
     * @param id 客户主键
     * @return 结果
     */
    public int deletePartClientById(Long id);

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePartClientByIds(String[] ids);
}
