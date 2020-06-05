package com.okay.family.service;

import com.okay.family.common.bean.testuser.TestUserBean;
import com.okay.family.fun.base.interfaces.ReturnCode;

import java.util.List;

public interface ITestUserService {

    List<TestUserBean> findUsers(int owner);

    int add(TestUserBean user);

    TestUserBean findUser(int id);

    int updateUser(TestUserBean bean);

    /**
     * 验证测试用户是否可用
     *
     * @param bean
     * @return
     */
    ReturnCode checkUser(TestUserBean bean);

    /**
     * 获取用户凭据
     *
     * @param id
     * @return
     */
    public String getCertificate(int id);


}