package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet(urlPatterns = {"/test"})
public class HelloWorldServlet extends HttpServlet
{
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException
  {
    response.getOutputStream().print("Hello World");
  }

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException
  {
    String name = request.getParameter("name");
    request.setAttribute("name", name);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/hello_world.jsp");
    if (dispatcher != null) {
          dispatcher.forward(request, response);
    }
  }
}
