package com.zzp.mall.service.impl;

import com.zzp.mall.mapper.UmsAdminMapper;
import com.zzp.mall.model.UmsAdmin;
import com.zzp.mall.model.UmsAdminExample;
import com.zzp.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * UmsAdminService实现类
 */
public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminMapper adminMapper;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }
}
