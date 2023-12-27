package com.example.elainaapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elainaapicommon.model.entity.UserInterfaceInfo;

/**
* @author 86158
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-12-15 00:10:47
*/
public interface InnerUserInterfaceInfoService {
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId,long userId);
}
