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


import com.dao.YimiaoleixingDao;
import com.entity.YimiaoleixingEntity;
import com.service.YimiaoleixingService;
import com.entity.vo.YimiaoleixingVO;
import com.entity.view.YimiaoleixingView;

@Service("yimiaoleixingService")
public class YimiaoleixingServiceImpl extends ServiceImpl<YimiaoleixingDao, YimiaoleixingEntity> implements YimiaoleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaoleixingEntity> page = this.selectPage(
                new Query<YimiaoleixingEntity>(params).getPage(),
                new EntityWrapper<YimiaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaoleixingEntity> wrapper) {
		  Page<YimiaoleixingView> page =new Query<YimiaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaoleixingVO> selectListVO(Wrapper<YimiaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaoleixingVO selectVO(Wrapper<YimiaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaoleixingView> selectListView(Wrapper<YimiaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaoleixingView selectView(Wrapper<YimiaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
