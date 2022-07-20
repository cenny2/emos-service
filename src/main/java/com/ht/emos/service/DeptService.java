package com.ht.emos.service;/**
 * @Description TODO
 * @Author Wuc
 * @Date 2022/7/20 22:12
 */

import com.ht.emos.proj.TbDept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName DeptService
 *@Description TODO:
 *@Author Wuc
 *@Date 2022/7/20 22:12
 */
public interface DeptService {
    List<TbDept> queryAllDept();
}
