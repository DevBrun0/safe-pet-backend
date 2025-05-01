package org.trainning.safepetbackend.repository.adotante;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.trainning.safepetbackend.domain.Adotante;
import org.trainning.safepetbackend.domain.Animal;

public class AdotanteRepositoryCustomImpl implements AdotanteRepositoryCustom {

    private final MongoTemplate mongoTemplate;
    public AdotanteRepositoryCustomImpl(MongoTemplate mongoTemplate){this.mongoTemplate = mongoTemplate;}

    @Override
    public Adotante atualizarPorId(Adotante adotante){
        Update update = new Update();

        if(adotante.getNome() != null) update.set("nome", adotante.getNome());

        if(adotante.getIdade() != null) update.set("idade", adotante.getIdade());

        if(adotante.getEnderecoCompleto() != null) update.set("enderecoCompleto", adotante.getEnderecoCompleto());

        if(adotante.getDocumentoCpf() != null) update.set("documentoCpf", adotante.getDocumentoCpf());

        Query query = new Query(Criteria.where("id").is(adotante.getId()));
        return mongoTemplate.findAndModify(query, update, Adotante.class);
    }
}
