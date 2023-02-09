package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealTo;
import ru.javawebinar.topjava.util.MealStorage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.slf4j.LoggerFactory.getLogger;


public class MealServlet extends HttpServlet {
    private MealStorage mealStorage = new MealStorage();
    private static final Logger log = getLogger(MealServlet.class);


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<LocalDate, Integer> caloriesSumByDate = mealStorage.getMeals().stream()
                .collect(
                        Collectors.groupingBy(Meal::getDate, Collectors.summingInt(Meal::getCalories))
                );

        List<MealTo> mealToList = mealStorage.getMeals().stream()
                .map(meal -> new MealTo(meal.getDateTime(), meal.getDescription(), meal.getCalories(), caloriesSumByDate.get(meal.getDate()) > MealStorage.CALORIESPERDAY))
                .collect(Collectors.toList());

        request.setAttribute("mealToList", mealToList);

        log.debug("redirect to meals");

        request.getRequestDispatcher("/meals.jsp").forward(request, response);
        //  response.sendRedirect("meals.jsp");
    }
}
