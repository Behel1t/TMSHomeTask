package org.example;

import org.example.domain.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    private final DataBase dataBase=new DataBase();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String model=req.getParameter("model");
        String year = req.getParameter("year");
        String price=req.getParameter("price");
        Integer priceAsCar=0;
        if (priceAsCar!=null){
            priceAsCar=Integer.parseInt(price);
        }
        String brand = req.getParameter("brand");
        Car car =new Car();
        car.setModel(model);
        car.setYear(year);
        car.setPrice(Integer.valueOf(price));
        car.setBrand(brand);

        dataBase.create(car);

        req.getRequestDispatcher("/home").forward(req,resp);

    }
}
