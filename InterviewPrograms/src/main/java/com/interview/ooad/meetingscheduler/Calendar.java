package com.interview.ooad.meetingscheduler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Calendar {
	MeetingRoom room;
	List<Meeting> meetings;

	public Calendar() {
		this.meetings = new ArrayList<>();
	}

	public boolean checkAvailability(Date start, Date end) {
		for (Meeting meeting : meetings) {
			if (meeting.end.after(start) || meeting.start.before(end))
				return false;
		}
		return true;
	}

	public Meeting scheduleNewMeeting(Date start, Date end) {
		Meeting meeting = new Meeting(room, start, end);
		meetings.add(meeting);
		return meeting;
	}
}
