package com.rms.entity.tdd;

// Generated 2015-8-26 14:10:45 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TddMemberBalances generated by hbm2java
 */
@Entity
@Table (
    name = "tdd_member_balances",
    catalog = "rms")
public class TddMemberBalances implements java.io.Serializable {

	private int	       userId;

	private BigDecimal	balance;

	public TddMemberBalances() {

	}

	public TddMemberBalances(int userId, BigDecimal balance) {

		this.userId = userId;
		this.balance = balance;
	}

	@Id
	@Column (
	    name = "user_id",
	    unique = true,
	    nullable = false)
	public int getUserId() {

		return this.userId;
	}

	public void setUserId(int userId) {

		this.userId = userId;
	}

	@Column (
	    name = "balance",
	    nullable = false,
	    precision = 10)
	public BigDecimal getBalance() {

		return this.balance;
	}

	public void setBalance(BigDecimal balance) {

		this.balance = balance;
	}

}