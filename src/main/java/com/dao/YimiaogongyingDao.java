package com.dao;

import com.entity.YimiaogongyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaogongyingVO;
import com.entity.view.YimiaogongyingView;


/**
 * 疫苗供应
 * 
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface YimiaogongyingDao extends BaseMapper<YimiaogongyingEntity> {
	
	List<YimiaogongyingVO> selectListVO(@Param("ew") Wrapper<YimiaogongyingEntity> wrapper);
	
	YimiaogongyingVO selectVO(@Param("ew") Wrapper<YimiaogongyingEntity> wrapper);
	
	List<YimiaogongyingView> selectListView(@Param("ew") Wrapper<YimiaogongyingEntity> wrapper);

	List<YimiaogongyingView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaogongyingEntity> wrapper);
	
	YimiaogongyingView selectView(@Param("ew") Wrapper<YimiaogongyingEntity> wrapper);
	

}
