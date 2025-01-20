package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaoleixingView;


/**
 * 疫苗类型
 *
 * @author 
 * @email 
 * @date 2022-04-25 18:34:14
 */
public interface YimiaoleixingService extends IService<YimiaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaoleixingVO> selectListVO(Wrapper<YimiaoleixingEntity> wrapper);
   	
   	YimiaoleixingVO selectVO(@Param("ew") Wrapper<YimiaoleixingEntity> wrapper);
   	
   	List<YimiaoleixingView> selectListView(Wrapper<YimiaoleixingEntity> wrapper);
   	
   	YimiaoleixingView selectView(@Param("ew") Wrapper<YimiaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaoleixingEntity> wrapper);
   	

}

