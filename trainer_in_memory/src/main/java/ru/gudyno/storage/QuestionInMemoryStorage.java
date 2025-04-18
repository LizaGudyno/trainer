package ru.gudyno.storage;

import org.springframework.stereotype.Repository;
import ru.gudyno.domain.model.OpenQuestionCard;
import ru.gudyno.domain.repo.QuestionRepository;

import java.util.*;


public class QuestionInMemoryStorage implements QuestionRepository {
    private final Map<Long, OpenQuestionCard> storage = new HashMap<>();

    @Override
    public List<OpenQuestionCard> findAll() { return new ArrayList<>(storage.values()); }
    @Override
    public Optional<OpenQuestionCard> findById(Long id) { return Optional.ofNullable(storage.get(id)); }
    @Override
    public void add(OpenQuestionCard task) { storage.put(task.getId(), task); }
    @Override
    public void update(OpenQuestionCard task) { storage.put(task.getId(), task); }
    @Override
    public void remove(Long id) { storage.remove(id); }
}