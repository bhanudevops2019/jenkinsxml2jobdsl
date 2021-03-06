package com.fergalgribben.jenkinsxml2jobdsl.xml.model.publishers.aggregatedtestresults;

import javax.xml.bind.annotation.XmlAttribute;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder;

public class AggregatedTestResultPublisher implements Buildable{

	@XmlAttribute
	public String plugin;
	
	public String jobs;
	public boolean includeFailedBuilds;
	@Override
	public void build(Builder builder) {
		builder.createMethod("aggregateDownstreamTestResults").withStringParameter(jobs).withBooleanParameter(includeFailedBuilds).endMethod();
		
	}
}
