package core.org.akaza.openclinica.domain.datamap;
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import core.org.akaza.openclinica.domain.DataMapDomainObject;
import core.org.akaza.openclinica.domain.Status;
import core.org.akaza.openclinica.domain.user.UserAccount;
import org.akaza.openclinica.domain.enumsupport.StudyEventWorkflowStatusEnum;
import org.apache.commons.lang3.BooleanUtils;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * StudyEvent generated by hbm2java
 */
@Entity
@Table(name = "study_event")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence_name", value = "study_event_study_event_id_seq") })

public class StudyEvent extends DataMapDomainObject  {

	private int studyEventId;
	private UserAccount userAccount;
	private StudyEventDefinition studyEventDefinition;
	private StudySubject studySubject;
	//private Status status;
	private Integer statusId;
	private String location;
	private Integer sampleOrdinal;
	private Date dateStart;
	private Date dateEnd;
	private Date dateCreated;
	private Date dateUpdated;
	private Integer updateId;
	private Integer subjectEventStatusId;
	private Boolean startTimeFlag;
	private Boolean endTimeFlag;
	private List<DnStudyEventMap> dnStudyEventMaps ;
	private List<EventCrf> eventCrfs ;
	private Integer sedOrdinal;
	private StudyEventWorkflowStatusEnum workflowStatus;
	private Boolean removed;
	private Boolean archived;
	private Boolean locked;
	private Boolean signed;

	public StudyEvent() {
	}

	public StudyEvent(int studyEventId) {
		this.studyEventId = studyEventId;
	}

	public StudyEvent(int studyEventId, UserAccount userAccount,
			StudyEventDefinition studyEventDefinition,
			StudySubject studySubject, Status status, String location,
			Integer sampleOrdinal, Date dateStart, Date dateEnd,
			Date dateCreated, Date dateUpdated, Integer updateId,
			Integer subjectEventStatusId, Boolean startTimeFlag,
			Boolean endTimeFlag, List<DnStudyEventMap> dnStudyEventMaps, List<EventCrf> eventCrfs) {
		this.studyEventId = studyEventId;
		this.userAccount = userAccount;
		this.studyEventDefinition = studyEventDefinition;
		this.studySubject = studySubject;
		
		this.location = location;
		this.sampleOrdinal = sampleOrdinal;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.updateId = updateId;
		this.subjectEventStatusId = subjectEventStatusId;
		this.startTimeFlag = startTimeFlag;
		this.endTimeFlag = endTimeFlag;
		this.dnStudyEventMaps = dnStudyEventMaps;
		this.eventCrfs = eventCrfs;
	}

	@Id
	@Column(name = "study_event_id", unique = true, nullable = false)
	@GeneratedValue(generator = "id-generator")
	public int getStudyEventId() {
		return this.studyEventId;
	}

	public void setStudyEventId(int studyEventId) {
		this.studyEventId = studyEventId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "study_event_definition_id")
	public StudyEventDefinition getStudyEventDefinition() {
		return this.studyEventDefinition;
	}

	public void setStudyEventDefinition(
			StudyEventDefinition studyEventDefinition) {
		this.studyEventDefinition = studyEventDefinition;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "study_subject_id")
	public StudySubject getStudySubject() {
		return this.studySubject;
	}

	public void setStudySubject(StudySubject studySubject) {
		this.studySubject = studySubject;
	}

	/*@Type(type = "status")
    @Column(name = "status_id")
    public Status getStatus() {
        if (status != null) {
            return status;
        } else
            return Status.AVAILABLE;
    }
	public void setStatus(Status status) {
		this.status = status;
	}*/

	@Column(name = "location", length = 2000)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "sample_ordinal")
	
	public Integer getSampleOrdinal() {
		return this.sampleOrdinal;
	}

	public void setSampleOrdinal(Integer sampleOrdinal) {
		this.sampleOrdinal = sampleOrdinal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_start", length = 8)
	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_end", length = 8)
	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_created", length = 8)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_updated", length = 8)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@Column(name = "update_id")
	public Integer getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	@Column(name = "subject_event_status_id")
	public Integer getSubjectEventStatusId() {
		return this.subjectEventStatusId;
	}

	public void setSubjectEventStatusId(Integer subjectEventStatusId) {
		this.subjectEventStatusId = subjectEventStatusId;
	}

	@Column(name = "start_time_flag")
	public Boolean getStartTimeFlag() {
		return this.startTimeFlag;
	}

	public void setStartTimeFlag(Boolean startTimeFlag) {
		this.startTimeFlag = startTimeFlag;
	}

	@Column(name = "end_time_flag")
	public Boolean getEndTimeFlag() {
		return this.endTimeFlag;
	}

	public void setEndTimeFlag(Boolean endTimeFlag) {
		this.endTimeFlag = endTimeFlag;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studyEvent")
	@OrderBy("discrepancyNote")
    public List<DnStudyEventMap> getDnStudyEventMaps() {
		return this.dnStudyEventMaps;
	}

	public void setDnStudyEventMaps(List<DnStudyEventMap> dnStudyEventMaps) {
		this.dnStudyEventMaps = dnStudyEventMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studyEvent")
	@OrderBy("dateUpdated asc")
	
	public List<EventCrf> getEventCrfs() {
		return this.eventCrfs;
	}

	public void setEventCrfs(List<EventCrf> eventCrfs) {
		this.eventCrfs = eventCrfs;
	}
	 @Column(name = "status_id")
	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}



	/*@Column(name="sed_ordinal",insertable=false,updatable=false,table="study_event_definition")
	
	public Integer getSedOrdinal() {
		return sedOrdinal;
	}

	public void setSedOrdinal(Integer sedOrdinal) {
		this.sedOrdinal = sedOrdinal;
	}
*/
	@Column(name = "removed")
	public Boolean getRemoved() {
		return removed;
	}

	public void setRemoved(Boolean removed) {
		this.removed = removed;
	}

	@Column(name = "archived")
	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	@Column(name = "locked")
	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	@Enumerated( EnumType.STRING )
	@Column(name = "workflow_status")
	public StudyEventWorkflowStatusEnum getWorkflowStatus() {
		return workflowStatus;
	}

	public void setWorkflowStatus(StudyEventWorkflowStatusEnum workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

	@Column(name = "signed")
	public Boolean getSigned() {
		return signed;
	}

	public void setSigned(Boolean signed) {
		this.signed = signed;
	}

	@Transient
	public boolean isCurrentlyRemoved() {
		return BooleanUtils.isTrue(this.getRemoved());
	}
	@Transient
	public boolean isCurrentlyLocked() {
		return BooleanUtils.isTrue(this.getLocked());
	}
	@Transient
	public boolean isCurrentlyArchived() {
		return BooleanUtils.isTrue(this.getArchived());
	}
	@Transient
	public boolean isCurrentlySigned() {
		return BooleanUtils.isTrue(this.getSigned());
	}
}