package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepoisitory extends CrudRepository<Category, Long> {
}
