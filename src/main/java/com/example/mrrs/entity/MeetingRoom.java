package com.example.mrrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEETING_ROOM")
public class MeetingRoom {
	
	@Id
	@Column(name = "meeting_id")
	private int meetingId;
	
	@Column(name = "room_name")
	private String roomName;
	
	@Column(name = "capacity")
	private int capacity;
	
	public MeetingRoom(int meetingId, String roomName, int capacity) {
		super();
		this.meetingId = meetingId;
		this.roomName = roomName;
		this.capacity = capacity;
	}

	public MeetingRoom() {
		super();
	}

	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
