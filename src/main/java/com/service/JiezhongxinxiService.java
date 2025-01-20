package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiezhongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiezhongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhongxinxiView;


/**
 * 接种信息
 *
 * @author 
 * @email 
 * @date 2022-04-25 18:34:14
 */
public interface JiezhongxinxiService extends IService<JiezhongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiezhongxinxiVO> selectListVO(Wrapper<JiezhongxinxiEntity> wrapper);
   	
   	JiezhongxinxiVO selectVO(@Param("ew") Wrapper<JiezhongxinxiEntity> wrapper);
   	
   	List<JiezhongxinxiView> selectListView(Wrapper<JiezhongxinxiEntity> wrapper);
   	
   	JiezhongxinxiView selectView(@Param("ew") Wrapper<JiezhongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiezhongxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiezhongxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiezhongxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiezhongxinxiEntity> wrapper);
}

