package com.example.task;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "task", urlPatterns = "/task", loadOnStartup = 5)
public class Task extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String header1 = req.getHeader("Task-Custom-Header");
        System.out.println(header1);

        String name = req.getParameter("name");
        System.out.println(name);
    }
}
