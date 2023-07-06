package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseaseTnbMapper;
import com.ruoyi.system.domain.DiseaseTnb;
import com.ruoyi.system.service.IDiseaseTnbService;
import com.ruoyi.common.core.text.Convert;

/**
 * 糖尿病Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
@Service
public class DiseaseTnbServiceImpl implements IDiseaseTnbService 
{
    @Autowired
    private DiseaseTnbMapper diseaseTnbMapper;

    /**
     * 查询糖尿病
     * 
     * @param id 糖尿病主键
     * @return 糖尿病
     */
    @Override
    public DiseaseTnb selectDiseaseTnbById(Long id)
    {
        return diseaseTnbMapper.selectDiseaseTnbById(id);
    }

    /**
     * 查询糖尿病列表
     * 
     * @param diseaseTnb 糖尿病
     * @return 糖尿病
     */
    @Override
    public List<DiseaseTnb> selectDiseaseTnbList(DiseaseTnb diseaseTnb)
    {
        return diseaseTnbMapper.selectDiseaseTnbList(diseaseTnb);
    }

    /**
     * 新增糖尿病
     * 
     * @param diseaseTnb 糖尿病
     * @return 结果
     */
    @Override
    public int insertDiseaseTnb(DiseaseTnb diseaseTnb)
    {
        return diseaseTnbMapper.insertDiseaseTnb(diseaseTnb);
    }

    /**
     * 修改糖尿病
     * 
     * @param diseaseTnb 糖尿病
     * @return 结果
     */
    @Override
    public int updateDiseaseTnb(DiseaseTnb diseaseTnb)
    {
        return diseaseTnbMapper.updateDiseaseTnb(diseaseTnb);
    }

    /**
     * 批量删除糖尿病
     * 
     * @param ids 需要删除的糖尿病主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseTnbByIds(String ids)
    {
        return diseaseTnbMapper.deleteDiseaseTnbByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除糖尿病信息
     * 
     * @param id 糖尿病主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseTnbById(Long id)
    {
        return diseaseTnbMapper.deleteDiseaseTnbById(id);
    }
}
