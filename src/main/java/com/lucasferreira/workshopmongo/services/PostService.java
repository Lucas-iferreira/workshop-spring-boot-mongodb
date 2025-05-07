package com.lucasferreira.workshopmongo.services;

import com.lucasferreira.workshopmongo.domain.Post;
import com.lucasferreira.workshopmongo.domain.User;
import com.lucasferreira.workshopmongo.dto.UserDTO;
import com.lucasferreira.workshopmongo.repository.PostRepository;
import com.lucasferreira.workshopmongo.repository.UserRepository;
import com.lucasferreira.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text){
       return repository.searchTitle(text);
    }
}
