package com.example.elainaapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.elainaapicommon.model.entity.InterfaceInfo;

/**
* @author 86158
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-12-10 23:02:24
*/
public interface InnerInterfaceInfoService {
    /**
     * 查询接口是否存在
     * @param id
     * @return
     */
    InterfaceInfo getInterfaceInfo(Long id);
}
