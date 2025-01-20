package com.dao;

import com.entity.YimiaochukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaochukuVO;
import com.entity.view.YimiaochukuView;


/**
 * 疫苗出库
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface YimiaochukuDao extends BaseMapper<YimiaochukuEntity> {
	
	List<YimiaochukuVO> selectListVO(@Param("ew") Wrapper<YimiaochukuEntity> wrapper);
	
	YimiaochukuVO selectVO(@Param("ew") Wrapper<YimiaochukuEntity> wrapper);
	
	List<YimiaochukuView> selectListView(@Param("ew") Wrapper<YimiaochukuEntity> wrapper);

	List<YimiaochukuView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaochukuEntity> wrapper);
	
	YimiaochukuView selectView(@Param("ew") Wrapper<YimiaochukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<YimiaochukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YimiaochukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YimiaochukuEntity> wrapper);
}
