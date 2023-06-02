package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PartClientMapper;
import com.ruoyi.system.domain.PartClient;
import com.ruoyi.system.service.IPartClientService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
@Service
public class PartClientServiceImpl implements IPartClientService 
{
    @Autowired
    private PartClientMapper partClientMapper;

    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    @Override
    public PartClient selectPartClientById(Long id)
    {
        return partClientMapper.selectPartClientById(id);
    }

    /**
     * 查询客户列表
     * 
     * @param partClient 客户
     * @return 客户
     */
    @Override
    public List<PartClient> selectPartClientList(PartClient partClient)
    {
        return partClientMapper.selectPartClientList(partClient);
    }

    /**
     * 新增客户
     * 
     * @param partClient 客户
     * @return 结果
     */
    @Override
    public int insertPartClient(PartClient partClient)
    {
        return partClientMapper.insertPartClient(partClient);
    }

    /**
     * 修改客户
     * 
     * @param partClient 客户
     * @return 结果
     */
    @Override
    public int updatePartClient(PartClient partClient)
    {
        return partClientMapper.updatePartClient(partClient);
    }

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键
     * @return 结果
     */
    @Override
    public int deletePartClientByIds(String ids)
    {
        return partClientMapper.deletePartClientByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    @Override
    public int deletePartClientById(Long id)
    {
        return partClientMapper.deletePartClientById(id);
    }
}
