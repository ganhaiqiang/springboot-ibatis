package com.example.demo.dao;

import com.example.demo.model.Emp;
import com.example.demo.model.EmpExample;
import java.util.List;

public interface EmpDao {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    void insert(Emp record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    int updateByPrimaryKey(Emp record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    List selectByExample(EmpExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    Emp selectByPrimaryKey(Short empno);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    int deleteByPrimaryKey(Short empno);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    int countByExample(EmpExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    int updateByExampleSelective(Emp record, EmpExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Tue Aug 17 17:07:40 CST 2021
     */
    int updateByExample(Emp record, EmpExample example);
}