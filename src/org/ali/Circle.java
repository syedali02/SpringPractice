package org.ali;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware {

	private Point center;
	@Autowired
	private MessageSource MessageSource;
	private ApplicationEventPublisher publisher;

	public MessageSource getMessageSource() {
		return MessageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.MessageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(this.MessageSource.getMessage("drawing",null,"Default value",null));
		System.out.println(this.MessageSource.getMessage("drawing.point",new Object[] {center.getX(),center.getY()},"Default value",null));
		//System.out.println(this.messageSource.getMessage("greeting",null,"Default value",null));
		DrawEvent event=new DrawEvent(this);
		publisher.publishEvent(event);
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy of Circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub
		
	this.publisher=arg0;
	}
}  
