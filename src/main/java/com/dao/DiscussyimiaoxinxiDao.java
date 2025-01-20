package com.dao;

import com.entity.DiscussyimiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyimiaoxinxiVO;
import com.entity.view.DiscussyimiaoxinxiView;


/**
 * 疫苗信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface DiscussyimiaoxinxiDao extends BaseMapper<DiscussyimiaoxinxiEntity> {
	
	List<DiscussyimiaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyimiaoxinxiEntity> wrapper);
	
	DiscussyimiaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussyimiaoxinxiEntity> wrapper);
	
	List<DiscussyimiaoxinxiView> selectListView(@Param("ew") Wrapper<DiscussyimiaoxinxiEntity> wrapper);

	List<DiscussyimiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyimiaoxinxiEntity> wrapper);
	
	DiscussyimiaoxinxiView selectView(@Param("ew") Wrapper<DiscussyimiaoxinxiEntity> wrapper);
	

}
