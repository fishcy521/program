package com.rms.entity.tdd;

// Generated 2015-8-26 14:10:45 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * TvInfoMore generated by hbm2java
 */
@Entity
@Table (
    name = "tv_info_more",
    catalog = "rms")
public class TvInfoMore implements java.io.Serializable {

	private int	   tvId;

	private TvInfo	tvInfo;

	private String	tvDesc;

	private int	   tvPraiseCount;

	private int	   tvCollectionCount;

	private int	   tvPlayCount;

	private int	   tvCommentCount;

	private int	   tvStepCount;

	private int	   tvVoteCount;

	public TvInfoMore() {

	}

	public TvInfoMore(TvInfo tvInfo, int tvPraiseCount, int tvCollectionCount, int tvPlayCount, int tvCommentCount, int tvStepCount,
	        int tvVoteCount) {

		this.tvInfo = tvInfo;
		this.tvPraiseCount = tvPraiseCount;
		this.tvCollectionCount = tvCollectionCount;
		this.tvPlayCount = tvPlayCount;
		this.tvCommentCount = tvCommentCount;
		this.tvStepCount = tvStepCount;
		this.tvVoteCount = tvVoteCount;
	}

	public TvInfoMore(TvInfo tvInfo, String tvDesc, int tvPraiseCount, int tvCollectionCount, int tvPlayCount, int tvCommentCount,
	        int tvStepCount, int tvVoteCount) {

		this.tvInfo = tvInfo;
		this.tvDesc = tvDesc;
		this.tvPraiseCount = tvPraiseCount;
		this.tvCollectionCount = tvCollectionCount;
		this.tvPlayCount = tvPlayCount;
		this.tvCommentCount = tvCommentCount;
		this.tvStepCount = tvStepCount;
		this.tvVoteCount = tvVoteCount;
	}

	@GenericGenerator (
	    name = "generator",
	    strategy = "foreign",
	    parameters = @Parameter (
	        name = "property",
	        value = "tvInfo"))
	@Id
	@GeneratedValue (
	    generator = "generator")
	@Column (
	    name = "tv_id",
	    unique = true,
	    nullable = false)
	public int getTvId() {

		return this.tvId;
	}

	public void setTvId(int tvId) {

		this.tvId = tvId;
	}

	@OneToOne (
	    fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public TvInfo getTvInfo() {

		return this.tvInfo;
	}

	public void setTvInfo(TvInfo tvInfo) {

		this.tvInfo = tvInfo;
	}

	@Column (
	    name = "tv_desc",
	    length = 65535)
	public String getTvDesc() {

		return this.tvDesc;
	}

	public void setTvDesc(String tvDesc) {

		this.tvDesc = tvDesc;
	}

	@Column (
	    name = "tv_praise_count",
	    nullable = false)
	public int getTvPraiseCount() {

		return this.tvPraiseCount;
	}

	public void setTvPraiseCount(int tvPraiseCount) {

		this.tvPraiseCount = tvPraiseCount;
	}

	@Column (
	    name = "tv_collection_count",
	    nullable = false)
	public int getTvCollectionCount() {

		return this.tvCollectionCount;
	}

	public void setTvCollectionCount(int tvCollectionCount) {

		this.tvCollectionCount = tvCollectionCount;
	}

	@Column (
	    name = "tv_play_count",
	    nullable = false)
	public int getTvPlayCount() {

		return this.tvPlayCount;
	}

	public void setTvPlayCount(int tvPlayCount) {

		this.tvPlayCount = tvPlayCount;
	}

	@Column (
	    name = "tv_comment_count",
	    nullable = false)
	public int getTvCommentCount() {

		return this.tvCommentCount;
	}

	public void setTvCommentCount(int tvCommentCount) {

		this.tvCommentCount = tvCommentCount;
	}

	@Column (
	    name = "tv_step_count",
	    nullable = false)
	public int getTvStepCount() {

		return this.tvStepCount;
	}

	public void setTvStepCount(int tvStepCount) {

		this.tvStepCount = tvStepCount;
	}

	@Column (
	    name = "tv_vote_count",
	    nullable = false)
	public int getTvVoteCount() {

		return this.tvVoteCount;
	}

	public void setTvVoteCount(int tvVoteCount) {

		this.tvVoteCount = tvVoteCount;
	}

}