package nsu.service;

import nsu.domain.Post;
import nsu.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository = new PostRepository();
    private long idSequence = 0L;

    public void createPost(String title){
        Post post = new Post(++idSequence, title);

        postRepository.save(post);
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post getPostById(Long id){
        return postRepository.findById(id);
    }

    public void updatePost(Long id, String newTitle){
        Post byId = postRepository.findById(id);
        byId.updateTitle(newTitle);
        postRepository.save(byId);
    }

    public void deletePost(Long id){
        postRepository.deleteById(id);
    }
}
