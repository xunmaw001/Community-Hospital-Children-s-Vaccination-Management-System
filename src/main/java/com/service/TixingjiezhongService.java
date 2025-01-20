package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TixingjiezhongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TixingjiezhongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TixingjiezhongView;


/**
 * 提醒接种
 *
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface TixingjiezhongService extends IService<TixingjiezhongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TixingjiezhongVO> selectListVO(Wrapper<TixingjiezhongEntity> wrapper);
   	
   	TixingjiezhongVO selectVO(@Param("ew") Wrapper<TixingjiezhongEntity> wrapper);
   	
   	List<TixingjiezhongView> selectListView(Wrapper<TixingjiezhongEntity> wrapper);
   	
   	TixingjiezhongView selectView(@Param("ew") Wrapper<TixingjiezhongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TixingjiezhongEntity> wrapper);
   	

}

