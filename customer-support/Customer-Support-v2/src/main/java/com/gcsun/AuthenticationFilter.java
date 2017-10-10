package com.gcsun;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 11981 on 2017/9/30.
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException{
        HttpSession session = ((HttpServletRequest)request).getSession(false);
        if (session == null || session.getAttribute("username") == null){

            ((HttpServletResponse)response).sendRedirect("login");
        }else
            chain.doFilter(request, response);

    }

    @Override
    public void init(FilterConfig config) throws ServletException{}
    @Override
    public void destroy(){}
}
