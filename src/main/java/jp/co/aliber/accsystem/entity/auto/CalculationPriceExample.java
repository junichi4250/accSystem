package jp.co.aliber.accsystem.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class CalculationPriceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    public CalculationPriceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
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
     * This method corresponds to the database table public.calculation_price
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
     * This method corresponds to the database table public.calculation_price
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.calculation_price
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
     * This class corresponds to the database table public.calculation_price
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

        public Criteria andCalculationPriceIdIsNull() {
            addCriterion("calculation_price_id is null");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdIsNotNull() {
            addCriterion("calculation_price_id is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdEqualTo(Long value) {
            addCriterion("calculation_price_id =", value, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdNotEqualTo(Long value) {
            addCriterion("calculation_price_id <>", value, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdGreaterThan(Long value) {
            addCriterion("calculation_price_id >", value, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("calculation_price_id >=", value, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdLessThan(Long value) {
            addCriterion("calculation_price_id <", value, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdLessThanOrEqualTo(Long value) {
            addCriterion("calculation_price_id <=", value, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdIn(List<Long> values) {
            addCriterion("calculation_price_id in", values, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdNotIn(List<Long> values) {
            addCriterion("calculation_price_id not in", values, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdBetween(Long value1, Long value2) {
            addCriterion("calculation_price_id between", value1, value2, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIdNotBetween(Long value1, Long value2) {
            addCriterion("calculation_price_id not between", value1, value2, "calculationPriceId");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIsNull() {
            addCriterion("calculation_price is null");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIsNotNull() {
            addCriterion("calculation_price is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceEqualTo(Integer value) {
            addCriterion("calculation_price =", value, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceNotEqualTo(Integer value) {
            addCriterion("calculation_price <>", value, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceGreaterThan(Integer value) {
            addCriterion("calculation_price >", value, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("calculation_price >=", value, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceLessThan(Integer value) {
            addCriterion("calculation_price <", value, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceLessThanOrEqualTo(Integer value) {
            addCriterion("calculation_price <=", value, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceIn(List<Integer> values) {
            addCriterion("calculation_price in", values, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceNotIn(List<Integer> values) {
            addCriterion("calculation_price not in", values, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceBetween(Integer value1, Integer value2) {
            addCriterion("calculation_price between", value1, value2, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andCalculationPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("calculation_price not between", value1, value2, "calculationPrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceIsNull() {
            addCriterion("hourly_wage_price is null");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceIsNotNull() {
            addCriterion("hourly_wage_price is not null");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceEqualTo(Integer value) {
            addCriterion("hourly_wage_price =", value, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceNotEqualTo(Integer value) {
            addCriterion("hourly_wage_price <>", value, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceGreaterThan(Integer value) {
            addCriterion("hourly_wage_price >", value, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hourly_wage_price >=", value, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceLessThan(Integer value) {
            addCriterion("hourly_wage_price <", value, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceLessThanOrEqualTo(Integer value) {
            addCriterion("hourly_wage_price <=", value, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceIn(List<Integer> values) {
            addCriterion("hourly_wage_price in", values, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceNotIn(List<Integer> values) {
            addCriterion("hourly_wage_price not in", values, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceBetween(Integer value1, Integer value2) {
            addCriterion("hourly_wage_price between", value1, value2, "hourlyWagePrice");
            return (Criteria) this;
        }

        public Criteria andHourlyWagePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("hourly_wage_price not between", value1, value2, "hourlyWagePrice");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.calculation_price
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
     * This class corresponds to the database table public.calculation_price
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