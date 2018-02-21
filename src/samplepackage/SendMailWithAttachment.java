package samplepackage;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

public class SendMailWithAttachment {

	public static void main(String[] args) {
	
	//public void method(){
		
		//create object of property file
		Properties props=new Properties();
		String host="smtp.gmail.com";
		//this will set host of server
		props.put("mail.smtp.starttls.enable", "true");
		//props.put("mail.smtp.host", "smtp.gmail.com");
		 props.put("mail.smtp.ssl.trust", host);
		//set the port socket factory
		props.put("mail.smtp.socketFactory.port", "587");
		
		//set socket factory
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		
		//set teh authentication to true
		props.put("mail.smtp.auth", "true");
		
		//set the port of smtp server
		props.put("mail.smtp.port", "587");
		
		//this will handle complete authentication
		Session session=Session.getDefaultInstance(props,
				new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication("bharathchitikela23@gmail.com","chitikela23");
			}
		});
		try{
			//create object of MimeMessage class
			Message message=new MimeMessage(session);
			
			//set the from address
			message.setFrom(new InternetAddress("bharathchitikela23@gmail.com"));
			
			//set the recepient address
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("mahi.bharu23@gmail.com"));
			
			//add the subject link
			message.setSubject("Testing subject");
			
			//create object to add multimedia type content
			BodyPart messageBodyPart1=new MimeBodyPart();
			
			//set the body of email
			messageBodyPart1.setText("This is message body");
			
			//create another subject to add another content
			MimeBodyPart messageBodyPart2=new MimeBodyPart();
			
			//mention the file which you wqant to send
			String filename="F:\\Test3.xlsx";
			
			//Create datasource and pass the filename
			DataSource source=new FileDataSource(filename);
			
			//set handler
			messageBodyPart2.setDataHandler(new DataHandler(source));
			
			//set the file
			messageBodyPart2.setFileName(filename);
			
			//create object of MimeMultipart class
			Multipart multipart=new MimeMultipart();
			
			//add body part 1
			multipart.addBodyPart(messageBodyPart2);
			
			//add body part 2
			multipart.addBodyPart(messageBodyPart1);
			
			//set the content
			message.setContent(multipart);
			
			//finally send the email
			Transport.send(message);
			System.out.println("====Email Sent===");
		}catch(MessagingException e){
			throw new RuntimeException(e);
			
		}
		

	}

}
