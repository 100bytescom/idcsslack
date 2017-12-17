/**
 * 
 */
package com.test.slack.response;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author 100bytes.com
 * WEBSITE: http://100bytes.com
 */

@Path("slackresponse")
public class SlackResponse {

	@POST
	public String post(String response)	{
		return "ACKNOWELDGED";
	}
}
