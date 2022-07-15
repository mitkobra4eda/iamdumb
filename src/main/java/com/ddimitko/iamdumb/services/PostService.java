package com.ddimitko.iamdumb.services;

import com.ddimitko.iamdumb.objects.Post;
import com.ddimitko.iamdumb.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepo;

    public List<Post> findAll(){
        return postRepo.findAll(Sort.by(Sort.Direction.DESC, "creationDate"));
    }

    public Post findById(Long id){

        if(postRepo.findById(id).isPresent()){
            Post post = postRepo.findById(id).get();
            return post;
        }
        else{
            return null;
        }

    }

    public void createPost(String name, String content){

        Post post = new Post();

        post.setUsername(name);
        post.setContent(content);
        postRepo.save(post);

    }

}
