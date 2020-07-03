package com.interview.ooad.meetingscheduler;

import java.util.Date;

class MeetingRoom {
	Calendar calendar;

	public boolean isAvailable(Date start, Date end) {
		return calendar.checkAvailability(start, end);
	}

	public Meeting scheduleMeeting(Date start, Date end) {
		return calendar.scheduleNewMeeting(start, end);
	}
}
