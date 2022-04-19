package com.df.report.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DfcvtrialExample {
        protected String orderByClause;

        protected boolean distinct;

        protected List<Criteria> oredCriteria;

        public DfcvtrialExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

        public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

        public String getOrderByClause() {
        return orderByClause;
    }

        public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

        public boolean isDistinct() {
        return distinct;
    }

        public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

        public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

        public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

        public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

        protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

        public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateStampIsNull() {
            addCriterion("create_stamp is null");
            return (Criteria) this;
        }

        public Criteria andCreateStampIsNotNull() {
            addCriterion("create_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStampEqualTo(Date value) {
            addCriterion("create_stamp =", value, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampNotEqualTo(Date value) {
            addCriterion("create_stamp <>", value, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampGreaterThan(Date value) {
            addCriterion("create_stamp >", value, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampGreaterThanOrEqualTo(Date value) {
            addCriterion("create_stamp >=", value, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampLessThan(Date value) {
            addCriterion("create_stamp <", value, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampLessThanOrEqualTo(Date value) {
            addCriterion("create_stamp <=", value, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampIn(List<Date> values) {
            addCriterion("create_stamp in", values, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampNotIn(List<Date> values) {
            addCriterion("create_stamp not in", values, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampBetween(Date value1, Date value2) {
            addCriterion("create_stamp between", value1, value2, "createStamp");
            return (Criteria) this;
        }

        public Criteria andCreateStampNotBetween(Date value1, Date value2) {
            addCriterion("create_stamp not between", value1, value2, "createStamp");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedIsNull() {
            addCriterion("is_persisted is null");
            return (Criteria) this;
        }

        public Criteria andIsPersistedIsNotNull() {
            addCriterion("is_persisted is not null");
            return (Criteria) this;
        }

        public Criteria andIsPersistedEqualTo(Boolean value) {
            addCriterion("is_persisted =", value, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedNotEqualTo(Boolean value) {
            addCriterion("is_persisted <>", value, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedGreaterThan(Boolean value) {
            addCriterion("is_persisted >", value, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_persisted >=", value, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedLessThan(Boolean value) {
            addCriterion("is_persisted <", value, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_persisted <=", value, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedIn(List<Boolean> values) {
            addCriterion("is_persisted in", values, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedNotIn(List<Boolean> values) {
            addCriterion("is_persisted not in", values, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_persisted between", value1, value2, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andIsPersistedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_persisted not between", value1, value2, "isPersisted");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteIsNull() {
            addCriterion("mark_for_delete is null");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteIsNotNull() {
            addCriterion("mark_for_delete is not null");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteEqualTo(Long value) {
            addCriterion("mark_for_delete =", value, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteNotEqualTo(Long value) {
            addCriterion("mark_for_delete <>", value, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteGreaterThan(Long value) {
            addCriterion("mark_for_delete >", value, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("mark_for_delete >=", value, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteLessThan(Long value) {
            addCriterion("mark_for_delete <", value, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteLessThanOrEqualTo(Long value) {
            addCriterion("mark_for_delete <=", value, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteIn(List<Long> values) {
            addCriterion("mark_for_delete in", values, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteNotIn(List<Long> values) {
            addCriterion("mark_for_delete not in", values, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteBetween(Long value1, Long value2) {
            addCriterion("mark_for_delete between", value1, value2, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andMarkForDeleteNotBetween(Long value1, Long value2) {
            addCriterion("mark_for_delete not between", value1, value2, "markForDelete");
            return (Criteria) this;
        }

        public Criteria andModifyStampIsNull() {
            addCriterion("modify_stamp is null");
            return (Criteria) this;
        }

        public Criteria andModifyStampIsNotNull() {
            addCriterion("modify_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andModifyStampEqualTo(Date value) {
            addCriterion("modify_stamp =", value, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampNotEqualTo(Date value) {
            addCriterion("modify_stamp <>", value, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampGreaterThan(Date value) {
            addCriterion("modify_stamp >", value, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_stamp >=", value, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampLessThan(Date value) {
            addCriterion("modify_stamp <", value, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampLessThanOrEqualTo(Date value) {
            addCriterion("modify_stamp <=", value, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampIn(List<Date> values) {
            addCriterion("modify_stamp in", values, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampNotIn(List<Date> values) {
            addCriterion("modify_stamp not in", values, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampBetween(Date value1, Date value2) {
            addCriterion("modify_stamp between", value1, value2, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andModifyStampNotBetween(Date value1, Date value2) {
            addCriterion("modify_stamp not between", value1, value2, "modifyStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNull() {
            addCriterion("update_count is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNotNull() {
            addCriterion("update_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountEqualTo(Integer value) {
            addCriterion("update_count =", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotEqualTo(Integer value) {
            addCriterion("update_count <>", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThan(Integer value) {
            addCriterion("update_count >", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_count >=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThan(Integer value) {
            addCriterion("update_count <", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThanOrEqualTo(Integer value) {
            addCriterion("update_count <=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIn(List<Integer> values) {
            addCriterion("update_count in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotIn(List<Integer> values) {
            addCriterion("update_count not in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountBetween(Integer value1, Integer value2) {
            addCriterion("update_count between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotBetween(Integer value1, Integer value2) {
            addCriterion("update_count not between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateStampIsNull() {
            addCriterion("update_stamp is null");
            return (Criteria) this;
        }

        public Criteria andUpdateStampIsNotNull() {
            addCriterion("update_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateStampEqualTo(Date value) {
            addCriterion("update_stamp =", value, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampNotEqualTo(Date value) {
            addCriterion("update_stamp <>", value, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampGreaterThan(Date value) {
            addCriterion("update_stamp >", value, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampGreaterThanOrEqualTo(Date value) {
            addCriterion("update_stamp >=", value, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampLessThan(Date value) {
            addCriterion("update_stamp <", value, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampLessThanOrEqualTo(Date value) {
            addCriterion("update_stamp <=", value, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampIn(List<Date> values) {
            addCriterion("update_stamp in", values, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampNotIn(List<Date> values) {
            addCriterion("update_stamp not in", values, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampBetween(Date value1, Date value2) {
            addCriterion("update_stamp between", value1, value2, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateStampNotBetween(Date value1, Date value2) {
            addCriterion("update_stamp not between", value1, value2, "updateStamp");
            return (Criteria) this;
        }

        public Criteria andVerifiedIsNull() {
            addCriterion("verified is null");
            return (Criteria) this;
        }

        public Criteria andVerifiedIsNotNull() {
            addCriterion("verified is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiedEqualTo(Boolean value) {
            addCriterion("verified =", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedNotEqualTo(Boolean value) {
            addCriterion("verified <>", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedGreaterThan(Boolean value) {
            addCriterion("verified >", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("verified >=", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedLessThan(Boolean value) {
            addCriterion("verified <", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("verified <=", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedIn(List<Boolean> values) {
            addCriterion("verified in", values, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedNotIn(List<Boolean> values) {
            addCriterion("verified not in", values, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("verified between", value1, value2, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("verified not between", value1, value2, "verified");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassIsNull() {
            addCriterion("creator_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassIsNotNull() {
            addCriterion("creator_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassEqualTo(String value) {
            addCriterion("creator_ref_class =", value, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassNotEqualTo(String value) {
            addCriterion("creator_ref_class <>", value, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassGreaterThan(String value) {
            addCriterion("creator_ref_class >", value, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("creator_ref_class >=", value, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassLessThan(String value) {
            addCriterion("creator_ref_class <", value, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassLessThanOrEqualTo(String value) {
            addCriterion("creator_ref_class <=", value, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassLike(String value) {
            addCriterion("creator_ref_class like", value, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassNotLike(String value) {
            addCriterion("creator_ref_class not like", value, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassIn(List<String> values) {
            addCriterion("creator_ref_class in", values, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassNotIn(List<String> values) {
            addCriterion("creator_ref_class not in", values, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassBetween(String value1, String value2) {
            addCriterion("creator_ref_class between", value1, value2, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefClassNotBetween(String value1, String value2) {
            addCriterion("creator_ref_class not between", value1, value2, "creatorRefClass");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdIsNull() {
            addCriterion("creator_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdIsNotNull() {
            addCriterion("creator_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdEqualTo(Long value) {
            addCriterion("creator_ref_id =", value, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdNotEqualTo(Long value) {
            addCriterion("creator_ref_id <>", value, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdGreaterThan(Long value) {
            addCriterion("creator_ref_id >", value, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_ref_id >=", value, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdLessThan(Long value) {
            addCriterion("creator_ref_id <", value, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_ref_id <=", value, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdIn(List<Long> values) {
            addCriterion("creator_ref_id in", values, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdNotIn(List<Long> values) {
            addCriterion("creator_ref_id not in", values, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdBetween(Long value1, Long value2) {
            addCriterion("creator_ref_id between", value1, value2, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andCreatorRefIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_ref_id not between", value1, value2, "creatorRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassIsNull() {
            addCriterion("modifier_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassIsNotNull() {
            addCriterion("modifier_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassEqualTo(String value) {
            addCriterion("modifier_ref_class =", value, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassNotEqualTo(String value) {
            addCriterion("modifier_ref_class <>", value, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassGreaterThan(String value) {
            addCriterion("modifier_ref_class >", value, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("modifier_ref_class >=", value, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassLessThan(String value) {
            addCriterion("modifier_ref_class <", value, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassLessThanOrEqualTo(String value) {
            addCriterion("modifier_ref_class <=", value, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassLike(String value) {
            addCriterion("modifier_ref_class like", value, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassNotLike(String value) {
            addCriterion("modifier_ref_class not like", value, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassIn(List<String> values) {
            addCriterion("modifier_ref_class in", values, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassNotIn(List<String> values) {
            addCriterion("modifier_ref_class not in", values, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassBetween(String value1, String value2) {
            addCriterion("modifier_ref_class between", value1, value2, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefClassNotBetween(String value1, String value2) {
            addCriterion("modifier_ref_class not between", value1, value2, "modifierRefClass");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdIsNull() {
            addCriterion("modifier_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdIsNotNull() {
            addCriterion("modifier_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdEqualTo(Long value) {
            addCriterion("modifier_ref_id =", value, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdNotEqualTo(Long value) {
            addCriterion("modifier_ref_id <>", value, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdGreaterThan(Long value) {
            addCriterion("modifier_ref_id >", value, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("modifier_ref_id >=", value, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdLessThan(Long value) {
            addCriterion("modifier_ref_id <", value, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdLessThanOrEqualTo(Long value) {
            addCriterion("modifier_ref_id <=", value, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdIn(List<Long> values) {
            addCriterion("modifier_ref_id in", values, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdNotIn(List<Long> values) {
            addCriterion("modifier_ref_id not in", values, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdBetween(Long value1, Long value2) {
            addCriterion("modifier_ref_id between", value1, value2, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andModifierRefIdNotBetween(Long value1, Long value2) {
            addCriterion("modifier_ref_id not between", value1, value2, "modifierRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassIsNull() {
            addCriterion("container_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassIsNotNull() {
            addCriterion("container_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassEqualTo(String value) {
            addCriterion("container_ref_class =", value, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassNotEqualTo(String value) {
            addCriterion("container_ref_class <>", value, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassGreaterThan(String value) {
            addCriterion("container_ref_class >", value, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("container_ref_class >=", value, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassLessThan(String value) {
            addCriterion("container_ref_class <", value, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassLessThanOrEqualTo(String value) {
            addCriterion("container_ref_class <=", value, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassLike(String value) {
            addCriterion("container_ref_class like", value, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassNotLike(String value) {
            addCriterion("container_ref_class not like", value, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassIn(List<String> values) {
            addCriterion("container_ref_class in", values, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassNotIn(List<String> values) {
            addCriterion("container_ref_class not in", values, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassBetween(String value1, String value2) {
            addCriterion("container_ref_class between", value1, value2, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefClassNotBetween(String value1, String value2) {
            addCriterion("container_ref_class not between", value1, value2, "containerRefClass");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdIsNull() {
            addCriterion("container_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdIsNotNull() {
            addCriterion("container_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdEqualTo(Long value) {
            addCriterion("container_ref_id =", value, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdNotEqualTo(Long value) {
            addCriterion("container_ref_id <>", value, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdGreaterThan(Long value) {
            addCriterion("container_ref_id >", value, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("container_ref_id >=", value, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdLessThan(Long value) {
            addCriterion("container_ref_id <", value, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdLessThanOrEqualTo(Long value) {
            addCriterion("container_ref_id <=", value, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdIn(List<Long> values) {
            addCriterion("container_ref_id in", values, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdNotIn(List<Long> values) {
            addCriterion("container_ref_id not in", values, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdBetween(Long value1, Long value2) {
            addCriterion("container_ref_id between", value1, value2, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andContainerRefIdNotBetween(Long value1, Long value2) {
            addCriterion("container_ref_id not between", value1, value2, "containerRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassIsNull() {
            addCriterion("domain_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassIsNotNull() {
            addCriterion("domain_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassEqualTo(String value) {
            addCriterion("domain_ref_class =", value, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassNotEqualTo(String value) {
            addCriterion("domain_ref_class <>", value, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassGreaterThan(String value) {
            addCriterion("domain_ref_class >", value, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("domain_ref_class >=", value, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassLessThan(String value) {
            addCriterion("domain_ref_class <", value, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassLessThanOrEqualTo(String value) {
            addCriterion("domain_ref_class <=", value, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassLike(String value) {
            addCriterion("domain_ref_class like", value, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassNotLike(String value) {
            addCriterion("domain_ref_class not like", value, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassIn(List<String> values) {
            addCriterion("domain_ref_class in", values, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassNotIn(List<String> values) {
            addCriterion("domain_ref_class not in", values, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassBetween(String value1, String value2) {
            addCriterion("domain_ref_class between", value1, value2, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefClassNotBetween(String value1, String value2) {
            addCriterion("domain_ref_class not between", value1, value2, "domainRefClass");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdIsNull() {
            addCriterion("domain_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdIsNotNull() {
            addCriterion("domain_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdEqualTo(Long value) {
            addCriterion("domain_ref_id =", value, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdNotEqualTo(Long value) {
            addCriterion("domain_ref_id <>", value, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdGreaterThan(Long value) {
            addCriterion("domain_ref_id >", value, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("domain_ref_id >=", value, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdLessThan(Long value) {
            addCriterion("domain_ref_id <", value, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdLessThanOrEqualTo(Long value) {
            addCriterion("domain_ref_id <=", value, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdIn(List<Long> values) {
            addCriterion("domain_ref_id in", values, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdNotIn(List<Long> values) {
            addCriterion("domain_ref_id not in", values, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdBetween(Long value1, Long value2) {
            addCriterion("domain_ref_id between", value1, value2, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andDomainRefIdNotBetween(Long value1, Long value2) {
            addCriterion("domain_ref_id not between", value1, value2, "domainRefId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassIsNull() {
            addCriterion("group_reference_reference_class is null");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassIsNotNull() {
            addCriterion("group_reference_reference_class is not null");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassEqualTo(String value) {
            addCriterion("group_reference_reference_class =", value, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassNotEqualTo(String value) {
            addCriterion("group_reference_reference_class <>", value, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassGreaterThan(String value) {
            addCriterion("group_reference_reference_class >", value, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassGreaterThanOrEqualTo(String value) {
            addCriterion("group_reference_reference_class >=", value, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassLessThan(String value) {
            addCriterion("group_reference_reference_class <", value, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassLessThanOrEqualTo(String value) {
            addCriterion("group_reference_reference_class <=", value, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassLike(String value) {
            addCriterion("group_reference_reference_class like", value, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassNotLike(String value) {
            addCriterion("group_reference_reference_class not like", value, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassIn(List<String> values) {
            addCriterion("group_reference_reference_class in", values, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassNotIn(List<String> values) {
            addCriterion("group_reference_reference_class not in", values, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassBetween(String value1, String value2) {
            addCriterion("group_reference_reference_class between", value1, value2, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceClassNotBetween(String value1, String value2) {
            addCriterion("group_reference_reference_class not between", value1, value2, "groupReferenceReferenceClass");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdIsNull() {
            addCriterion("group_reference_reference_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdIsNotNull() {
            addCriterion("group_reference_reference_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdEqualTo(Long value) {
            addCriterion("group_reference_reference_id =", value, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdNotEqualTo(Long value) {
            addCriterion("group_reference_reference_id <>", value, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdGreaterThan(Long value) {
            addCriterion("group_reference_reference_id >", value, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_reference_reference_id >=", value, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdLessThan(Long value) {
            addCriterion("group_reference_reference_id <", value, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdLessThanOrEqualTo(Long value) {
            addCriterion("group_reference_reference_id <=", value, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdIn(List<Long> values) {
            addCriterion("group_reference_reference_id in", values, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdNotIn(List<Long> values) {
            addCriterion("group_reference_reference_id not in", values, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdBetween(Long value1, Long value2) {
            addCriterion("group_reference_reference_id between", value1, value2, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andGroupReferenceReferenceIdNotBetween(Long value1, Long value2) {
            addCriterion("group_reference_reference_id not between", value1, value2, "groupReferenceReferenceId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassIsNull() {
            addCriterion("ltdtype_definition_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassIsNotNull() {
            addCriterion("ltdtype_definition_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassEqualTo(String value) {
            addCriterion("ltdtype_definition_ref_class =", value, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassNotEqualTo(String value) {
            addCriterion("ltdtype_definition_ref_class <>", value, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassGreaterThan(String value) {
            addCriterion("ltdtype_definition_ref_class >", value, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("ltdtype_definition_ref_class >=", value, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassLessThan(String value) {
            addCriterion("ltdtype_definition_ref_class <", value, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassLessThanOrEqualTo(String value) {
            addCriterion("ltdtype_definition_ref_class <=", value, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassLike(String value) {
            addCriterion("ltdtype_definition_ref_class like", value, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassNotLike(String value) {
            addCriterion("ltdtype_definition_ref_class not like", value, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassIn(List<String> values) {
            addCriterion("ltdtype_definition_ref_class in", values, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassNotIn(List<String> values) {
            addCriterion("ltdtype_definition_ref_class not in", values, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassBetween(String value1, String value2) {
            addCriterion("ltdtype_definition_ref_class between", value1, value2, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefClassNotBetween(String value1, String value2) {
            addCriterion("ltdtype_definition_ref_class not between", value1, value2, "ltdtypeDefinitionRefClass");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdIsNull() {
            addCriterion("ltdtype_definition_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdIsNotNull() {
            addCriterion("ltdtype_definition_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdEqualTo(Long value) {
            addCriterion("ltdtype_definition_ref_id =", value, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdNotEqualTo(Long value) {
            addCriterion("ltdtype_definition_ref_id <>", value, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdGreaterThan(Long value) {
            addCriterion("ltdtype_definition_ref_id >", value, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ltdtype_definition_ref_id >=", value, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdLessThan(Long value) {
            addCriterion("ltdtype_definition_ref_id <", value, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdLessThanOrEqualTo(Long value) {
            addCriterion("ltdtype_definition_ref_id <=", value, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdIn(List<Long> values) {
            addCriterion("ltdtype_definition_ref_id in", values, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdNotIn(List<Long> values) {
            addCriterion("ltdtype_definition_ref_id not in", values, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdBetween(Long value1, Long value2) {
            addCriterion("ltdtype_definition_ref_id between", value1, value2, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andLtdtypeDefinitionRefIdNotBetween(Long value1, Long value2) {
            addCriterion("ltdtype_definition_ref_id not between", value1, value2, "ltdtypeDefinitionRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassIsNull() {
            addCriterion("plan_activity_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassIsNotNull() {
            addCriterion("plan_activity_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassEqualTo(String value) {
            addCriterion("plan_activity_ref_class =", value, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassNotEqualTo(String value) {
            addCriterion("plan_activity_ref_class <>", value, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassGreaterThan(String value) {
            addCriterion("plan_activity_ref_class >", value, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("plan_activity_ref_class >=", value, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassLessThan(String value) {
            addCriterion("plan_activity_ref_class <", value, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassLessThanOrEqualTo(String value) {
            addCriterion("plan_activity_ref_class <=", value, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassLike(String value) {
            addCriterion("plan_activity_ref_class like", value, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassNotLike(String value) {
            addCriterion("plan_activity_ref_class not like", value, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassIn(List<String> values) {
            addCriterion("plan_activity_ref_class in", values, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassNotIn(List<String> values) {
            addCriterion("plan_activity_ref_class not in", values, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassBetween(String value1, String value2) {
            addCriterion("plan_activity_ref_class between", value1, value2, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefClassNotBetween(String value1, String value2) {
            addCriterion("plan_activity_ref_class not between", value1, value2, "planActivityRefClass");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdIsNull() {
            addCriterion("plan_activity_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdIsNotNull() {
            addCriterion("plan_activity_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdEqualTo(Long value) {
            addCriterion("plan_activity_ref_id =", value, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdNotEqualTo(Long value) {
            addCriterion("plan_activity_ref_id <>", value, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdGreaterThan(Long value) {
            addCriterion("plan_activity_ref_id >", value, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_activity_ref_id >=", value, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdLessThan(Long value) {
            addCriterion("plan_activity_ref_id <", value, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdLessThanOrEqualTo(Long value) {
            addCriterion("plan_activity_ref_id <=", value, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdIn(List<Long> values) {
            addCriterion("plan_activity_ref_id in", values, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdNotIn(List<Long> values) {
            addCriterion("plan_activity_ref_id not in", values, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdBetween(Long value1, Long value2) {
            addCriterion("plan_activity_ref_id between", value1, value2, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanActivityRefIdNotBetween(Long value1, Long value2) {
            addCriterion("plan_activity_ref_id not between", value1, value2, "planActivityRefId");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeIsNull() {
            addCriterion("plan_complete_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeIsNotNull() {
            addCriterion("plan_complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeEqualTo(Date value) {
            addCriterion("plan_complete_time =", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeNotEqualTo(Date value) {
            addCriterion("plan_complete_time <>", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeGreaterThan(Date value) {
            addCriterion("plan_complete_time >", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_complete_time >=", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeLessThan(Date value) {
            addCriterion("plan_complete_time <", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_complete_time <=", value, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeIn(List<Date> values) {
            addCriterion("plan_complete_time in", values, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeNotIn(List<Date> values) {
            addCriterion("plan_complete_time not in", values, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("plan_complete_time between", value1, value2, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andPlanCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_complete_time not between", value1, value2, "planCompleteTime");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIsNull() {
            addCriterion("project_number is null");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIsNotNull() {
            addCriterion("project_number is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNumberEqualTo(String value) {
            addCriterion("project_number =", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotEqualTo(String value) {
            addCriterion("project_number <>", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberGreaterThan(String value) {
            addCriterion("project_number >", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberGreaterThanOrEqualTo(String value) {
            addCriterion("project_number >=", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLessThan(String value) {
            addCriterion("project_number <", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLessThanOrEqualTo(String value) {
            addCriterion("project_number <=", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberLike(String value) {
            addCriterion("project_number like", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotLike(String value) {
            addCriterion("project_number not like", value, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberIn(List<String> values) {
            addCriterion("project_number in", values, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotIn(List<String> values) {
            addCriterion("project_number not in", values, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberBetween(String value1, String value2) {
            addCriterion("project_number between", value1, value2, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProjectNumberNotBetween(String value1, String value2) {
            addCriterion("project_number not between", value1, value2, "projectNumber");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassIsNull() {
            addCriterion("propose_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassIsNotNull() {
            addCriterion("propose_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassEqualTo(String value) {
            addCriterion("propose_ref_class =", value, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassNotEqualTo(String value) {
            addCriterion("propose_ref_class <>", value, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassGreaterThan(String value) {
            addCriterion("propose_ref_class >", value, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("propose_ref_class >=", value, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassLessThan(String value) {
            addCriterion("propose_ref_class <", value, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassLessThanOrEqualTo(String value) {
            addCriterion("propose_ref_class <=", value, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassLike(String value) {
            addCriterion("propose_ref_class like", value, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassNotLike(String value) {
            addCriterion("propose_ref_class not like", value, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassIn(List<String> values) {
            addCriterion("propose_ref_class in", values, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassNotIn(List<String> values) {
            addCriterion("propose_ref_class not in", values, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassBetween(String value1, String value2) {
            addCriterion("propose_ref_class between", value1, value2, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefClassNotBetween(String value1, String value2) {
            addCriterion("propose_ref_class not between", value1, value2, "proposeRefClass");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdIsNull() {
            addCriterion("propose_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdIsNotNull() {
            addCriterion("propose_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdEqualTo(Long value) {
            addCriterion("propose_ref_id =", value, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdNotEqualTo(Long value) {
            addCriterion("propose_ref_id <>", value, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdGreaterThan(Long value) {
            addCriterion("propose_ref_id >", value, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("propose_ref_id >=", value, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdLessThan(Long value) {
            addCriterion("propose_ref_id <", value, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdLessThanOrEqualTo(Long value) {
            addCriterion("propose_ref_id <=", value, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdIn(List<Long> values) {
            addCriterion("propose_ref_id in", values, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdNotIn(List<Long> values) {
            addCriterion("propose_ref_id not in", values, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdBetween(Long value1, Long value2) {
            addCriterion("propose_ref_id between", value1, value2, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProposeRefIdNotBetween(Long value1, Long value2) {
            addCriterion("propose_ref_id not between", value1, value2, "proposeRefId");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeIsNull() {
            addCriterion("provide_sample_time is null");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeIsNotNull() {
            addCriterion("provide_sample_time is not null");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeEqualTo(Date value) {
            addCriterion("provide_sample_time =", value, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeNotEqualTo(Date value) {
            addCriterion("provide_sample_time <>", value, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeGreaterThan(Date value) {
            addCriterion("provide_sample_time >", value, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("provide_sample_time >=", value, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeLessThan(Date value) {
            addCriterion("provide_sample_time <", value, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeLessThanOrEqualTo(Date value) {
            addCriterion("provide_sample_time <=", value, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeIn(List<Date> values) {
            addCriterion("provide_sample_time in", values, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeNotIn(List<Date> values) {
            addCriterion("provide_sample_time not in", values, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeBetween(Date value1, Date value2) {
            addCriterion("provide_sample_time between", value1, value2, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andProvideSampleTimeNotBetween(Date value1, Date value2) {
            addCriterion("provide_sample_time not between", value1, value2, "provideSampleTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeIsNull() {
            addCriterion("require_complete_time is null");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeIsNotNull() {
            addCriterion("require_complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeEqualTo(Date value) {
            addCriterion("require_complete_time =", value, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeNotEqualTo(Date value) {
            addCriterion("require_complete_time <>", value, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeGreaterThan(Date value) {
            addCriterion("require_complete_time >", value, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("require_complete_time >=", value, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeLessThan(Date value) {
            addCriterion("require_complete_time <", value, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("require_complete_time <=", value, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeIn(List<Date> values) {
            addCriterion("require_complete_time in", values, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeNotIn(List<Date> values) {
            addCriterion("require_complete_time not in", values, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("require_complete_time between", value1, value2, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequireCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("require_complete_time not between", value1, value2, "requireCompleteTime");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeIsNull() {
            addCriterion("result_notification_type is null");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeIsNotNull() {
            addCriterion("result_notification_type is not null");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeEqualTo(String value) {
            addCriterion("result_notification_type =", value, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeNotEqualTo(String value) {
            addCriterion("result_notification_type <>", value, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeGreaterThan(String value) {
            addCriterion("result_notification_type >", value, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("result_notification_type >=", value, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeLessThan(String value) {
            addCriterion("result_notification_type <", value, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeLessThanOrEqualTo(String value) {
            addCriterion("result_notification_type <=", value, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeLike(String value) {
            addCriterion("result_notification_type like", value, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeNotLike(String value) {
            addCriterion("result_notification_type not like", value, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeIn(List<String> values) {
            addCriterion("result_notification_type in", values, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeNotIn(List<String> values) {
            addCriterion("result_notification_type not in", values, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeBetween(String value1, String value2) {
            addCriterion("result_notification_type between", value1, value2, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andResultNotificationTypeNotBetween(String value1, String value2) {
            addCriterion("result_notification_type not between", value1, value2, "resultNotificationType");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoIsNull() {
            addCriterion("sap_order_info is null");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoIsNotNull() {
            addCriterion("sap_order_info is not null");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoEqualTo(String value) {
            addCriterion("sap_order_info =", value, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoNotEqualTo(String value) {
            addCriterion("sap_order_info <>", value, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoGreaterThan(String value) {
            addCriterion("sap_order_info >", value, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoGreaterThanOrEqualTo(String value) {
            addCriterion("sap_order_info >=", value, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoLessThan(String value) {
            addCriterion("sap_order_info <", value, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoLessThanOrEqualTo(String value) {
            addCriterion("sap_order_info <=", value, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoLike(String value) {
            addCriterion("sap_order_info like", value, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoNotLike(String value) {
            addCriterion("sap_order_info not like", value, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoIn(List<String> values) {
            addCriterion("sap_order_info in", values, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoNotIn(List<String> values) {
            addCriterion("sap_order_info not in", values, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoBetween(String value1, String value2) {
            addCriterion("sap_order_info between", value1, value2, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andSapOrderInfoNotBetween(String value1, String value2) {
            addCriterion("sap_order_info not between", value1, value2, "sapOrderInfo");
            return (Criteria) this;
        }

        public Criteria andAtGateIsNull() {
            addCriterion("at_gate is null");
            return (Criteria) this;
        }

        public Criteria andAtGateIsNotNull() {
            addCriterion("at_gate is not null");
            return (Criteria) this;
        }

        public Criteria andAtGateEqualTo(Boolean value) {
            addCriterion("at_gate =", value, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateNotEqualTo(Boolean value) {
            addCriterion("at_gate <>", value, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateGreaterThan(Boolean value) {
            addCriterion("at_gate >", value, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("at_gate >=", value, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateLessThan(Boolean value) {
            addCriterion("at_gate <", value, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateLessThanOrEqualTo(Boolean value) {
            addCriterion("at_gate <=", value, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateIn(List<Boolean> values) {
            addCriterion("at_gate in", values, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateNotIn(List<Boolean> values) {
            addCriterion("at_gate not in", values, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateBetween(Boolean value1, Boolean value2) {
            addCriterion("at_gate between", value1, value2, "atGate");
            return (Criteria) this;
        }

        public Criteria andAtGateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("at_gate not between", value1, value2, "atGate");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassIsNull() {
            addCriterion("lc_template_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassIsNotNull() {
            addCriterion("lc_template_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassEqualTo(String value) {
            addCriterion("lc_template_ref_class =", value, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassNotEqualTo(String value) {
            addCriterion("lc_template_ref_class <>", value, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassGreaterThan(String value) {
            addCriterion("lc_template_ref_class >", value, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("lc_template_ref_class >=", value, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassLessThan(String value) {
            addCriterion("lc_template_ref_class <", value, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassLessThanOrEqualTo(String value) {
            addCriterion("lc_template_ref_class <=", value, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassLike(String value) {
            addCriterion("lc_template_ref_class like", value, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassNotLike(String value) {
            addCriterion("lc_template_ref_class not like", value, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassIn(List<String> values) {
            addCriterion("lc_template_ref_class in", values, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassNotIn(List<String> values) {
            addCriterion("lc_template_ref_class not in", values, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassBetween(String value1, String value2) {
            addCriterion("lc_template_ref_class between", value1, value2, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefClassNotBetween(String value1, String value2) {
            addCriterion("lc_template_ref_class not between", value1, value2, "lcTemplateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdIsNull() {
            addCriterion("lc_template_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdIsNotNull() {
            addCriterion("lc_template_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdEqualTo(Long value) {
            addCriterion("lc_template_ref_id =", value, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdNotEqualTo(Long value) {
            addCriterion("lc_template_ref_id <>", value, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdGreaterThan(Long value) {
            addCriterion("lc_template_ref_id >", value, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lc_template_ref_id >=", value, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdLessThan(Long value) {
            addCriterion("lc_template_ref_id <", value, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdLessThanOrEqualTo(Long value) {
            addCriterion("lc_template_ref_id <=", value, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdIn(List<Long> values) {
            addCriterion("lc_template_ref_id in", values, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdNotIn(List<Long> values) {
            addCriterion("lc_template_ref_id not in", values, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdBetween(Long value1, Long value2) {
            addCriterion("lc_template_ref_id between", value1, value2, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcTemplateRefIdNotBetween(Long value1, Long value2) {
            addCriterion("lc_template_ref_id not between", value1, value2, "lcTemplateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassIsNull() {
            addCriterion("lc_state_ref_class is null");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassIsNotNull() {
            addCriterion("lc_state_ref_class is not null");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassEqualTo(String value) {
            addCriterion("lc_state_ref_class =", value, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassNotEqualTo(String value) {
            addCriterion("lc_state_ref_class <>", value, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassGreaterThan(String value) {
            addCriterion("lc_state_ref_class >", value, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassGreaterThanOrEqualTo(String value) {
            addCriterion("lc_state_ref_class >=", value, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassLessThan(String value) {
            addCriterion("lc_state_ref_class <", value, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassLessThanOrEqualTo(String value) {
            addCriterion("lc_state_ref_class <=", value, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassLike(String value) {
            addCriterion("lc_state_ref_class like", value, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassNotLike(String value) {
            addCriterion("lc_state_ref_class not like", value, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassIn(List<String> values) {
            addCriterion("lc_state_ref_class in", values, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassNotIn(List<String> values) {
            addCriterion("lc_state_ref_class not in", values, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassBetween(String value1, String value2) {
            addCriterion("lc_state_ref_class between", value1, value2, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefClassNotBetween(String value1, String value2) {
            addCriterion("lc_state_ref_class not between", value1, value2, "lcStateRefClass");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdIsNull() {
            addCriterion("lc_state_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdIsNotNull() {
            addCriterion("lc_state_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdEqualTo(Long value) {
            addCriterion("lc_state_ref_id =", value, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdNotEqualTo(Long value) {
            addCriterion("lc_state_ref_id <>", value, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdGreaterThan(Long value) {
            addCriterion("lc_state_ref_id >", value, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lc_state_ref_id >=", value, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdLessThan(Long value) {
            addCriterion("lc_state_ref_id <", value, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdLessThanOrEqualTo(Long value) {
            addCriterion("lc_state_ref_id <=", value, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdIn(List<Long> values) {
            addCriterion("lc_state_ref_id in", values, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdNotIn(List<Long> values) {
            addCriterion("lc_state_ref_id not in", values, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdBetween(Long value1, Long value2) {
            addCriterion("lc_state_ref_id between", value1, value2, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andLcStateRefIdNotBetween(Long value1, Long value2) {
            addCriterion("lc_state_ref_id not between", value1, value2, "lcStateRefId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIsNull() {
            addCriterion("task_number is null");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIsNotNull() {
            addCriterion("task_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNumberEqualTo(String value) {
            addCriterion("task_number =", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotEqualTo(String value) {
            addCriterion("task_number <>", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberGreaterThan(String value) {
            addCriterion("task_number >", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberGreaterThanOrEqualTo(String value) {
            addCriterion("task_number >=", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberLessThan(String value) {
            addCriterion("task_number <", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberLessThanOrEqualTo(String value) {
            addCriterion("task_number <=", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberLike(String value) {
            addCriterion("task_number like", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotLike(String value) {
            addCriterion("task_number not like", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIn(List<String> values) {
            addCriterion("task_number in", values, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotIn(List<String> values) {
            addCriterion("task_number not in", values, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberBetween(String value1, String value2) {
            addCriterion("task_number between", value1, value2, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotBetween(String value1, String value2) {
            addCriterion("task_number not between", value1, value2, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassIsNull() {
            addCriterion("team_reference_class is null");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassIsNotNull() {
            addCriterion("team_reference_class is not null");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassEqualTo(String value) {
            addCriterion("team_reference_class =", value, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassNotEqualTo(String value) {
            addCriterion("team_reference_class <>", value, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassGreaterThan(String value) {
            addCriterion("team_reference_class >", value, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassGreaterThanOrEqualTo(String value) {
            addCriterion("team_reference_class >=", value, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassLessThan(String value) {
            addCriterion("team_reference_class <", value, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassLessThanOrEqualTo(String value) {
            addCriterion("team_reference_class <=", value, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassLike(String value) {
            addCriterion("team_reference_class like", value, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassNotLike(String value) {
            addCriterion("team_reference_class not like", value, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassIn(List<String> values) {
            addCriterion("team_reference_class in", values, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassNotIn(List<String> values) {
            addCriterion("team_reference_class not in", values, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassBetween(String value1, String value2) {
            addCriterion("team_reference_class between", value1, value2, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceClassNotBetween(String value1, String value2) {
            addCriterion("team_reference_class not between", value1, value2, "teamReferenceClass");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdIsNull() {
            addCriterion("team_reference_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdIsNotNull() {
            addCriterion("team_reference_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdEqualTo(Long value) {
            addCriterion("team_reference_id =", value, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdNotEqualTo(Long value) {
            addCriterion("team_reference_id <>", value, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdGreaterThan(Long value) {
            addCriterion("team_reference_id >", value, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("team_reference_id >=", value, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdLessThan(Long value) {
            addCriterion("team_reference_id <", value, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdLessThanOrEqualTo(Long value) {
            addCriterion("team_reference_id <=", value, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdIn(List<Long> values) {
            addCriterion("team_reference_id in", values, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdNotIn(List<Long> values) {
            addCriterion("team_reference_id not in", values, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdBetween(Long value1, Long value2) {
            addCriterion("team_reference_id between", value1, value2, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTeamReferenceIdNotBetween(Long value1, Long value2) {
            addCriterion("team_reference_id not between", value1, value2, "teamReferenceId");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberIsNull() {
            addCriterion("telephone_number is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberIsNotNull() {
            addCriterion("telephone_number is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberEqualTo(String value) {
            addCriterion("telephone_number =", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberNotEqualTo(String value) {
            addCriterion("telephone_number <>", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberGreaterThan(String value) {
            addCriterion("telephone_number >", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("telephone_number >=", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberLessThan(String value) {
            addCriterion("telephone_number <", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberLessThanOrEqualTo(String value) {
            addCriterion("telephone_number <=", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberLike(String value) {
            addCriterion("telephone_number like", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberNotLike(String value) {
            addCriterion("telephone_number not like", value, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberIn(List<String> values) {
            addCriterion("telephone_number in", values, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberNotIn(List<String> values) {
            addCriterion("telephone_number not in", values, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberBetween(String value1, String value2) {
            addCriterion("telephone_number between", value1, value2, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumberNotBetween(String value1, String value2) {
            addCriterion("telephone_number not between", value1, value2, "telephoneNumber");
            return (Criteria) this;
        }

        public Criteria andTrialNatureIsNull() {
            addCriterion("trial_nature is null");
            return (Criteria) this;
        }

        public Criteria andTrialNatureIsNotNull() {
            addCriterion("trial_nature is not null");
            return (Criteria) this;
        }

        public Criteria andTrialNatureEqualTo(String value) {
            addCriterion("trial_nature =", value, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureNotEqualTo(String value) {
            addCriterion("trial_nature <>", value, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureGreaterThan(String value) {
            addCriterion("trial_nature >", value, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureGreaterThanOrEqualTo(String value) {
            addCriterion("trial_nature >=", value, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureLessThan(String value) {
            addCriterion("trial_nature <", value, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureLessThanOrEqualTo(String value) {
            addCriterion("trial_nature <=", value, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureLike(String value) {
            addCriterion("trial_nature like", value, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureNotLike(String value) {
            addCriterion("trial_nature not like", value, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureIn(List<String> values) {
            addCriterion("trial_nature in", values, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureNotIn(List<String> values) {
            addCriterion("trial_nature not in", values, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureBetween(String value1, String value2) {
            addCriterion("trial_nature between", value1, value2, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialNatureNotBetween(String value1, String value2) {
            addCriterion("trial_nature not between", value1, value2, "trialNature");
            return (Criteria) this;
        }

        public Criteria andTrialTypeIsNull() {
            addCriterion("trial_type is null");
            return (Criteria) this;
        }

        public Criteria andTrialTypeIsNotNull() {
            addCriterion("trial_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrialTypeEqualTo(String value) {
            addCriterion("trial_type =", value, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeNotEqualTo(String value) {
            addCriterion("trial_type <>", value, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeGreaterThan(String value) {
            addCriterion("trial_type >", value, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trial_type >=", value, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeLessThan(String value) {
            addCriterion("trial_type <", value, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeLessThanOrEqualTo(String value) {
            addCriterion("trial_type <=", value, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeLike(String value) {
            addCriterion("trial_type like", value, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeNotLike(String value) {
            addCriterion("trial_type not like", value, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeIn(List<String> values) {
            addCriterion("trial_type in", values, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeNotIn(List<String> values) {
            addCriterion("trial_type not in", values, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeBetween(String value1, String value2) {
            addCriterion("trial_type between", value1, value2, "trialType");
            return (Criteria) this;
        }

        public Criteria andTrialTypeNotBetween(String value1, String value2) {
            addCriterion("trial_type not between", value1, value2, "trialType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }
    }

        public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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