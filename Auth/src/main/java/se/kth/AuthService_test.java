package se.kth;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author AMore & Johan
 */
@WebService(serviceName = "AuthService")
@Stateless()
public class AuthService {

    /**
     * Web service operation for authorization
     */
    @WebMethod(operationName = "Authorize")
    public Boolean Authorize(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {

        if (!username.equals("user") || !password.equals("password")) {
            return false;
        }

        return true;
    }

}
