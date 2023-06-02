package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PartMapper;
import com.ruoyi.system.domain.Part;
import com.ruoyi.system.service.IPartService;
import com.ruoyi.common.core.text.Convert;

/**
 * 零件Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
@Service
public class PartServiceImpl implements IPartService 
{
    @Autowired
    private PartMapper partMapper;

    /**
     * 查询零件
     * 
     * @param id 零件主键
     * @return 零件
     */
    @Override
    public Part selectPartById(Long id)
    {
        return partMapper.selectPartById(id);
    }

    /**
     * 查询零件列表
     * 
     * @param part 零件
     * @return 零件
     */
    @Override
    public List<Part> selectPartList(Part part)
    {
        return partMapper.selectPartList(part);
    }

    /**
     * 新增零件
     * 
     * @param part 零件
     * @return 结果
     */
    @Override
    public int insertPart(Part part)
    {
        part.setCreateTime(DateUtils.getNowDate());
        return partMapper.insertPart(part);
    }

    /**
     * 修改零件
     * 
     * @param part 零件
     * @return 结果
     */
    @Override
    public int updatePart(Part part)
    {
        part.setUpdateTime(DateUtils.getNowDate());
        return partMapper.updatePart(part);
    }

    /**
     * 批量删除零件
     * 
     * @param ids 需要删除的零件主键
     * @return 结果
     */
    @Override
    public int deletePartByIds(String ids)
    {
        return partMapper.deletePartByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除零件信息
     * 
     * @param id 零件主键
     * @return 结果
     */
    @Override
    public int deletePartById(Long id)
    {
        return partMapper.deletePartById(id);
    }
}
