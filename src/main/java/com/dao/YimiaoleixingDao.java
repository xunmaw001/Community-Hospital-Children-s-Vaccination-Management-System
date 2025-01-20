package com.dao;

import com.entity.YimiaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaoleixingVO;
import com.entity.view.YimiaoleixingView;


/**
 * 疫苗类型
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:34:14
 */
public interface YimiaoleixingDao extends BaseMapper<YimiaoleixingEntity> {
	
	List<YimiaoleixingVO> selectListVO(@Param("ew") Wrapper<YimiaoleixingEntity> wrapper);
	
	YimiaoleixingVO selectVO(@Param("ew") Wrapper<YimiaoleixingEntity> wrapper);
	
	List<YimiaoleixingView> selectListView(@Param("ew") Wrapper<YimiaoleixingEntity> wrapper);

	List<YimiaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaoleixingEntity> wrapper);
	
	YimiaoleixingView selectView(@Param("ew") Wrapper<YimiaoleixingEntity> wrapper);
	

}
