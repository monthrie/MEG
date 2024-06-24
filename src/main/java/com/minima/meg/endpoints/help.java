package com.minima.meg.endpoints;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import com.minima.meg.server.BasicPage;

public class help extends BasicPage {

	@Override
	public void writePage(HttpServletRequest request, PrintWriter zOut) {
		zOut.println("<h2>HELP</h2>\r\n"
				+ "		\r\n"
				+ "		MEG is a simple bridge that connects Minima to your existing technical infra-structure.<br>\r\n"
				+ "		<br>\r\n"
				+ "		Events can occur on the Minima network that you are then informed about via an HTTP API call.<br>\r\n"
				+ "		<br>\r\n"
				+ "		Or you can define actions that you want to perform on the Minima network - again via simple API calls.<br>\r\n"
				+ "		<br>\r\n"
				+ "		A simple yet powerful two-way bridge via custom HTTP API calls from your current systems into the Minima network.<br>\r\n"
				+ "		<br>\r\n"
				+ "		\r\n"
				+ "		<h3>Minima Node</h3>\r\n"
				+ "		First you will need to set up a Minima node with RPC enabled so that you can access and \r\n"
				+ "		perform functions on the Minima network.<br>\r\n"
				+ "		<br>\r\n"
				+ "		MEG requires your Minima node be started with certain parameters.<br>\r\n"
				+ "		<br>\r\n"
				+ "		-rpcenable : So you can make calls to Minima<br>\r\n"
				+ "		-notifyalltxpow : Notify all TxPoW messgages - not just <i>relevant</i> ones<br>\r\n"
				+ "		-megammr : So that the Wallet functionality works with all coin proofs.<br>\r\n"
				+ "		\r\n"
				+ "		<h3>Triggers</h3>\r\n"
				+ "		You can listen for events that occur on the Minima network using TRIGGERS.<br>\r\n"
				+ "		<br>\r\n"
				+ "		When the event occurs - it <i>triggers</i> an API call from MEG with relevant JSON data for you to process as you see fit.<br>\r\n"
				+ "		<br>\r\n"
				+ "		This is your own server (NodeJS / PHP / Java Servlet / etc..) you run that listens and interacts with your own backend systems and databases.<br>\r\n"
				+ "		<br> \r\n"
				+ "		So you could listen for any Minima transactions that send or receive from a certain address or that use a certain Token.<br>\r\n"
				+ "		<br>\r\n"
				+ "		\r\n"
				+ "		<h3>Endpoints</h3>\r\n"
				+ "		You can define certain <i>endpoints</i> - which you access via the <b>./api/</b>endpoint URL of this server.<br>\r\n"
				+ "		<br>\r\n"
				+ "		When you call these endpoints an action is performed on the Minima network. This abstracts the complexities of running\r\n"
				+ "		 Minima commands into easily manageable calls that can be integrated into your own systems.<br>\r\n"
				+ "		<br>\r\n"
				+ "		For instance you can add an endpoint that sends 50, an only 50, tokens of a specific token type to an address.. and all that would need to be sent \r\n"
				+ "		to the endpoint is the address. All the Minima functionality is hidden from the API user.<br>\r\n"
				+ "		<br>\r\n"
				+ "		ONLY 'API Caller' users can call the endpoints. This way in the logs you can see who is using your various endpoints.<br>\r\n"
				+ "		<br>\r\n"
				+ "		 \r\n"
				+ "		<h3>Wallet API</h3>\r\n"
				+ "		The Wallet API is a powerful yet simple way of granting countless Users a Minima wallet.<br>\r\n"
				+ "		<br>\r\n"
				+ "		It is primarily designed for interfacing with Exchanges but can be used by anyone wishing to give their Users a Minima Wallet.<br>\r\n"
				+ "		<br>\r\n"
				+ "		A set of functions allows you to send and receive Minima and Tokens.<br>\r\n"
				+ "		<br>\r\n"
				+ "		Most interesting is that you can use 2 MEG systems - one that runs OFFLINE and one ONLINE - for maximum security.<br>\r\n"
				+ "		<br> \r\n"
				+ "		\r\n"
				+ "		<h3>Logs</h3>\r\n"
				+ "		MEG logs every login, trigger, endpoint or admin action.<br>\r\n"
				+ "		<br>\r\n"
				+ "		\r\n"
				+ "		<h3>Profile</h3>\r\n"
				+ "		A profile page that allows Users to change their password.<br>\r\n"
				+ "		<br>\r\n"
				+ "		\r\n"
				+ "		<h3>Admin</h3>\r\n"
				+ "		Only Users with Admin privileges can access this sections of the site.<br>\r\n"
				+ "		<br>\r\n"
				+ "		Here you can add / remove / list Users.<br>");
	}
}
