package com.entity.view;

import com.entity.YimiaogongyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗供应
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
@TableName("yimiaogongying")
public class YimiaogongyingView  extends YimiaogongyingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaogongyingView(){
	}
 
 	public YimiaogongyingView(YimiaogongyingEntity yimiaogongyingEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaogongyingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
