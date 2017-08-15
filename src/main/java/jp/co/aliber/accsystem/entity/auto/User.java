package jp.co.aliber.accsystem.entity.auto;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.last_name_kana
     *
     * @mbg.generated
     */
    private String lastNameKana;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.first_name_kana
     *
     * @mbg.generated
     */
    private String firstNameKana;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.alphabetical_name
     *
     * @mbg.generated
     */
    private String alphabeticalName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.tel
     *
     * @mbg.generated
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.last_login_datetime
     *
     * @mbg.generated
     */
    private Date lastLoginDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.login_id
     *
     * @mbg.generated
     */
    private String loginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.password_modify_datetime
     *
     * @mbg.generated
     */
    private Date passwordModifyDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.fail_datetime
     *
     * @mbg.generated
     */
    private Date failDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.fail_count
     *
     * @mbg.generated
     */
    private Short failCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.lockuser
     *
     * @mbg.generated
     */
    private Boolean lockuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.locale
     *
     * @mbg.generated
     */
    private String locale;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.company_name
     *
     * @mbg.generated
     */
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.company_abbreviation
     *
     * @mbg.generated
     */
    private String companyAbbreviation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.delete_flg
     *
     * @mbg.generated
     */
    private Boolean deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.regist_date
     *
     * @mbg.generated
     */
    private Date registDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.regist_id
     *
     * @mbg.generated
     */
    private Integer registId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.update_id
     *
     * @mbg.generated
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.user_img
     *
     * @mbg.generated
     */
    private byte[] userImg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.user_id
     *
     * @return the value of public.user.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.user_id
     *
     * @param userId the value for public.user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.last_name
     *
     * @return the value of public.user.last_name
     *
     * @mbg.generated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.last_name
     *
     * @param lastName the value for public.user.last_name
     *
     * @mbg.generated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.first_name
     *
     * @return the value of public.user.first_name
     *
     * @mbg.generated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.first_name
     *
     * @param firstName the value for public.user.first_name
     *
     * @mbg.generated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.last_name_kana
     *
     * @return the value of public.user.last_name_kana
     *
     * @mbg.generated
     */
    public String getLastNameKana() {
        return lastNameKana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.last_name_kana
     *
     * @param lastNameKana the value for public.user.last_name_kana
     *
     * @mbg.generated
     */
    public void setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.first_name_kana
     *
     * @return the value of public.user.first_name_kana
     *
     * @mbg.generated
     */
    public String getFirstNameKana() {
        return firstNameKana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.first_name_kana
     *
     * @param firstNameKana the value for public.user.first_name_kana
     *
     * @mbg.generated
     */
    public void setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.alphabetical_name
     *
     * @return the value of public.user.alphabetical_name
     *
     * @mbg.generated
     */
    public String getAlphabeticalName() {
        return alphabeticalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.alphabetical_name
     *
     * @param alphabeticalName the value for public.user.alphabetical_name
     *
     * @mbg.generated
     */
    public void setAlphabeticalName(String alphabeticalName) {
        this.alphabeticalName = alphabeticalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.email
     *
     * @return the value of public.user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.email
     *
     * @param email the value for public.user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.tel
     *
     * @return the value of public.user.tel
     *
     * @mbg.generated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.tel
     *
     * @param tel the value for public.user.tel
     *
     * @mbg.generated
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.last_login_datetime
     *
     * @return the value of public.user.last_login_datetime
     *
     * @mbg.generated
     */
    public Date getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.last_login_datetime
     *
     * @param lastLoginDatetime the value for public.user.last_login_datetime
     *
     * @mbg.generated
     */
    public void setLastLoginDatetime(Date lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.login_id
     *
     * @return the value of public.user.login_id
     *
     * @mbg.generated
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.login_id
     *
     * @param loginId the value for public.user.login_id
     *
     * @mbg.generated
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.password
     *
     * @return the value of public.user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.password
     *
     * @param password the value for public.user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.password_modify_datetime
     *
     * @return the value of public.user.password_modify_datetime
     *
     * @mbg.generated
     */
    public Date getPasswordModifyDatetime() {
        return passwordModifyDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.password_modify_datetime
     *
     * @param passwordModifyDatetime the value for public.user.password_modify_datetime
     *
     * @mbg.generated
     */
    public void setPasswordModifyDatetime(Date passwordModifyDatetime) {
        this.passwordModifyDatetime = passwordModifyDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.fail_datetime
     *
     * @return the value of public.user.fail_datetime
     *
     * @mbg.generated
     */
    public Date getFailDatetime() {
        return failDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.fail_datetime
     *
     * @param failDatetime the value for public.user.fail_datetime
     *
     * @mbg.generated
     */
    public void setFailDatetime(Date failDatetime) {
        this.failDatetime = failDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.fail_count
     *
     * @return the value of public.user.fail_count
     *
     * @mbg.generated
     */
    public Short getFailCount() {
        return failCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.fail_count
     *
     * @param failCount the value for public.user.fail_count
     *
     * @mbg.generated
     */
    public void setFailCount(Short failCount) {
        this.failCount = failCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.lockuser
     *
     * @return the value of public.user.lockuser
     *
     * @mbg.generated
     */
    public Boolean getLockuser() {
        return lockuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.lockuser
     *
     * @param lockuser the value for public.user.lockuser
     *
     * @mbg.generated
     */
    public void setLockuser(Boolean lockuser) {
        this.lockuser = lockuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.locale
     *
     * @return the value of public.user.locale
     *
     * @mbg.generated
     */
    public String getLocale() {
        return locale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.locale
     *
     * @param locale the value for public.user.locale
     *
     * @mbg.generated
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.company_name
     *
     * @return the value of public.user.company_name
     *
     * @mbg.generated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.company_name
     *
     * @param companyName the value for public.user.company_name
     *
     * @mbg.generated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.company_abbreviation
     *
     * @return the value of public.user.company_abbreviation
     *
     * @mbg.generated
     */
    public String getCompanyAbbreviation() {
        return companyAbbreviation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.company_abbreviation
     *
     * @param companyAbbreviation the value for public.user.company_abbreviation
     *
     * @mbg.generated
     */
    public void setCompanyAbbreviation(String companyAbbreviation) {
        this.companyAbbreviation = companyAbbreviation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.delete_flg
     *
     * @return the value of public.user.delete_flg
     *
     * @mbg.generated
     */
    public Boolean getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.delete_flg
     *
     * @param deleteFlg the value for public.user.delete_flg
     *
     * @mbg.generated
     */
    public void setDeleteFlg(Boolean deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.regist_date
     *
     * @return the value of public.user.regist_date
     *
     * @mbg.generated
     */
    public Date getRegistDate() {
        return registDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.regist_date
     *
     * @param registDate the value for public.user.regist_date
     *
     * @mbg.generated
     */
    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.regist_id
     *
     * @return the value of public.user.regist_id
     *
     * @mbg.generated
     */
    public Integer getRegistId() {
        return registId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.regist_id
     *
     * @param registId the value for public.user.regist_id
     *
     * @mbg.generated
     */
    public void setRegistId(Integer registId) {
        this.registId = registId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.update_date
     *
     * @return the value of public.user.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.update_date
     *
     * @param updateDate the value for public.user.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.update_id
     *
     * @return the value of public.user.update_id
     *
     * @mbg.generated
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.update_id
     *
     * @param updateId the value for public.user.update_id
     *
     * @mbg.generated
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.user_img
     *
     * @return the value of public.user.user_img
     *
     * @mbg.generated
     */
    public byte[] getUserImg() {
        return userImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.user_img
     *
     * @param userImg the value for public.user.user_img
     *
     * @mbg.generated
     */
    public void setUserImg(byte[] userImg) {
        this.userImg = userImg;
    }
}