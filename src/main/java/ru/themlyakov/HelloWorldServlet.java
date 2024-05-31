package ru.themlyakov;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        resp.setStatus(200);
        try(PrintWriter writer = resp.getWriter()) {
            writer.write("Hello world test 5");
        } catch (IOException e){
            resp.setStatus(500);
        }
    }
}
