package org.trainning.safepetbackend.repository.animal;

import org.trainning.safepetbackend.domain.Animal;

public interface AnimalRepositoryCustom {
    Animal updateByExample(Animal animal);
}
