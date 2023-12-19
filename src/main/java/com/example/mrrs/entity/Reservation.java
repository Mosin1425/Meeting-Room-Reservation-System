package com.example.mrrs.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "RESERVATION_TABLE")
public class Reservation {
	@Id
	@Column(name = "reservation_id")
	private int reservationId;
	
	@Column(name = "start_time")
	private LocalDateTime startTime;
	
	@Column(name = "end_time")
	private LocalDateTime endTime;
	
	@Transient
	private MeetingRoom meetingRoom;
	
	@Transient
	private User user;
	
	public Reservation(int reservationId, LocalDateTime startTime, LocalDateTime endTime, MeetingRoom meetingRoom,
			User user) {
		super();
		this.reservationId = reservationId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.meetingRoom = meetingRoom;
		this.user = user;
	}

	public Reservation() {
		super();
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}

	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
