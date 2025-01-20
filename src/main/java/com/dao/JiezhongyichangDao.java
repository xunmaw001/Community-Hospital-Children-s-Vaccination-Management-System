package com.dao;

import com.entity.JiezhongyichangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhongyichangVO;
import com.entity.view.JiezhongyichangView;


/**
 * 接种异常
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface JiezhongyichangDao extends BaseMapper<JiezhongyichangEntity> {
	
	List<JiezhongyichangVO> selectListVO(@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);
	
	JiezhongyichangVO selectVO(@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);
	
	List<JiezhongyichangView> selectListView(@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);

	List<JiezhongyichangView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);
	
	JiezhongyichangView selectView(@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);
}
