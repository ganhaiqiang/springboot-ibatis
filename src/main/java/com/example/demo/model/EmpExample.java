package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    public EmpExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    protected EmpExample(EmpExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table EMP
     *
     * @abatorgenerated Fri Aug 13 10:24:05 CST 2021
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andEmpnoIsNull() {
            addCriterion("EMPNO is null");
            return this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("EMPNO is not null");
            return this;
        }

        public Criteria andEmpnoEqualTo(Short value) {
            addCriterion("EMPNO =", value, "empno");
            return this;
        }

        public Criteria andEmpnoNotEqualTo(Short value) {
            addCriterion("EMPNO <>", value, "empno");
            return this;
        }

        public Criteria andEmpnoGreaterThan(Short value) {
            addCriterion("EMPNO >", value, "empno");
            return this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(Short value) {
            addCriterion("EMPNO >=", value, "empno");
            return this;
        }

        public Criteria andEmpnoLessThan(Short value) {
            addCriterion("EMPNO <", value, "empno");
            return this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(Short value) {
            addCriterion("EMPNO <=", value, "empno");
            return this;
        }

        public Criteria andEmpnoIn(List values) {
            addCriterion("EMPNO in", values, "empno");
            return this;
        }

        public Criteria andEmpnoNotIn(List values) {
            addCriterion("EMPNO not in", values, "empno");
            return this;
        }

        public Criteria andEmpnoBetween(Short value1, Short value2) {
            addCriterion("EMPNO between", value1, value2, "empno");
            return this;
        }

        public Criteria andEmpnoNotBetween(Short value1, Short value2) {
            addCriterion("EMPNO not between", value1, value2, "empno");
            return this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ENAME is null");
            return this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ENAME is not null");
            return this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ENAME =", value, "ename");
            return this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ENAME <>", value, "ename");
            return this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ENAME >", value, "ename");
            return this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENAME >=", value, "ename");
            return this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ENAME <", value, "ename");
            return this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ENAME <=", value, "ename");
            return this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ENAME like", value, "ename");
            return this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ENAME not like", value, "ename");
            return this;
        }

        public Criteria andEnameIn(List values) {
            addCriterion("ENAME in", values, "ename");
            return this;
        }

        public Criteria andEnameNotIn(List values) {
            addCriterion("ENAME not in", values, "ename");
            return this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ENAME between", value1, value2, "ename");
            return this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ENAME not between", value1, value2, "ename");
            return this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return this;
        }

        public Criteria andJobIn(List values) {
            addCriterion("JOB in", values, "job");
            return this;
        }

        public Criteria andJobNotIn(List values) {
            addCriterion("JOB not in", values, "job");
            return this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return this;
        }

        public Criteria andMgrIsNull() {
            addCriterion("MGR is null");
            return this;
        }

        public Criteria andMgrIsNotNull() {
            addCriterion("MGR is not null");
            return this;
        }

        public Criteria andMgrEqualTo(Short value) {
            addCriterion("MGR =", value, "mgr");
            return this;
        }

        public Criteria andMgrNotEqualTo(Short value) {
            addCriterion("MGR <>", value, "mgr");
            return this;
        }

        public Criteria andMgrGreaterThan(Short value) {
            addCriterion("MGR >", value, "mgr");
            return this;
        }

        public Criteria andMgrGreaterThanOrEqualTo(Short value) {
            addCriterion("MGR >=", value, "mgr");
            return this;
        }

        public Criteria andMgrLessThan(Short value) {
            addCriterion("MGR <", value, "mgr");
            return this;
        }

        public Criteria andMgrLessThanOrEqualTo(Short value) {
            addCriterion("MGR <=", value, "mgr");
            return this;
        }

        public Criteria andMgrIn(List values) {
            addCriterion("MGR in", values, "mgr");
            return this;
        }

        public Criteria andMgrNotIn(List values) {
            addCriterion("MGR not in", values, "mgr");
            return this;
        }

        public Criteria andMgrBetween(Short value1, Short value2) {
            addCriterion("MGR between", value1, value2, "mgr");
            return this;
        }

        public Criteria andMgrNotBetween(Short value1, Short value2) {
            addCriterion("MGR not between", value1, value2, "mgr");
            return this;
        }

        public Criteria andHiredateIsNull() {
            addCriterion("HIREDATE is null");
            return this;
        }

        public Criteria andHiredateIsNotNull() {
            addCriterion("HIREDATE is not null");
            return this;
        }

        public Criteria andHiredateEqualTo(Date value) {
            addCriterion("HIREDATE =", value, "hiredate");
            return this;
        }

        public Criteria andHiredateNotEqualTo(Date value) {
            addCriterion("HIREDATE <>", value, "hiredate");
            return this;
        }

        public Criteria andHiredateGreaterThan(Date value) {
            addCriterion("HIREDATE >", value, "hiredate");
            return this;
        }

        public Criteria andHiredateGreaterThanOrEqualTo(Date value) {
            addCriterion("HIREDATE >=", value, "hiredate");
            return this;
        }

        public Criteria andHiredateLessThan(Date value) {
            addCriterion("HIREDATE <", value, "hiredate");
            return this;
        }

        public Criteria andHiredateLessThanOrEqualTo(Date value) {
            addCriterion("HIREDATE <=", value, "hiredate");
            return this;
        }

        public Criteria andHiredateIn(List values) {
            addCriterion("HIREDATE in", values, "hiredate");
            return this;
        }

        public Criteria andHiredateNotIn(List values) {
            addCriterion("HIREDATE not in", values, "hiredate");
            return this;
        }

        public Criteria andHiredateBetween(Date value1, Date value2) {
            addCriterion("HIREDATE between", value1, value2, "hiredate");
            return this;
        }

        public Criteria andHiredateNotBetween(Date value1, Date value2) {
            addCriterion("HIREDATE not between", value1, value2, "hiredate");
            return this;
        }

        public Criteria andSalIsNull() {
            addCriterion("SAL is null");
            return this;
        }

        public Criteria andSalIsNotNull() {
            addCriterion("SAL is not null");
            return this;
        }

        public Criteria andSalEqualTo(BigDecimal value) {
            addCriterion("SAL =", value, "sal");
            return this;
        }

        public Criteria andSalNotEqualTo(BigDecimal value) {
            addCriterion("SAL <>", value, "sal");
            return this;
        }

        public Criteria andSalGreaterThan(BigDecimal value) {
            addCriterion("SAL >", value, "sal");
            return this;
        }

        public Criteria andSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAL >=", value, "sal");
            return this;
        }

        public Criteria andSalLessThan(BigDecimal value) {
            addCriterion("SAL <", value, "sal");
            return this;
        }

        public Criteria andSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAL <=", value, "sal");
            return this;
        }

        public Criteria andSalIn(List values) {
            addCriterion("SAL in", values, "sal");
            return this;
        }

        public Criteria andSalNotIn(List values) {
            addCriterion("SAL not in", values, "sal");
            return this;
        }

        public Criteria andSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAL between", value1, value2, "sal");
            return this;
        }

        public Criteria andSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAL not between", value1, value2, "sal");
            return this;
        }

        public Criteria andCommIsNull() {
            addCriterion("COMM is null");
            return this;
        }

        public Criteria andCommIsNotNull() {
            addCriterion("COMM is not null");
            return this;
        }

        public Criteria andCommEqualTo(BigDecimal value) {
            addCriterion("COMM =", value, "comm");
            return this;
        }

        public Criteria andCommNotEqualTo(BigDecimal value) {
            addCriterion("COMM <>", value, "comm");
            return this;
        }

        public Criteria andCommGreaterThan(BigDecimal value) {
            addCriterion("COMM >", value, "comm");
            return this;
        }

        public Criteria andCommGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMM >=", value, "comm");
            return this;
        }

        public Criteria andCommLessThan(BigDecimal value) {
            addCriterion("COMM <", value, "comm");
            return this;
        }

        public Criteria andCommLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMM <=", value, "comm");
            return this;
        }

        public Criteria andCommIn(List values) {
            addCriterion("COMM in", values, "comm");
            return this;
        }

        public Criteria andCommNotIn(List values) {
            addCriterion("COMM not in", values, "comm");
            return this;
        }

        public Criteria andCommBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMM between", value1, value2, "comm");
            return this;
        }

        public Criteria andCommNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMM not between", value1, value2, "comm");
            return this;
        }

        public Criteria andDeptnoIsNull() {
            addCriterion("DEPTNO is null");
            return this;
        }

        public Criteria andDeptnoIsNotNull() {
            addCriterion("DEPTNO is not null");
            return this;
        }

        public Criteria andDeptnoEqualTo(Short value) {
            addCriterion("DEPTNO =", value, "deptno");
            return this;
        }

        public Criteria andDeptnoNotEqualTo(Short value) {
            addCriterion("DEPTNO <>", value, "deptno");
            return this;
        }

        public Criteria andDeptnoGreaterThan(Short value) {
            addCriterion("DEPTNO >", value, "deptno");
            return this;
        }

        public Criteria andDeptnoGreaterThanOrEqualTo(Short value) {
            addCriterion("DEPTNO >=", value, "deptno");
            return this;
        }

        public Criteria andDeptnoLessThan(Short value) {
            addCriterion("DEPTNO <", value, "deptno");
            return this;
        }

        public Criteria andDeptnoLessThanOrEqualTo(Short value) {
            addCriterion("DEPTNO <=", value, "deptno");
            return this;
        }

        public Criteria andDeptnoIn(List values) {
            addCriterion("DEPTNO in", values, "deptno");
            return this;
        }

        public Criteria andDeptnoNotIn(List values) {
            addCriterion("DEPTNO not in", values, "deptno");
            return this;
        }

        public Criteria andDeptnoBetween(Short value1, Short value2) {
            addCriterion("DEPTNO between", value1, value2, "deptno");
            return this;
        }

        public Criteria andDeptnoNotBetween(Short value1, Short value2) {
            addCriterion("DEPTNO not between", value1, value2, "deptno");
            return this;
        }
    }
}