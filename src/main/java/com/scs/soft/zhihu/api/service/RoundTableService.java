package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;


/**
 * @author ASUS
 */
public interface RoundTableService {
    /**
     * 查询最新圆桌
     * @return
     */
    List<RoundTable> selectRecentRoundTable();

    /**
     * 查询所有圆桌
     * @return
     */
    List<Map> selectAllRoundTable();
}