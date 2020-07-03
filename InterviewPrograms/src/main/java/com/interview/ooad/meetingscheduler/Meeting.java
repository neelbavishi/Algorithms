package com.interview.ooad.meetingscheduler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Meeting {
	private static final String EMAIL_NOTIFICATION_TEMPLATE_NAME = "meeting scheduled";
	String id;
	MeetingRoom location;
	List<Attende> attendees;
	Date start;
	Date end;
	EmailService emailService;

	public Meeting(MeetingRoom location, Date start, Date end) {
		this.id = UUID.randomUUID().toString();
		this.location = location;
		this.start = start;
		this.end = end;
		this.emailService = new EmailService();
	}

	/**
	 * Use AWS SES for transactional emails.
	 */
	public void invite(List<Attende> attendees) {
		// this is a bit of Groovy, just for fun.
		List<String> attendeeEmails = new ArrayList<>();
		for(Attende attendee : attendees)
		{
			attendeeEmails.add(attendee.email);
		}
		emailService.sendBulkEmail(EMAIL_NOTIFICATION_TEMPLATE_NAME,attendeeEmails);
	}
}
