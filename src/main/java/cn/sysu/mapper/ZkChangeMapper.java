package cn.sysu.mapper;

import cn.sysu.pojo.ZkChange;
import cn.sysu.pojo.ZkChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZkChangeMapper {
    int countByExample(ZkChangeExample example);

    int deleteByExample(ZkChangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZkChange record);

    int insertSelective(ZkChange record);

    List<ZkChange> selectByExample(ZkChangeExample example);

    ZkChange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZkChange record, @Param("example") ZkChangeExample example);

    int updateByExample(@Param("record") ZkChange record, @Param("example") ZkChangeExample example);

    int updateByPrimaryKeySelective(ZkChange record);

    int updateByPrimaryKey(ZkChange record);
}