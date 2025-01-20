package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaogongyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaogongyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaogongyingView;


/**
 * 疫苗供应
 *
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface YimiaogongyingService extends IService<YimiaogongyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaogongyingVO> selectListVO(Wrapper<YimiaogongyingEntity> wrapper);
   	
   	YimiaogongyingVO selectVO(@Param("ew") Wrapper<YimiaogongyingEntity> wrapper);
   	
   	List<YimiaogongyingView> selectListView(Wrapper<YimiaogongyingEntity> wrapper);
   	
   	YimiaogongyingView selectView(@Param("ew") Wrapper<YimiaogongyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaogongyingEntity> wrapper);
   	

}

