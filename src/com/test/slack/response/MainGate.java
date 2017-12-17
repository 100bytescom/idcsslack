/**
 * 
 */
package com.test.slack.response;

import java.net.InetAddress;
import java.net.URI;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author 100bytes.com
 * WEBSITE: http://100bytes.com
 */

class Resources extends ResourceConfig	{

	public Resources()	{
		register(SlackResponse.class);
	}
}

public class MainGate {

	public static void main(String[] args) throws Exception {
		
		URI uri = new URI("http://" + InetAddress.getLocalHost().getHostName() + ":5001");
		ResourceConfig rc = new Resources();
		GrizzlyHttpServerFactory.createHttpServer(uri, rc, true);
	}

}
