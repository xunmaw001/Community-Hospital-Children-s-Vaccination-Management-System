package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaochukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaochukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaochukuView;


/**
 * 疫苗出库
 *
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface YimiaochukuService extends IService<YimiaochukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaochukuVO> selectListVO(Wrapper<YimiaochukuEntity> wrapper);
   	
   	YimiaochukuVO selectVO(@Param("ew") Wrapper<YimiaochukuEntity> wrapper);
   	
   	List<YimiaochukuView> selectListView(Wrapper<YimiaochukuEntity> wrapper);
   	
   	YimiaochukuView selectView(@Param("ew") Wrapper<YimiaochukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaochukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YimiaochukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YimiaochukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YimiaochukuEntity> wrapper);
}

