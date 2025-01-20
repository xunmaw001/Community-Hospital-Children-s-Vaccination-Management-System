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


import com.dao.TixingjiezhongDao;
import com.entity.TixingjiezhongEntity;
import com.service.TixingjiezhongService;
import com.entity.vo.TixingjiezhongVO;
import com.entity.view.TixingjiezhongView;

@Service("tixingjiezhongService")
public class TixingjiezhongServiceImpl extends ServiceImpl<TixingjiezhongDao, TixingjiezhongEntity> implements TixingjiezhongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TixingjiezhongEntity> page = this.selectPage(
                new Query<TixingjiezhongEntity>(params).getPage(),
                new EntityWrapper<TixingjiezhongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TixingjiezhongEntity> wrapper) {
		  Page<TixingjiezhongView> page =new Query<TixingjiezhongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TixingjiezhongVO> selectListVO(Wrapper<TixingjiezhongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TixingjiezhongVO selectVO(Wrapper<TixingjiezhongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TixingjiezhongView> selectListView(Wrapper<TixingjiezhongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TixingjiezhongView selectView(Wrapper<TixingjiezhongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
