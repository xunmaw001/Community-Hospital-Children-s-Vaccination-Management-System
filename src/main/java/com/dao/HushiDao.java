package com.dao;

import com.entity.HushiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HushiVO;
import com.entity.view.HushiView;


/**
 * 护士
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:34:14
 */
public interface HushiDao extends BaseMapper<HushiEntity> {
	
	List<HushiVO> selectListVO(@Param("ew") Wrapper<HushiEntity> wrapper);
	
	HushiVO selectVO(@Param("ew") Wrapper<HushiEntity> wrapper);
	
	List<HushiView> selectListView(@Param("ew") Wrapper<HushiEntity> wrapper);

	List<HushiView> selectListView(Pagination page,@Param("ew") Wrapper<HushiEntity> wrapper);
	
	HushiView selectView(@Param("ew") Wrapper<HushiEntity> wrapper);
	

}
