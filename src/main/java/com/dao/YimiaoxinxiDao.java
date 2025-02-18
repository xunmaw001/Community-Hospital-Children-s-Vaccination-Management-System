package com.dao;

import com.entity.YimiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaoxinxiVO;
import com.entity.view.YimiaoxinxiView;


/**
 * 疫苗信息
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:34:14
 */
public interface YimiaoxinxiDao extends BaseMapper<YimiaoxinxiEntity> {
	
	List<YimiaoxinxiVO> selectListVO(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
	
	YimiaoxinxiVO selectVO(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
	
	List<YimiaoxinxiView> selectListView(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);

	List<YimiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
	
	YimiaoxinxiView selectView(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
}
