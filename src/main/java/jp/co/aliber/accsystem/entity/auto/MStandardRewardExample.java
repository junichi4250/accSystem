package jp.co.aliber.accsystem.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class MStandardRewardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public MStandardRewardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andManagementIdIsNull() {
            addCriterion("management_id is null");
            return (Criteria) this;
        }

        public Criteria andManagementIdIsNotNull() {
            addCriterion("management_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagementIdEqualTo(Integer value) {
            addCriterion("management_id =", value, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdNotEqualTo(Integer value) {
            addCriterion("management_id <>", value, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdGreaterThan(Integer value) {
            addCriterion("management_id >", value, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("management_id >=", value, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdLessThan(Integer value) {
            addCriterion("management_id <", value, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdLessThanOrEqualTo(Integer value) {
            addCriterion("management_id <=", value, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdIn(List<Integer> values) {
            addCriterion("management_id in", values, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdNotIn(List<Integer> values) {
            addCriterion("management_id not in", values, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdBetween(Integer value1, Integer value2) {
            addCriterion("management_id between", value1, value2, "managementId");
            return (Criteria) this;
        }

        public Criteria andManagementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("management_id not between", value1, value2, "managementId");
            return (Criteria) this;
        }

        public Criteria andKbnIsNull() {
            addCriterion("kbn is null");
            return (Criteria) this;
        }

        public Criteria andKbnIsNotNull() {
            addCriterion("kbn is not null");
            return (Criteria) this;
        }

        public Criteria andKbnEqualTo(Short value) {
            addCriterion("kbn =", value, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnNotEqualTo(Short value) {
            addCriterion("kbn <>", value, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnGreaterThan(Short value) {
            addCriterion("kbn >", value, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnGreaterThanOrEqualTo(Short value) {
            addCriterion("kbn >=", value, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnLessThan(Short value) {
            addCriterion("kbn <", value, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnLessThanOrEqualTo(Short value) {
            addCriterion("kbn <=", value, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnIn(List<Short> values) {
            addCriterion("kbn in", values, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnNotIn(List<Short> values) {
            addCriterion("kbn not in", values, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnBetween(Short value1, Short value2) {
            addCriterion("kbn between", value1, value2, "kbn");
            return (Criteria) this;
        }

        public Criteria andKbnNotBetween(Short value1, Short value2) {
            addCriterion("kbn not between", value1, value2, "kbn");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Short value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Short value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Short value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Short value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Short value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Short> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Short> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Short value1, Short value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Short value1, Short value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.m_standard_reward
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}