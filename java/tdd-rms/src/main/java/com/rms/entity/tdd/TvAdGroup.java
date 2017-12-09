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
 * TvAdGroup generated by hbm2java
 */
@Entity
@Table (
    name = "tv_ad_group",
    catalog = "rms")
public class TvAdGroup implements java.io.Serializable {

	private Integer	tagId;

	private String	tagName;

	private String	tagDesc;

	private Date	tagAddtime;

	private Integer	tagAdduserId;

	private Integer	tagModfiyuserId;

	private Date	tagModiytime;

	public TvAdGroup() {

	}

	public TvAdGroup(String tagName) {

		this.tagName = tagName;
	}

	public TvAdGroup(String tagName, String tagDesc, Date tagAddtime, Integer tagAdduserId, Integer tagModfiyuserId, Date tagModiytime) {

		this.tagName = tagName;
		this.tagDesc = tagDesc;
		this.tagAddtime = tagAddtime;
		this.tagAdduserId = tagAdduserId;
		this.tagModfiyuserId = tagModfiyuserId;
		this.tagModiytime = tagModiytime;
	}

	@Id
	@GeneratedValue (
	    strategy = IDENTITY)
	@Column (
	    name = "tag_id",
	    unique = true,
	    nullable = false)
	public Integer getTagId() {

		return this.tagId;
	}

	public void setTagId(Integer tagId) {

		this.tagId = tagId;
	}

	@Column (
	    name = "tag_name",
	    nullable = false,
	    length = 80)
	public String getTagName() {

		return this.tagName;
	}

	public void setTagName(String tagName) {

		this.tagName = tagName;
	}

	@Column (
	    name = "tag_desc",
	    length = 200)
	public String getTagDesc() {

		return this.tagDesc;
	}

	public void setTagDesc(String tagDesc) {

		this.tagDesc = tagDesc;
	}

	@Temporal (TemporalType.TIMESTAMP)
	@Column (
	    name = "tag_addtime",
	    length = 19)
	public Date getTagAddtime() {

		return this.tagAddtime;
	}

	public void setTagAddtime(Date tagAddtime) {

		this.tagAddtime = tagAddtime;
	}

	@Column (
	    name = "tag_adduser_id")
	public Integer getTagAdduserId() {

		return this.tagAdduserId;
	}

	public void setTagAdduserId(Integer tagAdduserId) {

		this.tagAdduserId = tagAdduserId;
	}

	@Column (
	    name = "tag_modfiyuser_id")
	public Integer getTagModfiyuserId() {

		return this.tagModfiyuserId;
	}

	public void setTagModfiyuserId(Integer tagModfiyuserId) {

		this.tagModfiyuserId = tagModfiyuserId;
	}

	@Temporal (TemporalType.TIMESTAMP)
	@Column (
	    name = "tag_modiytime",
	    length = 19)
	public Date getTagModiytime() {

		return this.tagModiytime;
	}

	public void setTagModiytime(Date tagModiytime) {

		this.tagModiytime = tagModiytime;
	}

}