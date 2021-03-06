package it.etoken.base.model.eosblock.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

public class ActivityStageUser implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.activity_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private Long activityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.activity_stage_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private Long activityStageId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.status
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.account_name
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private String accountName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.is_winner
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private String isWinner;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.is_lucky
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private String isLucky;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.trx_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private String trxId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.trade_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private BigDecimal tradeQty;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.trade_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private Date tradeDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.win_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private BigDecimal winQty;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.lucky_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private BigDecimal luckyQty;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.create_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private Date createDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column activity_stage_user.update_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	private Date updateDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.id
	 * @return  the value of activity_stage_user.id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.id
	 * @param id  the value for activity_stage_user.id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.activity_id
	 * @return  the value of activity_stage_user.activity_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public Long getActivityId() {
		return activityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.activity_id
	 * @param activityId  the value for activity_stage_user.activity_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.activity_stage_id
	 * @return  the value of activity_stage_user.activity_stage_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public Long getActivityStageId() {
		return activityStageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.activity_stage_id
	 * @param activityStageId  the value for activity_stage_user.activity_stage_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setActivityStageId(Long activityStageId) {
		this.activityStageId = activityStageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.status
	 * @return  the value of activity_stage_user.status
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.status
	 * @param status  the value for activity_stage_user.status
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.account_name
	 * @return  the value of activity_stage_user.account_name
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.account_name
	 * @param accountName  the value for activity_stage_user.account_name
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.is_winner
	 * @return  the value of activity_stage_user.is_winner
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String getIsWinner() {
		return isWinner;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.is_winner
	 * @param isWinner  the value for activity_stage_user.is_winner
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setIsWinner(String isWinner) {
		this.isWinner = isWinner;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.is_lucky
	 * @return  the value of activity_stage_user.is_lucky
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String getIsLucky() {
		return isLucky;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.is_lucky
	 * @param isLucky  the value for activity_stage_user.is_lucky
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setIsLucky(String isLucky) {
		this.isLucky = isLucky;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.trx_id
	 * @return  the value of activity_stage_user.trx_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public String getTrxId() {
		return trxId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.trx_id
	 * @param trxId  the value for activity_stage_user.trx_id
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setTrxId(String trxId) {
		this.trxId = trxId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.trade_qty
	 * @return  the value of activity_stage_user.trade_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public BigDecimal getTradeQty() {
		return tradeQty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.trade_qty
	 * @param tradeQty  the value for activity_stage_user.trade_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setTradeQty(BigDecimal tradeQty) {
		this.tradeQty = tradeQty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.trade_date
	 * @return  the value of activity_stage_user.trade_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public Date getTradeDate() {
		return tradeDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.trade_date
	 * @param tradeDate  the value for activity_stage_user.trade_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.win_qty
	 * @return  the value of activity_stage_user.win_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public BigDecimal getWinQty() {
		return winQty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.win_qty
	 * @param winQty  the value for activity_stage_user.win_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setWinQty(BigDecimal winQty) {
		this.winQty = winQty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.lucky_qty
	 * @return  the value of activity_stage_user.lucky_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public BigDecimal getLuckyQty() {
		return luckyQty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.lucky_qty
	 * @param luckyQty  the value for activity_stage_user.lucky_qty
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setLuckyQty(BigDecimal luckyQty) {
		this.luckyQty = luckyQty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.create_date
	 * @return  the value of activity_stage_user.create_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.create_date
	 * @param createDate  the value for activity_stage_user.create_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column activity_stage_user.update_date
	 * @return  the value of activity_stage_user.update_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column activity_stage_user.update_date
	 * @param updateDate  the value for activity_stage_user.update_date
	 * @mbg.generated  Fri Sep 21 16:17:12 CST 2018
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3929574379336092841L;
}