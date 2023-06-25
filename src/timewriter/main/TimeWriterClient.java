package timewriter.main;

//import org.apache.cxf.jaxrs.client.Client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.jaxrs.client.WebClient;
import timewriter.object.*;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

public class TimeWriterClient {
	public static void main(String[] args) {
		try
		{
			Login loginRequest = new Login();
			loginRequest.setApiKey("123");
			loginRequest.setUserKey("123");
			loginRequest.setSoftwareDesc("test");

			List<Object> providers = new ArrayList<>();
			providers.add(new JacksonJsonProvider());
			WebClient webClient = WebClient.create("http://localhost:8080", providers );

			// Login
			webClient.path("/rest/api/login");
			webClient.type(MediaType.APPLICATION_JSON);
			webClient.accept(MediaType.APPLICATION_JSON);
			LoginResponse result = webClient.post(loginRequest, LoginResponse.class);
			if ( result.getResult().isError() )
			{
				System.err.println( result.getResult().getErrorMessage() );
				return;
			}
			String token = result.getResult().getSecurityToken();
			System.out.println( "Received securityToken: " + token );

			// Get book
			webClient = WebClient.create("http://localhost:8080", providers );
			webClient.path("/rest/api/booking");
			webClient.type(MediaType.APPLICATION_JSON);
			webClient.accept(MediaType.APPLICATION_JSON);
			webClient.header("securityToken", token);
			GetBookingsResponse bookings = webClient.get(GetBookingsResponse.class);
			System.out.println( "Number of bookings: " + bookings.getResult().getBookingList().getBooking().size() );

			Booking booking = new Booking();
			UpdateBookingResponse updateResult = webClient.put(booking, UpdateBookingResponse.class);
			if (updateResult.getResult().isError() ) {
				System.err.println( updateResult.getResult().getErrorMessage() );
				return;
			}

			bookings = webClient.get(GetBookingsResponse.class);
			System.out.println( "Number of bookings: " + bookings.getResult().getBookingList().getBooking().size() );

			webClient = WebClient.create("http://localhost:8080", providers );
			webClient.path("/rest/api/hello");
			String resHello = webClient.query("request", "Rinse").get(String.class);
			System.out.println(resHello);

		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
}
