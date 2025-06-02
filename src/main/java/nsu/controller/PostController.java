package nsu.controller;

import nsu.domain.Post;
import nsu.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService = new PostService();

    @GetMapping("/get")
    public void createPost(String title){
        postService.createPost(title);
    }

    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    public Post getPostById(Long id){
        return postService.getPostById(id);
    }

    public void updatePost(Long id, String newTitle){
        postService.updatePost(id, newTitle);
    }

    public void deletePost(Long id){
        postService.deletePost(id);
    }
}
