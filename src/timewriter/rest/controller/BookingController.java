package timewriter.rest.controller;

import timewriter.object.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Path("/rest/api/booking")
public class BookingController extends BaseController {
    private static ArrayList<Booking> _bookings;

    @GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    @Path("")
    public GetBookingsResponse getBookings(@HeaderParam("securityToken") String securityToken,
								@QueryParam("startTime") String startTime,
								@QueryParam("endTime") String endTime,
								Filters filters) {
        GetBookingsResponse result = new GetBookingsResponse();
        GetBookingsResult getBookingsResult = new GetBookingsResult();
        if (checkSecurityToken(securityToken, getBookingsResult)) {
            BookingList bookingList = new BookingList();
            ArrayList<Booking> bookings = getBookings();

            // Filter booking by startTime & endTime
            if (startTime != null && !startTime.isEmpty() && endTime != null && !endTime.isEmpty()) {

            }
            //Filter booking by filters param
            if (filters != null && filters.getFilter() != null && !filters.getFilter().isEmpty()) {

            }

            bookingList.getBooking().addAll(bookings);
            getBookingsResult.setBookingList(bookingList);
        } else {
            getBookingsResult.setError(true);
            getBookingsResult.setErrorMessage( "Invalid securityKey" );
        }
        result.setResult(getBookingsResult);
        return result;
    }

    @PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    @Path("")
    public UpdateBookingResponse updateBooking(@HeaderParam("securityToken") String securityToken,
                                             Booking booking )
    {
        UpdateBookingResponse response = new UpdateBookingResponse();
        UpdateBookingResult result = new UpdateBookingResult();
        if ( checkSecurityToken( securityToken, result ) )
        {
            // in real a booking with an ID will be updated.. otherwise it will be added to the database
            _bookings.add( booking );
            result.setBooking(booking);
        } else {
            result.setError( true );
            result.setErrorMessage( "Invalid securityKey" );
        }
        response.setResult(result);
        return response;
    }

    @DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    @Path("/{bookingId}")
    public DeleteBookingResponse deleteBooking(@HeaderParam("securityToken") String securityToken,
                                             @PathParam("bookingId") long id )
    {
        DeleteBookingResponse response = new DeleteBookingResponse();
        DeleteBookingResult result = new DeleteBookingResult();
        if ( checkSecurityToken( securityToken, result ) )
        {
            for (Booking b : _bookings) {
                if (b.getId() == id) {
                    _bookings.remove(b);
                }
            }
            result.setSuccess(true);
        } else {
            result.setError( true );
            result.setErrorMessage( "Invalid securityKey" );
        }
        response.setResult(result);
        return response;
    }

    private static synchronized ArrayList<Booking> getBookings()
    {
        if ( _bookings == null )
        {
            LocalDateTime currentTime = LocalDateTime.now();
            _bookings = new ArrayList<Booking>();
            _bookings.add( createBooking( 1, 1));
            _bookings.add( createBooking( 2, 2));
            _bookings.add( createBooking( 3, 3));
        }
        return _bookings;
    }

    private static Booking createBooking(long i, long idGrmedn)
    {
        Booking b = new Booking();
        b.setId( i );
        b.setIdITMED( new Long( 123 ) );
        b.setIdGRMED(Long.valueOf(idGrmedn));
        return b;
    }
}
