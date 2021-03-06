package com.rms.entity.tdd;

// Generated 2015-8-26 14:10:45 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TvUserComment generated by hbm2java
 */
@Entity
@Table (
    name = "tv_user_comment",
    catalog = "rms")
public class TvUserComment implements java.io.Serializable {

	private Integer	tucId;

	private Integer	tucUserId;

	private String	tucCommentContent;

	private Date	tucAddtime;

	private Integer	tucTvId;

	private Byte	tucState;

	public TvUserComment() {

	}

	public TvUserComment(Integer tucUserId, String tucCommentContent, Date tucAddtime, Integer tucTvId, Byte tucState) {

		this.tucUserId = tucUserId;
		this.tucCommentContent = tucCommentContent;
		this.tucAddtime = tucAddtime;
		this.tucTvId = tucTvId;
		this.tucState = tucState;
	}

	@Id
	@GeneratedValue (
	    strategy = IDENTITY)
	@Column (
	    name = "tuc_id",
	    unique = true,
	    nullable = false)
	public Integer getTucId() {

		return this.tucId;
	}

	public void setTucId(Integer tucId) {

		this.tucId = tucId;
	}

	@Column (
	    name = "tuc_user_id")
	public Integer getTucUserId() {

		return this.tucUserId;
	}

	public void setTucUserId(Integer tucUserId) {

		this.tucUserId = tucUserId;
	}

	@Column (
	    name = "tuc_comment_content",
	    length = 65535)
	public String getTucCommentContent() {

		return this.tucCommentContent;
	}

	public void setTucCommentContent(String tucCommentContent) {

		this.tucCommentContent = tucCommentContent;
	}

	@Temporal (TemporalType.TIMESTAMP)
	@Column (
	    name = "tuc_addtime",
	    length = 19)
	public Date getTucAddtime() {

		return this.tucAddtime;
	}

	public void setTucAddtime(Date tucAddtime) {

		this.tucAddtime = tucAddtime;
	}

	@Column (
	    name = "tuc_tv_id")
	public Integer getTucTvId() {

		return this.tucTvId;
	}

	public void setTucTvId(Integer tucTvId) {

		this.tucTvId = tucTvId;
	}

	@Column (
	    name = "tuc_state")
	public Byte getTucState() {

		return this.tucState;
	}

	public void setTucState(Byte tucState) {

		this.tucState = tucState;
	}

}
