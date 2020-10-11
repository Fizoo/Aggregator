package com.javarush.task.task28.task2810;


import com.javarush.task.task28.task2810.model.HHStrategy;
import com.javarush.task.task28.task2810.model.Model;
import com.javarush.task.task28.task2810.model.MoikrugStrategy;
import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.view.HtmlView;

public class Aggregator {

    public static void main(String[] args) {
        Provider provider = new Provider(new MoikrugStrategy());
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()), provider);
        Controller controller = new Controller(model);

        view.setController(controller);

        view.userCitySelectEmulationMethod();
    }
}
