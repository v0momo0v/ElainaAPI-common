package com.example.elainaapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elainaapicommon.model.entity.User;

/**
* @author 86158
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-12-10 18:16:41
*/
public interface InnerUserService {
    /**
     * 查询是否已分配给用户accessKey
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
