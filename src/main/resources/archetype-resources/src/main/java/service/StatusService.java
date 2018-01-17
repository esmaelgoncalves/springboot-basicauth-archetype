#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ${package}.model.Status;

@Service
public class StatusService {
	
	@Value("${symbol_dollar}{app.appName}")
	private String appName;
	@Value("${symbol_dollar}{app.appVersion}")
	private String appVersion;
	
	public Status getStatus() {
		return new Status(appName, appVersion);
	}
	
}
