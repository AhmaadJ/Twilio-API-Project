package com.twilio;

import static spark.Spark.post;

import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;

import static spark.Spark.*;

public class ReceiveSMS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get("/", (req, res) -> "Hello Web");
		
		post("/receive-sms", (req, res) -> {
			res.type("application/xml");
				Body body = new Body
					.Builder("Here's a new message, Round 2!")
					.build();
			
			Message sms = new Message.Builder()
					.body(body)
					.build();
			
			MessagingResponse twiml = new MessagingResponse.Builder()
					.message(sms)
					.build();
			
			return twiml.toXml();
			
		});
	}

}

/* Listening on 0.0.0.0:4567
 * Twilio can't reach this local host port
 * Use ngrok to create an HTTP tunnel on port 4567
 * This will give us a publicly addressable URL that we can uses for
 * incoming message(Webhook)
*/
