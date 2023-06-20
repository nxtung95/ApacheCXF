package timewriter.rest.controller;

import timewriter.object.*;

public class BaseController {
    protected boolean checkSecurityToken( String securityToken, RequestResult result )
    {
        if ( !"123".equals( securityToken ) )
        {
            result.setError( true );
            result.setErrorMessage( "Invalid securityToken" );
            return false;
        }
        return true;
    }
}
