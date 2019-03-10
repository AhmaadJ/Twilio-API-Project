package com.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

//Twilio API

public class SendSMS2 {

	// Find your account sid and token at twilio.com/user/account
	public static final String ACCOUNT_SID = "ACa4b8aeb89cb6104b753493a5bfaffd12";
	public static final String AUTH_TOKEN = "8cd7e340642982dabeb8000a5b387715";
		
	public static void main(String[] args)	{
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			
		Message message = Message.creator(
				new PhoneNumber("+17325109423"), 
				new PhoneNumber("+19737559494"), "This is the message, you did it!").create();
			
		System.out.println(message.getSid());
			
	}

}
