package co.com.sofka.app.repository;

import co.com.sofka.app.model.Widget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WidgetRepository extends MongoRepository<Widget, Long> {
}
