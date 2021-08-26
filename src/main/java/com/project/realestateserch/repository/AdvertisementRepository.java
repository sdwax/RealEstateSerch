package com.project.realestateserch.repository;

import java.util.Set;

public interface AdvertisementRepository {

    <S> void save(S entity);

    <E> Set<E> find();
}
