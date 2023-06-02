package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Part;

/**
 * 零件Mapper接口
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
public interface PartMapper 
{
    /**
     * 查询零件
     * 
     * @param id 零件主键
     * @return 零件
     */
    public Part selectPartById(Long id);

    /**
     * 查询零件列表
     * 
     * @param part 零件
     * @return 零件集合
     */
    public List<Part> selectPartList(Part part);

    /**
     * 新增零件
     * 
     * @param part 零件
     * @return 结果
     */
    public int insertPart(Part part);

    /**
     * 修改零件
     * 
     * @param part 零件
     * @return 结果
     */
    public int updatePart(Part part);

    /**
     * 删除零件
     * 
     * @param id 零件主键
     * @return 结果
     */
    public int deletePartById(Long id);

    /**
     * 批量删除零件
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePartByIds(String[] ids);
}