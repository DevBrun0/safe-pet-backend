package org.trainning.safepetbackend.repository.animal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.trainning.safepetbackend.domain.Animal;

@Repository
public interface AnimalRepository extends MongoRepository<Animal, String> , AnimalRepositoryCustom{

}
