package org.trainning.safepetbackend.repository.adotante;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.trainning.safepetbackend.domain.Adotante;

@Repository
public interface AdotanteRepository extends MongoRepository<Adotante, String>, AdotanteRepositoryCustom{

}
