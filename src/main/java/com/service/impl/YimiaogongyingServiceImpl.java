package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YimiaogongyingDao;
import com.entity.YimiaogongyingEntity;
import com.service.YimiaogongyingService;
import com.entity.vo.YimiaogongyingVO;
import com.entity.view.YimiaogongyingView;

@Service("yimiaogongyingService")
public class YimiaogongyingServiceImpl extends ServiceImpl<YimiaogongyingDao, YimiaogongyingEntity> implements YimiaogongyingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaogongyingEntity> page = this.selectPage(
                new Query<YimiaogongyingEntity>(params).getPage(),
                new EntityWrapper<YimiaogongyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaogongyingEntity> wrapper) {
		  Page<YimiaogongyingView> page =new Query<YimiaogongyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaogongyingVO> selectListVO(Wrapper<YimiaogongyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaogongyingVO selectVO(Wrapper<YimiaogongyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaogongyingView> selectListView(Wrapper<YimiaogongyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaogongyingView selectView(Wrapper<YimiaogongyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
