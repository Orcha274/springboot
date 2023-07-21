//package com.example.first.app.Student;
//
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
///** @noinspection ALL*/
//public class StudentRepositoryImpl implements StudentRepository {
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends student> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends student> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<student> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public student getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public student getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public student getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends student> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends student> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends student> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends student> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends student> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends student> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends student, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public <S extends student> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends student> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<student> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public List<student> findAll() {
//        return null;
//    }
//
//    @Override
//    public List<student> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(student entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends student> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public List<student> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<student> findAll(Pageable pageable) {
//        return null;
//    }
//}
