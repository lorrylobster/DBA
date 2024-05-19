/*
 * SoSe2024
 * Quelle: https://gist.github.com/kodiyan/2ce0707ce215288406c8
 */
package util;

import jakarta.faces.context.FacesContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class Util {
    public static HttpSession getSession() {
	return (HttpSession)FacesContext
                                .getCurrentInstance()
                                .getExternalContext()
                                .getSession(false);
    }

    public static HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext
                                    .getCurrentInstance()
                                    .getExternalContext()
                                    .getRequest();
    }

    public static String getUserName()
    {
        HttpSession session 
            = (HttpSession) FacesContext.getCurrentInstance()
                                        .getExternalContext()
                                        .getSession(false);
        return  session.getAttribute("username").toString();
    }

    public static String getUserId()
    {
        HttpSession session = getSession();
        if ( session != null )
            return (String) session.getAttribute("userid");
        else
            return null;
    }
}
