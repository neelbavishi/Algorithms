package com.interview.ooad.meetingscheduler;

import java.util.List;

public class EmailService {
	public void sendBulkEmail(String template, List<String> emails) {
		for (String email : emails) {
			sendEmail(template, email);
		}
	}

	private boolean sendEmail(String template, String email) {
		System.out.println("email sent to:" + email);
		return true;
	}
}
