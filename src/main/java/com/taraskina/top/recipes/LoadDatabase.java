package com.taraskina.top.recipes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.taraskina.top.recipes.model.Recipe;
import com.taraskina.top.recipes.repository.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger LOG = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RecipeRepository repository){
        return arg -> {

            Recipe recipe = repository.save(new Recipe("Яичные конвертики с сыром и ветчиной",
                    "https://www.russianfood.com/recipes/recipe.php?rid=154015",
                    "Яйца - 4 шт., ветчина - 130 г, сыр твёрдый - 100 г, масло растительное (для жарки) - 1-2 ч. ложки",
                    "Завтрак",
                    "Основное блюдо"));

            LOG.info("Preloading " + recipe);
            LOG.info("Preloading " + repository.save(new Recipe("Панкейки (американские блинчики)",
                    "https://www.russianfood.com/recipes/recipe.php?rid=134468",
                    "Яйца - 2 шт., " +
                            "молоко - 200 мл, " +
                            "мука пшеничная - 10 ст. л., " +
                            "разрыхлитель - 1 ч. л., " +
                            "сахар - 2 ст. л., " +
                            "ванильный сахар (по желанию) - по вкусу",
                    "Завтрак",
                    "Основное блюдо")));
            LOG.info("Preloading " + repository.save(new Recipe("Ленивая пицца на сковороде",
                    "https://www.russianfood.com/recipes/recipe.php?rid=153498",
                    "Сметана - 2 ст. ложки, " +
                            "Майонез - 2 ст. ложки, " +
                            "Яйцо - 1 шт., " +
                            "Мука - 4 ст. ложки, " +
                            "Колбаса копчёная - 100 г, " +
                            "Сыр твёрдый - 80 г, " +
                            "Помидор - 1 шт., " +
                            "Масло растительное - 1 ст. ложка, " +
                            "Соль - по вкусу",
                    "Завтрак",
                    "Основное блюдо")));
        };
    }
}
