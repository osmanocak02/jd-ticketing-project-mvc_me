package com.cybertek.implementation;

import com.cybertek.dto.TaskDTO;
import com.cybertek.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO, Long> implements TaskService {
    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public TaskDTO save(TaskDTO object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void update(TaskDTO object) {
        super.update(object.getId(), object);
    }

    @Override
    public void delete(TaskDTO object) {
        super.delete(object);
    }

    @Override
    public TaskDTO findByID(Long id) {
        return super.findByID(id);
    }
}
