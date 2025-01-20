package com.dao;

import com.entity.TixingjiezhongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TixingjiezhongVO;
import com.entity.view.TixingjiezhongView;


/**
 * 提醒接种
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface TixingjiezhongDao extends BaseMapper<TixingjiezhongEntity> {
	
	List<TixingjiezhongVO> selectListVO(@Param("ew") Wrapper<TixingjiezhongEntity> wrapper);
	
	TixingjiezhongVO selectVO(@Param("ew") Wrapper<TixingjiezhongEntity> wrapper);
	
	List<TixingjiezhongView> selectListView(@Param("ew") Wrapper<TixingjiezhongEntity> wrapper);

	List<TixingjiezhongView> selectListView(Pagination page,@Param("ew") Wrapper<TixingjiezhongEntity> wrapper);
	
	TixingjiezhongView selectView(@Param("ew") Wrapper<TixingjiezhongEntity> wrapper);
	

}
