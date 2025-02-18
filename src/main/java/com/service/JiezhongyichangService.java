package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiezhongyichangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiezhongyichangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhongyichangView;


/**
 * 接种异常
 *
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public interface JiezhongyichangService extends IService<JiezhongyichangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiezhongyichangVO> selectListVO(Wrapper<JiezhongyichangEntity> wrapper);
   	
   	JiezhongyichangVO selectVO(@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);
   	
   	List<JiezhongyichangView> selectListView(Wrapper<JiezhongyichangEntity> wrapper);
   	
   	JiezhongyichangView selectView(@Param("ew") Wrapper<JiezhongyichangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiezhongyichangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiezhongyichangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiezhongyichangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiezhongyichangEntity> wrapper);
}

