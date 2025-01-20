package com.entity.view;

import com.entity.YimiaoleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:14
 */
@TableName("yimiaoleixing")
public class YimiaoleixingView  extends YimiaoleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaoleixingView(){
	}
 
 	public YimiaoleixingView(YimiaoleixingEntity yimiaoleixingEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaoleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
